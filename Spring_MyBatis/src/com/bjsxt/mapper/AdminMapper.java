package com.bjsxt.mapper;

import com.bjsxt.pojo.Admin;

/**
 * @author Zhang Haoyu
 * @create 2020-03-07 20:50
 */
public interface AdminMapper {
    /**
     *查找用户
     * @return Admin
     */
    Admin selAdmin(String username, String password);
}
