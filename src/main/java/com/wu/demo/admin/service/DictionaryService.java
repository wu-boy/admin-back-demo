package com.wu.demo.admin.service;

import com.wu.demo.admin.dao.DictionaryMapper;
import com.wu.demo.admin.pojo.entity.Dictionary;
import com.wu.demo.admin.pojo.query.DictionaryQuery;
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
public class DictionaryService {

    @Autowired
    private DictionaryMapper mapper;

    public Integer countPage(DictionaryQuery query){
        return mapper.countPage(query);
    }

    public List<Dictionary> listPage(DictionaryQuery query){
        return mapper.listPage(query);
    }
}
