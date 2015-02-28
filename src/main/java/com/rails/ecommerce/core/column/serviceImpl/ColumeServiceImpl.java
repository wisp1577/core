package com.rails.ecommerce.core.column.serviceImpl;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import com.rails.ecommerce.core.column.dao.ColumeDao;
import com.rails.ecommerce.core.column.domain.Colume;
import com.rails.ecommerce.core.column.service.ColumeService;
import com.rails.ecommerce.core.common.domain.PaginationList;
import com.rails.ecommerce.core.common.domain.TreeList;
/**
 * 
 *  Class Name: ColumeServiceImpl.java
 *  Function:
 *  
 *  Modifications:   
 *  
 *  @author zjf  DateTime 2015-1-12 下午4:05:15    
 *  @version 1.0
 */
@Repository("ColumeServiceImpl")
public class ColumeServiceImpl  implements ColumeService {

	@Resource(name = "ColumeDaoImpl")
	private ColumeDao columeDao;

	@Override
	public PaginationList findAllPage(String orgIds,String organization,String statDate,String endDate,int pageNo, int pageSize)
			throws Exception {
		return columeDao.findAllPage(orgIds,organization, statDate, endDate, pageNo, pageSize);
	}
	
	@Override
	public List<TreeList> findAllPid(String pid)  throws Exception{
		List<TreeList> treeList = new ArrayList<TreeList>();
		List<Colume> columeList = new ArrayList();
		columeList = columeDao.findAllPid(pid);
		if(columeList.size()>0){
			for(int i=0;i<columeList.size();i++){
				Colume colume = columeList.get(i);
				TreeList tree = new TreeList();
				tree.setId(colume.getColumnId());
				tree.setText(colume.getName());
				tree.setState("colse");
				
				List<TreeList> childrenList =findAllPid(colume.getColumnId());
				if(childrenList.size()>0){
					tree.setChildren(childrenList);
				}
				treeList.add(tree);
			}
		}
		
		return treeList;
	}
	
	@Override
	public List<Colume> findByColumnIds(String columnIds)throws Exception{
		return columeDao.findByColumnIds(columnIds);
	}

	@Override
	public Colume save(Colume entity) throws Exception {
		// TODO Auto-generated method stub
		return columeDao.save(entity);
	}

	@Override
	public void delete(Colume entity) throws Exception {
		// TODO Auto-generated method stub
		columeDao.delete(entity);
	}

	@Override
	public Colume update(Colume entity) throws Exception {
		// TODO Auto-generated method stub
		return columeDao.update(entity);
	}

	@Override
	public List<Colume> findAll() throws Exception {
		// TODO Auto-generated method stub
		return columeDao.findAll();
	}

	@Override
	public Colume findById(Long id) throws Exception {
		// TODO Auto-generated method stub
		return columeDao.findById(id);
	}
	
	@Override
	public Colume findById(Object id) throws Exception {
		// TODO Auto-generated method stub
		return columeDao.findById(id);
	}
	
}
