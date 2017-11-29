package com.scbrl.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * 模块:【类模块名称】
 * <p>
 * 开发: Bruce.Liu By 2017/11/18 上午2:27 Create
 */
public interface SysUserMapper {

    @Insert("insert into sys_user(user_id , username , password , nick_name , role_id , user_state , create_who , create_time)" +
            " values(#{userId} , #{username} , #{password} , #{nickName} , #{roleId} , #{userState} , #{createWho} , #{createTime} ) ")
    int insertByMap(Map<String,Object> map);



}
