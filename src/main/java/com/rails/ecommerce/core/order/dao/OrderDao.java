package com.rails.ecommerce.core.order.dao;

import com.rails.common.core.frame.generic.dao.GenericDao;
import com.rails.ecommerce.core.common.domain.PaginationList;
import com.rails.ecommerce.core.order.domain.OrderInfo;

public interface OrderDao extends GenericDao<OrderInfo> {

	public PaginationList findAllPage(String organization, String trainNo, String beginDate, String endDate, int pageNo, int pageSize) throws Exception;

}
