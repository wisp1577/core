package com.rails.ecommerce.core.filemanage.serviceImpl;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rails.common.core.frame.utils.CustomFileUtils;
import com.rails.common.core.frame.utils.JsonUtil;
import com.rails.common.core.frame.utils.StaticValue;
import com.rails.common.core.frame.utils.zip4jUtil;
import com.rails.common.exception.BusinessWifiException;
import com.rails.common.exception.ServiceMessageException;
import com.rails.common.logger.WifiLogUtil;
import com.rails.ecommerce.core.filemanage.dao.FileTransferDao;
import com.rails.ecommerce.core.filemanage.domain.FileTransfer;
import com.rails.ecommerce.core.filemanage.service.FileTransferService;
import com.rails.ecommerce.core.order.dao.OrderDao;
import com.rails.ecommerce.core.order.domain.OrderInfo;

@Service("FileTransferServiceImpl")
public class FileTransferServiceImpl  implements FileTransferService {
	
	@Resource(name = "FileTransferDaoImpl")
	private FileTransferDao fileTransferDao;

	@Resource(name = "OrderDaoImpl")
	private OrderDao orderDao;
	
	@Override
	public FileTransfer save(FileTransfer entity) throws Exception {
		return fileTransferDao.save(entity);
	}


	@Override
	public void delete(FileTransfer entity) throws Exception {
		fileTransferDao.delete(entity);
	}


	@Override
	public FileTransfer update(FileTransfer entity) throws Exception {
		// TODO Auto-generated method stub
		return fileTransferDao.update(entity);
	}

	@Override
	public List<FileTransfer> findFileTransfer(String fileName) {
		return fileTransferDao.findFileTransfer(fileName);
	}


	@Override
	public List<FileTransfer> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public FileTransfer findById(Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public FileTransfer findById(Object id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public Boolean restore(String currentRootPath, String zipPath) throws Exception {
		try {
			// 解压临时路径 webRoot / temp_root /
			String tempUnzipRoot = currentRootPath + "\\"
					+ StaticValue.TEMP_ROOT;

			zip4jUtil.unzip(zipPath, tempUnzipRoot, "");

			File zipFile = new File(zipPath);
			String zipName = CustomFileUtils
					.getFileNameNoExt(zipFile.getName());
			// json路径为解压目标文件夹下的zip包同名文件
			List<File> jsonFiles = CustomFileUtils.getCurrentPathFileExt(
					tempUnzipRoot + File.separator + zipName, "json");
			// 遍历json文件
			for (File f : jsonFiles) {

				if (f.getName().contains("OrderInfo.json")) {
					// 转成实体
					List<OrderInfo> importOrder = new JsonUtil<OrderInfo>()
							.readFileToEntity(f.getPath(), OrderInfo.class);
					// 实体写入数据库
					List<OrderInfo> oriOrder = null;
					try {
						oriOrder = orderDao.findAll();
					} catch (BusinessWifiException e) {
						oriOrder = new ArrayList<OrderInfo>();
					}
					for (OrderInfo orderstoAdd : importOrder) {
						boolean isin = false;
						for (OrderInfo ordersIn : oriOrder) {
							if (orderstoAdd.getOrderInfoId()
									.equals(ordersIn.getOrderInfoId())) {
								isin = true;
							}
						}

						if (isin) {
							orderDao.update(orderstoAdd);
						} else {
							orderDao.save(orderstoAdd);
						}

					}
//					updateInsertGoodsList(importGoods);
				}
			}

//			CustomFileUtils.moveFolder(tempUnzipRoot + File.separator + zipName
//					+ File.separator + StaticValue.RESOURCE_ROOT,
//					destFolderPath);

			return true;
		} catch (Exception e) {
			WifiLogUtil.wifiLogError(this.getClass().getName(), e);
			throw new ServiceMessageException("解压文件异常");
		}
	}
	
}
