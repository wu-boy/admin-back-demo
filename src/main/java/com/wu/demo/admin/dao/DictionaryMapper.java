package com.wu.demo.admin.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wu.demo.admin.pojo.entity.Dictionary;
import com.wu.demo.admin.pojo.query.DictionaryQuery;

import java.util.List;

/**
 * @author wusq
 * @date 2020/8/25
 */
public interface DictionaryMapper extends BaseMapper<Dictionary> {

    Integer countPage(DictionaryQuery query);

    List<Dictionary> listPage(DictionaryQuery query);
}
