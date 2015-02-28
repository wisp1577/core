package com.rails.common.core.frame.generic.dao;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rails.common.exception.BusinessWifiException;
import com.rails.common.exception.SystemWifiException;
import com.rails.common.logger.WifiLogUtil;


@SuppressWarnings(value={"unchecked","unused"})
@Repository("GenericDaoImpl")
public class GenericDaoImpl<T> implements GenericDao<T> {  
	 protected static Logger log = Logger.getLogger(GenericDaoImpl.class);

	    @PersistenceContext
	    protected EntityManager em;

	    private Class<T> persistentClass;

	    public GenericDaoImpl() {

	    }

	    public Class<T> getPersistentClass() {
		return this.persistentClass = (Class<T>) ((ParameterizedType) getClass()
			.getGenericSuperclass()).getActualTypeArguments()[0];
	    }

	    @Transactional
	    public T save(Object entity) throws Exception{
	    	try{
		em.persist(entity);
	    	}catch (Exception e) {
	    	    WifiLogUtil.wifiLogError("GenericDaoImpl.class save", e);
	    	    throw new SystemWifiException("保存数据库出错，请确认sql语句是否正确或者链接是否正确。");
	    	}
		return (T) entity;
	    }

	    @Transactional
	    public T update(Object entity) throws Exception{
	    	Object object=null;
	    	try{
	    		object= em.merge(entity);
	    	}catch (Exception e) {
	    	    WifiLogUtil.wifiLogError("GenericDaoImpl.class update", e);
	    	    throw new SystemWifiException("更新数据库出错，请确认sql语句是否正确或者链接是否正确。");
	    	}
		  return (T) object;
	    }

	    @Transactional
	    public void delete(Object entity) throws Exception{
//	    	try
//	    	{
		    em.remove(em.merge(entity));	
		    //em.remove(entity);	
//	    	}catch (Exception e) {
//	    	    WifiLogUtil.wifiLogError("GenericDaoImpl.class delete", e);
//	    	    throw new SystemWifiException("删除数据库出错，请确认sql语句是否正确或者链接是否正确。");
//	    	}
	    }

	    public T findById(Long id) throws Exception{
	    	try{
		return (T) em.find(this.getPersistentClass(), id);
	    }catch (Exception e) {
		    WifiLogUtil.wifiLogError("GenericDaoImpl.class findById", e);
		    throw new SystemWifiException("查询数据库出错，请确认sql语句是否正确或者链接是否正确。");
		}
	    }
	    
	    public T findById(Object id) throws Exception{
	    	try{
		return (T) em.find(this.getPersistentClass(), id);
	    }catch (Exception e) {
		    WifiLogUtil.wifiLogError("GenericDaoImpl.class findById", e);
		    throw new SystemWifiException("查询数据库出错，请确认sql语句是否正确或者链接是否正确。");
		}
	    }

	    public List<T> findAll() throws Exception {
		List<T> resultList = null;
		try {
		    String sql = "from " + getPersistentClass().getName() + " obj";
		    TypedQuery<T> query = em
			    .createQuery(sql, this.getPersistentClass());
		     resultList = query.getResultList();
		} catch (Exception e) {
		    WifiLogUtil.wifiLogError("GenericDaoImpl.class findAll", e);
		    throw new SystemWifiException("查询数据库出错，请确认sql语句是否正确或者链接是否正确。");
		}
		if (resultList == null || (resultList!=null && resultList.size()<1)){
		    WifiLogUtil.wifiLogInfo("GenericDaoImpl.class findAll", new Object[]{"查询结果为空"});
		    throw new BusinessWifiException("查询结果为空");
		}else
		    return resultList;
	    }
	    
	    @Transactional
	    public List<T> UpdateList(List<T> list) throws Exception{
	    	List<T> resultList = new ArrayList<T>();
	    	
	    	try{
	    		for(T entity :list){
	    	     Object object = em.merge(entity);
	    	     resultList.add((T) object);
	    		}
	    	}catch(Exception e) {
	    		    WifiLogUtil.wifiLogError("GenericDaoImpl.class UpdateList", e);
	    		    throw new SystemWifiException("更新数据报错");
	    		}
	    	
	    	return resultList;
	    	
	    }

	    }