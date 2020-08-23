package com.wu.demo.admin.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 角色
 * @author wusq
 * @date 2020/8/23
 */
public class Role {

    /**
     * ID
     */
    private String id;

    /**
     * 名称
     */
    private String name;

    /**
     * 父ID
     */
    private String parentId;

    /**
     * 备注
     */
    private String remark;

    /**
     * 是否删除
     */
    private Integer delFlag;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 菜单集合
     */
    @TableField(exist = false)
    private List<Menu> menuList = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }
}
