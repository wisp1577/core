package com.rails.ecommerce.core.templet.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
 *  Class Name: TempletList.java
 *  Function:模板集合类 每个集合为一套模板
 *  
 *  Modifications:   
 *  
 *  @author zjf  DateTime 2015-1-9 上午11:36:45    
 *  @version 1.0
 */
@Entity
@Table(name="ecommerce_templet_list")
public class TempletList {
	
	
	@Id  
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="templet_list_id")  
	private String templetListId;
	
	@Column(name="templet_list_name",length=255)  
	private String templetListName;
	
	@Column(name="templet_list_type",length=255)  
	private String templetListType;//模板套类型
	
	@Column(name="templet_id")  
	private String templetId;
	
	@Column(name="create_date")  
	private Date createDate;
	
	@Column(name="create_user",length=50)  
	private String createUser;
	
	@Column(name="last_modify_date")  
	private Date lastModifyDate;
	
	@Column(name="templet_list_url")
	private String templetListUrl;
	
	public String getTempletListUrl() {
		return templetListUrl;
	}

	public void setTempletListUrl(String templetListUrl) {
		this.templetListUrl = templetListUrl;
	}

	@Column(name="descript")
	private String descript;
	
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

	@Column(name="unit")
	private String unit;
	
	public String getTempletListId() {
		return templetListId;
	}

	public void setTempletListId(String templetListId) {
		this.templetListId = templetListId;
	}

	public String getTempletListName() {
		return templetListName;
	}

	public void setTempletListName(String templetListName) {
		this.templetListName = templetListName;
	}

	public String getTempletId() {
		return templetId;
	}

	public void setTempletId(String templetId) {
		this.templetId = templetId;
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


	public String getTempletListType() {
		return templetListType;
	}

	public void setTempletListType(String templetListType) {
		this.templetListType = templetListType;
	}
}