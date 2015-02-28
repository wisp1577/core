package com.rails.ecommerce.core.publishgoods.daoImpl;


import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.rails.common.core.frame.generic.dao.GenericDaoImpl;
import com.rails.ecommerce.core.common.domain.PaginationList;
import com.rails.ecommerce.core.goodsinfo.domain.GoodsInfo;
import com.rails.ecommerce.core.publishgoods.dao.SelectGoodsDao;
import com.rails.ecommerce.core.publishgoods.domain.PublishGoods;

@Repository("SelectGoodsDaoImpl")
public class SelectGoodsDaoImpl extends GenericDaoImpl<PublishGoods> implements SelectGoodsDao {

	
	public PaginationList findAllPage(String columnId,String goodsTitle,String state,String beginDate,String endDate,int pageNo, int pageSize)throws Exception{
		String select ="select goods.* ";
		String sql = " from ecommerce.ecommerce_goods_info goods  " +
				"left join " +
				"(select * from  ecommerce.commerce_publish_goods c where c.column_id='"+columnId+"') pub " +
				"on goods.goods_info_id = pub.goods_info_id" +
				" where  pub.goods_info_id is null" ;
		
		if(goodsTitle!=null && !"".equals(goodsTitle)){
			sql =  sql + " and goods.goods_title like '%"+goodsTitle+"%'";
		}
		if(state!=null && !"".equals(state)){
			sql =  sql + " and goods.state = '"+state+"'";
		}
		if(beginDate!=null && !"".equals(beginDate)){
			sql =  sql + " and goods.create_date >= '"+beginDate+"'";
		}
		if(endDate!=null && !"".equals(endDate)){
			sql =  sql + " and goods.create_date <= '"+endDate+"'";
		}
		//Query q = em.createQuery("select goods from com.rails.ecommerce.core.goodsinfo.domain.GoodsInfo goods ");
		TypedQuery<GoodsInfo>  query  = (TypedQuery<GoodsInfo>) em.createNativeQuery(select + sql + " order by goods.create_date desc",GoodsInfo.class);

		//TypedQuery<GoodsInfo> query = em.createQuery(select + sql + " order by goods.createDate desc", GoodsInfo.class);
		query.setFirstResult((pageNo-1)*pageSize); 
		query.setMaxResults(pageSize); 
		
		PaginationList pageList = new PaginationList();
		pageList.setTotal(findTotal(sql));
		pageList.setRows(query.getResultList());
		return pageList;
	}
	
	public int findTotal(String sqlStr) {
		int totalrow = 0;
		String sql = "select count(goods.goods_info_id) " + sqlStr;
		Query query;
		query = em.createNativeQuery(sql);
		totalrow = Integer.parseInt(query.getResultList().get(0).toString());
		return totalrow;
	}

	


}
