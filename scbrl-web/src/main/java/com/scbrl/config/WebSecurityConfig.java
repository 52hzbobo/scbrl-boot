package com.scbrl.config;

import com.scbrl.security.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * 模块:【Spring Security 拦截器主配置】
 *
 * 时间: Bruce.Liu By 2017/10/29 下午8:47 Create
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)//允许进入页面方法前验证
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {


    @Autowired
    private SecurityAuthenticationProvider provider;//自定义验证
    @Autowired
    private UserDetailsService userDetailsService;//自定义用户服务
    @Autowired
    public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception{}

    @Autowired
    private SecuritySuccessBrlHander securitySuccessBrlHander;

    @Autowired
    private SecurityFailureBrlHander securityFailureBrlHander;

    @Autowired
    private SecurityLogoutSuccessHandler securityLogoutSuccessHandler;


    /**
     * 配置过滤拦截项
     * @param web
     * @throws Exception
     */
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/static/**");//加载静态资源
        web.ignoring().antMatchers("/templates/**");//加载页面资源
        web.ignoring().antMatchers("/loginOut");//退出登录
        web.ignoring().antMatchers("/");//默认首页
        //web.ignoring().antMatchers("/main");//测试时开放
        //web.ignoring().antMatchers("/home");//测试时开放
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests()
                //任何访问都必须授权
                .anyRequest().fullyAuthenticated()
                .anyRequest().authenticated()
                .and()
            .formLogin()
                .loginPage("/login")
                .loginProcessingUrl("/main")//需验证登录的表单逻辑函数
                .successHandler(securitySuccessBrlHander)
                .failureHandler(securityFailureBrlHander)
                .permitAll()
                .and()
            .logout()
                .logoutUrl("/logout")//退出执行的地址
                .logoutSuccessHandler(securityLogoutSuccessHandler)
                .deleteCookies("JSESSIONID")
                .permitAll();

        /**
         * Session配置
         */
        http.sessionManagement()
            .invalidSessionUrl("/login") //Session过期跳转的路径
            .maximumSessions(1) // 同个用户Session只能存在一份(多点登录失效)
            //.maxSessionsPreventsLogin(true)//当用户已登录阻止后面同个用户登录
            //.expiredSessionStrategy(new SecurityExpiredSessionStrategy())//自定义Session并发登录逻辑
            ;

        /**
         * 禁用csrf保护
         */
        http.csrf().disable();

        /**
         * 禁用跨站iframe验证(避免前端框架套用iframe)
         */
        http.headers().frameOptions().disable();
    }


    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }


}
