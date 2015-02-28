package com.rails.ecommerce.core.order.service;

import com.rails.common.core.frame.generic.service.GenericService;
import com.rails.ecommerce.core.common.domain.PaginationList;
import com.rails.ecommerce.core.order.domain.OrderInfo;

public interface OrderService extends GenericService<OrderInfo> {
	
	public PaginationList findAllPage(String organization, String trainNo, String beginDate, String endDate, int pageNo, int pageSize) throws Exception;
	
}
