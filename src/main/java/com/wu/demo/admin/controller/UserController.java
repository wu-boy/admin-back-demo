package com.wu.demo.admin.controller;

import com.wu.demo.admin.pojo.entity.User;
import com.wu.demo.admin.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wusq
 * @date 2020/8/5
 */
@Api(description = "用户")
@RestController
@RequestMapping("v1/users")
public class UserController {

    @Autowired
    private UserService service;

    @ApiOperation("根据用户名获取用户")
    @GetMapping("{username}")
    public User get(@PathVariable String username){
        return service.getByUsername(username);
    }
}
