package com.bjsxt.pojo;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author ZhangHaoyu
 * @description
 * @date 2020/3/27 14:13
 */
@Component
public class User implements Serializable {

    private  int uid;
    private  String uname;
    private  String pwd;

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public User() {
    }

    public User(int uid, String uname, String pwd) {
        this.uid = uid;
        this.uname = uname;
        this.pwd = pwd;
    }
}
