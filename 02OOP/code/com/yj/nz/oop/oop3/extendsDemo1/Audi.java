package com.yj.nz.oop.oop3.extendsDemo1;

public class Audi extends Car  {
    public void lightUp(){
        System.out.println("一台"+getDoorNum()+"开门的"+getColor()+"颜色的"+getBrand()+"的"+getType()+"开启了耀眼的远光灯");
    }
}
