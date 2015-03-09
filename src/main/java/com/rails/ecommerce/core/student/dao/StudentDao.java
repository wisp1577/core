package com.rails.ecommerce.core.student.dao;

import com.rails.common.core.frame.generic.dao.GenericDao;
import com.rails.ecommerce.core.common.domain.PaginationList;
import com.rails.ecommerce.core.student.domain.StudentInfo;

public interface StudentDao extends GenericDao<StudentInfo> {

	public PaginationList findAllPage(String cardNo, String jxid, String classSign, String statusName, int pageNo, int pageSize) throws Exception;

}
