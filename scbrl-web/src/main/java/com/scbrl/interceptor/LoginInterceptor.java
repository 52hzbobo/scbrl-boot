package com.scbrl.interceptor;

import com.scbrl.interfaces.LoginAuth;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * 统一登录拦截器
 * Created by Bruce.Liu on 2017/8/28.
 *
 * TODO: 函数已废弃，引用 Spring Security 安全框架 by 2017-10-22
 */
//@Slf4j
@Deprecated
public class LoginInterceptor  { //implements HandlerInterceptor {


//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)  {
//        /**
//         * 对来自后台的请求统一进行日志处理
//         */
//        try{
//            /**
//                String url = request.getRequestURL().toString();
//                String method = request.getMethod();
//                String uri = request.getRequestURI();
//                String queryString = request.getQueryString();
//                System.out.println(request.getParameterMap().toString())
//            **/
//            if(handler.getClass().isAssignableFrom(HandlerMethod.class)) {
//                LoginAuth auth = ((HandlerMethod) handler).getMethodAnnotation(LoginAuth.class);
//                if(auth != null && auth.isAdmin()){
//                        PrintWriter out = response.getWriter();
//                        out.println("<html>");
//                        out.println("<script>");
//                        out.println("window.open ('"+request.getContextPath()+"/login','_top')");
//                        out.println("</script>");
//                        out.println("</html>");
//                        return false;
//                }
//            }
//            //log.info(String.format("请求参数, url: %s, method: %s, uri: %s, params: %s", url, method, uri, queryString));
//            } catch (Exception e){
//                e.printStackTrace();
//            }
//        return true;
//    }
//
//    @Override
//    public void postHandle(HttpServletRequest httpServletRequest,
//                           HttpServletResponse httpServletResponse,
//                           Object o, ModelAndView modelAndView) throws Exception {
//
//    }
//
//    @Override
//    public void afterCompletion(HttpServletRequest httpServletRequest,
//                                HttpServletResponse httpServletResponse,
//                                Object o, Exception e) throws Exception {
//
//    }


}
