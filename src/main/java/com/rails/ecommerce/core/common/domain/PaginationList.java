package com.rails.ecommerce.core.common.domain;

import java.util.List;


public class PaginationList {
	
	private int total; //总记录数据
	
	private List<?> rows; //行的集合



	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<?> getRows() {
		return rows;
	}

	public void setRows(List<?> rows) {
		this.rows = rows;
	}



	
	
	
	
}
