package com.rails.common.core.frame.shiro;

/**  
 * @ClassName: ShiroUser   
 * @Description: shiro用户.
 * @author: "blueSummer"  
 * @date:2014-12-23 下午2:50:43     
 */ 
public class ShiroUser {
	
	private Long id;
	private String name;
	private String password;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
