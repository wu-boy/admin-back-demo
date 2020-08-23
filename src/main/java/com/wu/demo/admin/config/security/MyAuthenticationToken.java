package com.wu.demo.admin.config.security;

import com.wu.demo.admin.pojo.entity.User;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

/**
 * 自定义AuthenticationToken，把用户放进去，方便随时取用
 * @author wusq
 * @date 2020/1/7
 */
public class MyAuthenticationToken extends UsernamePasswordAuthenticationToken {

    /**
     * 用户
     */
    private User user;

    public MyAuthenticationToken(Object principal, Object credentials,
                                 Collection<? extends GrantedAuthority> authorities, User user) {
        super(principal, credentials, authorities);
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
