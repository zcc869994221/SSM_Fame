package com.bjsxt.spring01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Zhang Haoyu
 */
public class Test {
    public static void main(String[] args) {
        //1、解析xml文件
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");

        //2、获得对象
        Student stu = (Student) app.getBean("stu");

        //.var
        Student stu1 = app.getBean("stu", Student.class);

        stu1.eat();
        //返回值true
        System.out.println(stu==stu1);
    }
}
