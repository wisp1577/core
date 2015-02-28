package com.rails.ecommerce.core.common.domain;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * Class Name: Train.java
 * Function: 车次
 * 
 * Modifications:
 * 
 * @author huangww DateTime 2014-12-25 上午10:24:54
 * @version 1.0
 */
@XmlRootElement
public class TrainNumberView implements java.io.Serializable {
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	private String id; // 车次表主键ID

	private String trainNumber; // 车次号
	
	private String trainCode; // 车次码

	private String dataRank; // 数据有效性0—有效1—无效

	private String carOrgId; // 客运机构编号

	private String runOrgId; // 运营机构编号

	private String beginStation; // 始发站
	
	private String endStation; // 终到站
	
	private String isRun; // 机构编码ORGANIZATIONNUM VARCHAR2(255)
	
	private String trainTypeId; // 车次类型
	
	private String createStaff; //创建用户
	
	private String createDate; //创建时间
	
	private String updateStaff; //修改用户
	
	private String updateDate; //修改时间

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}

	public String getTrainCode() {
		return trainCode;
	}

	public void setTrainCode(String trainCode) {
		this.trainCode = trainCode;
	}

	public String getDataRank() {
		return dataRank;
	}

	public void setDataRank(String dataRank) {
		this.dataRank = dataRank;
	}

	public String getCarOrgId() {
		return carOrgId;
	}

	public void setCarOrgId(String carOrgId) {
		this.carOrgId = carOrgId;
	}

	public String getRunOrgId() {
		return runOrgId;
	}

	public void setRunOrgId(String runOrgId) {
		this.runOrgId = runOrgId;
	}

	public String getBeginStation() {
		return beginStation;
	}

	public void setBeginStation(String beginStation) {
		this.beginStation = beginStation;
	}

	public String getEndStation() {
		return endStation;
	}

	public void setEndStation(String endStation) {
		this.endStation = endStation;
	}

	public String getIsRun() {
		return isRun;
	}

	public void setIsRun(String isRun) {
		this.isRun = isRun;
	}

	public String getTrainTypeId() {
		return trainTypeId;
	}

	public void setTrainTypeId(String trainTypeId) {
		this.trainTypeId = trainTypeId;
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
