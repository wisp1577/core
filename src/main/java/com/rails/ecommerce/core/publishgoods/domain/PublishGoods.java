package com.rails.ecommerce.core.publishgoods.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 * 
 *  Class Name: PublishGoods.java
 *  Function:商品发布信息表
 *  
 *  Modifications:   
 *  
 *  @author allenCai  DateTime 2015-1-12 下午5:04:43    
 *  @version 1.0
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "commerce_publish_goods")
public class PublishGoods implements Serializable {


	private static final long serialVersionUID = 7913650997879956727L;
	
	//@GeneratedValue(strategy = GenerationType.AUTO)
	//@GeneratedValue(generator = "paymentableGenerator")    
	//@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")  

	@Id
	@Column(name = "publish_goods_id")
	private String publishGoodsId;


	@Column(name="column_id")
	private String columnId;
	
	@Column(name="goods_info_id")
	private String goodsInfoId;

	public String getPublishGoodsId() {
		return publishGoodsId;
	}

	public void setPublishGoodsId(String publishGoodsId) {
		this.publishGoodsId = publishGoodsId;
	}

	public String getColumnId() {
		return columnId;
	}

	public void setColumnId(String columnId) {
		this.columnId = columnId;
	}

	public String getGoodsInfoId() {
		return goodsInfoId;
	}

	public void setGoodsInfoId(String goodsInfoId) {
		this.goodsInfoId = goodsInfoId;
	}


	
}
