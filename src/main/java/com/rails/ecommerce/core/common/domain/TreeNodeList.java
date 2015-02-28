package com.rails.ecommerce.core.common.domain;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
public class TreeNodeList implements Serializable {
    
	
	private static final long serialVersionUID = 1L;

	private long id;       	//node id, which is important to load remote data
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	private String text;     	//node text to show

	private String state;    	//node state, 'open' or 'closed', default is 'open'. When set to 'closed', the node have children nodes and will load them from remote site
	
	private String checked;  	//Indicate whether the node is checked selected.
	
	private String attributes; 	//custom attributes can be added to a node
	
	private List<TreeNodeList> children;  	// an array nodes defines some children nodes

	private String iconCls;		//CSS class of node icon

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

	public List<TreeNodeList> getChildren() {
		return children;
	}

	public void setChildren(List<TreeNodeList> children) {
		this.children = children;
	}

	public String getChecked() {
		return checked;
	}

	public void setChecked(String checked) {
		this.checked = checked;
	}

	public String getAttributes() {
		return attributes;
	}

	public void setAttributes(String attributes) {
		this.attributes = attributes;
	}

	public String getIconCls() {
		return iconCls;
	}

	public void setIconCls(String iconCls) {
		this.iconCls = iconCls;
	}

}
