package com.yj.nz.projectb.secondshop;

public class User {
    private int id;
    private String uname;
    private String pwd;
    private double money;

    public User() {
    }

    public User(int id, String uname, String pwd, double money) {
        this.id = id;
        this.uname = uname;
        this.pwd = pwd;
        this.money = money;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
