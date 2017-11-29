package com.scbrl.entity.sys;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 模块:【菜单信息主表】
 * <p>
 * 开发: Bruce.Liu By 2017/11/5 下午3:00 Create
 */
@Data
@Entity
@Table(name = "sys_menu")
public class SysMenu {

    /**
     * 主键
     */
    @Id
    @Column(length = 36 , nullable = false)
    private String menuId;

    /**
     * 菜单地址
     */
    @Column(length = 128)
    private String menuUrl ;

    /**
     * 菜单名称
     */
    @Column(length = 36)
    private String menuName ;

    /**
     * 上级菜单Id
     */
    @Column(length = 36)
    private String menuParent;

    /**
     * 上级菜单图标
     */
    @Column(length = 128)
    private String menuIcon;

    /**
     * 菜单状态
     */
    @Column(length = 16)
    private String menuState;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人
     */
    @Column(length = 36)
    private String createWho;

    /**
     * 排序
     */
    @Column(length = 8)
    private Integer menuOrder;

}
