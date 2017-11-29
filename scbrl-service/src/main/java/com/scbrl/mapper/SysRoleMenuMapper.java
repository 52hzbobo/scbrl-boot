package com.scbrl.mapper;

import com.scbrl.dto.RoleMenuDTO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 模块:【类模块名称】
 * <p>
 * 开发: Bruce.Liu By 2017/11/18 上午3:04 Create
 */
public interface SysRoleMenuMapper {

    /**
     * 联合查询菜单权限
     *
     * @param roleId 角色ID
     * @param parent 上级菜单ID
     * @return List<LinkedHashMap>
     */
    @Select(
       " SELECT " +
        " sm.menu_id as menuId, " +
        " sm.menu_name as menuName, " +
        " sm.menu_url as menuUrl, " +
        " sm.menu_parent as menuParent, " +
        " sm.menu_icon as menuIcon, " +
        " sm.menu_order as menuOrder, " +
        " srm.menu_ins as menuIns, " +
        " srm.menu_del as menuDel, " +
        " srm.menu_upd as menuUpd, " +
        " srm.menu_sel as menuSel, " +
        " srm.menu_imp as menuImp, " +
        " srm.menu_exp as menuExp " +
       " FROM " +
        " sys_menu sm, " +
        " sys_role_menu srm " +
       " WHERE " +
        " srm.menu_id = sm.menu_id " +
        " AND srm.role_id = #{roleId} " +
        " AND sm.menu_parent = #{parent} " +
        " AND sm.menu_state = 'normal' " +
       " ORDER BY " +
        " sm.menu_order ASC"
    )
    List<LinkedHashMap> selectByRoleMenuList(
            @Param("roleId") String roleId ,
            @Param("parent") String parent
    );


    /**
     * 联合查询菜单权限
     *
     * @param roleId 角色ID
     * @param parent 上级菜单ID
     * @return List<RoleMenuDTO>
     */
    @Select(
            " SELECT " +
            " sm.menu_id as menuId, " +
            " sm.menu_name as menuName, " +
            " sm.menu_url as menuUrl, " +
            " sm.menu_parent as menuParent, " +
            " sm.menu_icon as menuIcon, " +
            " sm.menu_order as menuOrder, " +
            " srm.menu_ins as menuIns, " +
            " srm.menu_del as menuDel, " +
            " srm.menu_upd as menuUpd, " +
            " srm.menu_sel as menuSel, " +
            " srm.menu_imp as menuImp, " +
            " srm.menu_exp as menuExp " +
            " FROM " +
            " sys_menu sm, " +
            " sys_role_menu srm " +
            " WHERE " +
            " srm.menu_id = sm.menu_id " +
            " AND srm.role_id = #{roleId} " +
            " AND sm.menu_parent = #{parent} " +
            " AND sm.menu_state = 'normal' " +
            " ORDER BY " +
            " sm.menu_order ASC"
    )
    List<RoleMenuDTO> selectByRoleMenuDTOList(
            @Param("roleId") String roleId ,
            @Param("parent") String parent
    );
}
