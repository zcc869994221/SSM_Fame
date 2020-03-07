package com.bjsxt.Spring04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Zhang Haoyu
 * @create 2020-03-07 18:34
 */
public class Test {
    public static void main(String[] args) {
        /**
         * 测试Map，list，Set等的IOC注入
         */
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext2.xml");
       /* Student stu = app.getBean("stu", Student.class);
        System.out.println(stu);*/
        User user = app.getBean("user", User.class);
        System.out.println("user = " + user);
    }
}
