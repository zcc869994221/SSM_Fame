package com.bjsxt.proxy03;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author Zhang Haoyu
 * @create 2020-03-09 21:18
 */
public class MyInvocation implements MethodInterceptor {
    /**
     * 获得代理对象
     * @return
     */
    public Object getProxy(){
        Enhancer en = new Enhancer();
        en.setSuperclass(FD.class);
        en.setCallback(this);
        return en.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("收取推荐费100￥");
        Object invoke = methodProxy.invokeSuper(o, objects);
        System.out.println("收取管理费500￥");
        return invoke;
    }
}
