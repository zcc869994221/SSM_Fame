package com.bjsxt.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ZhangHaoyu
 * @description
 * @date 2020/3/22 15:44
 */
@Controller
public class MyControl {

    @RequestMapping("/abc")
    public String demo1() {
        //接受页面数据

        //数据处理
        System.out.println("进入了demo1控制单元");
        //做出相应
        return "index.jsp";
    }
}
