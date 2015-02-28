package com.rails.ecommerce.core.publish.domain;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 *  Class Name: PublishApi.java
 *  Function:打包文件表接口
 *  
 *  Modifications:   
 *  
 *  @author allen  DateTime 2015-2-4 上午11:52:07    
 *  @version 1.0
 */
@XmlRootElement
@XmlType(name = "PublishApi", namespace = "domain.publish.core.ecommerce.rails.com")
public class PublishApi {
	
	private String publishId;
	private String trainNo;
	private String name;
	private String version;
	private String unit;
	private String jsonUrl;
	private String zipUrl;
	private String descript;
	private Date createDate;
	private String createUser;
	private Date lastModifyDate;
	private String MD5String;
	private long fileSize;
	
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

	public String getMD5String() {
		return MD5String;
	}

	public void setMD5String(String mD5String) {
		MD5String = mD5String;
	}

	public long getFileSize() {
		return fileSize;
	}

	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}
	
	
}
