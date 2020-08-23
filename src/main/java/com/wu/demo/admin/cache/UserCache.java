package com.wu.demo.admin.cache;

import com.wu.demo.admin.pojo.entity.User;

import java.util.HashMap;
import java.util.Map;

/**
 * 用户缓存
 * @author wusq
 * @date 2020/8/23
 */
public class UserCache {

    /**
     * key是tokencde6da6e888944f6ab9f73c6def2430e
     */
    private static final Map<String, User> userMap = new HashMap<>();

    public static void putUser(String token, User user){
        userMap.put(token, user);
    }

    public static User getUser(String token){
        return userMap.get(token);
    }

    public static void removeUser(String token){
        userMap.remove(token);
    }

}
