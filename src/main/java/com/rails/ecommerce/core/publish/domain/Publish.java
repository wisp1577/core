package com.rails.ecommerce.core.publish.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.GenericGenerator;

/**
 * 
 *  Class Name: PublishGoods.java
 *  Function:发布打包表
 *  
 *  Modifications:   
 *  
 *  @author allenCai  DateTime 2015-1-12 下午5:04:43    
 *  @version 1.0
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "commerce_publish")
public class Publish implements Serializable {

	private static final long serialVersionUID = 7913650997879956727L;
	
//	@GeneratedValue(generator = "paymentableGenerator")    
//	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")  
	
	@Id
	@Column(name = "publish_id")
	private String publishId;
	
	@Column(name="train_no",length=255)
	private String trainNo;

	@Column(name="name",length=255)
	private String name;
	
	@Column(name="version",length=10)
	private String version;

	@Column(name="unit",length=255)
	private String unit;

	@Column(name="json_url",length=1024)
	private String jsonUrl;
	
	@Column(name="zip_url",length=1024)
	private String zipUrl;
	
	@Column(name="descript",length=4000)
	private String descript;
	
	@Column(name="create_date")
	private Date createDate;
	
	@Column(name="create_user",length=50)
	private String createUser;
	
	@Column(name="last_modify_date")
	private Date lastModifyDate;

	public String getPublishId() {
		return publishId;
	}

	public void setPublishId(String publishId) {
		this.publishId = publishId;
	}
	
	public String getTrainNo() {
		return trainNo;
	}

	public void setTrainNo(String trainNo) {
		this.trainNo = trainNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getJsonUrl() {
		return jsonUrl;
	}

	public void setJsonUrl(String jsonUrl) {
		this.jsonUrl = jsonUrl;
	}

	public String getZipUrl() {
		return zipUrl;
	}

	public void setZipUrl(String zipUrl) {
		this.zipUrl = zipUrl;
	}

	public String getDescript() {
		return descript;
	}

	public void setDescript(String descript) {
		this.descript = descript;
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
	
	
}
