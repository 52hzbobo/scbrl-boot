package com.scbrl.entity.sys;

import lombok.Data;

import javax.persistence.*;

/**
 * 模块:【角色菜单表】
 * <p>
 * 开发: Bruce.Liu By 2017/11/5 下午3:05 Create
 */
@Data
@Entity
@Table(name = "sys_role_menu")
public class SysRoleMenu {

    /**
     * 主键
     */
    @Id
    @Column(length = 36 )
    private String roleMenuId;

    /**
     * 角色Id
     */
    @Column(length = 36 )
    private String roleId ;

    /**
     * 菜单ID
     */
    @Column(length = 36 )
    private String menuId ;

    /**
     * 权限：查询 Y/N
     */
    @Column(length = 8 )
    private String menuSel;

    /**
     * 权限：删除 Y/N
     */
    @Column(length = 8 )
    private String menuDel;

    /**
     * 权限：新增 Y/N
     */
    @Column(length = 8 )
    private String menuIns ;

    /**
     * 权限：修改 Y/N
     */
    @Column(length = 8 )
    private String menuUpd ;

    /**
     * 权限：导入 Y/N
     */
    @Column(length = 8 )
    private String menuImp ;

    /**
     * 权限：导出 Y/N
     */
    @Column(length = 8 )
    private String menuExp ;


}
