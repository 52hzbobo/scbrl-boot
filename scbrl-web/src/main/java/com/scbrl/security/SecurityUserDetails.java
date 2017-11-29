package com.scbrl.security;

import com.scbrl.entity.sys.SysRole;
import com.scbrl.entity.sys.SysUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

/**
 * 模块:【Spring Security 自定义登录用户／角色信息】
 *
 * 时间: Bruce.Liu By 2017/10/29 下午8:50 Create
 */
public class SecurityUserDetails extends SysUser implements UserDetails {

    private SysRole role;

    public SecurityUserDetails(SysUser user, SysRole roles){
        super(user);
        this.role = roles;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        if(role == null ){
            return AuthorityUtils.commaSeparatedStringToAuthorityList("");
        }
        StringBuilder commaBuilder = new StringBuilder();
        commaBuilder.append(role.getRoleName()).append(",");
        String authorities = commaBuilder.substring(0,commaBuilder.length()-1);
        return AuthorityUtils.commaSeparatedStringToAuthorityList(authorities);
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }

    @Override
    public String getUsername() {
        return super.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}
