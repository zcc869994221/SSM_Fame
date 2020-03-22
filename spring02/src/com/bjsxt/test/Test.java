package com.bjsxt.test;

import com.bjsxt.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * @author ZhangHaoyu
 * @description
 * @date 2020/3/21 21:01
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext2.xml");
        User user = app.getBean("user",User.class);
        user.a("123");
    }
}
