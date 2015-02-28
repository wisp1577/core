package com.rails.common.core.frame.shiro;

import java.io.IOException;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.shiro.web.filter.authz.PermissionsAuthorizationFilter;

public class URLPermissionAuthorizationFilter extends PermissionsAuthorizationFilter {


	@Override
	public boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) throws IOException {
		return true;
	}


}
