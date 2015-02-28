package com.rails.ecommerce.core.templet.service;

import java.util.List;

import com.rails.common.core.frame.generic.service.GenericService;
import com.rails.ecommerce.core.common.domain.PaginationList;
import com.rails.ecommerce.core.templet.domain.TempletList;

public interface TempletListService extends GenericService<TempletList> {
	public PaginationList findAllPage(String orgIds,String organization,String statDate,String endDate,int pageNo,int pageSize)  throws Exception;

	public List<TempletList> findTempletListByType(String templetListType);
	
	public List<TempletList> findByTempletlistIds(String templetListIds)throws Exception;
}
