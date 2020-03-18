package com.bjsxt.proxy02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Zhang Haoyu
 * @create 2020-03-09 20:50
 */
public class MyInvocationHandler implements InvocationHandler {
    ZF zf;

    public MyInvocationHandler() {
    }

    public MyInvocationHandler(ZF zf) {
        this.zf = zf;
    }

    public Object getProxy(){
        Object obj = Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{ZF.class}, this);
        return obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("收取推荐费100￥");
        Object invoke = method.invoke(zf, args);
        System.out.println("收取管理费500￥");
        return invoke;
    }
}
