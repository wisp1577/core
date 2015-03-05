package com.rails.ecommerce.core.logger.dao;

import com.rails.common.core.frame.generic.dao.GenericDao;
import com.rails.ecommerce.core.common.domain.PaginationList;
import com.rails.ecommerce.core.student.domain.StudentInfo;

public interface LoggerDao extends GenericDao<StudentInfo> {

	public PaginationList findAllPage(String cardNo, String jxid, String beginDate, String endDate, int pageNo, int pageSize) throws Exception;

}
