package com.scbrl.service;

import com.scbrl.entity.sys.SysUser;

import java.util.Map;

/**
 * 模块:【用户业务层接口】
 *
 * 时间: Bruce.Liu By 2017/11/5 下午3:55 Create
 */
public interface SysUserService {

    void save(SysUser user);

    SysUser findByUsername(String username);

    int insertByMap(Map<String , Object> map);
}
