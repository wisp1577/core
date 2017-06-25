//package com.rails.ecommerce.core.logger.serviceImpl;
//
//import java.util.List;
//
//import javax.annotation.Resource;
//
//import org.springframework.stereotype.Service;
//
//import com.rails.ecommerce.core.common.domain.PaginationList;
//import com.rails.ecommerce.core.student.dao.StudentDao;
//import com.rails.ecommerce.core.student.domain.StudentInfo;
//import com.rails.ecommerce.core.student.service.StudentService;
//
//@Service("LoggerServiceImpl")
//public class LoggerServiceImpl  implements StudentService {
//	
//	@Resource(name = "StudentDaoImpl")
//	private StudentDao studentDao;
//
//	
//	@Override
//	public PaginationList findAllPage(String cardNo, String jxid, String beginDate, String endDate, int pageNo, int pageSize) throws Exception {
//		return studentDao.findAllPage(cardNo, jxid, beginDate, endDate, pageNo, pageSize);
//	}
//
//
//	@Override
//	public StudentInfo save(StudentInfo entity) throws Exception {
//		return studentDao.save(entity);
//	}
//
//
//	@Override
//	public void delete(StudentInfo entity) throws Exception {
//		// TODO Auto-generated method stub
//		studentDao.delete(entity);
//	}
//
//
//	@Override
//	public StudentInfo update(StudentInfo entity) throws Exception {
//		// TODO Auto-generated method stub
//		return studentDao.update(entity);
//	}
//
//
//	@Override
//	public List<StudentInfo> findAll() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//
//	@Override
//	public StudentInfo findById(Long id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	
//	@Override
//	public StudentInfo findById(Object id) throws Exception {
//		// TODO Auto-generated method stub
//		return studentDao.findById(id);
//	}
//	
//
//}
