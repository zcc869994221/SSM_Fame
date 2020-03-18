package com.bjsxt.service;

import com.bjsxt.pojo.Flower;

import java.util.List;

public interface FlowerService {
    /**
     * @Author Zhang haoyu
     * @Description //TODO 查找所有花信息
     * @Date 9:49 2020/3/18
     * @Param []
     * @return java.util.List<com.bjsxt.pojo.Flower>
     **/
    List<Flower> selAll();

    /**
     * @Author Zhang haoyu
     * @Description //TODO 插入新的花信息
     * @Date 9:50 2020/3/18
     * @Param [flower]
     * @return int
     **/
    int insFlower(Flower flower);
}
