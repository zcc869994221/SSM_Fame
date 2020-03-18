package com.bjsxt.pojo;

import java.io.Serializable;

/**
 * @author Zhang Haoyu
 * @date 2020-03-06
 */

public class Flower implements Serializable {


    private Integer id;

    private   String  name;

    private   int   price;

    private   String  production;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public Flower(Integer id, String name, int price, String production) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.production = production;
    }
    public Flower(String name, int price, String production) {
        this.name = name;
        this.price = price;
        this.production = production;
    }
    public Flower(){}

    @Override
    public String toString() {
        return "Flower{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", production='" + production + '\'' +
                '}';
    }

}
