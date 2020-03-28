package com.bjsxt.mapper;

import com.bjsxt.pojo.User;

/**
 * @author ZhangHaoyu
 * @description
 * @date 2020/3/28 11:29
 */
public interface UserMapper {

    /**
     * 用户登录
     * @param uname
     * @param pwd
     * @return
     */
    User selectOne(String uname,String pwd);
}
