package com.scbrl.service.impl;

import com.scbrl.dto.RoleMenuDTO;
import com.scbrl.entity.sys.SysRoleMenu;
import com.scbrl.mapper.SysRoleMenuMapper;
import com.scbrl.repository.SysRoleMenuRepository;
import com.scbrl.service.SysRoleMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 模块:【角色菜单权限业务层】
 *
 * 时间: Bruce.Liu By 2017/11/5 下午4:14 Create
 */

@Service
public class SysRoleMenuServiceImpl implements SysRoleMenuService {

    @Autowired
    private SysRoleMenuRepository sysRoleMenuRepository;
    @Autowired
    private SysRoleMenuMapper sysRoleMenuMapper;

    public void save(SysRoleMenu roleMenu){
        sysRoleMenuRepository.save(roleMenu);
    }

    public List<SysRoleMenu> findByRoleId(String roleId){
        return sysRoleMenuRepository.findByRoleId(roleId);
    }

    public List<SysRoleMenu> selectByRoleParent(String roleId , String parent){
        return sysRoleMenuRepository.selectByRoleParent(roleId , parent);
    }

    /**
     * 模块:【角色菜单权限联合查询集合】
     *
     * 时间: Bruce.Liu By 2017/11/18 上午3:38 Create
     *
     * TODO: MyBatis复杂范式查询(返回动态列)
     */

    public List<LinkedHashMap> selectByRoleMenuList(String roleId){
        List<LinkedHashMap> menuParents = sysRoleMenuMapper.selectByRoleMenuList(roleId , "0");
        List<LinkedHashMap> menuSubs = null ;
        for(LinkedHashMap parent_ :  menuParents){
            menuSubs = sysRoleMenuMapper.selectByRoleMenuList(roleId , parent_.get("menuId").toString());
            parent_.put("menuSubs",menuSubs);
        }
        return menuParents;
    }

    /**
     * 模块:【角色菜单权限联合查询集合】
     *
     * 时间: Bruce.Liu By 2017/11/18 上午3:38 Create
     *
     * TODO: MyBatis复杂范式查询(返回DTO) 需创建对应的返回列
     */
    public List<RoleMenuDTO> selectByRoleMenuDTOList(String roleId){
        List<RoleMenuDTO> menuParents = sysRoleMenuMapper.selectByRoleMenuDTOList(roleId , "0");
        List<RoleMenuDTO> menuSubs = null ;
        for(RoleMenuDTO dto :  menuParents){
            menuSubs = sysRoleMenuMapper.selectByRoleMenuDTOList(roleId , dto.getMenuId());
            dto.setMenuSubs(menuSubs);
        }
        return menuParents;
    }

}
