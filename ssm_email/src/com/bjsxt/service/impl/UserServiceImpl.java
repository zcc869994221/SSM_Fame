package com.bjsxt.service.impl;

import com.bjsxt.mapper.UserMapper;
import com.bjsxt.pojo.User;
import com.bjsxt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ZhangHaoyu
 * @description
 * @date 2020/3/28 11:33
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public User login(String uname, String pwd) {

        return userMapper.selectOne(uname, pwd);
    }
}
