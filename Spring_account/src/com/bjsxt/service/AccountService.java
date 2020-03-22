package com.bjsxt.service;

import com.bjsxt.pojo.Account;

/**
 * @author ZhangHaoyu
 * @description
 * @date 2020/3/20 14:00
 */
public interface AccountService {
    public Account findOne(String cno,String pwd,String money);
    public int inOutMoney(String outCno,String inCno,String money);
}
