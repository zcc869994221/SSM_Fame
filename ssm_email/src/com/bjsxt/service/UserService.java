package com.bjsxt.service;

import com.bjsxt.pojo.User;

/**
 * @author ZhangHaoyu
 * @description
 * @date 2020/3/28 11:33
 */
public interface UserService {

    /**
     * 用户登录
     * @param uname
     * @param pwd
     * @return
     */
    User login(String uname,String pwd);
}
