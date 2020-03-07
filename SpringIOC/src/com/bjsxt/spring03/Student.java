package com.bjsxt.spring03;

/**
 * @author Zhang Haoyu
 * @create 2020-03-07 18:26
 */
public class Student implements People {
    public Student() {
        System.out.println("Student.Student");
    }

    @Override
    public String toString() {
        return "Student{}";
    }

    @Override
    public void eat() {
        System.out.println("Student.eat");
    }

    @Override
    public void run() {
        System.out.println("Student.run");
    }
}
