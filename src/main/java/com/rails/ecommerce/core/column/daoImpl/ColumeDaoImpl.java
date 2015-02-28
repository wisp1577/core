package com.rails.ecommerce.core.column.daoImpl;


import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.rails.common.core.frame.generic.dao.GenericDaoImpl;
import com.rails.ecommerce.core.column.dao.ColumeDao;
import com.rails.ecommerce.core.column.domain.Colume;
import com.rails.ecommerce.core.common.domain.PaginationList;
import com.rails.ecommerce.core.publishgoods.domain.PublishGoods;
/**
 * 
 *  Class Name: ColumeDaoImpl.java
 *  Function:
 *  
 *  Modifications:   
 *  
 *  @author zjf  DateTime 2015-1-12 下午3:35:52    
 *  @version 1.0
 */
@Repository("ColumeDaoImpl")
public class ColumeDaoImpl extends GenericDaoImpl<Colume> implements ColumeDao {

	
		
		@Override
	public List<Colume> findAll() throws Exception {
			String select ="select columes ";
			String sql = " from com.rails.ecommerce.core.column.domain.Colume columes ";
			TypedQuery<Colume> query = em.createQuery(select + sql, Colume.class);
			List<Colume> li=query.getResultList();
		return li;
	}

		@Override
	public Colume findById(Long id) throws Exception {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

		@Override
	public Colume save(Colume entity) throws Exception {
		// TODO Auto-generated method stub
		return super.save(entity);
	}

	@Override
	public void delete(Colume entity) throws Exception {
		// TODO Auto-generated method stub
		super.delete(entity);
	}

	@Override
	public Colume update(Colume entity) throws Exception {
		// TODO Auto-generated method stub
		return super.update(entity);
	}

		
		
		public int findTotal(String sqlStr) {
			int totalrow = 0;
			String sql = "select count(columnId) " + sqlStr;
			Query query;
			query = em.createQuery(sql);
			totalrow = Integer.parseInt(query.getResultList().get(0).toString());
			return totalrow;
		}
	
	public List<Colume> findAllPid(String pid)throws Exception{
		String select ="select columes ";
		String sql = " from com.rails.ecommerce.core.column.domain.Colume columes where columes.pid ='"+pid+"'";
		TypedQuery<Colume> query =  em.createQuery(select + sql, Colume.class);
		return query.getResultList();
	}

	@Override
	public PaginationList findAllPage(String orgIds,String organization, String beginDate,
			String endDate, int pageNo, int pageSize) throws Exception {
		
			String select ="select columes ";
			String sql = " from com.rails.ecommerce.core.column.domain.Colume columes ";
			if(orgIds!=null && !"".equals(orgIds)){
				if(sql.indexOf("where")==-1){
					sql = sql + "where columes.unit in ("+orgIds+")";
				}else{
					sql =  sql + " and columes.unit in ("+orgIds+")";
				}
			}
			if(organization!=null && !"".equals(organization)){
				if(sql.indexOf("where")==-1){
					sql = sql + "where columes.unit like '%"+organization+"%'";
				}else{
					sql =  sql + " and columes.unit like '%"+organization+"%'";
				}
			}
			if(beginDate!=null && !"".equals(beginDate)){
				if(sql.indexOf("where")==-1){
					sql = sql + "where columes.createDate >= '"+beginDate+"'";
				}else{
					sql =  sql + " and columes.createDate >= '"+beginDate+"'";
				}
			}
			if(endDate!=null && !"".equals(endDate)){
				if(sql.indexOf("where")==-1){
					sql = sql + "where columes.createDate <= '"+endDate+"'";
				}else{
					sql =  sql + " and columes.createDate <= '"+endDate+"'";
				}
			}
			TypedQuery<Colume> query = em.createQuery(select + sql, Colume.class);
			query.setFirstResult((pageNo-1)*pageSize); 
			query.setMaxResults(pageSize); 
			
			PaginationList pageList = new PaginationList();
			pageList.setTotal(findTotal(sql));
			pageList.setRows(query.getResultList());
			return pageList;
		
	}
	
	@Override
	public List<Colume> findByColumnIds(String columnIds)throws Exception{
		String sql="select columes from com.rails.ecommerce.core.column.domain.Colume columes where columes.columnId in ("+columnIds+")";
		TypedQuery<Colume> query = em.createQuery(sql, Colume.class);
		return query.getResultList();
	}
}
