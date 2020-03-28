package com.bjsxt.controller;

import com.bjsxt.pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * @author ZhangHaoyu
 * @description
 * @date 2020/3/22 15:44
 */
@Controller
public class MyControl2 {

    @RequestMapping("/demo1")
    public String demo1(HttpServletRequest req) {
        //接受页面数据
        String uname = req.getParameter("uname");
        String pwd = req.getParameter("pwd");

        //数据处理
        System.out.println(uname + "----" + pwd);
        //做出相应
        return "success.jsp";
    }

    @RequestMapping("/demo2")
    public String demo2(String uname, String pwd, int age) {
        //接受页面数据


        //数据处理
        System.out.println(uname + "----" + pwd + "----" + age);
        //做出相应
        return "success.jsp";
    }

    @RequestMapping("/demo3")
    public String demo3(User user) {
        //接受页面数据


        //数据处理
        System.out.println(user);
        //做出相应
        return "success.jsp";
    }

    /*
        Sql中date  只是含有年月日
        util中date  含有年月日时分秒

        @DateTimeFormat(pattern = "指定日期格式")
     */
    @RequestMapping("/demo4")
    public String demo4(String[] hobby, @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date birth, User user) {
        //接受页面数据


        //数据处理
        System.out.println(hobby[0] + "..." + birth + user);
        //做出相应
        return "success.jsp";
    }

    /**
     * 数据传输风格
     * <p>
     * demo5/sxt/123/uuu
     *
     * @RequestMapping("/demo5/{name}/{pwd}/{age}")
     */
    @RequestMapping("demo5/{username}/{pwd}")
    public String demo5(@PathVariable("username") String username, @PathVariable("pwd") String pwd, HttpServletRequest req) {
        //接受页面数据


        //数据处理
        System.out.println(username + ".." + pwd);
        System.out.println(req.getContextPath());
        //做出相应
        return "success.jsp";
    }
}
