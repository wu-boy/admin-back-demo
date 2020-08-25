-- MySQL数据库

-- 创建数据库
CREATE DATABASE IF NOT EXISTS admin_demo DEFAULT CHARSET utf8 COLLATE utf8_general_ci;
-- 创建用户
CREATE USER admin_demo IDENTIFIED BY 'admin_demo';
-- 赋权
grant all privileges ON admin_demo.* TO 'admin_demo'@'%';
-- 生效
FLUSH PRIVILEGES;

-- 创建字典表
drop table if exists `sys_dictionary`;
create table `sys_dictionary`(
  `id` char(32) comment 'ID',
  `value` varchar(64) not null comment '数据值',
  `label` varchar(64) not null comment '标签名',
  `type` varchar(32) not null comment '类型',
  `description` varchar(64) comment '描述',
  `sort` int not null default 0 comment '排序',
  `remark` varchar(64) comment '备注',
  `del_flag` tinyint not null default 0 comment '是否删除',
  `parent_id` char(32) comment '父ID',
  `create_time` datetime default current_timestamp comment '创建时间',
  `update_time` datetime comment '修改时间',
  primary key (`id`)
) engine=InnoDB default charset=utf8 comment '数据字典表';

-- 创建菜单表
drop table if exists `sys_menu`;
create table `sys_menu`(
  `id` char(32) comment 'ID',
  `name` varchar(32) unique not null comment '名称',
  `parent_id` char(32) default null comment '父ID',
  `url` varchar(256) default null comment 'URL',
  `perms` varchar(512) default null comment '授权',
  `type` tinyint default null comment '类型 0：目录 1：菜单 2：按钮',
  `icon` varchar(64) default null comment '图标',
  `sort` int not null default 0 comment '排序',
  `del_flag` tinyint not null default 0 comment '是否删除',
  `create_time` datetime not null default current_timestamp comment '创建时间',
  `update_time` datetime comment '修改时间',
  primary key (`id`)
) engine=InnoDB default charset=utf8 comment '菜单表';

-- 创建部门表
drop table if exists `sys_department`;
create table `sys_department`(
  `id` char(32) comment 'ID',
  `name` varchar(32) not null comment '部门名称',
  `parent_id` char(32) default null comment '父ID',
  `sort` int not null default 0 comment '排序',
  `del_flag` tinyint not null default 0 comment '是否删除',
  `create_time` datetime not null default current_timestamp comment '创建时间',
  `update_time` datetime comment '修改时间',
  primary key (`id`)
) engine=InnoDB default charset=utf8 comment '部门表';

-- 创建角色表
drop table if exists `sys_role`;
create table `sys_role`(
  `id` char(32) comment 'ID',
  `name` varchar(32) not null comment '角色名称',
  `remark` varchar(64) default null comment '备注',
  `del_flag` tinyint not null default 0 comment '是否删除',
  `create_time` datetime not null default current_timestamp comment '创建时间',
  `update_time` datetime comment '修改时间',
  primary key (`id`)
) engine=InnoDB default charset=utf8 comment '角色表';

-- 创建角色菜单表
drop table if exists `sys_role_menu`;
create table `sys_role_menu`(
  `id` char(32) comment 'ID',
  `role_id` char(32) not null comment '角色ID',
  `menu_id` char(32) not null comment '菜单ID',
  `create_time` datetime not null default current_timestamp comment '创建时间',
  `update_time` datetime comment '修改时间',
  primary key (`id`)
) engine=InnoDB default charset=utf8 comment '角色菜单表';

-- 创建部门角色表
drop table if exists `sys_department_role`;
create table `sys_department_role`(
  `id` char(32) comment 'ID',
  `department_id` char(32) not null comment '部门ID',
  `role_id` char(32) not null comment '角色ID',
  `create_time` datetime not null default current_timestamp comment '创建时间',
  `update_time` datetime comment '修改时间',
  primary key (`id`)
) engine=InnoDB default charset=utf8 comment '部门角色表';

-- 创建用户表
drop table if exists `sys_user`;
create table `sys_user`(
  `id` char(32) comment 'ID',
  `username` varchar(32) unique not null comment '用户名',
  `password` varchar(32) not null comment '密码',
  `nickname` varchar(32) default null comment '昵称',
  `avatar` varchar(128) default null comment '头像',
  `email` varchar(32) default null comment '邮箱',
  `mobile` char(11) default null comment '手机号',
  `state` tinyint not null default 1 comment '状态',
  `department_id` char(32) comment '部门ID',
  `create_time` datetime not null default current_timestamp comment '创建时间',
  `update_time` datetime comment '修改时间',
  primary key (`id`)
) engine=InnoDB default charset=utf8 comment '用户表';

-- 创建用户角色表
drop table if exists `sys_user_role`;
create table `sys_user_role`(
  `id` char(32) comment 'ID',
  `user_id` char(32) not null comment '用户ID',
  `role_id` char(32) not null comment '角色ID',
  `create_time` datetime not null default current_timestamp comment '创建时间',
  `update_time` datetime comment '修改时间',
  primary key (`id`)
) engine=InnoDB default charset=utf8 comment '用户角色表';




