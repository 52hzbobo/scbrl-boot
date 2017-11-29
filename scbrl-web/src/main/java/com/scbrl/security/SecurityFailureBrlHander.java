package com.scbrl.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 模块:【Spring Security 自定义登录失败处理逻辑】
 *
 * 时间: Bruce.Liu By 2017/10/29 下午8:58 Create
 */
@Service("scurityFailureBrlHander")
@Slf4j
public class SecurityFailureBrlHander implements AuthenticationFailureHandler {

    @Autowired
    private ObjectMapper objectMapper;


    @Override
    public void onAuthenticationFailure(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
                                        AuthenticationException e) throws IOException, ServletException {
        log.info("登录认证失败:"+e.getMessage()+"|"+httpServletRequest.getAttribute("username"));
        //httpServletResponse.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());//默认状态码是200 修改成500 服务器异常
        //httpServletResponse.setContentType("application/json/;charset=UTF-8");
        //httpServletResponse.getWriter().write(objectMapper.writeValueAsString(e));
        httpServletRequest.setAttribute("ErrorLoginMsg",e.getMessage());
        httpServletRequest.getRequestDispatcher("/login").forward(httpServletRequest,httpServletResponse);
        //httpServletResponse.sendRedirect("/login");
    }
}
