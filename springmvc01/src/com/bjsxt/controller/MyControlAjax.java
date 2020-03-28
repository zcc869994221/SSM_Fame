package com.bjsxt.controller;

import com.bjsxt.pojo.Student;
import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author ZhangHaoyu
 * @description spingmvc中做ajax请求
 * @date 2020/3/24 16:33
 */
@Controller
public class MyControlAjax {
    /**
     * 使用传统的方式来做ajax请求
     * @param name
     * @param resp
     * @throws IOException
     */
    @RequestMapping("ajax1")
    public void ajax1(String name, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html;charset=utf-8");
        // 接收数据
        // 数据处理
        Student student = new Student(18,"张三","男");
        String json = new Gson().toJson(student);
        // 做出响应
        resp.getWriter().println(json);
    }

    /**
     * Springmvc 结合ajax使用
     *
     * 注意：
     *  A、方法的返回值可以直接是对象，或者集合，但需要添加@ResponseBody标签
     *  B、响应给前台的数据直接是一个json对象
     */
    @RequestMapping(value = "ajax2",produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Student ajax2(){
        // 接收数据
        // 数据处理
        Student student = new Student(18,"张三","男");
        // 做出响应
        return student;
    }
}
