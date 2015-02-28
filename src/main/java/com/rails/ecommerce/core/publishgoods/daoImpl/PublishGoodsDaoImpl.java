package com.rails.ecommerce.core.publishgoods.daoImpl;


import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.rails.common.core.frame.generic.dao.GenericDaoImpl;
import com.rails.ecommerce.core.column.domain.Colume;
import com.rails.ecommerce.core.common.domain.PaginationList;
import com.rails.ecommerce.core.goodsinfo.domain.GoodsInfo;
import com.rails.ecommerce.core.publishgoods.dao.PublishGoodsDao;
import com.rails.ecommerce.core.publishgoods.domain.PublishGoods;

@Repository("PublishGoodsDaoImpl")
public class PublishGoodsDaoImpl extends GenericDaoImpl<PublishGoods> implements PublishGoodsDao {

	@Override
	public PublishGoods save(PublishGoods entity) throws Exception {
		return super.save(entity);
	}
	
	
	public PaginationList findAllPage(String columnId,String goodsTitle,String state,String beginDate,String endDate,int pageNo, int pageSize)throws Exception{
		String select ="select goods ";
		String in = " goods.goodsInfoId in( select p.goodsInfoId from com.rails.ecommerce.core.publishgoods.domain.PublishGoods p where columnId='"+columnId+"')";
		String sql = " from com.rails.ecommerce.core.goodsinfo.domain.GoodsInfo goods where" + in;
		if(goodsTitle!=null && !"".equals(goodsTitle)){
			sql =  sql + " and goods.goodsTitle like '%"+goodsTitle+"%'";
		}
		if(state!=null && !"".equals(state)){
			sql =  sql + " and goods.state = '"+state+"'";
		}
		if(beginDate!=null && !"".equals(beginDate)){
			sql =  sql + " and goods.createDate >= '"+beginDate+"'";
		}
		if(endDate!=null && !"".equals(endDate)){
			sql =  sql + " and goods.createDate <= '"+endDate+"'";
		}
		TypedQuery<GoodsInfo> query = em.createQuery(select + sql + " order by goods.createDate desc", GoodsInfo.class);
		query.setFirstResult((pageNo-1)*pageSize); 
		query.setMaxResults(pageSize); 
		
		PaginationList pageList = new PaginationList();
		pageList.setTotal(findTotal(sql));
		pageList.setRows(query.getResultList());
		return pageList;
	}
	
	public int findTotal(String sqlStr) {
		int totalrow = 0;
		String sql = "select count(goodsInfoId) " + sqlStr;
		Query query;
		query = em.createQuery(sql);
		totalrow = Integer.parseInt(query.getResultList().get(0).toString());
		return totalrow;
	}

	public List<PublishGoods> findByColumnGoodsInfoId(String goodsInfoId,String columnId)throws Exception{
		String sql = "select pub from com.rails.ecommerce.core.publishgoods.domain.PublishGoods pub where pub.goodsInfoId ='"+goodsInfoId+"' and pub.columnId='"+columnId+"'";
		TypedQuery<PublishGoods> query = em.createQuery(sql, PublishGoods.class);
		return query.getResultList();
		
	}


	@Override
	public void delete(PublishGoods entity) throws Exception {
		super.delete(entity);
	}
	
	@Override
	public PublishGoods findById(Object id) throws Exception {
		// TODO Auto-generated method stub
		return super.findById(id);
	}


	@Override
	public PublishGoods update(PublishGoods entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<PublishGoods> findByColumnId(String columnId) throws Exception {
		String sql="select publishGoods from com.rails.ecommerce.core.publishgoods.domain.PublishGoods publishGoods where columnId='"+columnId+"'";
		TypedQuery<PublishGoods> query = em.createQuery(sql, PublishGoods.class);
		return query.getResultList();
	}
	
	@Override
	public List<PublishGoods> findByGoodsIds(String goodsIds)throws Exception{
		String sql="select publishGoods from com.rails.ecommerce.core.publishgoods.domain.PublishGoods publishGoods where goodsInfoId in ("+goodsIds+")";
		TypedQuery<PublishGoods> query = em.createQuery(sql, PublishGoods.class);
		return query.getResultList();
	}


}
