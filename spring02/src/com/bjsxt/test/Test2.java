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
public class Test2 {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Student stu = app.getBean("stu", Student.class);
        System.out.println("stu = " + stu);
    }
}
