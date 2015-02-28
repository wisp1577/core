package com.rails.ecommerce.core.templet.domain;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 
 *  Class Name: EcommerceTemplet.java
 *  Function:模板实体类
 *  
 *  Modifications:   
 *  
 *  @author zjf  DateTime 2015-1-9 上午9:14:04    
 *  @version 1.0
 */

@Entity  
@Table(name="ecommerce_templet")  
public class Templet {
	
	@Id 
	@Column(name="templet_id")  
	private String templetId;
	
	@Column(name="name",length=255) 
	private String name;
	
	@Column(name="extension",length=100) 
	private String extension; //扩展名
	
	@Column(name="descript",length=1024)
	private String descript;
	
	@Column(name="url",length=1024)  
	private String url;
	
	@Column(name="content",length=500)  
	private String content;
	 
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
	 
	public String getTempletId() {
		return templetId;
	}
	public void setTempletId(String templetId) {
		this.templetId = templetId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
	
	public String getDescript() {
		return descript;
	}
	public void setDescript(String descript) {
		this.descript = descript;
	}
		
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
		
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
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
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}
	

}
