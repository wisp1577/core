package com.rails.ecommerce.core.filemanage.dao;

import java.util.List;

import com.rails.common.core.frame.generic.dao.GenericDao;
import com.rails.ecommerce.core.filemanage.domain.FileTransfer;

public interface FileTransferDao extends GenericDao<FileTransfer> {
	public List<FileTransfer> findFileTransfer(String fileName);

}
