package com.wu.demo.admin.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wu.demo.admin.pojo.entity.User;

/**
 * @author wusq
 * @date 2020/8/5
 */
public interface UserMapper extends BaseMapper<User> {

    User getByUsername(String username);
}
