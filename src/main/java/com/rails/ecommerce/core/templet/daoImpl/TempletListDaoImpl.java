package com.rails.ecommerce.core.templet.daoImpl;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.rails.common.core.frame.generic.dao.GenericDaoImpl;
import com.rails.ecommerce.core.column.domain.Colume;
import com.rails.ecommerce.core.common.domain.PaginationList;
import com.rails.ecommerce.core.templet.dao.TempletListDao;
import com.rails.ecommerce.core.templet.domain.Templet;
import com.rails.ecommerce.core.templet.domain.TempletList;

@Repository("TempletListDaoImpl")
public class TempletListDaoImpl extends GenericDaoImpl<TempletList> implements TempletListDao {

	@Override
	public TempletList findById(Long id) throws Exception {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public List<TempletList> findAll() throws Exception {
		String select ="select templetLists ";
		String sql = " from com.rails.ecommerce.core.templet.domain.TempletList templetLists ";
		TypedQuery<TempletList> query = em.createQuery(select + sql, TempletList.class);
		List<TempletList> li=query.getResultList();
		return li;
	}

	@Override
	public TempletList save(TempletList entity) throws Exception {
		// TODO Auto-generated method stub
		return super.save(entity);
	}

	@Override
	public void delete(TempletList entity) throws Exception {
		super.delete(entity);
		
	}

	@Override
	public TempletList update(TempletList entity) throws Exception {
		// TODO Auto-generated method stub
		return super.update(entity);
	}

	@Override
	public PaginationList findAllPage(String orgIds,String organization, String beginDate,
			String endDate, int pageNo, int pageSize) throws Exception {
		String select ="select templetLists ";
		String sql = " from com.rails.ecommerce.core.templet.domain.TempletList templetLists ";
		if(orgIds!=null && !"".equals(orgIds)){
			if(sql.indexOf("where")==-1){
				sql = sql + "where templetLists.unit in ("+orgIds+")";
			}else{
				sql =  sql + " and templetLists.unit in ("+orgIds+")";
			}
		}
		if(organization!=null && !"".equals(organization)){
			if(sql.indexOf("where")==-1){
				sql = sql + "where templetLists.unit like '%"+organization+"%'";
			}else{
				sql =  sql + " and templetLists.unit like '%"+organization+"%'";
			}
		}
		if(beginDate!=null && !"".equals(beginDate)){
			if(sql.indexOf("where")==-1){
				sql = sql + "where templetLists.createDate >= '"+beginDate+"'";
			}else{
				sql =  sql + " and templetLists.createDate >= '"+beginDate+"'";
			}
		}
		if(endDate!=null && !"".equals(endDate)){
			if(sql.indexOf("where")==-1){
				sql = sql + "where templetLists.createDate <= '"+endDate+"'";
			}else{
				sql =  sql + " and templetLists.createDate <= '"+endDate+"'";
			}
		}
		TypedQuery<TempletList> query = em.createQuery(select + sql, TempletList.class);
		query.setFirstResult((pageNo-1)*pageSize); 
		query.setMaxResults(pageSize); 
		
		PaginationList pageList = new PaginationList();
		pageList.setTotal(findTotal(sql));
		pageList.setRows(query.getResultList());
		return pageList;
	}

	@Override
	public int findTotal(String sqlStr) {
		int totalrow = 0;
		String sql = "select count(templetListId) " + sqlStr;
		Query query;
		query = em.createQuery(sql);
		totalrow = Integer.parseInt(query.getResultList().get(0).toString());
		return totalrow;
	}

	@Override
	public List<TempletList> findTempletListByType(String templetListType) {
		String select ="select templetLists ";
		String sql = " from com.rails.ecommerce.core.templet.domain.TempletList templetLists ";
		if(templetListType!=null && !"".equals(templetListType)){
				sql = sql + "where templetLists.templetListType = "+templetListType;
		}
		TypedQuery<TempletList> query = em.createQuery(select + sql, TempletList.class);
		List<TempletList> li=query.getResultList();
		return li;
	}
	
	@Override
	public List<TempletList> findByTempletlistIds(String templetListIds)throws Exception{
		String sql="select templetLists from com.rails.ecommerce.core.templet.domain.TempletList templetLists where templetLists.templetListId in ("+templetListIds+")";
		TypedQuery<TempletList> query = em.createQuery(sql, TempletList.class);
		return query.getResultList();	
	}

}
