package com.scbrl.service.impl;

import com.scbrl.entity.sys.SysMenu;
import com.scbrl.repository.SysMenuRepository;
import com.scbrl.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 模块:【菜单业务层】
 *
 * 时间: Bruce.Liu By 2017/11/5 下午4:09 Create
 */

@Service
public class SysMenuServiceImpl implements SysMenuService {

    @Autowired
    private SysMenuRepository sysMenuRepository;

    public void save(SysMenu menu){
        sysMenuRepository.save(menu);
    }


}
