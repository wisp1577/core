package com.rails.ecommerce.core.templet.dao;

import java.util.List;

import com.rails.common.core.frame.generic.dao.GenericDao;
import com.rails.ecommerce.core.common.domain.PaginationList;
import com.rails.ecommerce.core.templet.domain.TempletList;


public interface TempletListDao extends GenericDao<TempletList> {

	public PaginationList findAllPage(String orgIds,String organization,String statDate,String endDate,int pageNo, int pageSize)throws Exception;

	public int findTotal(String sqlStr);
	
	public List<TempletList> findTempletListByType(String templetListType);
	
	public List<TempletList> findByTempletlistIds(String templetListIds)throws Exception;
}
