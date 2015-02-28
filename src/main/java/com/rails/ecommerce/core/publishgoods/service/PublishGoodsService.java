package com.rails.ecommerce.core.publishgoods.service;

import java.util.List;

import com.rails.common.core.frame.generic.service.GenericService;
import com.rails.ecommerce.core.common.domain.PaginationList;
import com.rails.ecommerce.core.publishgoods.domain.PublishGoods;

public interface PublishGoodsService extends GenericService<PublishGoods> {
	
	public PaginationList findAllPage(String columnId,String goodsTitle,String state,String beginDate,String endDate,int pageNo,int pageSize)  throws Exception;
	
	public List<PublishGoods> findByColumnGoodsInfoId(String goodsInfoId,String columnId)throws Exception;

	public List<PublishGoods> findByColumnId(String columnId)throws Exception;
	
	public List<PublishGoods> findByGoodsIds(String goodsIds)throws Exception;

}
