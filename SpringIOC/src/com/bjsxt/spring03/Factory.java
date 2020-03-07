package com.bjsxt.spring03;

/**
 * 静态工厂
 * @author Zhang Haoyu
 * @create 2020-03-07 18:25
 */
public class Factory {
    public People getInstance(String param) {
        if ("stu".equals(param)) {
            return new Student();
        } else if ("tea".equals(param)) {
            return new Teacher();
        }

        return null;
    }

    public static People getInstance2(String param) {
        if ("stu".equals(param)) {
            return new Student();
        } else if ("tea".equals(param)) {
            return new Teacher();
        }

        return null;
    }
}
