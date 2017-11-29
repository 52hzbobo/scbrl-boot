package com.scbrl.config;

import com.scbrl.interceptor.LoginInterceptor;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Bruce.Liu on 2017/8/10.
 */
@EnableWebMvc
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

    /**
     * 启动时加载静态资源
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }

    /**
     * 统一拦截器
     * @param registry
     *
     * TODO: 函数已废弃，引用 Spring Security 安全框架 by 2017-10-22
     */
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new LoginInterceptor())
//                .addPathPatterns("/**")                  //添加所有资源拦截
//                .excludePathPatterns("/img/**").excludePathPatterns("/css/**").excludePathPatterns("/error") //排除静态资源拦截
//                .excludePathPatterns("/statics/**");      //排除静态资源拦截
//    }


}