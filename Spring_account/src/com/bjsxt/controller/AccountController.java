package com.bjsxt.controller;

import com.bjsxt.pojo.Account;
import com.bjsxt.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author ZhangHaoyu
 * @description
 * @date 2020/3/20 14:07
 */
@WebServlet("/AccountController")
public class AccountController extends HttpServlet {
    AccountService accs;
    @Override
    public void init() throws ServletException {
        //获得ApplicationContext对象
        ApplicationContext  app= WebApplicationContextUtils.getWebApplicationContext(getServletContext());
        //ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        accs = app.getBean("asi", AccountService.class);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置编码格式
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        //根据数据判断执行的操作
        String method = req.getParameter("method");
        if (method.equals("checkUser")){
            checkUser(req,resp);
        }else if (method.equals("inOutMoney")){
            inOutMoney(req,resp);
        }
    }

    /**
     * 汇款操作
     * @param req
     * @param resp
     */
    private void inOutMoney(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //获取转出卡号
        String outCno = req.getParameter("outCno");
        //获取转入卡号
        String inCno = req.getParameter("inCno");
        //获取金额
        String money = req.getParameter("money");

        //数据处理
        int i = accs.inOutMoney(outCno, inCno, money);

        //响应
        if (i>0){
            //用户满足条件
            resp.sendRedirect("success.jsp");
        }else{
            resp.sendRedirect("account.jsp");
        }
    }

    /**
     * 检查用户
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void checkUser(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //接收页面数据
        String cno = req.getParameter("cno");
        String pwd = req.getParameter("pwd");
        String money = req.getParameter("money");
        //处理数据
        Account ac = accs.findOne(cno, pwd, money);
        System.out.println(ac);
        //响应
        if (ac!=null){
            //用户满足条件
            resp.getWriter().write("true");
        }else{
            resp.getWriter().write("false");
        }
    }
}
