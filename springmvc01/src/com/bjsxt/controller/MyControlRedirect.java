package com.bjsxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.RedirectView;

/**
 * @author ZhangHaoyu
 * @description 学习转发和重定向
 * @date 2020/3/24 17:02
 */
@Controller
@RequestMapping("/MyControlRedirect")
public class MyControlRedirect {


    /**
     * springmvc底层实现请求转发和重定向
     * return URL --> View  -->ModelAndView
     * @return
     */
    @RequestMapping(value = "demo4")
    public ModelAndView demo4(){

        ModelAndView modelAndView = new ModelAndView();
        // 转发1
        modelAndView.setViewName("forward:/index.jsp");
        // 重定向1
        modelAndView.setViewName("redirect:/index.jsp");
        //转发2
        modelAndView.setView(new InternalResourceView("/index.jsp"));
        // 重定向2
        modelAndView.setView(new InternalResourceView("/springmvc01/index.jsp"));
        return modelAndView;
    }

    /**
     * springmvc底层实现请求转发和重定向
     * return URL --> View  -->ModelAndView
     * @return
     */
    @RequestMapping(value = "demo3")
    public View demo3(){
       // View view = new InternalResourceView("/index.jsp");

        View view = new RedirectView("/springmvc01/index.jsp");
        return view;
    }


    /**
     * 转发
     *     return "index.jsp" 默认是转发
     *     return "forward:/index.jsp";全称
     *     路径支持：
     *          相对路径    ../
     *          根路径：    / 表示当前项目，推荐使用
     *          绝对路径：不支持，最大范围是当前路径
     * @return
     */
    @RequestMapping(value = "demo1")
    public String demo1(){

        return "forward:/index.jsp";
    }

    /**
     * 重定向学习：
     *     return "redirect:index.jsp";
     *     相对路径：相对于当前浏览器地址
     *     根路径：/表示当前项目
     *     绝对路径：
     * @return
     */
    @RequestMapping(value = "demo2")
    public String demo2(){

        System.out.println("重定向跳转");
        return "redirect:/index.jsp";
    }
}
