package com.rails.ecommerce.core.column.service;
import java.util.List;

import com.rails.common.core.frame.generic.service.GenericService;
import com.rails.ecommerce.core.column.domain.Colume;
import com.rails.ecommerce.core.common.domain.PaginationList;
import com.rails.ecommerce.core.common.domain.TreeList;

public interface ColumeService extends GenericService<Colume>{

	public PaginationList findAllPage(String orgIds,String organization,String statDate,String endDate,int pageNo,int pageSize)  throws Exception;
	
	public List<TreeList>  findAllPid(String id)  throws Exception;
	
	public List<Colume> findByColumnIds(String columnIds)throws Exception;
}
