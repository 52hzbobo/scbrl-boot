package com.scbrl.security;

import com.scbrl.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;

/**
 * 模块:【Spring Security 自定义登录验证服务模块】
 *
 * 时间: Bruce.Liu By 2017/10/29 下午8:49 Create
 */
@Component
public class SecurityAuthenticationProvider implements AuthenticationProvider {

    @Autowired
    private SecurityUserDetailsService securityUserDetailsImpl;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = authentication.getName();
        WebAuthenticationDetails wad = (WebAuthenticationDetails)authentication.getDetails();
        String rKey = wad.getRemoteAddress()+"_WrongPwd_"+username;
        String rVal = RedisUtil.get(rKey);
        if(rVal!=null && Integer.valueOf(rVal) > 10){
            throw new BadCredentialsException("Fail too many. 异常登录请求！");
        }
        String password = (String) authentication.getCredentials();
        SecurityUserDetails user = (SecurityUserDetails) securityUserDetailsImpl.loadUserByUsername(username);
//        if(user == null){
//            throw new BadCredentialsException("Username not found. 登录账户不存在！");
//        }

        //加密过程在这里体现
        PasswordEncoder pe = new BCryptPasswordEncoder();
        if (user == null || !pe.matches(password,user.getPassword())) {
            throw new BadCredentialsException("Wrong password. 账户或密码不正确！");
        }

        Collection<? extends GrantedAuthority> authorities = user.getAuthorities();
        RedisUtil.del(rKey);
        return new UsernamePasswordAuthenticationToken(user, password, authorities);
    }

    @Override
    public boolean supports(Class<?> arg0) {
        return true;
    }

}