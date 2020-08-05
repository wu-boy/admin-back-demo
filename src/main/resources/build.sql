drop table if exists sys_menu;
create table sys_menu(
  id varchar(32) primary key,
  name varchar(32),
  parent_id varchar(32),
  url varchar(64),
  permission varchar(512),
  type smallint not null,
  icon varchar(64),
  order_number int,
  create_time timestamp default localtimestamp(0),
  update_time timestamp
);
comment on table sys_menu is '菜单表';
comment on column sys_menu.id is 'ID';
comment on column sys_menu.name is '名称';
comment on column sys_menu.parent_id is '父ID';
comment on column sys_menu.url is '菜单URL';
comment on column sys_menu.permission is '授权';
comment on column sys_menu.type is '类型';
comment on column sys_menu.icon is '图标';
comment on column sys_menu.order_number is '排序';
comment on column sys_menu.create_time is '创建时间';
comment on column sys_menu.update_time is '修改时间';

drop table if exists sys_user;
create table sys_user(
  id char(32) primary key,
  username varchar(32) unique not null,
  password char(32) not null,
  email varchar(32),
  mobile char(11),
  state smallint not null,
  department_id char(32),
  create_time timestamp default localtimestamp(0),
  update_time timestamp
);
comment on table sys_user is '用户表';
comment on column sys_user.id is 'ID';
comment on column sys_user.username is '用户名';
comment on column sys_user.password is '密码';
comment on column sys_user.email is '邮箱';
comment on column sys_user.mobile is '手机号';
comment on column sys_user.state is '状态';
comment on column sys_user.department_id is '部门ID';
comment on column sys_user.create_time is '创建时间';
comment on column sys_user.update_time is '修改时间';