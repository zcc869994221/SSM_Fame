package com.bjsxt.spring02;

/**
 * @author Zhang Haoyu
 * @create 2020-03-07 18:06
 */
public class Student {
    private String name;

    private String sex;

    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String a, int b) {
        this.name = a;
        this.age = b;
        System.out.println("name在前，age在后");
    }
    public Student(int b, String a) {
        this.name = a;
        this.age = b;
        System.out.println("age在前，name在后");
    }
    public Student(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Student() {
        System.out.println("spring02无参构造");
    }
}
