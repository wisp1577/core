package com.rails.ecommerce.core.common.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;






 /**
 *  Class Name: SystemRoleResource.java
 *  Function:
 *  
 *  Modifications:   
 *  
 *  @author lxn  DateTime 2015-1-19 下午4:30:34    
 *  @version 1.0 
 */
@XmlRootElement
public class SystemRoleResource implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	List<Role> listRole ;
	List<SysResource> listResource;
	List<Organization> listOrganization;
	public List<Organization> getListOrganization() {
		return listOrganization;
	}
	public void setListOrganization(List<Organization> listOrganization) {
		this.listOrganization = listOrganization;
	}
	public List<Role> getListRole() {
		return listRole;
	}
	public void setListRole(List<Role> listRole) {
		this.listRole = listRole;
	}
	public List<SysResource> getListResource() {
		return listResource;
	}
	public void setListResource(List<SysResource> listResource) {
		this.listResource = listResource;
	}
	
	
}
