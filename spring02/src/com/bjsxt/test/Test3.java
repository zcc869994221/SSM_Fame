package com.bjsxt.test;

import com.bjsxt.pojo.Student;
import com.bjsxt.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ZhangHaoyu
 * @description
 * @date 2020/3/21 21:50
 */
public class Test3 {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext3.xml");
        User user = app.getBean("user", User.class);
        user.c("123");
    }
}
