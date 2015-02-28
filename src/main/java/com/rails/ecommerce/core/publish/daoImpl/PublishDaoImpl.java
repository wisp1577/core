package com.rails.ecommerce.core.publish.daoImpl;


import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.rails.common.core.frame.generic.dao.GenericDaoImpl;
import com.rails.common.utils.DateUtils;
import com.rails.ecommerce.core.common.domain.PaginationList;
import com.rails.ecommerce.core.publish.dao.PublishDao;
import com.rails.ecommerce.core.publish.domain.Publish;

@Repository("PublishDaoImpl")
public class PublishDaoImpl extends GenericDaoImpl<Publish> implements PublishDao {

	
	@Override
	public Publish save(Publish entity) throws Exception {
		return super.save(entity);
	}
	
	public PaginationList findAllPage(String name,String trainNo,String beginDate,String endDate,int pageNo, int pageSize)throws Exception{
		String select ="select pub ";
		String sql = " from com.rails.ecommerce.core.publish.domain.Publish pub ";
		if(name!=null && !"".equals(name)){
			if(sql.indexOf("where")==-1){
				sql = sql + "where pub.name like '%"+name+"%'";
			}else{
				sql =  sql + " and pub.name like '%"+name+"%'";
			}
		}
		if(trainNo!=null && !"".equals(trainNo)){
			if(sql.indexOf("where")==-1){
				sql = sql + "where pub.trainNo = '"+trainNo+"'";
			}else{
				sql =  sql + " and pub.trainNo = '"+trainNo+"'";
			}
		}
		if(beginDate!=null && !"".equals(beginDate)){
			if(sql.indexOf("where")==-1){
				sql = sql + "where pub.createDate >= '"+beginDate+"'";
			}else{
				sql =  sql + " and pub.createDate >= '"+beginDate+"'";
			}
		}
		if(endDate!=null && !"".equals(endDate)){
			if(sql.indexOf("where")==-1){
				sql = sql + "where pub.createDate <= '"+endDate+"'";
			}else{
				sql =  sql + " and pub.createDate <= '"+endDate+"'";
			}
		}
		
		TypedQuery<Publish> query = em.createQuery(select + sql + " order by pub.createDate desc", Publish.class);
		query.setFirstResult((pageNo-1)*pageSize); 
		query.setMaxResults(pageSize); 
		
		PaginationList pageList = new PaginationList();
		pageList.setTotal(findTotal(sql));
		pageList.setRows(query.getResultList());
		return pageList;
	}
	
	public int findTotal(String sqlStr) {
		int totalrow = 0;
		String sql = "select count(publishId) " + sqlStr;
		Query query;
		query = em.createQuery(sql);
		totalrow = Integer.parseInt(query.getResultList().get(0).toString());
		return totalrow;
	}

	public List<Publish> findTrainNo(String trainNo) throws Exception{
		String select ="select pub ";
		String sql = " from com.rails.ecommerce.core.publish.domain.Publish pub ";
		String where = " where pub.trainNo = '"+trainNo+"' order by pub.version desc";
		TypedQuery<Publish> query = em.createQuery(select + sql + where, Publish.class);
		return query.getResultList();
	}
	
	public Publish findById(String id)throws Exception{
		return em.find(Publish.class, id);
	}

	@Override
	public List<Publish> findDownload(String name,String updataDate) {
		String tmpDate = "%"+updataDate+"%";
		String sql = "FROM com.rails.ecommerce.core.publish.domain.Publish as publish where publish.trainNo = :name and publish.name like :updataDate";
		TypedQuery<Publish> query = em.createQuery(sql, Publish.class);
		      query.setParameter("name", name);
		      query.setParameter("updataDate", tmpDate);
		      return query.getResultList();
	}

	@Override
	public void delete(Publish entity) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Publish update(Publish entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Publish> downloadInfo(String publishId) {
		String sql = "FROM com.rails.ecommerce.core.publish.domain.Publish as publish where publish.publishId = :publishId";
		TypedQuery<Publish> query = em.createQuery(sql, Publish.class);
		      query.setParameter("publishId", publishId);
		      return query.getResultList();
	}

}
