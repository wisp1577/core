package com.rails.ecommerce.core.filemanage.service;

import java.util.List;

import com.rails.common.core.frame.generic.service.GenericService;
import com.rails.ecommerce.core.filemanage.domain.FileTransfer;

public interface FileTransferService extends GenericService<FileTransfer> {
	
	public Boolean restore(String currentRootPath, String destFolderPath) throws Exception;
	public List<FileTransfer> findFileTransfer(String fileName);
}
