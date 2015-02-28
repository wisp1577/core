package com.rails.ecommerce.core.publish.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.rails.common.core.frame.generic.service.GenericService;
import com.rails.ecommerce.core.common.domain.PaginationList;
import com.rails.ecommerce.core.common.domain.TrainNumberView;
import com.rails.ecommerce.core.publish.domain.Publish;

public interface PublishService extends GenericService<Publish> {
	
	public PaginationList findAllPage(String name,String trainNo,String beginDate,String endDate,int pageNo,int pageSize)  throws Exception;

	public List<Publish> findTrainNo(String trainNo) throws Exception;
	
	public Publish findById(String id)throws Exception;
	
	public List<Publish> findDownload(String name,String updataDate);
	
	public List<Publish> downloadInfo(String publishId);
	
	//打包
	public String packagePublish(HttpServletRequest request,TrainNumberView view) throws  Exception ;
}
