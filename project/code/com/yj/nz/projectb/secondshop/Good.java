package com.yj.nz.projectb.secondshop;

public class Good {
    private int id;
    private String name;
    private Double price;
    private int num;
    private int uid;

    public Good() {
    }

    public Good(int id, String name, Double price, int num, int uid) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.num = num;
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "Good{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", num=" + num +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }
}
