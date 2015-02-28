package com.rails.ecommerce.core.templet.service;

import java.util.List;

import com.rails.common.core.frame.generic.service.GenericService;
import com.rails.ecommerce.core.common.domain.PaginationList;
import com.rails.ecommerce.core.templet.domain.Templet;

public interface TempletService extends GenericService<Templet> {
	public PaginationList findAllPage(String templetType,String orgIds,String templetListId,String organization,String statDate,String endDate,int pageNo,int pageSize)  throws Exception;
	
	public List<Templet> findByTempletlistIds(String templetListIds)throws Exception;
}
