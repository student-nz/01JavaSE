package com.yj.nz.oop.oop3.extendsDemo1;

public class Toyota extends Car{
    private int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void gps(){
        System.out.println("一台"+getDoorNum()+"开门的"+getColor()+"颜色的"+getBrand()+"的具有"+year+"年寿命的"+getType()+"开启了导航功能,一路向西驶去");
    }

}
