package com.rails.ecommerce.core.order.daoImpl;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.rails.common.core.frame.generic.dao.GenericDaoImpl;
import com.rails.ecommerce.core.common.domain.PaginationList;
import com.rails.ecommerce.core.order.dao.OrderDao;
import com.rails.ecommerce.core.order.domain.OrderInfo;

@Repository("OrderDaoImpl")
public class OrderDaoImpl extends GenericDaoImpl<OrderInfo> implements OrderDao {

	@Override
	public OrderInfo save(OrderInfo entity) throws Exception {
		return super.save(entity);
	}
	
	@Override
	public PaginationList findAllPage(String organization, String trainNo, String beginDate,
			String endDate, int pageNo, int pageSize) throws Exception {
		
		String select ="select order ";
		String sql = " from com.rails.ecommerce.core.order.domain.OrderInfo order ";
		if(organization!=null && !"".equals(organization)) {
			if(sql.indexOf("where")==-1) {
				sql = sql + "where order.unit like '%"+organization+"%'";
			} else {
				sql =  sql + " and order.unit like '%"+organization+"%'";
			}
		}
		if(trainNo!=null && !"".equals(trainNo)) {
			if(sql.indexOf("where")==-1) {
				sql = sql + "where order.trainCode = '"+trainNo+"'";
			} else {
				sql =  sql + " and order.trainCode = '"+trainNo+"'";
			}
		}
		if(beginDate!=null && !"".equals(beginDate)) {
			if(sql.indexOf("where")==-1) {
				sql = sql + "where order.createDate >= '"+beginDate+"'";
			} else {
				sql =  sql + " and order.createDate >= '"+beginDate+"'";
			}
		}
		if(endDate!=null && !"".equals(endDate)) {
			if(sql.indexOf("where")==-1) {
				sql = sql + "where order.createDate <= '"+endDate+"'";
			} else {
				sql =  sql + " and order.createDate <= '"+endDate+"'";
			}
		}
		
		TypedQuery<OrderInfo> query = em.createQuery(select + sql + " order by order.createDate desc", OrderInfo.class);
		query.setFirstResult((pageNo-1)*pageSize); 
		query.setMaxResults(pageSize); 
		
		PaginationList pageList = new PaginationList();
		pageList.setTotal(findTotal(sql));
		pageList.setRows(query.getResultList());
		return pageList;
	}
	
	public int findTotal(String sqlStr) {
		int totalrow = 0;
		String sql = "select count(orderInfoId) " + sqlStr;
		Query query;
		query = em.createQuery(sql);
		totalrow = Integer.parseInt(query.getResultList().get(0).toString());
		return totalrow;
	}

}
