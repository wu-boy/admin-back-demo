-- 初始化菜单
insert into `sys_menu`(`id`,`name`,`parent_id`,`url`,`perms`,`type`,`icon`,`sort`,`del_flag`) values
('54d2021c438a43959dc6f4a6f537f135', '系统管理', null, null, null,
'0', 'el-icon-setting', '0', '0');
insert into `sys_menu`(`id`,`name`,`parent_id`,`url`,`perms`,`type`,`icon`,`sort`,`del_flag`) values
('8d096c735ab748a49d47ea69f0f390a1', '用户管理', '54d2021c438a43959dc6f4a6f537f135', '/sys/user', null,
'1', 'el-icon-service', '1', '0');
insert into `sys_menu`(`id`,`name`,`parent_id`,`url`,`perms`,`type`,`icon`,`sort`,`del_flag`) values
('f2a9272962674bcca9fbe3fc8833ae0f', '新增', '8d096c735ab748a49d47ea69f0f390a1', null, 'sys:user:insert',
'2', null, '0', '0');
insert into `sys_menu`(`id`,`name`,`parent_id`,`url`,`perms`,`type`,`icon`,`sort`,`del_flag`) values
('524721d9b45b448197677e181e8c8fdf', '删除', '8d096c735ab748a49d47ea69f0f390a1', null, 'sys:user:delete',
'2', null, '0', '0');
insert into `sys_menu`(`id`,`name`,`parent_id`,`url`,`perms`,`type`,`icon`,`sort`,`del_flag`) values
('4c7f40017cd440f9b169cc101fadf2ee', '修改', '8d096c735ab748a49d47ea69f0f390a1', null, 'sys:user:update',
'2', null, '0', '0');
insert into `sys_menu`(`id`,`name`,`parent_id`,`url`,`perms`,`type`,`icon`,`sort`,`del_flag`) values
('6033f494aeb0485482ebd13fe58a78ce', '查看', '8d096c735ab748a49d47ea69f0f390a1', null, 'sys:user:view',
'2', null, '0', '0');
insert into `sys_menu`(`id`,`name`,`parent_id`,`url`,`perms`,`type`,`icon`,`sort`,`del_flag`) values
('a0a407c2e2634666a708d6c775c806d1', '机构管理', '54d2021c438a43959dc6f4a6f537f135', '/sys/dept', null,
'1', 'el-icon-news', '2', '0');
insert into `sys_menu`(`id`,`name`,`parent_id`,`url`,`perms`,`type`,`icon`,`sort`,`del_flag`) values
('c0952708e98c4a9aa5279d62973669a6', '角色管理', '54d2021c438a43959dc6f4a6f537f135', '/sys/role', null,
'1', 'el-icon-view', '3', '0');
insert into `sys_menu`(`id`,`name`,`parent_id`,`url`,`perms`,`type`,`icon`,`sort`,`del_flag`) values
('5f0688a95b424ee8991fcb30f5b26906', '菜单管理', '54d2021c438a43959dc6f4a6f537f135', '/sys/menu', null,
'1', 'el-icon-menu', '4', '0');
insert into `sys_menu`(`id`,`name`,`parent_id`,`url`,`perms`,`type`,`icon`,`sort`,`del_flag`) values
('6c00dc2ab6aa444dae65c6a2f219f819', '字典管理', '54d2021c438a43959dc6f4a6f537f135', '/sys/dictionary', null,
'1', 'el-icon-collection', '5', '0');
insert into `sys_menu`(`id`,`name`,`parent_id`,`url`,`perms`,`type`,`icon`,`sort`,`del_flag`) values
('6f596f62c5814f64bba02e5f70752b32', '新增', '6c00dc2ab6aa444dae65c6a2f219f819', null, 'sys:dictionary:insert',
'2', null, '0', '0');
insert into `sys_menu`(`id`,`name`,`parent_id`,`url`,`perms`,`type`,`icon`,`sort`,`del_flag`) values
('c3ac3bc1c3794d6a9aab89fc112b38b0', '删除', '6c00dc2ab6aa444dae65c6a2f219f819', null, 'sys:dictionary:delete',
'2', null, '0', '0');
insert into `sys_menu`(`id`,`name`,`parent_id`,`url`,`perms`,`type`,`icon`,`sort`,`del_flag`) values
('e732afdd908e45fa9cd6e2cc58047796', '修改', '6c00dc2ab6aa444dae65c6a2f219f819', null, 'sys:dictionary:update',
'2', null, '0', '0');
insert into `sys_menu`(`id`,`name`,`parent_id`,`url`,`perms`,`type`,`icon`,`sort`,`del_flag`) values
('d2b2356482e54ff79dac6cb8bbecd2c6', '查看', '6c00dc2ab6aa444dae65c6a2f219f819', null, 'sys:dictionary:view',
'2', null, '0', '0');
insert into `sys_menu`(`id`,`name`,`parent_id`,`url`,`perms`,`type`,`icon`,`sort`,`del_flag`) values
('49a049a05f474f8aa5e489f06a391efc', '系统配置', '54d2021c438a43959dc6f4a6f537f135', '/sys/config', null,
'1', 'el-icon-orange', '6', '0');
insert into `sys_menu`(`id`,`name`,`parent_id`,`url`,`perms`,`type`,`icon`,`sort`,`del_flag`) values
('ff6c1451303e4fc0bfcc5cc70c48133f', '登录日志', '54d2021c438a43959dc6f4a6f537f135', '/sys/loginlog', null,
'1', 'el-icon-info', '7', '0');
insert into `sys_menu`(`id`,`name`,`parent_id`,`url`,`perms`,`type`,`icon`,`sort`,`del_flag`) values
('e4f6fb0199264d72a913d5ba7999f042', '操作日志', '54d2021c438a43959dc6f4a6f537f135', '/sys/log', null,
'1', 'el-icon-info', '8', '0');
insert into `sys_menu`(`id`,`name`,`parent_id`,`url`,`perms`,`type`,`icon`,`sort`,`del_flag`) values
('1f41b1d151bc410cbedfed4dccfdaa2c', '系统监控', null, null, null,
'0', 'el-icon-info', '1', '0');

-- 初始化部门
insert into `sys_department`(`id`,`name`,`parent_id`,`sort`,`del_flag`) values
('300344ef74d44740ad7e99bf73a67832', '牛魔王集团', null, '0', '0');
insert into `sys_department`(`id`,`name`,`parent_id`,`sort`,`del_flag`) values
('39c3bd05460f4e62be24b6b9324bb475', '山东总部', '300344ef74d44740ad7e99bf73a67832', '0', '0');
insert into `sys_department`(`id`,`name`,`parent_id`,`sort`,`del_flag`) values
('e5c920c2146a43aa93b0d63595ff278c', '技术部', '39c3bd05460f4e62be24b6b9324bb475', '0', '0');
insert into `sys_department`(`id`,`name`,`parent_id`,`sort`,`del_flag`) values
('c5bb60d72fee421eb572b51915c3b570', '财务部', '39c3bd05460f4e62be24b6b9324bb475', '1', '0');

-- 初始化角色
insert into `sys_role`(`id`,`name`,`remark`,`del_flag`) values
('32221b00670742779e2ed427c7e3c9ed', 'admin', '超级管理员', '0');

-- 初始化部门角色
insert into `sys_department_role`(`id`,`department_id`,`role_id`)
values ('e99c6d3fcab444c7acf7d037abf08d7a', 'e5c920c2146a43aa93b0d63595ff278c', '32221b00670742779e2ed427c7e3c9ed');

-- 初始化角色菜单
insert into `sys_role_menu`(`id`,`role_id`,`menu_id`) values
('f1059fc95f314b27aee8d4194a2e8efa', '32221b00670742779e2ed427c7e3c9ed', '54d2021c438a43959dc6f4a6f537f135');
insert into `sys_role_menu`(`id`,`role_id`,`menu_id`) values
('abba4832f65b4e70bb9e7cc493e4e992', '32221b00670742779e2ed427c7e3c9ed', '8d096c735ab748a49d47ea69f0f390a1');
insert into `sys_role_menu`(`id`,`role_id`,`menu_id`) values
('cf8063f1f40d46459f890ebf1e4fea9e', '32221b00670742779e2ed427c7e3c9ed', 'a0a407c2e2634666a708d6c775c806d1');
insert into `sys_role_menu`(`id`,`role_id`,`menu_id`) values
('13986fb33a034dd4a3516245180d6e68', '32221b00670742779e2ed427c7e3c9ed', 'c0952708e98c4a9aa5279d62973669a6');
insert into `sys_role_menu`(`id`,`role_id`,`menu_id`) values
('bc301c92af5d41b08db83b5d850f3125', '32221b00670742779e2ed427c7e3c9ed', '5f0688a95b424ee8991fcb30f5b26906');
insert into `sys_role_menu`(`id`,`role_id`,`menu_id`) values
('6bc44961c1354ab8b53ced3126bf6014', '32221b00670742779e2ed427c7e3c9ed', '6c00dc2ab6aa444dae65c6a2f219f819');
insert into `sys_role_menu`(`id`,`role_id`,`menu_id`) values
('6ebf9a3fcf28488b87efaac6d41eb637', '32221b00670742779e2ed427c7e3c9ed', '49a049a05f474f8aa5e489f06a391efc');
insert into `sys_role_menu`(`id`,`role_id`,`menu_id`) values
('80c7b7d00fd34613a3c9a7be88fc1fd2', '32221b00670742779e2ed427c7e3c9ed', 'ff6c1451303e4fc0bfcc5cc70c48133f');
insert into `sys_role_menu`(`id`,`role_id`,`menu_id`) values
('34ccabb2f98341279bd8e6e1982c66a3', '32221b00670742779e2ed427c7e3c9ed', 'e4f6fb0199264d72a913d5ba7999f042');
insert into `sys_role_menu`(`id`,`role_id`,`menu_id`) values
('dbbf2f042fea4e7bb0dfbfcdecba1a00', '32221b00670742779e2ed427c7e3c9ed', '1f41b1d151bc410cbedfed4dccfdaa2c');

-- 初始化用户
insert into `sys_user`(`id`,`username`,`nickname`,`avatar`,`password`,`email`,`mobile`,`state`,`department_id`) values
('b652492a9c5247ed8eb1a8fa9ae0a286', 'admin', '超管', null, 'b652492a9c5247ed8eb1a8fa9ae0a286', 'wu.work@qq.com',
'16666666666', '1', 'e5c920c2146a43aa93b0d63595ff278c');

-- 初始化用户角色
insert into `sys_user_role`(`id`,`user_id`,`role_id`) values
('9ed84cc34275469781e907d95bb388fb', '32221b00670742779e2ed427c7e3c9ed', '1');

