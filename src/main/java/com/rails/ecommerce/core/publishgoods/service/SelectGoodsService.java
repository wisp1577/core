package com.rails.ecommerce.core.publishgoods.service;

import com.rails.common.core.frame.generic.service.GenericService;
import com.rails.ecommerce.core.common.domain.PaginationList;
import com.rails.ecommerce.core.publishgoods.domain.PublishGoods;

public interface SelectGoodsService extends GenericService<PublishGoods> {
	
	public PaginationList findAllPage(String columnId,String goodsTitle,String state,String beginDate,String endDate,int pageNo,int pageSize)  throws Exception;
	

}
