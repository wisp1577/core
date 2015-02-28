package com.rails.ecommerce.core.column.dao;
import java.util.List;

import com.rails.common.core.frame.generic.dao.GenericDao;
import com.rails.ecommerce.core.column.domain.Colume;
import com.rails.ecommerce.core.common.domain.PaginationList;

/**
 *  Class Name: ColumnDao.java
 *  Function:栏目管理DAO 
 *  Modifications:     
 *  @author zjf  DateTime 2015-1-12 下午3:26:56    
 *  @version 1.0
 */
public interface ColumeDao extends GenericDao<Colume> {
  
	public PaginationList findAllPage(String orgIds,String organization,String statDate,String endDate,int pageNo, int pageSize)throws Exception;
	
	public List<Colume> findAllPid(String pid)throws Exception;
	
	public List<Colume> findByColumnIds(String columnIds)throws Exception;
}
