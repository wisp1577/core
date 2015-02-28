package com.rails.ecommerce.core.goodsinfo.daoImpl;


import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.rails.common.core.frame.generic.dao.GenericDaoImpl;
import com.rails.ecommerce.core.common.domain.PaginationList;
import com.rails.ecommerce.core.goodsinfo.dao.GoodsInfoDao;
import com.rails.ecommerce.core.goodsinfo.domain.GoodsInfo;

@Repository("GoodsInfoDaoImpl")
public class GoodsInfoDaoImpl extends GenericDaoImpl<GoodsInfo> implements GoodsInfoDao {

	@Override
	public GoodsInfo save(GoodsInfo entity) throws Exception {
		return super.save(entity);
	}
	
	public PaginationList findAllPage(String goodsTitle,String state,String beginDate,String endDate,int pageNo, int pageSize)throws Exception{
		String select ="select goods ";
		String sql = " from com.rails.ecommerce.core.goodsinfo.domain.GoodsInfo goods ";
		if(goodsTitle!=null && !"".equals(goodsTitle)){
			if(sql.indexOf("where")==-1){
				sql = sql + "where goods.goodsTitle like '%"+goodsTitle+"%'";
			}else{
				sql =  sql + " and goods.goodsTitle like '%"+goodsTitle+"%'";
			}
		}
		if(state!=null && !"".equals(state)){
			if(sql.indexOf("where")==-1){
				sql = sql + "where goods.state = '"+state+"'";
			}else{
				sql =  sql + " and goods.state = '"+state+"'";
			}
		}
		if(beginDate!=null && !"".equals(beginDate)){
			if(sql.indexOf("where")==-1){
				sql = sql + "where goods.createDate >= '"+beginDate+"'";
			}else{
				sql =  sql + " and goods.createDate >= '"+beginDate+"'";
			}
		}
		if(endDate!=null && !"".equals(endDate)){
			if(sql.indexOf("where")==-1){
				sql = sql + "where goods.createDate <= '"+endDate+"'";
			}else{
				sql =  sql + " and goods.createDate <= '"+endDate+"'";
			}
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

	public List<GoodsInfo> findByIds(String goodsIds)  throws Exception{
		String select ="select goods ";
		String sql = " from com.rails.ecommerce.core.goodsinfo.domain.GoodsInfo goods ";
		if(goodsIds!=null && !"".equals(goodsIds)){
			if(sql.indexOf("where")==-1){
				sql = sql + "where goods.goodsInfoId in ("+goodsIds+")";
			}else{
				sql =  sql + " and goods.goodsInfoId in ("+goodsIds+")";
			}
		}
		TypedQuery<GoodsInfo> query = em.createQuery(select + sql + " order by goods.createDate desc", GoodsInfo.class);
		return query.getResultList();
	}

}
