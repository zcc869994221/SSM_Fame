package com.bjsxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ZhangHaoyu
 * @description
 * @date 2020/3/24 18:20
 */
@Controller
public class MyControlView {

    // /springmvc01/show

    @RequestMapping("/{path}")
    public String d(@PathVariable String path){
        return path;
    }

//    @RequestMapping("update")
//    public String update(){
//        return "update";
//    }
//
//    @RequestMapping("delete")
//    public String delete(){
//        return "delete";
//    }
}
