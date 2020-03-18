package com.bjsxt.controller;

import com.bjsxt.pojo.Flower;
import com.bjsxt.service.FlowerService;
import com.bjsxt.service.impl.FlowerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: Zhang Haoyu
 * @Date: 2020/3/18 09:54
 * @Description:
 */
@WebServlet("/InsFlower")
public class InsFlower extends HttpServlet{
    FlowerService fs;
    @Override
    public void init() throws ServletException {
//        String path = this.getServletContext().getInitParameter("app");
//        ApplicationContext app = new ClassPathXmlApplicationContext(path);
        ApplicationContext app = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
        fs = app.getBean("flower", FlowerService.class);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置编码格式
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        //获取请求信息
        String name = req.getParameter("name");
        int price = Integer.parseInt(req.getParameter("price"));
        String production = req.getParameter("production");
        //封装对象
        Flower flower = new Flower(name,price,production);
        //调用业务层方法
        int i = fs.insFlower(flower);
        if (i>0){
            resp.sendRedirect("FlowerFindAll");
        }else{
            req.setAttribute("flag","错误");
            req.getRequestDispatcher("save.jsp").forward(req,resp);
        }
        
    }
}
