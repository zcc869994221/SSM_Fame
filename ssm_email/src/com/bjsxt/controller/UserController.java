package com.bjsxt.controller;

import com.bjsxt.pojo.User;
import com.bjsxt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author ZhangHaoyu
 * @description
 * @date 2020/3/28 11:35
 */
@RequestMapping("/user")
@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "login")
    public String login(String uname, String pwd, HttpServletRequest request, HttpSession session){
        // 执行业务层代码
        User user = userService.login(uname, pwd);
        if(user!=null){
            // return "redirect:/email/findMore";
            session.setAttribute("user",user);
            return "redirect:/email/selectMore";
        }else {
            request.setAttribute("msg","账号密码错误");
            return "forward:/login.jsp";
        }
    }
}
