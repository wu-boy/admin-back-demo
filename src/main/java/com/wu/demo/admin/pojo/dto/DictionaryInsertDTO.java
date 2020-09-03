package com.wu.demo.admin.pojo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;

/**
 * @author wusq
 * @date 2020/9/3
 */
@ApiModel("新增数据字典参数")
public class DictionaryInsertDTO {

    @ApiModelProperty(value = "名称", required = true)
    @NotBlank(message = "名称不能为空")
    private String label;

    @ApiModelProperty(value = "值", required = true)
    @NotBlank(message = "值不能为空")
    private String value;

    @ApiModelProperty(value = "父ID", required = true)
    @NotBlank(message = "父ID不能为空")
    private String parentId;

    @ApiModelProperty(value = "描述")
    private String description;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
