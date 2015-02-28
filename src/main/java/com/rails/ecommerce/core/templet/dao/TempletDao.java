package com.rails.ecommerce.core.templet.dao;

import java.util.List;

import com.rails.common.core.frame.generic.dao.GenericDao;
import com.rails.ecommerce.core.common.domain.PaginationList;
import com.rails.ecommerce.core.templet.domain.Templet;
import com.rails.ecommerce.core.templet.domain.TempletList;
/**
 * 
 *  Class Name: templet.java
 *  Function:
 *  Modifications:    
 *  @author zjf  DateTime 2015-1-13 下午9:37:41    
 *  @version 1.0
 */
public interface TempletDao extends GenericDao<Templet> {
	  
	public PaginationList findAllPage(String templetType,String orgIds,String templetListId,String organization,String statDate,String endDate,int pageNo, int pageSize)throws Exception;
	
	public int findTotal(String sqlStr);
		
	public List<Templet> findByTempletlistIds(String templetListIds)throws Exception;
		
}
