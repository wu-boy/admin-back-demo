package com.wu.demo.admin.service;

import com.wu.demo.admin.constant.GlobalConsts;
import com.wu.demo.admin.dao.MenuMapper;
import com.wu.demo.admin.pojo.entity.Menu;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wusq
 * @date 2020/8/25
 */
@Service
public class MenuService {

    @Autowired
    private MenuMapper mapper;

    public List<Menu> list(){
        return mapper.list();
    }

    public List<Menu> listByUsername(String username){
        return mapper.listByUsername(username);
    }

    public List<Menu> tree(String username, Integer menuType){
        List<Menu> result = new ArrayList<>();

        List<Menu> menuList = null;
        if(StringUtils.isBlank(username) || GlobalConsts.ADMIN.equalsIgnoreCase(username)){
            menuList = list();
        }else{
            menuList = listByUsername(username);
        }

        return result;
    }
}
