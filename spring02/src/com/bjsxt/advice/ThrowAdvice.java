package com.bjsxt.advice;

import org.springframework.aop.ThrowsAdvice;

/**
 * @author ZhangHaoyu
 * @description
 * @date 2020/3/21 21:19
 */
public class ThrowAdvice implements ThrowsAdvice {

    public void afterThrowing(Exception e){
        System.out.println("ThrowAdvice.afterThrowing");
    }
}
