package com.rails.common.core.frame.utils;

import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
    public static String home = null;
    public static String uploadUrl = null;
    public static String downloadUrl = null;

	private static Properties props = new Properties(); 

	static { 
        try { 
                props.load(ReadProperties.class.getResourceAsStream("/config.properties")); 
        } catch (IOException e) { 
                e.printStackTrace();
        } 

        home= props.getProperty("home").trim();//首页路径
        uploadUrl = props.getProperty("uploadUrl").trim();//上传文件路径
        downloadUrl = props.getProperty("downloadUrl").trim();//下发文件路径
        
	} 
    
}
