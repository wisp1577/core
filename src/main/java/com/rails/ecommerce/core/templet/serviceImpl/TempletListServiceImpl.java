package com.rails.ecommerce.core.templet.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.rails.ecommerce.core.common.domain.PaginationList;
import com.rails.ecommerce.core.templet.dao.TempletListDao;
import com.rails.ecommerce.core.templet.domain.TempletList;
import com.rails.ecommerce.core.templet.service.TempletListService;

@Repository("TempletListServiceImpl")
public class TempletListServiceImpl implements TempletListService {

	@Resource(name = "TempletListDaoImpl")
	private TempletListDao templetListDao;
	@Override
	public TempletList save(TempletList entity) throws Exception {
		// TODO Auto-generated method stub
		return templetListDao.save(entity);
	}

	@Override
	public void delete(TempletList entity) throws Exception {

		templetListDao.delete(entity);
	}

	@Override
	public TempletList update(TempletList entity) throws Exception {
		// TODO Auto-generated method stub
		return templetListDao.update(entity);
	}

	@Override
	public List<TempletList> findAll() throws Exception {
		// TODO Auto-generated method stub
		return templetListDao.findAll();
	}

	@Override
	public TempletList findById(Long id) throws Exception {
		// TODO Auto-generated method stub
		return templetListDao.findById(id);
	}
	
	@Override
	public TempletList findById(Object id) throws Exception {
		// TODO Auto-generated method stub
		return templetListDao.findById(id);
	}


	@Override
	public PaginationList findAllPage(String orgIds ,String organization, String statDate,
			String endDate, int pageNo, int pageSize) throws Exception {
		// TODO Auto-generated method stub
		return  templetListDao.findAllPage(orgIds,organization, statDate, endDate, pageNo, pageSize);
	}

	@Override
	public List<TempletList> findTempletListByType(String templetListType) {
		// TODO Auto-generated method stub
		return templetListDao.findTempletListByType(templetListType);
	}
	
	@Override
	public List<TempletList> findByTempletlistIds(String templetListIds)throws Exception{
		return templetListDao.findByTempletlistIds(templetListIds);
	}

}
