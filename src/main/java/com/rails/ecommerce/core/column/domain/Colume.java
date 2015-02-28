package com.rails.ecommerce.core.column.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 *  Class Name: Column.java
 *  Function:栏目实体类
 *  
 *  Modifications:   
 *  
 *  @author zjf  DateTime 2015-1-9 下午4:11:14    
 *  @version 1.0
 */
@Entity
@Table(name="ecommerce_column")
public class Colume{

	//@GeneratedValue(strategy=GenerationType.AUTO) 
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@Column(name="column_id")
	private String columnId;
	
	@Column(name="pid")
	private String pid;
	
	@Column(name="isLeafNode",length=100) 
	private String  isLeafNode;//是否是叶子节点
	
	@Column(name="templet_list_type",length=100) 
	private String templetListType;//栏目绑带套装类型

	@Column(name="name",length=255)
	private String name;
	
	@Column(name="code",length=255)
	private String code;
	
	@Column(name="is_show",length=1)
	private String isShow;
	
	@Column(name="c_order",length=20)
	private String order;
	
	@Column(name="is_default",length=1)
	private String isDefault;
	
	@Column(name="image_url",length=1024)
	private String imageUrl;

	@Column(name="descript",length=4000)
	private String descript;
	
	@Column(name="unit",length=255)
	private String unit;
	
	@Column(name="create_date")
	private Date createDate;
	
	@Column(name="create_user",length=50)
	private String createUser;
	
	@Column(name="last_modify_date")
	private Date lastModifyDate;
	
	@Column(name="templet_list_id")
	private String templetListId;
	

	public String getTempletListId() {
		return templetListId;
	}

	public void setTempletListId(String templetListId) {
		this.templetListId = templetListId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getIsShow() {
		return isShow;
	}

	public void setIsShow(String isShow) {
		this.isShow = isShow;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public String getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(String isDefault) {
		this.isDefault = isDefault;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getDescript() {
		return descript;
	}

	public void setDescript(String descript) {
		this.descript = descript;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getLastModifyDate() {
		return lastModifyDate;
	}

	public void setLastModifyDate(Date lastModifyDate) {
		this.lastModifyDate = lastModifyDate;
	}

	public String getColumnId() {
		return columnId;
	}

	public void setColumnId(String columnId) {
		this.columnId = columnId;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getIsLeafNode() {
		return isLeafNode;
	}

	public void setIsLeafNode(String isLeafNode) {
		this.isLeafNode = isLeafNode;
	}

	  
	public String getTempletListType() {
		return templetListType;
	}

	public void setTempletListType(String templetListType) {
		this.templetListType = templetListType;
	}
}
