package com.scbrl.security;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.web.session.SessionInformationExpiredEvent;
import org.springframework.security.web.session.SessionInformationExpiredStrategy;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 模块:【Spring Security Session并发登录处理流程】
 * <p>
 * 开发: Bruce.Liu By 2017/10/29 下午9:27 Create
 *
 * TODO: 暂未启用(业务流程未贯通)
 */
@Slf4j
public class SecurityExpiredSessionStrategy implements SessionInformationExpiredStrategy {

    @Override
    public void onExpiredSessionDetected(SessionInformationExpiredEvent event)
            throws IOException, ServletException {
        log.info("The session has been to login again. ");
        event.getRequest().setAttribute("ErrorLoginMsg","The session has been to login again!");
    }
}
