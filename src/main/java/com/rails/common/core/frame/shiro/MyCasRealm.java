package com.rails.common.core.frame.shiro;

import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.cas.CasRealm;
import org.apache.shiro.subject.PrincipalCollection;
@SuppressWarnings({"unused"})
public class MyCasRealm extends CasRealm {
	
	@Override  
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) { 
        String username = (String)principals.getPrimaryPrincipal();  //从这里可以从cas server获得认证通过的用户名，得到后我们可以根据用户名进行具体的授权  
//       //也可以从  Subject subject = SecurityUtils.getSubject();  
//        //return (String)subject.getPrincipals().asList().get(0); 中取得，因为已经整合后 cas 交给了 shiro-cas  
//    /*  PermissionService service = (PermissionService)SpringContextUtil.getBean("PermissionService");  
//        List<String> codes = service.findPermissionCodeByUsername(username); 
//        if(codes != null && codes.size() > 0){ 
//             SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo(); 
//                 for (String str : codes) 
//                    { 
//                        authorizationInfo.addStringPermission(str); 
////                       info.addRole(role); 
//                    } 
//                return authorizationInfo; 
//        }*/  
       
        
        //为当前用户设置角色和权限  
//      SimpleAuthorizationInfo simpleAuthorInfo = new SimpleAuthorizationInfo();  
//      simpleAuthorInfo.addRoles(roleList);  
//      simpleAuthorInfo.addStringPermissions(permissionList);  
        SimpleAuthorizationInfo simpleAuthorInfo = new SimpleAuthorizationInfo();  
        simpleAuthorInfo.addStringPermission("account:create");
        //实际中可能会像上面注释的那样从数据库取得  
        if(null!=username && "test".equals(username)){  
            //添加一个角色,不是配置意义上的添加,而是证明该用户拥有admin角色    
            simpleAuthorInfo.addRole("admin");  
            //添加权限  
            simpleAuthorInfo.addStringPermission("admin:manage");  
            System.out.println("已为用户[test]赋予了[admin]角色和[admin:manage]权限");  
            return simpleAuthorInfo;  
        }
        //若该方法什么都不做直接返回null的话,就会导致任何用户访问/admin/listUser.jsp时都会自动跳转到unauthorizedUrl指定的地址  
        //详见applicationContext.xml中的<bean id="shiroFilter">的配置  
        return null; 
    }

}
