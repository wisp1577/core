package com.rails.ecommerce.core.common.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


public class SysResource  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private long id;// 资源编号（主键）
	private long parentid;// 父资源单编号
	
	private long type;// 资源类型（模块、页面和操作）
	
	private String caption;// 标题
	
	private long priority;// 序号
	
	private String permission;// 权限串
	
	private String linkurl;// 应用链接
	
	private String icon;// 应用链接
	
	private String createstaff;// 创建用户
	
	private String createdate;// 创建时间
	
	private String updatestaff;// 修改用户
	
	private String updatedate;// 修改时间
	
	private String reserve1;// 预留字段
	
	private String reserve2;// 预留字段
	
	private String reserve3;// 预留字段
	
	private List<SysResource> menus = new ArrayList<SysResource>();
	
	public List<SysResource> getMenus() {
		return menus;
	}

	public void setMenus(List<SysResource> menus) {
		this.menus = menus;
	}

	/**
	 * @return 获得 id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id 设置 id
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return 获得 parentid
	 */
	public long getParentid() {
		return parentid;
	}

	/**
	 * @param parentid 设置 parentid
	 */
	public void setParentid(long parentid) {
		this.parentid = parentid;
	}

	/**
	 * @return 获得 type
	 */
	public long getType() {
		return type;
	}

	/**
	 * @param type 设置 type
	 */
	public void setType(long type) {
		this.type = type;
	}

	/**
	 * @return 获得 caption
	 */
	public String getCaption() {
		return caption;
	}

	/**
	 * @param caption 设置 caption
	 */
	public void setCaption(String caption) {
		this.caption = caption;
	}

	/**
	 * @return 获得 priority
	 */
	public long getPriority() {
		return priority;
	}

	/**
	 * @param priority 设置 priority
	 */
	public void setPriority(long priority) {
		this.priority = priority;
	}

	/**
	 * @return 获得 permission
	 */
	public String getPermission() {
		return permission;
	}

	/**
	 * @param permission 设置 permission
	 */
	public void setPermission(String permission) {
		this.permission = permission;
	}

	/**
	 * @return 获得 linkurl
	 */
	public String getLinkurl() {
		return linkurl;
	}

	/**
	 * @param linkurl 设置 linkurl
	 */
	public void setLinkurl(String linkurl) {
		this.linkurl = linkurl;
	}

	/**
	 * @return 获得 createstaff
	 */
	public String getCreatestaff() {
		return createstaff;
	}

	/**
	 * @param createstaff 设置 createstaff
	 */
	public void setCreatestaff(String createstaff) {
		this.createstaff = createstaff;
	}

	/**
	 * @return 获得 createdate
	 */
	public String getCreatedate() {
		return createdate;
	}

	/**
	 * @param createdate 设置 createdate
	 */
	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}

	/**
	 * @return 获得 updatestaff
	 */
	public String getUpdatestaff() {
		return updatestaff;
	}

	/**
	 * @param updatestaff 设置 updatestaff
	 */
	public void setUpdatestaff(String updatestaff) {
		this.updatestaff = updatestaff;
	}

	/**
	 * @return 获得 updatedate
	 */
	public String getUpdatedate() {
		return updatedate;
	}

	/**
	 * @param updatedate 设置 updatedate
	 */
	public void setUpdatedate(String updatedate) {
		this.updatedate = updatedate;
	}

	/**
	 * @return 获得 reserve1
	 */
	public String getReserve1() {
		return reserve1;
	}

	/**
	 * @param reserve1 设置 reserve1
	 */
	public void setReserve1(String reserve1) {
		this.reserve1 = reserve1;
	}

	/**
	 * @return 获得 reserve2
	 */
	public String getReserve2() {
		return reserve2;
	}

	/**
	 * @param reserve2 设置 reserve2
	 */
	public void setReserve2(String reserve2) {
		this.reserve2 = reserve2;
	}

	/**
	 * @return 获得 reserve3
	 */
	public String getReserve3() {
		return reserve3;
	}

	/**
	 * @param reserve3 设置 reserve3
	 */
	public void setReserve3(String reserve3) {
		this.reserve3 = reserve3;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	
	

}
