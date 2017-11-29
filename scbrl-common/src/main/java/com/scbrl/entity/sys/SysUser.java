package com.scbrl.entity.sys;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * 模块:【用户信息主表】
 * <p>
 * 开发: Bruce.Liu By 2017/11/5 下午2:26 Create
 */
@Data
@Entity
@Table(name = "sys_user")
public class SysUser {

    /**
     * 主键
     */
    @Id
    @Column(length = 36 , nullable = false)
    private String userId;

    /**
     * 登录账号(手机号)
     */
    @Column(length = 32)
    private String username ;

    /**
     * 密码
     */
    @Column(length = 128)
    private String password ;

    /**
     * 昵称
     */
    @Column(length = 22)
    private String nickName ;

    /**
     * 角色Id
     */
    private String roleId ;

    /**
     * 用户状态
     */
    @Column(length = 16)
    private String userState ;

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
     * 定义空构造函数
     */
    public SysUser () {}

    /**
     * 定义有参构造函数
     */
    public SysUser (SysUser u ){
        userId = u.getUserId();
        username = u.getUsername();
        password = u.getPassword();
        nickName = u.getNickName();
        roleId = u.getRoleId();
        userState = u.getUserState();
        createTime = u.getCreateTime();
        createWho = u.getCreateWho();
    }
}
