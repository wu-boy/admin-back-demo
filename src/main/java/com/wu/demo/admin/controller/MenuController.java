package com.wu.demo.admin.controller;

import com.wu.demo.admin.pojo.entity.Menu;
import com.wu.demo.admin.service.MenuService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author wusq
 * @date 2020/9/3
 */
@Api(description = "菜单")
@RestController
@RequestMapping("v1/menus")
public class MenuController {

    @Autowired
    private MenuService service;

    @ApiOperation("查询菜单树")
    @GetMapping("tree")
    public List<Menu> tree(@RequestParam(required = false) String username, @RequestParam Boolean button) {
        return service.tree(username, button);
    }

    @ApiOperation("查询用户权限")
    @GetMapping("findPermissions")
    public Set<String> findPermissions(@RequestParam String username) {
        Set<String> result = new HashSet<>();
        List<Menu> menuList = service.listByUsername(username);
        if(menuList == null || menuList.isEmpty()){
            return result;
        }
        menuList.forEach(o -> {
            if(StringUtils.isNotBlank(o.getPerms())){
                result.add(o.getPerms());
            }
        });
        return result;
    }
}
