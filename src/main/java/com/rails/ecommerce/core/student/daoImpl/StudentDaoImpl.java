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
	public PaginationList findAllPage(String cardNo, String jxid, String classSign, 
			String statusName, int pageNo, int pageSize) throws Exception {
		
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
		if(classSign!=null && !"".equals(classSign)) {
			if ("2".equals(classSign)) {
				if(sql.indexOf("where")==-1) {
					sql = sql + "where (student.stClasssign = '2' OR student.stClasssign = '10000534')";
				} else {
					sql =  sql + " and (student.stClasssign = '2' OR student.stClasssign = '10000534')";
				}
			} else if ("1".equals(classSign)) {
				if(sql.indexOf("where")==-1) {
					sql = sql + "where (student.stClasssign = '1' OR student.stClasssign = '10000533')";
				} else {
					sql =  sql + " and (student.stClasssign = '1' OR student.stClasssign = '10000533')";
				}
			}
			
		}
		if(statusName!=null && !"".equals(statusName)) {
			if ("2".equals(statusName)) {
				if(sql.indexOf("where")==-1) {
					sql = sql + "where (student.stauts = '222' OR student.stauts = '311' OR student.stauts = '312' OR student.stauts = '321')";
				} else {
					sql = sql + "and (student.stauts = '222' OR student.stauts = '311' OR student.stauts = '312' OR student.stauts = '321')";
				}
			} else if ("3".equals(statusName)) {
				if(sql.indexOf("where")==-1) {
					sql = sql + "where (student.stauts = '322' OR student.stauts = '421')";
				} else {
					sql = sql + "and (student.stauts = '322' OR student.stauts = '421')";
				}
			} else if ("4".equals(statusName)) {
				if(sql.indexOf("where")==-1) {
					sql = sql + "where (student.stauts = '422' OR student.stauts = '512' OR student.stauts = '521')";
				} else {
					sql = sql + "and (student.stauts = '422' OR student.stauts = '512' OR student.stauts = '521')";
				}
			} else if ("6".equals(statusName)) {
				if(sql.indexOf("where")==-1) {
					sql = sql + "where student.stauts = '622'";
				} else {
					sql = sql + "and student.stauts = '622'";
				}
			}
		}
		
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
