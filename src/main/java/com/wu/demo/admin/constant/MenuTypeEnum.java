package com.wu.demo.admin.constant;

/**
 * 菜单类型枚举
 * @author wusq
 * @date 2020/8/25
 */
public enum MenuTypeEnum {

    DIRECTORY(0, "目录"),

    MENU(1, "菜单"),

    BUTTON(2, "按钮");

    private final Integer value;

    private final String description;

    MenuTypeEnum(Integer value, String description){
        this.value = value;
        this.description = description;
    }

    public Integer getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

}
