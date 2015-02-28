package com.rails.ecommerce.core.publish.serviceImpl;


import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Service;

import com.rails.common.core.frame.utils.CustomFileUtils;
import com.rails.common.core.frame.utils.FileUtils;
import com.rails.common.core.frame.utils.JsonUtil;
import com.rails.common.core.frame.utils.MD5CheckUtil;
import com.rails.common.core.frame.utils.StaticConfig;
import com.rails.common.core.frame.utils.StaticValue;
import com.rails.common.core.frame.utils.zip4jUtil;
import com.rails.common.utils.DateUtils;
import com.rails.ecommerce.core.column.domain.Colume;
import com.rails.ecommerce.core.column.service.ColumeService;
import com.rails.ecommerce.core.common.domain.PaginationList;
import com.rails.ecommerce.core.common.domain.ShiftInfo;
import com.rails.ecommerce.core.common.domain.TrainNumberView;
import com.rails.ecommerce.core.filemanage.dao.FileTransferDao;
import com.rails.ecommerce.core.filemanage.domain.FileTransfer;
import com.rails.ecommerce.core.goodsinfo.domain.GoodsInfo;
import com.rails.ecommerce.core.goodsinfo.service.GoodsInfoService;
import com.rails.ecommerce.core.publish.dao.PublishDao;
import com.rails.ecommerce.core.publish.domain.Publish;
import com.rails.ecommerce.core.publish.service.PublishService;
import com.rails.ecommerce.core.publishgoods.domain.PublishGoods;
import com.rails.ecommerce.core.publishgoods.service.PublishGoodsService;
import com.rails.ecommerce.core.templet.domain.Templet;
import com.rails.ecommerce.core.templet.domain.TempletList;
import com.rails.ecommerce.core.templet.service.TempletListService;
import com.rails.ecommerce.core.templet.service.TempletService;


@Service("PublishServiceImpl")
public class PublishServiceImpl  implements PublishService {
	
	@Resource(name = "PublishDaoImpl")
	private PublishDao publishDao;
	
	@Resource(name = "GoodsInfoServiceImpl")
	private GoodsInfoService goodsInfoService;
	
	@Resource(name = "FileTransferDaoImpl")
	private FileTransferDao fileTransferDao;
	
	@Resource(name = "PublishGoodsServiceImpl")
	private PublishGoodsService publishGoodsService;
	
	@Resource(name = "ColumeServiceImpl")
	private ColumeService columeService;
	
	@Resource(name = "TempletServiceImpl")
	private TempletService templetService;
	
	@Resource(name = "TempletListServiceImpl")
	private TempletListService templetListService;


	
	@Override
	public PaginationList findAllPage(String name,String trainNo,String beginDate,String endDate,int pageNo, int pageSize)throws Exception {
		return publishDao.findAllPage( name, trainNo, beginDate,endDate,pageNo, pageSize);
	}
	
	@Override
	public List<Publish> findTrainNo(String trainNo) throws Exception{
		return publishDao.findTrainNo(trainNo);
	}

	@Override
	public Publish findById(String id)throws Exception{
		return publishDao.findById(id);
	}

	@Override
	public Publish save(Publish entity) throws Exception {
		return publishDao.save(entity);
	}


	@Override
	public void delete(Publish entity) throws Exception {
		publishDao.delete(entity);
	}


	@Override
	public Publish update(Publish entity) throws Exception {
		// TODO Auto-generated method stub
		return publishDao.update(entity);
	}


	@Override
	public List<Publish> findAll() {
		return null;
	}


	@Override
	public Publish findById(Long id) throws Exception {
		// TODO Auto-generated method stub
		return publishDao.findById(id);
	}
	
	@Override
	public Publish findById(Object id) throws Exception {
		// TODO Auto-generated method stub
		return publishDao.findById(id);
	}

	@Override
	public List<Publish> findDownload(String name,String updataDate) {
		return publishDao.findDownload(name,updataDate);
	}

	@Override
	public List<Publish> downloadInfo(String publishId) {
		return publishDao.downloadInfo(publishId);
	}

	public String packagePublish(HttpServletRequest request ,TrainNumberView view) throws  Exception {
		String zipUrl = "";
		String goodsIds = request.getParameter("goodsIds");  //商品id集合
		String columnIds = request.getParameter("columnIds");  //栏目id集合
		String templetlistIds = "";   //模版套装id集合
		String templetIds = "";    //模版id集合
	
		/**获取下发文件路径*/
		String downloadPath =  request.getSession().getServletContext().getRealPath("")+"/"+StaticConfig.downloadUrl+"/zip/temp/"+request.getParameter("name").replace(".zip", "");
		
		/**生成车次内容*/
		List<ShiftInfo> shiftInfos = new ArrayList<ShiftInfo>();
		ShiftInfo shiftInfo = new ShiftInfo();
		shiftInfo.setShiftInfoId(UUID.randomUUID().toString().replaceAll("-", ""));
		shiftInfo.setShiftTrainCode(view.getTrainNumber());
		shiftInfo.setShiftState("1");
		shiftInfo.setShiftDate(DateUtils.stringToDate((String)request.getParameter("pubDate"),"yyyy-MM-dd"));
		shiftInfos.add(shiftInfo);
		new JsonUtil<ShiftInfo>().saveEntityToFile(downloadPath,"ShiftInfo.json", shiftInfos);
		
		/**生成     GoodsInfo.json文件*/
		List<GoodsInfo> goods =  goodsInfoService.findByIds(parseStr(goodsIds));
		new JsonUtil<GoodsInfo>().saveEntityToFile(downloadPath,"GoodsInfo.json", goods);
		
		//读json文件
		//List<GoodsInfo> returnList =new JsonUtil<GoodsInfo>().readFileToEntity(zipRootPath+"\\test.json", GoodsInfo.class); 

		/**生成     PublishGoods.json文件*/
		List<PublishGoods> publishGoods =  publishGoodsService.findByGoodsIds(parseStr(goodsIds));
		new JsonUtil<PublishGoods>().saveEntityToFile(downloadPath,"PublishGoods.json", publishGoods);
		
		/**生成     Column.json文件*/
		List<Colume> columes =  columeService.findByColumnIds(parseStr(columnIds));
		new JsonUtil<Colume>().saveEntityToFile(downloadPath,"Column.json", columes);
		
		/**生成     TempletList.json文件*/
		if(columes.size()>0){
			for(int i=0;i<columes.size();i++){
				templetlistIds = templetlistIds +","+ columes.get(i).getTempletListId();
			}
		}
		List<TempletList> templetlists =  templetListService.findByTempletlistIds(parseStr(templetlistIds));
		new JsonUtil<TempletList>().saveEntityToFile(downloadPath,"TempletList.json", templetlists);
		
		/**生成     Templet.json文件*/
		List<Templet> templets =  templetService.findByTempletlistIds(parseStr(templetlistIds));
		new JsonUtil<Templet>().saveEntityToFile(downloadPath,"Templet.json", templets);

		/**拷贝生成模版文件*/
		
		if(templets.size()>0){
			for(int i=0;i<templets.size();i++){
				Templet templet = templets.get(i);
				if(templet.getUrl()!=null && !"".equals(templet.getUrl())){
					//取文件夹名称
					String templetName = templet.getUrl().substring(templet.getUrl().lastIndexOf("/")+1,templet.getUrl().length())+"/";
					String targetTempletUrl ="";
					String sourceTempletUrl ="";
					if(!"html".equals(templet.getExtension())){
						targetTempletUrl = downloadPath+"/"+StaticConfig.page_templ_url+"/"+templetName+templet.getExtension()+"/"+templet.getName()+"."+templet.getExtension(); //目标路径
						sourceTempletUrl = templet.getUrl()+"/"+templet.getExtension()+"/"+templet.getName()+"."+templet.getExtension();//源路径
					}else{
						targetTempletUrl = downloadPath+"/"+StaticConfig.page_templ_url+"/"+templetName+templet.getName()+"."+templet.getExtension(); //目标路径
						sourceTempletUrl = templet.getUrl()+"/"+templet.getName()+"."+templet.getExtension();//源路径
					}
					FileUtils.copyFile(sourceTempletUrl,targetTempletUrl);
				}
			}
		}
		
		/**拷贝商品图片*/
		String uploadPath =  request.getSession().getServletContext().getRealPath("")+"/"+StaticConfig.uploadUrl;
		String sourceImageUrl = uploadPath+"/images/";
		String targetImageUrl = downloadPath+"/"+StaticConfig.uploadUrl+"/images/";
		if(goods.size()>0){
			for(int i=0;i<goods.size();i++){
				GoodsInfo good = goods.get(i);
				if(good.getTitleImgUrl()!=null && !"".equals(good.getTitleImgUrl())){
					FileUtils.copyFile(sourceImageUrl+good.getTitleImgName(),targetImageUrl+good.getTitleImgName());
				}
				if(good.getSmallImgUrl()!=null && !"".equals(good.getSmallImgUrl())){
					FileUtils.copyFile(sourceImageUrl+good.getSmallImgName(),targetImageUrl+good.getSmallImgName());
				}
				if(good.getImgUrl1()!=null && !"".equals(good.getImgUrl1())){
					FileUtils.copyFile(sourceImageUrl+good.getImgName1(),targetImageUrl+good.getImgName1());
				}
				if(good.getImgUrl2()!=null && !"".equals(good.getImgUrl2())){
					FileUtils.copyFile(sourceImageUrl+good.getImgName2(),targetImageUrl+good.getImgName2());
				}
				if(good.getImgUrl3()!=null && !"".equals(good.getImgUrl3())){
					FileUtils.copyFile(sourceImageUrl+good.getImgName3(),targetImageUrl+good.getImgName3());
				}
				if(good.getImgUrl4()!=null && !"".equals(good.getImgUrl4())){
					FileUtils.copyFile(sourceImageUrl+good.getImgName4(),targetImageUrl+good.getImgName4());
				}
				if(good.getImgUrl5()!=null && !"".equals(good.getImgUrl5())){
					FileUtils.copyFile(sourceImageUrl+good.getImgName5(),targetImageUrl+good.getImgName5());
				}
			}
		}
		
		/**分卷压缩*/
		String dest =  request.getSession().getServletContext().getRealPath("")+"/"+StaticConfig.downloadUrl+"/zip/"+request.getParameter("name");
		List<File> zipFiles  = zip4jUtil.splitZip(downloadPath, dest, true, "");
		
		/**分卷压缩存入数据库*/
		String parentFileId = "";
		String parentFileName = "";
		Subject subject = SecurityUtils.getSubject();
		Object principal = subject.getPrincipal();//获取用户登录信息
		// 父文件插入数据库
		for (File f : zipFiles) {
			if (CustomFileUtils.getFileExt(f.getName()).equals("zip")) {
				// 主包 。zip
				FileTransfer file = new FileTransfer();
				file.setFileId(UUID.randomUUID().toString().replaceAll("-", ""));
				file.setFileName(f.getName());
				file.setFileSize(f.length());
				file.setMD5String(MD5CheckUtil.getMD5Checksum(f));
				file.setFilePath(f.getPath());
				file.setFileExt(CustomFileUtils.getFileExt(f.getName()));
				file.setFileType(StaticValue.FILE_ISPARENT_TRUE);
				file.setFilePid(parentFileId);
				file.setFromTo(StaticValue.FILE_FROMTO_TOTRAIN);
				file.setFileState(StaticValue.FILE_TRANSFESTATE_FALSE);
				file.setTrainCode(request.getParameter("trainNo"));
				file.setTrainDate(new Date());
				file.setCreator(principal.toString());
				file.setCreateDate(new Date());
				
				parentFileId = fileTransferDao.save(file).getFileId();
				parentFileName = f.getName();

			} else {
				// 分卷包 .z00
				FileTransfer file = new FileTransfer();
				file.setFileId(UUID.randomUUID().toString().replaceAll("-", ""));
				file.setFileName(f.getName());
				file.setMD5String(MD5CheckUtil.getMD5Checksum(f));
				file.setFilePath(f.getPath());
				file.setFileExt(CustomFileUtils.getFileExt(f.getName()));
				file.setFileType(StaticValue.FILE_ISPARENT_TRUE);
				file.setFilePid(parentFileId);
				file.setFileSize(f.length());
				file.setFromTo(StaticValue.FILE_FROMTO_TOTRAIN);
				file.setFileState(StaticValue.FILE_TRANSFESTATE_FALSE);
				file.setTrainCode(request.getParameter("trainNo"));
				file.setTrainDate(new Date());
				file.setCreator(principal.toString());
				file.setCreateDate(new Date());
				
				fileTransferDao.save(file);
			}

		}
		
		/** 删除临时目录temp*/
		File fileTemp = new File(request.getSession().getServletContext().getRealPath("")+"/"+StaticConfig.downloadUrl+"/zip/temp");
		FileUtils.deleteDir(fileTemp);
		
		/**返回zipUrl路径*/
		zipUrl = StaticConfig.downloadUrl+"/zip/"+parentFileName;
		
		return zipUrl;
	}
	
	//将字符串参数都加上引号
	public String  parseStr(String arg) {
		String returnStr  = "";
		String[] args = arg.split(",");
		for(int i=0;i<args.length;i++){
			returnStr = returnStr + "'" +args[i] + "',";
		}
		returnStr = returnStr.substring(0,returnStr.length()-1);
		return returnStr;
	}	

}
