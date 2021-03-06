package com.rails.ecommerce.core.logger.service;

import com.rails.common.core.frame.generic.service.GenericService;
import com.rails.ecommerce.core.common.domain.PaginationList;
import com.rails.ecommerce.core.student.domain.StudentInfo;

public interface LoggerService extends GenericService<StudentInfo> {
	
	public PaginationList findAllPage(String cardNo, String jxid, String beginDate, String endDate, int pageNo, int pageSize) throws Exception;
	
}
