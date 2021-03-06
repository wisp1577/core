package com.rails.common.core.frame.generic.dao;

import java.util.List;

public interface GenericDao<T> {  
    public T save(T entity) throws Exception;  
  
    public void delete(T entity) throws Exception;  
    
    public T update(T entity) throws Exception;  
  
    public List<T> findAll() throws Exception;  
    
    public T findById(Long id) throws Exception; 
    
    public T findById(Object id) throws Exception; 
    
    
  
}  