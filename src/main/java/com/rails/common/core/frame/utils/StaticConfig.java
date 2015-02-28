package com.rails.common.core.frame.utils;

public class StaticConfig {
	
	//栏目图标文件保存路径
		public final static String  NEWPATH="E:/column/images";
		
		//模板套装保存的物理路径
		public final static String  TEMPLETlISTPATH="E:/templetListFile";
		
	    //获取菜单资源接口
		public final static String RESOURCEPATH="http://198.216.7.118:8000/admin/api/roleresource";
		
		//获取登录部门人员所在部门接口
		public final static String USERPATH="http://198.216.7.118:8000/admin/api/user";

		// 获取组织机构对应的车次
		public final static String TRAINPATH="http://198.216.7.118:8000/admin/api/trainnum";
		//模板生成相对系统路径
		public final static String  CREATTEMPLETPATH="resources/creatTemplets";
		
		//模板中js文件生成路径
		public final static String  JSFIlETPATH=CREATTEMPLETPATH+"/js";
		
		//模板中css文件生成路径
		public final static String CSSFILEPATH=CREATTEMPLETPATH+"/css";
		
		//模板中images文件生成路径
		public final static String  IMAGESPATH=CREATTEMPLETPATH+"/images";
		

		//liunx基础路径
		public final static String BASE="/home/upload/";
		//文件上传到服务器路径
		public final static String uploadUrl="resources/uploadfiles";
		//下发文件路径
		public final static String downloadUrl="resources/downloadfiles";
		
		//模版html打包存储路径
		public final static String page_templ_url="WEB-INF/templates/Templets";

}
