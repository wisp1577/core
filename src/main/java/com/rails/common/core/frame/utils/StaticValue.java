package com.rails.common.core.frame.utils; 
/** * Class Name: StaticValue.java * Function: * * Modifications: * * @author WengShengyuan DateTime 2015-1-23 上午11:27:13 * @version 1.0 * 
 */
public class StaticValue {

	/**
	 * 班次状态
	 */
	public static final String SHIFTSTATE_BEFORESHIFT="1";//未开班
	public static final String SHIFTSTATE_ONSHIFT="2";//已开班
	public static final String SHIFTSTATE_OFFSHIFT="3";//退班
	
	/**
	 * 订单状态
	 */
	public static final String ORDERSTATE_NEWORDER="1";//已提交
	public static final String ORDERSTATE_CONFIRMED="2";//已确认
	public static final String ORDERSTATE_CANCELED="3";//已取消
	public static final String ORDERSTATE_DELIVERED="4";//已配送
	public static final String ORDERSTATE_DONE="5";//已完成
	
	public static final String ORDERTYPE_ONLINE="1";//线上订单
	public static final String ORDERTYPE_OFFLINE="2";//线下订单
	
	/**
	 * 商品状态
	 */
	public static final String GOODSSTATE_ONSTAGE="1";//已上架
	public static final String GOODSSTATE_OFFSTAGE="0";//未上架
	
	/**
	 * 用户行为日志
	 */
	public static final String USERLOGFLAG_OPENSHIFT="1";//开班动作
	public static final String USERLOGFLAG_LOGIN="2";//登录动作
	public static final String USERLOGFLAG_LOGOUT="3";//注销动作
	public static final String USERLOGFLAG_ENDSHIFT="4";//退班动作
	
	/**
	 * 栏目状态
	 */
	public static final String COLUMESTATE_ISSHOW_TRUE="1";//是否展示
	public static final String COLUMESTATE_ISSHOW_FALSE="0";//是否展示
	public static final String COLUMESTATE_ISDEFAULT_TRUE="1";//是否默认
	public static final String COLUMESTATE_ISDEFAULT_FALSE="0";//是否默认
	
	/**
	 * 文件状态
	 */
	public static final String FILE_ISPARENT_TRUE="1";//是否是父文件(压缩包)
	public static final String FILE_ISPARENT_FALSE="0";//是否是父文件(压缩包)
	
	public static final String FILE_FROMTO_TOTRAIN="0";//地面到中心
	public static final String FILE_FROMTO_TOSTATION="1";//中心到地面
	
	public static final String FILE_TRANSFESTATE_TRUE="1";//已完成
	public static final String FILE_TRANSFESTATE_FALSE="0";//已完成
	
	/**
	 * 路径变量
	 */
	public static final String ZIP_ROOT="VEHICLE_ZIP";//文件操作的相关根目录
	public static final String UNZIP_ROOT="VEHICLE_UNZIP";//文件操作的相关根目录
	public static final String TEMP_ROOT="VEHICLE_TEMP";//文件操作的临时文件夹
	public static final String RESOURCE_ROOT="resources";//resource目录的文件名

}



 
