package com.wu.demo.admin.service;

import com.wu.demo.admin.constant.GlobalConsts;
import com.wu.demo.admin.constant.MenuTypeEnum;
import com.wu.demo.admin.dao.MenuMapper;
import com.wu.demo.admin.pojo.entity.Menu;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author wusq
 * @date 2020/9/2
 */
@Service
public class MenuService {

    @Autowired
    private MenuMapper mapper;

    public List<Menu> list(){
        return mapper.list();
    }

    public List<Menu> listByUsername(String username){
        List<Menu> result = new ArrayList<>();
        if(StringUtils.isBlank(username)){
            return result;
        }
        if(GlobalConsts.ADMIN.equalsIgnoreCase(username)){
            result = list();
        }else{
            result = mapper.listByUsername(username);
        }
        return result;
    }

    /**
     * 根据用户名查找左侧导航菜单树
     * @param username
     * @return
     */
    public List<Menu> navTree(String username){
        List<Menu> result = new ArrayList<>();
        if(StringUtils.isBlank(username)){
            return result;
        }

        List<Menu> menuList = listByUsername(username);

        if(menuList == null || menuList.isEmpty()){
            return result;
        }
        for(Menu m:menuList){
            for(Menu o:menuList){

                // 过滤掉按钮
                if(MenuTypeEnum.BUTTON.getValue().equals(o.getType())){
                    continue;
                }

                if(m.getId().equals(o.getParentId())){
                    m.getChildren().add(o);
                }
            }
            if(m.getParentId() == null){
                result.add(m);
            }
        }

        menuList.forEach(o -> {
            List<Menu> list = o.getChildren();
            if(list != null && !list.isEmpty()){
                Collections.sort(list, Comparator.comparing(Menu::getSort));
            }
        });

        Collections.sort(result, Comparator.comparing(Menu::getSort));
        return result;
    }
}
