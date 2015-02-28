package com.rails.ecommerce.core.templet.daoImpl;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.rails.common.core.frame.generic.dao.GenericDaoImpl;
import com.rails.ecommerce.core.common.domain.PaginationList;
import com.rails.ecommerce.core.templet.dao.TempletDao;
import com.rails.ecommerce.core.templet.domain.Templet;
import com.rails.ecommerce.core.templet.domain.TempletList;
/**
 *  Class Name: templetDaoImpl.java
 *  Modifications:    
 *  @author zjf  DateTime 2015-1-13 下午9:41:55    
 *  @version 1.0
 */
@Repository("TempletDaoImpl")
public class TempletDaoImpl extends GenericDaoImpl<Templet> implements TempletDao {

	@Override
	public Templet findById(Long id) throws Exception {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public Templet save(Templet entity) throws Exception {
		// TODO Auto-generated method stub
		return super.save(entity);
	}

	@Override
	public void delete(Templet entity) throws Exception {
		// TODO Auto-generated method stub
		super.delete(entity);
	}
	
	@Override
	public List<Templet> findAll() throws Exception {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Templet update(Templet entity) throws Exception {
		// TODO Auto-generated method stub
		return super.update(entity);
	}

	@Override
	public PaginationList findAllPage(String templetType,String orgIds,String templetListId,String organization, String beginDate,
			String endDate, int pageNo, int pageSize) throws Exception {
	String select ="select templets ";
	String sql = " from com.rails.ecommerce.core.templet.domain.Templet templets ";
	if(orgIds!=null && !"".equals(orgIds)){
		if(sql.indexOf("where")==-1){
			sql = sql + "where templets.unit in ("+orgIds+")";
		}else{
			sql =  sql + " and templets.unit in ("+orgIds+")";
		}
	}
	if(organization!=null && !"".equals(organization)){
		if(sql.indexOf("where")==-1){
			sql = sql + "where templets.unit like '%"+organization+"%'";
		}else{
			sql =  sql + " and templets.unit like '%"+organization+"%'";
		}
	}
	if(beginDate!=null && !"".equals(beginDate)){
		if(sql.indexOf("where")==-1){
			sql = sql + "where templets.createDate >= '"+beginDate+"'";
		}else{
			sql =  sql + " and templets.createDate >= '"+beginDate+"'";
		}
	}
	if(endDate!=null && !"".equals(endDate)){
		if(sql.indexOf("where")==-1){
			sql = sql + "where templets.createDate <= '"+endDate+"'";
		}else{
			sql =  sql + " and templets.createDate <= '"+endDate+"'";
		}
	}
	if(templetListId!=null && !"".equals(templetListId)){
		if(sql.indexOf("where")==-1){
			sql = sql + "where templets.templetListId = '"+templetListId+"'";
		}else{
			sql =  sql + " and templets.templetListId = '"+templetListId+"'";
		}
	}
	if(templetType!=null && !"".equals(templetType)){
		if(sql.indexOf("where")==-1){
			sql = sql + "where templets.extension = '"+templetType+"'";
		}else{
			sql =  sql + " and templets.extension = '"+templetType+"'";
		}
	}
	TypedQuery<Templet> query = em.createQuery(select + sql, Templet.class);
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
		String sql = "select count(templetId) " + sqlStr;
		Query query;
		query = em.createQuery(sql);
		totalrow = Integer.parseInt(query.getResultList().get(0).toString());
		return totalrow;
	}

	@Override
	public List<Templet> findByTempletlistIds(String templetListIds)throws Exception{
		String sql="select templet from com.rails.ecommerce.core.templet.domain.Templet templet where templet.templetListId in ("+templetListIds+")";
		TypedQuery<Templet> query = em.createQuery(sql, Templet.class);
		return query.getResultList();	
	}
	

}
