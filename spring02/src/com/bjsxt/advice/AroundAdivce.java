package com.bjsxt.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author ZhangHaoyu
 * @description
 * @date 2020/3/21 21:17
 */
public class AroundAdivce implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("AroundAdivce.invoke前");
        Object o = methodInvocation.proceed();
        System.out.println("AroundAdivce.invoke后");
        return o;
    }
}
