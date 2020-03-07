package com.bjsxt.Spring04;

/**
 * @author Zhang Haoyu
 * @create 2020-03-07 18:33
 */
public class Clazz {

    private int clazzno;
    private String cname;

    public int getClazzno() {
        return clazzno;
    }

    public void setClazzno(int clazzno) {
        this.clazzno = clazzno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Clazz() {
    }

    public Clazz(int clazzno, String cname) {
        this.clazzno = clazzno;
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "clazzno=" + clazzno +
                ", cname='" + cname + '\'' +
                '}';
    }

}
