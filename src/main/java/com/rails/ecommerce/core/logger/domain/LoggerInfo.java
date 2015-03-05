package com.rails.ecommerce.core.logger.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

 /**
 *  Class Name: LoggerInfo.java
 *  Function:日志表
 *  
 *  Modifications:   
 *  
 *  @author gxl  DateTime 2015-1-9 上午10:08:46    
 *  @version 1.0 
 */
@Entity
@Table(name = "logger_info")
public class LoggerInfo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id", length=20)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;	//编号
	
	@Column(name = "_st_idcard")
	private String _stIdcard;
	
	@Column(name = "st_no")
	private String stNo;
	
	@Column(name = "st_name")
	private String stName;
	
	@Column(name = "qq")
	private String qq;
	
	@Column(name = "remark")
	private String remark;

	@Column(name = "st_sex")
	private String stSex;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String get_stIdcard() {
		return _stIdcard;
	}

	public void set_stIdcard(String _stIdcard) {
		this._stIdcard = _stIdcard;
	}

	public String getStNo() {
		return stNo;
	}

	public void setStNo(String stNo) {
		this.stNo = stNo;
	}

	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getStSex() {
		return stSex;
	}

	public void setStSex(String stSex) {
		this.stSex = stSex;
	}

	
}
