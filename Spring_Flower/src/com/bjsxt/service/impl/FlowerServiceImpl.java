package com.bjsxt.service.impl;

import com.bjsxt.mapper.FlowerMapper;
import com.bjsxt.pojo.Flower;
import com.bjsxt.service.FlowerService;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class FlowerServiceImpl implements FlowerService{
    private FlowerMapper mapper;
    public void setMapper(FlowerMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public List<Flower> selAll() {

        return mapper.selAll();
    }

    @Override
    public int insFlower(Flower flower) {

        return mapper.save(flower);
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
