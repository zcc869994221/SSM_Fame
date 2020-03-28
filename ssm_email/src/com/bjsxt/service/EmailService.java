package com.bjsxt.service;

import com.bjsxt.pojo.Email;

import java.util.List;

/**
 * @author ZhangHaoyu
 * @description
 * @date 2020/3/27 16:03
 */
public interface EmailService {

    /**
     * 查询邮箱信息
     * @param recid
     * @return
     */
    List<Email> findMore(int recid);

    /**
     * 发送右键
     * @param email
     * @return
     */
    int sendEmail(Email email);
}
