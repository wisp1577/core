package com.rails.ecommerce.core.student.daoImpl;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.rails.common.core.frame.generic.dao.GenericDaoImpl;
import com.rails.ecommerce.core.common.domain.PaginationList;
import com.rails.ecommerce.core.student.dao.StudentDao;
import com.rails.ecommerce.core.student.domain.StudentInfo;

@Repository("StudentDaoImpl")
public class StudentDaoImpl extends GenericDaoImpl<StudentInfo> implements StudentDao {

	@Override
	public StudentInfo save(StudentInfo entity) throws Exception {
		return super.save(entity);
	}
	
	@Override
	public PaginationList findAllPage(String cardNo, String jxid, String beginDate,
			String endDate, int pageNo, int pageSize) throws Exception {
		
		String select ="select student ";
		String sql = " from com.rails.ecommerce.core.student.domain.StudentInfo student ";
		if(cardNo != null && !"".equals(cardNo)) {
			if(sql.indexOf("where")==-1) {
				sql = sql + "where student.stId = '"+cardNo+"'";
			} else {
				sql =  sql + " and student.stId = '"+cardNo+"'";
			}
		}
		if(jxid!=null && !"".equals(jxid)) {
			if(sql.indexOf("where")==-1) {
				sql = sql + "where student.jxid = '"+jxid+"'";
			} else {
				sql =  sql + " and student.jxid = '"+jxid+"'";
			}
		}
//		if(beginDate!=null && !"".equals(beginDate)) {
//			if(sql.indexOf("where")==-1) {
//				sql = sql + "where student.createDate >= '"+beginDate+"'";
//			} else {
//				sql =  sql + " and student.createDate >= '"+beginDate+"'";
//			}
//		}
//		if(endDate!=null && !"".equals(endDate)) {
//			if(sql.indexOf("where")==-1) {
//				sql = sql + "where student.createDate <= '"+endDate+"'";
//			} else {
//				sql =  sql + " and student.createDate <= '"+endDate+"'";
//			}
//		}
		
		TypedQuery<StudentInfo> query = em.createQuery(select + sql + " order by student.usexss asc", StudentInfo.class);
		query.setFirstResult((pageNo-1)*pageSize); 
		query.setMaxResults(pageSize); 
		
		PaginationList pageList = new PaginationList();
		pageList.setTotal(findTotal(sql));
		pageList.setRows(query.getResultList());
		return pageList;
	}
	
	public int findTotal(String sqlStr) {
		int totalrow = 0;
		String sql = "select count(stId) " + sqlStr;
		Query query;
		query = em.createQuery(sql);
		totalrow = Integer.parseInt(query.getResultList().get(0).toString());
		return totalrow;
	}

}
