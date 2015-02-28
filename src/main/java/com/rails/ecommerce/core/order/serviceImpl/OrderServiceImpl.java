package com.rails.ecommerce.core.order.serviceImpl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.rails.ecommerce.core.common.domain.PaginationList;
import com.rails.ecommerce.core.order.dao.OrderDao;
import com.rails.ecommerce.core.order.domain.OrderInfo;
import com.rails.ecommerce.core.order.service.OrderService;


@Service("OrderServiceImpl")
public class OrderServiceImpl  implements OrderService {
	
	@Resource(name = "OrderDaoImpl")
	private OrderDao orderDao;

	
	@Override
	public PaginationList findAllPage(String organization, String trainNo, String beginDate, String endDate, int pageNo, int pageSize) throws Exception {
		return orderDao.findAllPage(organization, trainNo, beginDate, endDate, pageNo, pageSize);
	}


	@Override
	public OrderInfo save(OrderInfo entity) throws Exception {
		return orderDao.save(entity);
	}


	@Override
	public void delete(OrderInfo entity) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public OrderInfo update(OrderInfo entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<OrderInfo> findAll() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public OrderInfo findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public OrderInfo findById(Object id) throws Exception {
		// TODO Auto-generated method stub
		return orderDao.findById(id);
	}
	

}
