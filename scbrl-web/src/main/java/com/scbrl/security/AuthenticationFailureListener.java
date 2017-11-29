package com.scbrl.security;

import com.scbrl.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.security.authentication.event.AuthenticationFailureBadCredentialsEvent;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.stereotype.Component;

/**
 * 模块:【登录失败次数监听】
 * <p>
 * 开发: Bruce.Liu By 2017/11/5 上午9:53 Create
 */
@Component
public class AuthenticationFailureListener
        implements ApplicationListener<AuthenticationFailureBadCredentialsEvent> {

    /**
     * 模块:【监听登录失败IP，记录IP登录的每个账号的失败次数到Redis】
     *
     * 时间: Bruce.Liu By 2017/11/5 上午10:22 Create
     */
    @Override
    public void onApplicationEvent(AuthenticationFailureBadCredentialsEvent e) {
        WebAuthenticationDetails auth = (WebAuthenticationDetails)
                e.getAuthentication().getDetails();
        if(e.getException().getMessage().indexOf("Wrong password.")>=0){
            String k = auth.getRemoteAddress()+"_WrongPwd_"+e.getAuthentication().getPrincipal();
            String v = RedisUtil.get(k);
            if(v == null){
                RedisUtil.put(k,"1",600);
            } else {
                int count = Integer.valueOf(v);
                RedisUtil.put(k,(count+1)+"",600);
            }
        }
    }
}