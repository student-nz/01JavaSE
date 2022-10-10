package com.yj.nz.oop.oop1.demo1;

public class Dog {
   /* 在程序中创建一个Dog
    属性   品种  颜色  月龄  重量
    行为   叫  玩  吃
    创建两个Dog 类对象
    分别给对象属性赋值  调用对象方法*/
   String type;
   String color;
   int month;
   double weight;
   public void bark(){
       System.out.println("一只"+color+"颜色的"+month+"个月大"+weight+"斤重的"+type+"叫了一声 汪");
   }

    public void play(){
        System.out.println("一只"+color+"颜色的"+month+"个月大"+weight+"斤重的"+type+"叼住了一只盘子");
    }

    public void eat(String food){
        System.out.println("一只"+color+"颜色的"+month+"个月大"+weight+"斤重的"+type+"吃了一斤"+food);
    }
}
