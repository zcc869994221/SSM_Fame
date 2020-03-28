package com.bjsxt.mapper;

import com.bjsxt.pojo.Email;

import java.util.List;

/**
 * @author ZhangHaoyu
 * @description
 * @date 2020/3/28 13:44
 */
public interface EmailMapper {

    /**
     * 查找当前id的所有收件
     * @param recid
     * @return
     */
    List<Email> selectMore(int recid);

    /**
     * 发送邮件
     * @param email
     * @return
     */
    int insertEmail(Email email);
}
