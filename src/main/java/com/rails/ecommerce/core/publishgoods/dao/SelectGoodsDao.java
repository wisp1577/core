package com.rails.ecommerce.core.publishgoods.dao;

import com.rails.common.core.frame.generic.dao.GenericDao;
import com.rails.ecommerce.core.common.domain.PaginationList;
import com.rails.ecommerce.core.publishgoods.domain.PublishGoods;

public interface SelectGoodsDao extends GenericDao<PublishGoods> {

	public PaginationList findAllPage(String columnId,String goodsTitle,String state,String beginDate,String endDate,int pageNo, int pageSize)throws Exception;

}
