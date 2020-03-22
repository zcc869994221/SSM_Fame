package com.bjsxt.service.impl;

import com.bjsxt.mapper.AccountMapper;
import com.bjsxt.pojo.Account;
import com.bjsxt.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author ZhangHaoyu
 * @description
 * @date 2020/3/20 14:01
 */
@Service("asi")
public class AccountServiceImpl implements AccountService {
    /**
     * 自动注入mapper对象
     */
    @Autowired
    AccountMapper mapper;


    @Override
//    @Transactional
    public int inOutMoney(String outCno, String inCno, String money) {
        int i = mapper.update1(outCno, money);
        int j = mapper.update2(inCno, money);
        if(i>0 && j>0){
            //都执行了
            return 1;
        }
        return 0;
    }

    @Override
    public Account findOne(String cno, String pwd, String money) {
        return mapper.selectOne(cno, pwd, money);
    }

    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        String[] beanDefinitionNames = app.getBeanDefinitionNames();
        for (int i = 0; i < beanDefinitionNames.length; i++) {
            System.out.println(beanDefinitionNames[i]);
        }
    }
}
