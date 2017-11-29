package com.scbrl.service;

import com.scbrl.entity.sys.SysRole;

/**
 * 模块:【角色业务层接口】
 *
 * 时间: Bruce.Liu By 2017/11/5 下午3:55 Create
 */
public interface SysRoleService {

    void save(SysRole role);

    SysRole findByRoleId(String roleId);
}
