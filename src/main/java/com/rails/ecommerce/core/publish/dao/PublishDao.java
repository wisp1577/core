package com.rails.ecommerce.core.publish.dao;

import java.util.List;

import com.rails.common.core.frame.generic.dao.GenericDao;
import com.rails.ecommerce.core.common.domain.PaginationList;
import com.rails.ecommerce.core.publish.domain.Publish;

public interface PublishDao extends GenericDao<Publish> {

	public PaginationList findAllPage(String name,String trainNo,String beginDate,String endDate,int pageNo, int pageSize)throws Exception;

	public List<Publish> findTrainNo(String trainNo) throws Exception;
	
	public Publish findById(String id)throws Exception;
	
	public List<Publish> findDownload(String name,String updataDate);
	
	public List<Publish> downloadInfo(String publishId);
}
