package com.wu.demo.admin.config.security;

import com.wu.demo.admin.cache.UserCache;
import com.wu.demo.admin.constant.GlobalConsts;
import com.wu.demo.admin.pojo.entity.Menu;
import com.wu.demo.admin.pojo.entity.Role;
import com.wu.demo.admin.pojo.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 自定义认证过滤器
 * @author wusq
 * @date 2020/8/23
 */
public class MyAuthenticationFilter extends BasicAuthenticationFilter {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    public MyAuthenticationFilter(AuthenticationManager authenticationManager) {
        super(authenticationManager);
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        log.debug("Security过滤器");

        Authentication authentication = null;

        // 登录验证和授权
        String token = request.getHeader(GlobalConsts.TOKEN);
        if(token != null){
            String tokenKey = GlobalConsts.TOKEN + token;
            User user = UserCache.getUser(tokenKey);
            if(user != null){
                List<GrantedAuthority> grantedAuthorityList = new ArrayList<>();
                List<Role> roleList = user.getRoleList();
                if (roleList != null && !roleList.isEmpty()) {
                    for(Role role:roleList){
                        List<Menu> menuList = role.getMenuList();
                        if(menuList != null && !menuList.isEmpty()){
                            for(Menu m:menuList){
                                grantedAuthorityList.add(new GrantedAuthorityImpl(m.getPermission()));
                            }
                        }
                    }
                }
                authentication = new MyAuthenticationToken(user.getUsername(), null,
                        grantedAuthorityList, user);
                log.debug("授权");
            }else{
                authentication = new MyAuthenticationToken(null, null, null, null);
            }
        }else{
            authentication = new MyAuthenticationToken(null, null, null, null);
        }

        SecurityContextHolder.getContext().setAuthentication(authentication);

        chain.doFilter(request, response);
    }

}
