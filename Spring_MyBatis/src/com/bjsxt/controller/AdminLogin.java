package com.bjsxt.controller;

import com.bjsxt.pojo.Admin;
import com.bjsxt.service.AdminService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Zhang Haoyu
 * @create 2020-03-07 21:33
 */
@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {
    AdminService as;
    @Override
    public void init() throws ServletException {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        as = app.getBean("adminService",AdminService.class);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        //接收前台数据
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        //数据处理
        Admin admin = as.login(username, password);
        if (admin != null) {
            resp.sendRedirect(req.getContextPath()+"/success.jsp");
        }else{
            req.setAttribute("false","错误");
            req.getRequestDispatcher(req.getContextPath()+"/login.jsp").forward(req,resp);
        }
    }
}
