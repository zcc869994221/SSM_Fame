package com.bjsxt.spring03;

/**
 * @author Zhang Haoyu
 * @create 2020-03-07 18:26
 */
public class Teacher implements People {
    public Teacher() {
        System.out.println("Teacher.Teacher");
    }

    @Override
    public void eat() {
        System.out.println("Teacher.eat");
    }

    @Override
    public void run() {
        System.out.println("Teacher.run");
    }

    @Override
    public String toString() {
        return "Teacher{}";
    }
}
