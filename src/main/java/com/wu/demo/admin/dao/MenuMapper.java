package com.wu.demo.admin.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wu.demo.admin.pojo.entity.Menu;

import java.util.List;

/**
 * @author wusq
 * @date 2020/8/25
 */
public interface MenuMapper extends BaseMapper<Menu> {

    /**
     * 根据用户名查询
     * @param username
     * @return
     */
    List<Menu> listByUsername(String username);

    /**
     * 查询所有
     * @return
     */
    List<Menu> list();
}
