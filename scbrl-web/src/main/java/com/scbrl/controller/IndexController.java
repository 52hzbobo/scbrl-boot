package com.scbrl.controller;

import com.scbrl.dto.RoleMenuDTO;
import com.scbrl.entity.sys.SysRoleMenu;
import com.scbrl.entity.sys.SysUser;
import com.scbrl.security.SecurityUserDetails;
import com.scbrl.service.SysRoleMenuService;
import com.scbrl.service.SysUserService;
import com.scbrl.util.CookieUtil;
import com.scbrl.util.JsonUtil;
import com.scbrl.util.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

/**
 * Created by Bruce.Liu on 2017/8/10.
 */
@Controller
@Slf4j
public class IndexController {


    @Autowired
    private SysRoleMenuService sysRoleMenuService;

    /**
     * 默认后台主菜单
     */
    @RequestMapping("/main")
    public ModelAndView main() {
        ModelAndView mv = new ModelAndView();
        SecurityUserDetails userDetails ;
        try{
            userDetails  = (SecurityUserDetails) SecurityContextHolder.getContext()
                    .getAuthentication()
                    .getPrincipal();
        } catch (Exception e){
            e.printStackTrace();
            mv.addObject("ErrorLoginMsg","Invalid Credentials. 无效的登录凭证！");
            mv.setViewName("login");
            return mv;
        }
        List<LinkedHashMap> menus = sysRoleMenuService.selectByRoleMenuList(userDetails.getRoleId());
        mv.addObject("UserInfo",userDetails);
        mv.addObject("Menus",menus);
        mv.setViewName("system/main");
        return mv;
    }


    @RequestMapping("/login")
    public ModelAndView login(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();
        log.info(">>>>>>>>>>>>>>>>>>>>: "+request.getAttribute("ErrorLoginMsg"));
        mv.setViewName("login");
        return mv;
    }

    @RequestMapping("/logout")
    public ModelAndView loginOut(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("ErrorLoginMsg","Logged out successfully. 退出成功！");
        mv.setViewName("login");
        return mv;
    }


    @RequestMapping("/home")
    public ModelAndView home(
    ) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("home");
        return mv;
    }


    @RequestMapping("/userinfo")
    public ModelAndView userinfo() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("userinfo");
        return mv;
    }


    @RequestMapping("/message")
    public ModelAndView message() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("message");
        return mv;
    }

    @RequestMapping("/smsinfo")
    public ModelAndView smsinfo() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("smsinfo");
        return mv;
    }

    @RequestMapping("/identify")
    public ModelAndView identify() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("identify");
        return mv;
    }

}
