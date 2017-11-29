package com.scbrl.interfaces;

import java.lang.annotation.*;

/**
 * @author liuwb 2016-12-2 17:30:37 by create
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface LoginAuth {
	
    /**
     * 直接请求(无需用户登录)
     */
    boolean Succeed() default true;
    
    /**
     * APP请求(需用户登录成功)
     */
    boolean isAppLogin() default false;
    
    /**
     * 后台管理登录验证
     */
    boolean isAdmin() default false;

    /**
     * 微信授权登陆
     */
    boolean isWeChat() default false;
    
}
