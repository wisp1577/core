package com.rails.ecommerce.core.publishgoods.serviceImpl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.rails.ecommerce.core.common.domain.PaginationList;
import com.rails.ecommerce.core.publishgoods.dao.PublishGoodsDao;
import com.rails.ecommerce.core.publishgoods.domain.PublishGoods;
import com.rails.ecommerce.core.publishgoods.service.PublishGoodsService;


@Service("PublishGoodsServiceImpl")
public class PublishGoodsServiceImpl  implements PublishGoodsService {
	
	@Resource(name = "PublishGoodsDaoImpl")
	private PublishGoodsDao publishGoodsDao;

	
	@Override
	public PaginationList findAllPage(String columnId,String goodsTitle,String state,String beginDate,String endDate,int pageNo, int pageSize)throws Exception {
		return publishGoodsDao.findAllPage(columnId, goodsTitle, state, beginDate, endDate,pageNo, pageSize);
	}
	
	@Override
	public List<PublishGoods> findByColumnGoodsInfoId(String goodsInfoId,String columnId)throws Exception{
		return publishGoodsDao.findByColumnGoodsInfoId( goodsInfoId, columnId);
	}
	
	@Override
	public List<PublishGoods> findByGoodsIds(String goodsIds)throws Exception{
		return publishGoodsDao.findByGoodsIds(goodsIds);
	}


	@Override
	public PublishGoods save(PublishGoods entity) throws Exception {
		return publishGoodsDao.save(entity);
	}


	@Override
	public void delete(PublishGoods entity) throws Exception {
		publishGoodsDao.delete(entity);
	}


	@Override
	public PublishGoods update(PublishGoods entity) throws Exception {
		// TODO Auto-generated method stub
		return publishGoodsDao.update(entity);
	}


	@Override
	public List<PublishGoods> findAll() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public PublishGoods findById(Long id) throws Exception {
		// TODO Auto-generated method stub
		return publishGoodsDao.findById(id);
	}
	
	@Override
	public PublishGoods findById(Object id) throws Exception {
		// TODO Auto-generated method stub
		return publishGoodsDao.findById(id);
	}

	@Override
	public List<PublishGoods> findByColumnId(String columnId) throws Exception {
		// TODO Auto-generated method stub
		return publishGoodsDao.findByColumnId(columnId);
	}


}
