package com.yj.nz.oop.oop3.extendsDemo1;

public class Test1 {
    public static void main(String[] args) {
        /*实例化两个子类对象 查看是否有父类中的属性和方法*/
        Audi audi =new Audi();
        // 从父类中继承的属性
        audi.setBrand("奥迪");
        audi.setType("TT");
        audi.setDoorNum(2);
        audi.setColor("蓝");
        // 从父类中继承的方法
        audi.start();
        audi.speedUp();
        audi.slowDown();
        // 子类中独有的方法
        audi.lightUp();

        System.out.println("++++++++++++++++++++++++++++++++++++++");

        Toyota toyota =new Toyota();
        // 从父类中继承的属性
        toyota.setBrand("丰田");
        toyota.setType("凯美瑞");
        toyota.setDoorNum(4);
        toyota.setColor("黑");
        // 子类中独有的属性
        toyota.setYear(20);
        // 从父类中继承的方法
        toyota.start();
        toyota.speedUp();
        toyota.slowDown();
        // 子类中独有的方法
        toyota.gps();



    }
}
