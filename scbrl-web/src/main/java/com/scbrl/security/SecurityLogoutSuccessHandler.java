package com.scbrl.security;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 模块:【Spring Security 用户退出登录】
 * <p>
 * 开发: Bruce.Liu By 2017/10/29 下午10:42 Create
 */
@Component
@Slf4j
public class SecurityLogoutSuccessHandler implements LogoutSuccessHandler {


    @Override
    public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response,
                                Authentication authentication) throws IOException, ServletException {
        log.info("Logged out successfully. 退出成功！");
        request.setAttribute("ErrorLoginMsg","Logged out successfully. 退出成功！");
        request.getRequestDispatcher("/login").forward(request,response);
    }
}
