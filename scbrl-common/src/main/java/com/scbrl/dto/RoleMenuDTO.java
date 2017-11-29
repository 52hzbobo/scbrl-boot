package com.scbrl.dto;

import lombok.Data;

import java.util.List;

/**
 * 模块:【菜单权限DTO】
 * <p>
 * 开发: Bruce.Liu By 2017/11/18 上午10:21 Create
 */
@Data
public class RoleMenuDTO {

    private String menuId;

    private String menuName;

    private String menuUrl;

    private String menuParent;

    private String menuIcon;

    private int menuOrder;

    private String menuIns;

    private String menuDel;

    private String menuUpd;

    private String menuSel;

    private String menuImp;

    private String menuExp;

    private List<RoleMenuDTO> menuSubs;

}
