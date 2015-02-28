package com.rails.ecommerce.core.common.domain;



import java.util.Date;


public class ShiftInfo {

	private String shiftInfoId;
	
	private String userInfoId;
	
	private Date shiftDate;
	
	private String shiftTrainCode;
	
	private long shiftDaySpan;

	private String shiftState;

	private String deviceCode;
	
	public String getShiftInfoId() {
		return shiftInfoId;
	}

	public void setShiftInfoId(String shiftInfoId) {
		this.shiftInfoId = shiftInfoId;
	}

	public Date getShiftDate() {
		return shiftDate;
	}

	public void setShiftDate(Date shiftDate) {
		this.shiftDate = shiftDate;
	}

	public String getShiftTrainCode() {
		return shiftTrainCode;
	}

	public void setShiftTrainCode(String shiftTrainCode) {
		this.shiftTrainCode = shiftTrainCode;
	}

	public long getShiftDaySpan() {
		return shiftDaySpan;
	}

	public void setShiftDaySpan(long shiftDaySpan) {
		this.shiftDaySpan = shiftDaySpan;
	}

	public String getShiftState() {
		return shiftState;
	}

	public void setShiftState(String shiftState) {
		this.shiftState = shiftState;
	}
	
	
	
	
	
}
