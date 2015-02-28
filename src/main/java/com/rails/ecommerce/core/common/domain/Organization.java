package com.rails.ecommerce.core.common.domain;


import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * Class Name: Organization.java 
 * Function: 组织机构
 * 
 * Modifications:
 * 
 * @author huangww DateTime 2014-12-25 上午10:24:54
 * @version 1.0
 */
@XmlRootElement
public class Organization implements java.io.Serializable {
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	private long id; // 组织机构编号ID NUMBER(10)

	private long parentId; // 上级编号PARENTID NUMBER(10)
	private long dataRank; // 数据级别DATARANK NUMBER(10)

	private String organizationName; // 名称NAME VARCHAR2(225)

	private String remark; // 备注REMARK VARCHAR2(255)

	private String organizationType; // 机构类型

	private long organizationClass; //机构类别
	
	private long priority; //显示顺序
	
	private String organizationCode; // 机构编码ORGANIZATIONNUM VARCHAR2(255)

	private String startDate; // 启用时间STARTDATE 

	private String endDate; // 停止时间ENDDATE 
	
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

	public long getParentId() {
		return parentId;
	}

	public void setParentId(long parentId) {
		this.parentId = parentId;
	}

	public long getDataRank() {
		return dataRank;
	}

	public void setDataRank(long dataRank) {
		this.dataRank = dataRank;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getOrganizationType() {
		return organizationType;
	}

	public void setOrganizationType(String organizationType) {
		this.organizationType = organizationType;
	}

	public long getOrganizationClass() {
		return organizationClass;
	}

	public void setOrganizationClass(long organizationClass) {
		this.organizationClass = organizationClass;
	}

	public long getPriority() {
		return priority;
	}

	public void setPriority(long priority) {
		this.priority = priority;
	}

	public String getOrganizationCode() {
		return organizationCode;
	}

	public void setOrganizationCode(String organizationCode) {
		this.organizationCode = organizationCode;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
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
