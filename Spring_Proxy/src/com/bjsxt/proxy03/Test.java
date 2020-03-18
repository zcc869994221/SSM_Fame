package com.bjsxt.proxy03;

/**
 * @author Zhang Haoyu
 * @create 2020-03-09 21:30
 */
public class Test {


    public static void main(String[] args) {
        MyInvocation my = new MyInvocation();
        FD proxy = (FD)my.getProxy();
        proxy.ZF();

    }
}
