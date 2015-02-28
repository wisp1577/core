package com.rails.ecommerce.core.publishgoods.serviceImpl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.rails.ecommerce.core.common.domain.PaginationList;
import com.rails.ecommerce.core.publishgoods.dao.SelectGoodsDao;
import com.rails.ecommerce.core.publishgoods.domain.PublishGoods;
import com.rails.ecommerce.core.publishgoods.service.SelectGoodsService;


@Service("SelectGoodsServiceImpl")
public class SelectGoodsServiceImpl  implements SelectGoodsService {
	
	@Resource(name = "SelectGoodsDaoImpl")
	private SelectGoodsDao selectGoodsDao;

	
	@Override
	public PaginationList findAllPage(String columnId,String goodsTitle,String state,String beginDate,String endDate,int pageNo, int pageSize)throws Exception {
		return selectGoodsDao.findAllPage(columnId, goodsTitle, state, beginDate, endDate,pageNo, pageSize);
	}


	@Override
	public PublishGoods save(PublishGoods entity) throws Exception {
		return selectGoodsDao.save(entity);
	}


	@Override
	public void delete(PublishGoods entity) throws Exception {
		selectGoodsDao.delete(entity);
	}


	@Override
	public PublishGoods update(PublishGoods entity) throws Exception {
		// TODO Auto-generated method stub
		return selectGoodsDao.update(entity);
	}


	@Override
	public List<PublishGoods> findAll() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public PublishGoods findById(Long id) throws Exception {
		// TODO Auto-generated method stub
		return selectGoodsDao.findById(id);
	}
	
	@Override
	public PublishGoods findById(Object id) throws Exception {
		// TODO Auto-generated method stub
		return selectGoodsDao.findById(id);
	}


}
