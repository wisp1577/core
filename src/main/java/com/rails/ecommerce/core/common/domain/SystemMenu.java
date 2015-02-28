package com.rails.ecommerce.core.common.domain;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;



 /**
 *  Class Name: SystemMenu.java
 *  Function:系统菜单实体
 *  
 *  Modifications:   
 *  
 *  @author lxn  DateTime 2014-12-29 下午9:14:27    
 *  @version 1.0 
 */
@XmlRootElement
public class SystemMenu implements Serializable{

    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long menuid; //菜单id
	
	private String menuname; //菜单名单
	
	private String icon; //菜单图标
	
	private String url; //菜单链接
	
	private long type; //菜单链接
	
	private String permission; //菜单链接
	
	//private List<SystemMenu> menus; //
	
	private List<SystemMenu> menus = new ArrayList<SystemMenu>();
	
	
	  public long getMenuid() {
		return menuid;
	}



	public void setMenuid(long menuid) {
		this.menuid = menuid;
	}



	public String getMenuname() {
		return menuname;
	}

	public void setMenuname(String menuname) {
		this.menuname = menuname;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}



	


	public long getType() {
		return type;
	}



	public void setType(long type) {
		this.type = type;
	}



	public List<SystemMenu> getMenus() {
		return menus;
	}



	public void setMenus(List<SystemMenu> menus) {
		this.menus = menus;
	}



	public String getPermission() {
		return permission;
	}



	public void setPermission(String permission) {
		this.permission = permission;
	}



	


	
}
