package com.rails.ecommerce.core.goodsinfo.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.rails.common.core.frame.generic.service.GenericService;
import com.rails.ecommerce.core.common.domain.PaginationList;
import com.rails.ecommerce.core.goodsinfo.domain.GoodsInfo;

public interface GoodsInfoService extends GenericService<GoodsInfo> {
	
	public PaginationList findAllPage(String goodsTitle,String state,String beginDate,String endDate,int pageNo,int pageSize)  throws Exception;
	
	public List<GoodsInfo> findByIds(String goodsIds)  throws Exception;
	
	public String imageUpload(HttpServletRequest request) throws Exception;
}
