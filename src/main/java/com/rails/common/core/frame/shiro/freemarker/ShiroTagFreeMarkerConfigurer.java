package com.rails.common.core.frame.shiro.freemarker;

import java.io.IOException;

import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import freemarker.template.TemplateException;



 /**
 *  Class Name: ShiroTagFreeMarkerConfigurer.java
 *  Function: shiro标签整合Freemarker标签配置
 *  
 *  Modifications:   
 *  
 *  @author "blueSummer"  DateTime 2015-1-6 下午9:26:38    
 *  @version 1.0 
 */
public class ShiroTagFreeMarkerConfigurer extends FreeMarkerConfigurer {
  
    @Override
    public void afterPropertiesSet() throws IOException, TemplateException {
        super.afterPropertiesSet();
        this.getConfiguration().setSharedVariable("shiro", new ShiroTags());
    }
      
}