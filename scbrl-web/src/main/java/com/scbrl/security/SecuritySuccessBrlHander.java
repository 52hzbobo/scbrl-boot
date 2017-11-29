package com.scbrl.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 模块:【Spring Security 自定义登录成功处理逻辑】
 *
 * 时间: Bruce.Liu By 2017/10/29 下午8:57 Create
 */

@Service("securitySuccessBrlHander")
@Slf4j
public class SecuritySuccessBrlHander implements AuthenticationSuccessHandler {

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
                                        Authentication authentication) throws IOException, ServletException {
        log.info("登录成功！！");
        //httpServletResponse.setContentType("application/json/;charset=UTF-8");//返回内容为Json格式
        //httpServletResponse.getWriter().write(objectMapper.writeValueAsString(authentication));
        // 逻辑2 直接跳转到登录
        httpServletResponse.sendRedirect("/main");
    }
}
