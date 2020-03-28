package com.bjsxt.controller;

import com.bjsxt.pojo.Email;
import com.bjsxt.pojo.User;
import com.bjsxt.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * @author ZhangHaoyu
 * @description
 * @date 2020/3/28 13:53
 */
@Controller
@RequestMapping("/email")
public class EmailController {

    @Autowired
    EmailService emailService;

    @RequestMapping("selectMore")
    public String selectMore(HttpSession session, HttpServletRequest request) throws IOException {
        User user = (User) session.getAttribute("user");

        List<Email> list = emailService.findMore(user.getUid());

        request.setAttribute("list",list);
        return "forward:/main.jsp";

    }

    @RequestMapping("sendEmail")
    public String sendEmail(Email email, MultipartFile fi, HttpSession session){
        User user = (User) session.getAttribute("user");

        email.setEdate(new java.sql.Date(new java.util.Date().getTime()));

        email.setFilename(fi.getOriginalFilename());

        email.setSendid(user.getUid());

        int i = emailService.sendEmail(email);
        if(i>0){

            return "redirect:/success.jsp";
        }else{
            return "forward:/emailSend.jsp";
        }

    }

}
