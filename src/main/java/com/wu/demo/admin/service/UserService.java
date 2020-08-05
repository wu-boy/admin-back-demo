package com.wu.demo.admin.service;

import com.wu.demo.admin.dao.UserMapper;
import com.wu.demo.admin.pojo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author wusq
 * @date 2020/8/5
 */
@Service
@Transactional
public class UserService {

    @Autowired
    private UserMapper mapper;

    public User getByUsername(String username){
        return mapper.getByUsername(username);
    }
}
