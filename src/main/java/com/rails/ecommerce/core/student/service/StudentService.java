package com.rails.ecommerce.core.student.service;

import com.rails.common.core.frame.generic.service.GenericService;
import com.rails.ecommerce.core.common.domain.PaginationList;
import com.rails.ecommerce.core.student.domain.StudentInfo;

public interface StudentService extends GenericService<StudentInfo> {
	
	public PaginationList findAllPage(String cardNo, String cnbh, String jxid, String classSign, String statusName, int pageNo, int pageSize) throws Exception;
	
	public PaginationList findAllCheck(String cardNo, String jxid, String classSign, String statusName, int pageNo, int pageSize, int usexs) throws Exception;
}
