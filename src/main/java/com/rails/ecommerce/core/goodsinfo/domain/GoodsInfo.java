package com.rails.ecommerce.core.goodsinfo.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



 /**
 *  Class Name: GoodsInfo.java
 *  Function:
 *  
 *  Modifications:   
 *  
 *  @author gxl  DateTime 2015-1-12 上午11:48:23    
 *  @version 1.0 
 */
@Entity
@Table(name = "ecommerce_goods_info")
public class GoodsInfo { 
	
	//@GeneratedValue(generator = "paymentableGenerator")    
	//@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")  
	//@GeneratedValue(strategy = GenerationType.AUTO)
	//@SequenceGenerator(name="stu_seq",sequenceName="st_seq",allocationSize=1)
	
	@Id
	@Column(name = "goods_info_id")
	private String goodsInfoId;  //主键
	
	@Column(name = "goods_title", length=255)
	private String goodsTitle; //商品标题
	
	@Column(name = "goods_summary", length=1024)
	private String goodsSummary; //商品概述 

	@Column(name = "unit", length=255)
	private String unit; //所属单位
	
	@Column(name = "price")
	private long price; //价格
	
	@Column(name = "goods_unit", length=20)
	private String goodsUnit; //商品单位（个/元/盒等）

	@Column(name = "goods_descript" , length=4000)
	private String goodsDescript; //商品详细描述
	
	@Column(name = "title_img_url", length=1024)
	private String titleImgUrl; //标题图片路径
	
	@Column(name = "title_img_name", length=255)
	private String titleImgName; //图片名称
	
	@Column(name = "small_img_url", length=1024)
	private String smallImgUrl; //缩略图路径
	
	@Column(name = "small_img_name", length=255)
	private String smallImgName; //图片名称
	
	@Column(name = "img_url1", length=1024)
	private String imgUrl1; //多图路径
	
	@Column(name = "img_name1", length=255)
	private String imgName1; //图片名称
	
	@Column(name = "img_url2", length=1024)
	private String imgUrl2; //多图路径
	
	@Column(name = "img_name2", length=255)
	private String imgName2; //图片名称
	
	@Column(name = "img_url3", length=1024)
	private String imgUrl3; //多图路径
	
	@Column(name = "img_name3", length=255)
	private String imgName3; //图片名称
	
	@Column(name = "img_url4", length=1024)
	private String imgUrl4; //多图路径
	
	@Column(name = "img_name4", length=255)
	private String imgName4; //图片名称
	
	@Column(name = "img_url5", length=1024)
	private String imgUrl5; //多图路径
	
	@Column(name = "img_name5", length=255)
	private String imgName5; //图片名称
	
	@Column(name = "state", length=2)
	private String state; //上架状态 0待上架 1已上架
	
	@Column(name = "create_date")
	private Date createDate; //创建时间
	
	@Column(name = "create_user", length=50)
	private String createUser; //创建人

	@Column(name = "last_modify_date")
	private Date lastModifyDate; //最后修改时间

	public String getGoodsInfoId() {
		return goodsInfoId;
	}

	public void setGoodsInfoId(String goodsInfoId) {
		this.goodsInfoId = goodsInfoId;
	}

	public String getGoodsTitle() {
		return goodsTitle;
	}

	public void setGoodsTitle(String goodsTitle) {
		this.goodsTitle = goodsTitle;
	}

	public String getGoodsSummary() {
		return goodsSummary;
	}

	public void setGoodsSummary(String goodsSummary) {
		this.goodsSummary = goodsSummary;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getGoodsUnit() {
		return goodsUnit;
	}

	public void setGoodsUnit(String goodsUnit) {
		this.goodsUnit = goodsUnit;
	}

	public String getGoodsDescript() {
		return goodsDescript;
	}

	public void setGoodsDescript(String goodsDescript) {
		this.goodsDescript = goodsDescript;
	}

	public String getTitleImgUrl() {
		return titleImgUrl;
	}

	public void setTitleImgUrl(String titleImgUrl) {
		this.titleImgUrl = titleImgUrl;
	}

	public String getTitleImgName() {
		return titleImgName;
	}

	public void setTitleImgName(String titleImgName) {
		this.titleImgName = titleImgName;
	}

	public String getSmallImgUrl() {
		return smallImgUrl;
	}

	public void setSmallImgUrl(String smallImgUrl) {
		this.smallImgUrl = smallImgUrl;
	}

	public String getSmallImgName() {
		return smallImgName;
	}

	public void setSmallImgName(String smallImgName) {
		this.smallImgName = smallImgName;
	}

	public String getImgUrl1() {
		return imgUrl1;
	}

	public void setImgUrl1(String imgUrl1) {
		this.imgUrl1 = imgUrl1;
	}

	public String getImgName1() {
		return imgName1;
	}

	public void setImgName1(String imgName1) {
		this.imgName1 = imgName1;
	}

	public String getImgUrl2() {
		return imgUrl2;
	}

	public void setImgUrl2(String imgUrl2) {
		this.imgUrl2 = imgUrl2;
	}

	public String getImgName2() {
		return imgName2;
	}

	public void setImgName2(String imgName2) {
		this.imgName2 = imgName2;
	}
	
	public String getImgUrl3() {
		return imgUrl3;
	}

	public void setImgUrl3(String imgUrl3) {
		this.imgUrl3 = imgUrl3;
	}

	public String getImgName3() {
		return imgName3;
	}

	public void setImgName3(String imgName3) {
		this.imgName3 = imgName3;
	}

	public String getImgUrl4() {
		return imgUrl4;
	}

	public void setImgUrl4(String imgUrl4) {
		this.imgUrl4 = imgUrl4;
	}

	public String getImgName4() {
		return imgName4;
	}

	public void setImgName4(String imgName4) {
		this.imgName4 = imgName4;
	}

	public String getImgUrl5() {
		return imgUrl5;
	}

	public void setImgUrl5(String imgUrl5) {
		this.imgUrl5 = imgUrl5;
	}

	public String getImgName5() {
		return imgName5;
	}

	public void setImgName5(String imgName5) {
		this.imgName5 = imgName5;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
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
