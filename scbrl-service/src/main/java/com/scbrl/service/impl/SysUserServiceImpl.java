package com.scbrl.service.impl;

import com.scbrl.entity.sys.SysUser;
import com.scbrl.mapper.SysUserMapper;
import com.scbrl.repository.SysUserRepository;
import com.scbrl.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 模块:【用户业务层】
 *
 * 时间: Bruce.Liu By 2017/11/5 下午3:50 Create
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserRepository sysUserRepository;

    @Autowired
    private SysUserMapper sysUserMapper ;

    public void save(SysUser user){
        sysUserRepository.save(user);
    }

    public SysUser findByUsername(String username){
       return sysUserRepository.findByUsername(username);
    }

    public int insertByMap(Map<String , Object> map){
        return sysUserMapper.insertByMap(map);
    }
}
