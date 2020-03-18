package com.bjsxt.controller;

import com.bjsxt.pojo.Flower;
import com.bjsxt.service.FlowerService;
import com.bjsxt.service.impl.FlowerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/FlowerFindAll")
public class FindAll extends HttpServlet {
    private FlowerService fs;

    @Override
    public void init() throws ServletException {
        //读取全局参数的路径
        //String path = this.getServletContext().getInitParameter("app");
        //解析路径
       // ApplicationContext app = new ClassPathXmlApplicationContext(path);
        //
        ApplicationContext app = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
        //获取FlowerService对象,用IOC DI实现
        fs = app.getBean("flower", FlowerService.class);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");


        List<Flower> list = fs.selAll();

        //重定向
        req.setAttribute("list",list);
        req.getRequestDispatcher("findAll.jsp").forward(req,resp);
    }
}
