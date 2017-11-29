package com.scbrl.repository;

import com.scbrl.entity.sys.SysRoleMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * 模块:【类模块名称】
 * <p>
 * 开发: Bruce.Liu By 2017/11/5 下午3:36 Create
 */
public interface SysRoleMenuRepository extends JpaRepository<SysRoleMenu, String> {

    List<SysRoleMenu> findByRoleId(String roleId);

    @Query(value = " select srm.* from sys_menu sm , sys_role_menu srm " +
            " where srm.menu_id = sm.menu_id and srm.role_id = ?1 and sm.menu_parent = ?2 " +
            " order by sm.menu_order asc", nativeQuery = true)
    List<SysRoleMenu> selectByRoleParent(String roleId , String parent);


    /**
     * 联合查询角色菜单权限
     *
     * TODO: 新增、删除、修改字段顺序需同步修改业务类顺序
     *
     * @param roleId 角色
     * @param parent 上级Id
     * @return
     */
    @Query(value = "SELECT " +
            " sm.menu_id, " +
            " sm.menu_name, " +
            " sm.menu_url, " +
            " sm.menu_parent, " +
            " sm.menu_icon, " +
            " sm.menu_order, " +
            " srm.role_id, " +
            " srm.menu_ins, " +
            " srm.menu_del, " +
            " srm.menu_upd, " +
            " srm.menu_sel, " +
            " srm.menu_imp, " +
            " srm.menu_exp " +
            " FROM " +
            " sys_menu sm, " +
            " sys_role_menu srm " +
            " WHERE " +
            " srm.menu_id = sm.menu_id " +
            " AND srm.role_id = ?1 " +
            " AND sm.menu_parent = ?2 " +
            " AND sm.menu_state = 'normal' " +
            " ORDER BY " +
            " sm.menu_order ASC", nativeQuery = true)
    List<Object[]> selectByRoleMenus(String roleId , String parent);
}
