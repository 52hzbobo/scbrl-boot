package com.scbrl.security;

import com.scbrl.entity.sys.SysRole;
import com.scbrl.entity.sys.SysUser;
import com.scbrl.service.SysRoleService;
import com.scbrl.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * 模块:【Spring Secutity 自定义用户信息获取】
 *
 * 时间: Bruce.Liu By 2017/10/29 下午8:54 Create
 */
@Service("securityUserDetailsImpl")
public class SecurityUserDetailsService implements UserDetailsService {

    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private SysRoleService sysRoleService;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        SysUser user;
        try {
            user = sysUserService.findByUsername(userName);
        } catch (Exception e) {
            throw new UsernameNotFoundException("user select fail. 登录用户数据异常！");
        }
        if(user == null){
            // throw new UsernameNotFoundException("No user found. 登录用户不存在！");
            throw new UsernameNotFoundException("Wrong password. 账户或密码不正确！");
        } else {
            try {
                SysRole role = sysRoleService.findByRoleId(user.getRoleId());
                return new SecurityUserDetails(user, role);
            } catch (Exception e) {
                throw new UsernameNotFoundException("user role select fail. 登录用户角色组异常！");
            }
        }
    }
}
