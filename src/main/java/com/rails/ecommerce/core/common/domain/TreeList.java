package com.rails.ecommerce.core.common.domain;

import java.util.List;


public class TreeList {
	
	private String id; //节点id
	
	private String text; //节点文本

	private String state;//关闭状态
	
	private List<?> children;  //子集合

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public List<?> getChildren() {
		return children;
	}

	public void setChildren(List<?> children) {
		this.children = children;
	}
	
	
	
}

