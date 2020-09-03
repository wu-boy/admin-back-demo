package com.wu.demo.admin.pojo.query;

import com.wu.demo.admin.util.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author wusq
 * @date 2020/9/3
 */
@ApiModel("数据字典查询参数")
public class DictionaryQuery extends PageQuery {

    @ApiModelProperty("名称")
    private String label;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
