package com.bjsxt.spring02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Zhang Haoyu
 * @create 2020-03-07 18:09
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student stu2 = app.getBean("stu2", Student.class);
       // System.out.println("stu2 = " + stu2);

        Student stu3 = app.getBean("stu3", Student.class);
        System.out.println("stu3 = " + stu3);
    }
}
