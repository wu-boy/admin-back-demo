package com.wu.demo.admin.controller;

import com.wu.demo.admin.pojo.entity.Dictionary;
import com.wu.demo.admin.pojo.query.DictionaryQuery;
import com.wu.demo.admin.service.DictionaryService;
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
@Api(description = "数据字典")
@RestController
@RequestMapping("v1/dictionaries")
public class DictionaryController {

    @Autowired
    private DictionaryService service;

    @ApiOperation("分页查询")
    @PostMapping("page")
    public PageResult<Dictionary> page(@RequestBody DictionaryQuery query){
        PageResult<Dictionary> result = new PageResult<>();
        query.init();
        result.setTotal(service.countPage(query));
        if(result.getTotal() > 0){
            result.setRows(service.listPage(query));
        }
        return result;
    }
}
