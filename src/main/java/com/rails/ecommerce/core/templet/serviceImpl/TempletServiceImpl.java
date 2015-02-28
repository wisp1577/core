package com.rails.ecommerce.core.templet.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.rails.ecommerce.core.common.domain.PaginationList;
import com.rails.ecommerce.core.templet.dao.TempletDao;
import com.rails.ecommerce.core.templet.domain.Templet;
import com.rails.ecommerce.core.templet.domain.TempletList;
import com.rails.ecommerce.core.templet.service.TempletService;
/**
 *  Class Name: TempletServiceImpl.java
 *  Function:
 *  Modifications:   
 *  @author zjf  DateTime 2015-1-13 下午9:57:52    
 *  @version 1.0
 */
@Repository("TempletServiceImpl")
public class TempletServiceImpl  implements
		TempletService {

	@Resource(name = "TempletDaoImpl")
	private TempletDao templetDao;

	
	@Override
	public Templet save(Templet entity) throws Exception {
		// TODO Auto-generated method stub
		return templetDao.save(entity);
	}

	@Override
	public void delete(Templet entity) throws Exception {
		// TODO Auto-generated method stub

		templetDao.delete(entity);
	}

	@Override
	public Templet update(Templet entity) throws Exception {
		// TODO Auto-generated method stub
		return templetDao.update(entity);
	}

	@Override
	public List<Templet> findAll() throws Exception {
		// TODO Auto-generated method stub
		return templetDao.findAll();
	}

	@Override
	public Templet findById(Long id) throws Exception {
		// TODO Auto-generated method stub
		return templetDao.findById(id);
	}
	
	@Override
	public Templet findById(Object id) throws Exception {
		// TODO Auto-generated method stub
		return templetDao.findById(id);
	}

	@Override
	public PaginationList findAllPage(String templetType,String orgIds,String templetListId,String organization,String statDate,String endDate,int pageNo, int pageSize)
			throws Exception {
		return templetDao.findAllPage(templetType,orgIds,templetListId,organization, statDate, endDate, pageNo, pageSize);
	}

	@Override
	public List<Templet> findByTempletlistIds(String templetListIds)throws Exception{
		return templetDao.findByTempletlistIds(templetListIds);
	}
}
