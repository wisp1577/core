package com.rails.ecommerce.core.goodsinfo.dao;

import java.util.List;

import com.rails.common.core.frame.generic.dao.GenericDao;
import com.rails.ecommerce.core.common.domain.PaginationList;
import com.rails.ecommerce.core.goodsinfo.domain.GoodsInfo;

public interface GoodsInfoDao extends GenericDao<GoodsInfo> {

	public PaginationList findAllPage(String goodsTitle,String state,String beginDate,String endDate,int pageNo, int pageSize)throws Exception;

	public List<GoodsInfo> findByIds(String goodsIds)  throws Exception;
}
