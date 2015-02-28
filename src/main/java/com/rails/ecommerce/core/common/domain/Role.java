package com.rails.ecommerce.core.common.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

 /**
 *  Class Name: Role.java
 *  Function:角色实体
 *  
 *  Modifications:
 *  
 *  @author huangww  Date	Time 2014-12-25 上午10:47:02    
 *  @version 1.0
 */
public class Role implements java.io.Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long id; //角色编号ID		
	
	private String roleName; //角色名称
	
	private long dataRank; //数据有效性  0—有效	1—无效 
	
	private String roleType; //角色类型

	private String remark; //备注
	
	private String createStaff; //创建用户
	
	private String createDate; //创建时间
	
	private String updateStaff; //修改用户
	
	private String updateDate; //修改时间
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public long getDataRank() {
		return dataRank;
	}

	public void setDataRank(long dataRank) {
		this.dataRank = dataRank;
	}

	public String getRoleType() {
		return roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getCreateStaff() {
		return createStaff;
	}

	public void setCreateStaff(String createStaff) {
		this.createStaff = createStaff;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
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
}
