package com.bjsxt.pojo;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author ZhangHaoyu
 * @description
 * @date 2020/3/24 16:35
 */
@Component
public class Student implements Serializable {
    private int age;
    private String name;
    private String sex;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Student() {
    }

    public Student(int age, String name, String sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }
}
