package com.bjsxt.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author ZhangHaoyu
 * @description
 * @date 2020/3/21 21:22
 */
@Component("aspectJAdvice")
@Aspect
public class AspectJAdvice{

    @Before("execution(* com.bjsxt.pojo.User.c(..))")
    public void beforeAd(){
        System.out.println("前置通知");
    }
    public void beforeAd2(){
        System.out.println("前置通知2");
    }
    //后置通知
    public void afterAd(){
        System.out.println("后置通知");
    }
    //环绕通知
    public Object aroundAd(ProceedingJoinPoint point) throws Throwable {
        System.out.println("环绕前");
        Object o = point.proceed();
        System.out.println("环绕后");
        return o;
    }
    //异常通知
    @AfterThrowing("execution(* com.bjsxt.pojo.User.c())")
    public void throwsAd(){
        System.out.println("后置通知");
    }
}
