package com.rails.ecommerce.core.common.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

 /**
 *  Class Name: SystemTime.java
 *  Function:系统菜单实体
 *  
 *  Modifications:   
 *  
 *  @author lxn  DateTime 2014-12-29 下午9:14:27    
 *  @version 1.0 
 */
@XmlRootElement
public class SystemTime implements Serializable{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	private String data; // 数据
	
	private String code; // 代码
	
	private String message; // 错误信息

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
