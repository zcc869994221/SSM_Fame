package com.bjsxt.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author Zhang Haoyu
 * @description
 * @create 2020/3/20
 */
@Component("stu")
public class Student {
    @Value("${a}")
    private int age;
    @Resource
    private String name;
    @Autowired
    private String sex;//默认byType

    public Student(int age, String name, String sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }



    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public Student() {
        System.out.println("Student.Student无参构造");
    }
}
