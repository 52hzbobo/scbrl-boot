package com.scbrl.service.impl;

import com.scbrl.entity.sys.SysRole;
import com.scbrl.repository.SysRoleRepository;
import com.scbrl.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 模块:【角色业务层】
 *
 * 时间: Bruce.Liu By 2017/11/5 下午4:08 Create
 */

@Service
public class SysRoleServiceImpl implements SysRoleService {

    @Autowired
    private SysRoleRepository sysRoleRepository;

    public void save(SysRole role){
        sysRoleRepository.save(role);
    }

    public SysRole findByRoleId(String roleId){
        return sysRoleRepository.findOne(roleId);
    }
}
