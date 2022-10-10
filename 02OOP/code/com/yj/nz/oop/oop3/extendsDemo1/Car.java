package com.yj.nz.oop.oop3.extendsDemo1;

public class Car {
    private String color;
    private String brand;
    private String type;
    private int doorNum;
    // alt + insert
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDoorNum() {
        return doorNum;
    }

    public void setDoorNum(int doorNum) {
        this.doorNum = doorNum;
    }

    public void start(){
        System.out.println("一台"+doorNum+"开门的"+color+"颜色的"+brand+"的"+type+"正在启动...");
    }
    public void speedUp(){
        System.out.println("一台"+doorNum+"开门的"+color+"颜色的"+brand+"的"+type+"正在加速...");
    }
    public void slowDown(){
        System.out.println("一台"+doorNum+"开门的"+color+"颜色的"+brand+"的"+type+"正在减速...");
    }
}
