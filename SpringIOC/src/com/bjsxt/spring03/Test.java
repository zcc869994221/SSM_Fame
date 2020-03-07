package com.bjsxt.spring03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Zhang Haoyu
 * @create 2020-03-07 18:22
 */
public class Test {
    public static void main(String[] args) {
        //使用静态方法调用实现工厂
        People tea = Factory.getInstance2("tea");
        System.out.println("tea = " + tea);
        //使用IOC DI注入实现
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        People be = app.getBean("be", People.class);
        be.eat();
        //实现静态的工厂
        People be2 = app.getBean("be2", People.class);
        be2.run();

    }
    
}
