package com.scbrl.entity.sys;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 模块:【角色信息表】
 * <p>
 * 开发: Bruce.Liu By 2017/11/5 下午2:46 Create
 */
@Data
@Entity
@Table(name = "sys_role")
public class SysRole {

    /**
     * 主键
     */
    @Id
    @Column(length = 36 , nullable = false)
    private String roleId;

    /**
     * 角色编码
     */
    @Column(length = 36)
    private String roleCode ;

    /**
     * 角色名称
     */
    @Column(length = 36)
    private String roleName ;

    /**
     * 角色状态
     */
    @Column(length = 16)
    private String roleState;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人
     */
    @Column(length = 36)
    private String createWho;


}
