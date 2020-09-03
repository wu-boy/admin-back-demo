package com.wu.demo.admin.controller;

import com.wu.demo.admin.pojo.entity.Role;
import com.wu.demo.admin.pojo.query.RoleQuery;
import com.wu.demo.admin.service.RoleService;
import com.wu.demo.admin.util.PageResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wusq
 * @date 2020/9/3
 */
@Api(description = "角色")
@RestController
@RequestMapping("v1/roles")
public class RoleController {

    @Autowired
    private RoleService service;

    @ApiOperation("分页查询")
    @PostMapping("page")
    public PageResult<Role> page(@RequestBody RoleQuery query){
        PageResult<Role> result = new PageResult<>();
        query.init();
        result.setTotal(service.countPage(query));
        if(result.getTotal() > 0){
            result.setRows(service.listPage(query));
        }
        return result;
    }
}
