package com.bjsxt.pojo;

import org.springframework.stereotype.Component;

@Component("user")
public class User {

    public void a(String str){
       // int i = 5/0;  //测试异常通知
        System.out.println("User.a");
    }
    public void b(String str){

        System.out.println("User.b");
    }
    public void c(String s){
        System.out.println("User.c");
    }
}
