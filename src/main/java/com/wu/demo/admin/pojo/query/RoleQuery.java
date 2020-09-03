package com.wu.demo.admin.pojo.query;

import com.wu.demo.admin.util.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author wusq
 * @date 2020/9/3
 */
@ApiModel("角色查询参数")
public class RoleQuery extends PageQuery {

    @ApiModelProperty("名称")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
