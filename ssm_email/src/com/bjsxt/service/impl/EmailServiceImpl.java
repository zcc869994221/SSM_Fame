package com.bjsxt.service.impl;

import com.bjsxt.mapper.EmailMapper;
import com.bjsxt.pojo.Email;
import com.bjsxt.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ZhangHaoyu
 * @description
 * @date 2020/3/27 16:04
 */
@Service
public class EmailServiceImpl implements EmailService {
    @Autowired
    EmailMapper emailMapper;

    @Override
    public List<Email> findMore(int recid) {
        return emailMapper.selectMore(recid);
    }

    @Override
    public int sendEmail(Email email) {

        return emailMapper.insertEmail(email);
    }
}
