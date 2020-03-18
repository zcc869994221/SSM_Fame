package com.bjsxt.proxy02;

/**
 * @author Zhang Haoyu
 * @create 2020-03-09 21:01
 */
public class Test {
    public static void main(String[] args) {
        MyInvocationHandler my = new MyInvocationHandler();
        my.zf=new FD();
        ZF proxy = (ZF)my.getProxy();
        proxy.ZF();
    }
}
