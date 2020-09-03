package com.wu.demo.admin.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wu.demo.admin.pojo.entity.Role;
import com.wu.demo.admin.pojo.query.RoleQuery;

import java.util.List;

/**
 * @author wusq
 * @date 2020/9/3
 */
public interface RoleMapper extends BaseMapper<Role> {

    Integer countPage(RoleQuery query);

    List<Role> listPage(RoleQuery query);
}
