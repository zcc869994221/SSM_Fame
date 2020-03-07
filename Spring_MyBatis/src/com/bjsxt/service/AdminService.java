package com.bjsxt.service;

import com.bjsxt.pojo.Admin;

/**
 * @author Zhang Haoyu
 * @create 2020-03-07 21:19
 */
public interface AdminService {
    /**
     * 用户登录
     * @param username
     * @param password
     * @return
     */
    Admin login(String username, String password);
}
