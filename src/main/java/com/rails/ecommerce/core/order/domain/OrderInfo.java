package com.rails.ecommerce.core.order.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

 /**
 *  Class Name: OrderInfo.java
 *  Function:订单表
 *  
 *  Modifications:   
 *  
 *  @author gxl  DateTime 2015-1-9 上午10:08:46    
 *  @version 1.0 
 */
@Entity
@Table(name = "ecommerce_order_info")
public class OrderInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "order_info_id")
	private String orderInfoId; // 主键

	@Column(name = "order_code",length=50)
	private String orderCode; // 订单号

	@Column(name = "shift_info_id")
	private String shiftInfoId;
	
	@Column(name = "goods_title", length=255)
	private String goodsTitle; //商品标题
	
	@Column(name = "goods_count")
	private long goodsCount;  //购买数量
	
	@Column(name = "goods_price")
	private long goodsPrice;  //总价
	
	@Column(name = "unit", length=255)
	private String unit; //所属单位
	
	@Column(name = "user_phone",length=11)
	private String userPhone;  //客户手机
	
	@Column(name = "user_card_no",length=18)
	private String userCardNo;  //客户身份证号码
	
	@Column(name = "train_code",length=10)
	private String trainCode;  //车次
	
	@Column(name = "box_no",length=10)
	private String boxNo;  //订单车厢号
	
	@Column(name = "seat_no",length=50)
	private String seatNo;  //订单座位号
	
	@Column(name = "order_date")
	private Date orderDate;  //订单时间
	
	@Column(name = "order_state",length=2)
	private String orderState;  //订单状态  - 1 已提交 2已确认 3已取消4已派送5已收钱
	
	@Column(name = "on_line",length=2)
	private String onLine;  //线下线上类型 1 线上 2线下
	
	@Column(name = "create_date")
	private Date createDate;  //创建时间
	
	@Column(name = "operate_user",length=255)
	private String operateUser;  //操作人员
	
	@Column(name = "operator_user_name",length=255)
	private String operatorUserName;  //操作人员姓名

	@Column(name = "last_modify_date")
	private Date lastModifyDate;  //最后操作时间
	
	@Column(name="column_id")
	private String columnId;

	@Column(name = "single_price")
	private long singlePrice;//商品单价
	
	public long getSinglePrice() {
		return singlePrice;
	}

	public void setSinglePrice(long singlePrice) {
		this.singlePrice = singlePrice;
	}

	public String getColumnId() {
		return columnId;
	}

	public void setColumnId(String columnId) {
		this.columnId = columnId;
	}
	
	public String getShiftInfoId() {
		return shiftInfoId;
	}

	public void setShiftInfoId(String shiftInfoId) {
		this.shiftInfoId = shiftInfoId;
	}
	
	public String getOrderInfoId() {
		return orderInfoId;
	}

	public void setOrderInfoId(String orderInfoId) {
		this.orderInfoId = orderInfoId;
	}

	public String getOperatorUserName() {
		return operatorUserName;
	}

	public void setOperatorUserName(String operatorUserName) {
		this.operatorUserName = operatorUserName;
	}
	
	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getGoodsTitle() {
		return goodsTitle;
	}

	public void setGoodsTitle(String goodsTitle) {
		this.goodsTitle = goodsTitle;
	}

	public long getGoodsCount() {
		return goodsCount;
	}

	public void setGoodsCount(long goodsCount) {
		this.goodsCount = goodsCount;
	}

	public long getGoodsPrice() {
		return goodsPrice;
	}

	public void setGoodsPrice(long goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserCardNo() {
		return userCardNo;
	}

	public void setUserCardNo(String userCardNo) {
		this.userCardNo = userCardNo;
	}

	public String getTrainCode() {
		return trainCode;
	}

	public void setTrainCode(String trainCode) {
		this.trainCode = trainCode;
	}

	public String getBoxNo() {
		return boxNo;
	}

	public void setBoxNo(String boxNo) {
		this.boxNo = boxNo;
	}

	public String getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderState() {
		return orderState;
	}

	public void setOrderState(String orderState) {
		this.orderState = orderState;
	}

	public String getOnLine() {
		return onLine;
	}

	public void setOnLine(String onLine) {
		this.onLine = onLine;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getOperateUser() {
		return operateUser;
	}

	public void setOperateUser(String operateUser) {
		this.operateUser = operateUser;
	}

	public Date getLastModifyDate() {
		return lastModifyDate;
	}

	public void setLastModifyDate(Date lastModifyDate) {
		this.lastModifyDate = lastModifyDate;
	}

	



}
