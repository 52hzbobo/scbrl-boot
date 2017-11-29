package com.scbrl.controller;

import com.scbrl.dto.RoleMenuDTO;
import com.scbrl.entity.sys.SysUser;
import com.scbrl.service.SysRoleMenuService;
import com.scbrl.service.SysUserService;
import com.scbrl.util.CookieUtil;
import com.scbrl.util.JsonUtil;
import com.scbrl.util.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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
 * 模块:【类模块名称】
 * <p>
 * 开发: Bruce.Liu By 2017/11/18 上午10:46 Create
 */
@Controller
@Slf4j
public class TestController {

    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private SysRoleMenuService sysRoleMenuService;

    PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    /**
     * 默认启动页
     */
    @RequestMapping("/")
    public ModelAndView index(
            HttpServletRequest request,
            HttpServletResponse response
    ) {
        RedisUtil.put("BruceLiu","Hello Word");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        mv.addObject("msg",RedisUtil.get("BruceLiu"));
        Cookie cookie = CookieUtil.get(request, "token");
        if(cookie == null){
            String token = UUID.randomUUID().toString().toUpperCase();
            Integer expire = 7200;
            CookieUtil.set(response, "token", token, expire);
            log.error("Set CookieUtil：" + token);
        }
        Map<String , Object> userMap = new HashMap<>();
        userMap.put("userId",UUID.randomUUID().toString().toUpperCase());
        userMap.put("username","U_"+System.currentTimeMillis());
        userMap.put("password", passwordEncoder.encode("P_"+System.currentTimeMillis()));
        userMap.put("nickName","N_"+System.currentTimeMillis());
        userMap.put("roleId","1");
        userMap.put("userState","normal");
        userMap.put("createWho","admin");
        userMap.put("createTime",new Date());
        sysUserService.insertByMap(userMap);

        List<LinkedHashMap> ls = sysRoleMenuService.selectByRoleMenuList("1024");
        List<RoleMenuDTO> lsdto = sysRoleMenuService.selectByRoleMenuDTOList("1024");

        System.err.println(JsonUtil.toJson(ls));
        log.info(JsonUtil.toJson(lsdto));
        return mv;
    }

    @RequestMapping("/add")
    public ModelAndView add(
            HttpServletRequest request,
            HttpServletResponse response
    ) {
        Cookie cookie = CookieUtil.get(request, "token");
        if(cookie == null){
            String token = UUID.randomUUID().toString().toUpperCase();
            Integer expire = 7200;
            CookieUtil.set(response, "token", token, expire);
            log.error("Set CookieUtil：" + token);
        } else {
            System.out.print(JsonUtil.toJson(cookie));
        }

        SysUser user = new SysUser();
        String s = System.currentTimeMillis()+"";
        user.setUserId(UUID.randomUUID().toString());
        user.setUsername("Un"+s);
        user.setPassword("Pwd"+s);
        user.setNickName("TestNK"+s);
        user.setRoleId("S"+s);
        user.setCreateTime(new Date());
        user.setCreateWho("TestAdd");
        String encodePwd = passwordEncoder.encode(request.getParameter("pwd"));
        System.err.println(encodePwd);
        sysUserService.save(user);
        RedisUtil.put("BruceLiu","Hello Word");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        mv.addObject("msg",RedisUtil.get("BruceLiu"));
        return mv;
    }
}
