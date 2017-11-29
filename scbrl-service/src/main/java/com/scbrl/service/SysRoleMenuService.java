package com.scbrl.service;

import com.scbrl.dto.RoleMenuDTO;
import com.scbrl.entity.sys.SysRoleMenu;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * 模块:【角色菜单业务层接口】
 *
 * 时间: Bruce.Liu By 2017/11/5 下午3:55 Create
 */
public interface SysRoleMenuService {

    void save(SysRoleMenu roleMenu);

    List<SysRoleMenu> findByRoleId(String roleId);

    List<SysRoleMenu> selectByRoleParent(String roleId , String parent);

    List<LinkedHashMap> selectByRoleMenuList(String roleId);

    List<RoleMenuDTO> selectByRoleMenuDTOList(String roleId);
}
