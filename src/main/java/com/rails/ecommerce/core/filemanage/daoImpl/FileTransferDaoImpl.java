package com.rails.ecommerce.core.filemanage.daoImpl;


import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.rails.common.core.frame.generic.dao.GenericDaoImpl;
import com.rails.ecommerce.core.filemanage.dao.FileTransferDao;
import com.rails.ecommerce.core.filemanage.domain.FileTransfer;
import com.rails.ecommerce.core.publish.domain.Publish;

@Repository("FileTransferDaoImpl")
public class FileTransferDaoImpl extends GenericDaoImpl<FileTransfer> implements FileTransferDao {

	@Override
	public FileTransfer save(FileTransfer entity) throws Exception {
		return super.save(entity);
	}

	@Override
	public List<FileTransfer> findFileTransfer(String fileName) {
		String sql = "FROM com.rails.ecommerce.core.filemanage.domain.FileTransfer as fileTransfer where fileTransfer.fileName = :fileName";
		TypedQuery<FileTransfer> query = em.createQuery(sql, FileTransfer.class);
		      query.setParameter("fileName", fileName);
		      return query.getResultList();
	}
	

}
