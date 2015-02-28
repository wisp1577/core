package com.rails.common.core.frame.generic.service;

import java.util.List;

import javax.annotation.Resource;

import com.rails.common.core.frame.generic.dao.GenericDao;
import com.rails.common.exception.SystemWifiException;
import com.rails.common.logger.WifiLogUtil;


 /**
 *  Class Name: GenericServiceImpl.java
 *  Function: 通用service,可以将通用service方法放入内部,(但是内部调用的是genericDao)
 *  此时genericDao的persistentClass还无法确定,所有有关persistentClass的方法还得自己写
 *  即:调用自己生成的dao如UserDao等
 *  
 *  Modifications:   
 *  
 *  @author "blueSummer"  DateTime 2015-1-6 上午9:15:35    
 *  @version 1.0 
 *  @param <T>
 */
public abstract class GenericServiceImpl<T> implements GenericService<T>{

	@Resource(name = "GenericDaoImpl")
	private GenericDao<T> genericDao;
	@Override
	public T save(T entity) throws Exception {
		try{
			return genericDao.save(entity);
			}catch(Exception e) {
	    	    WifiLogUtil.wifiLogError("GenericServiceImpl.class save", e);
	    	    throw new SystemWifiException("保存数据库出错，请确认sql语句是否正确或者链接是否正确。");
	    	}
	}
	@Override
	public void delete(T entity) throws Exception {
		try{
			genericDao.delete(entity);
			}catch(Exception e) {
	    	    WifiLogUtil.wifiLogError("GenericServiceImpl.class delete", e);
	    	    throw new SystemWifiException("删除数据库出错，请确认sql语句是否正确或者链接是否正确。");
	    	}
	}

	@Override
	public T update(T entity) throws Exception {
		try{
			return genericDao.update(entity);
			}
			catch(Exception e) {
	    	    WifiLogUtil.wifiLogError("GenericServiceImpl.class update", e);
	    	    throw new SystemWifiException("更新数据库出错，请确认sql语句是否正确或者链接是否正确。");
	    	}
	}

	@Override
	public List<T> findAll() throws Exception {
		return genericDao.findAll();
	}

	@Override
	public T findById(Long id) throws Exception {
		return genericDao.findById(id);
	}
	
	@Override
	public T findById(Object id) throws Exception {
		return genericDao.findById(id);
	}

}
