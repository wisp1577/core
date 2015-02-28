package com.rails.ecommerce.core.user.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 *  Class Name: User.java
 *  Function:远程用户接受类
 *  
 *  Modifications:   
 *  
 *  @author allen  DateTime 2015-1-31 上午10:37:10    
 *  @version 1.0
 */
@XmlRootElement
public class User  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -475848362562739423L;
	
	private long id; 				// 用户编号
	private String loginName; 		// 登录名
	private String userName; 		// 用户姓名
	private String password; 		// 密码
	private String organizationId; 	// 所属机构编号
	private String duty; 			// 职务
	private String telephone; 		// 电话号码
	private String mobile; 			// 手机号码
	private long dataRank; 			// 数据有效性 0-有效1-无效
	private String createStaff; 	// 创建用户
	private String createDate;		// 创建时间
	private String updateStaff; 	// 修改用户
	private String updateDate; 		// 修改时间
	private int isLoan; 			// 是否外借
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getOrganizationId() {
		return organizationId;
	}
	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
	}
	public String getDuty() {
		return duty;
	}
	public void setDuty(String duty) {
		this.duty = duty;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public long getDataRank() {
		return dataRank;
	}
	public void setDataRank(long dataRank) {
		this.dataRank = dataRank;
	}
	public String getCreateStaff() {
		return createStaff;
	}
	public void setCreateStaff(String createStaff) {
		this.createStaff = createStaff;
	}
	public String getUpdateStaff() {
		return updateStaff;
	}
	public void setUpdateStaff(String updateStaff) {
		this.updateStaff = updateStaff;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	public int getIsLoan() {
		return isLoan;
	}
	public void setIsLoan(int isLoan) {
		this.isLoan = isLoan;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	
}