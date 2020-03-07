package com.bjsxt.service.impl;

import com.bjsxt.mapper.AdminMapper;
import com.bjsxt.pojo.Admin;
import com.bjsxt.service.AdminService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Zhang Haoyu
 * @create 2020-03-07 21:20
 */
public class AdminServiceImpl implements AdminService {
    private AdminMapper adminMapper;

    public void setAdminMapper(AdminMapper adminMapper) {
        this.adminMapper = adminMapper;
    }

    @Override
    public Admin login(String username, String password) {
        Admin admin = adminMapper.selAdmin(username, password);
        System.out.println("admin = " + admin);
        return admin;
    }

    /**
     * 测试
     * @param args
     */
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        String[] beanDefinitionNames = app.getBeanDefinitionNames();
        /*发现里边有Spring自动创建的adminMapper对象*/
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
}
