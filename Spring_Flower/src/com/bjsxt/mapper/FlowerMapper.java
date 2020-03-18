package com.bjsxt.mapper;

import com.bjsxt.pojo.Flower;

import java.util.List;


public interface FlowerMapper {
    /**
     * @Author Zhang haoyu
     * @Description //TODO  查找所有花的信息
     * @Date 9:45 2020/3/18
     * @Param []
     * @return java.util.List<com.bjsxt.pojo.Flower>
     **/
    List<Flower> selAll();

    /**
     * @Author Zhang haoyu
     * @Description //TODO 保存花信息
     * @Date 9:46 2020/3/18
     * @Param [flower]
     * @return int
     **/
    int save(Flower flower);
}
