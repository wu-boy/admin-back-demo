package com.wu.demo.admin.service;

import com.wu.demo.admin.dao.RoleMapper;
import com.wu.demo.admin.pojo.entity.Role;
import com.wu.demo.admin.pojo.query.RoleQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author wusq
 * @date 2020/9/3
 */
@Service
@Transactional
public class RoleService {

    @Autowired
    private RoleMapper mapper;

    public Integer countPage(RoleQuery query){
        return mapper.countPage(query);
    }

    public List<Role> listPage(RoleQuery query){
        return mapper.listPage(query);
    }
}
