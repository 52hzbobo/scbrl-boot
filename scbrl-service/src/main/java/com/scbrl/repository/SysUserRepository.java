package com.scbrl.repository;

import com.scbrl.entity.sys.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 模块:【类模块名称】
 * <p>
 * 开发: Bruce.Liu By 2017/11/5 下午3:36 Create
 */
public interface SysUserRepository  extends JpaRepository<SysUser, String> {

    /**
     * 根据用户账号查询
     * @param username 登录用户账号
     * @return
     */
    SysUser findByUsername(String username) ;

}
