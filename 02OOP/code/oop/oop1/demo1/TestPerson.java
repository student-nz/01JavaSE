package com.yj.nz.oop.oop1.demo1;

public class TestPerson {
    public static void main(String[] args) {
        // 对象的创建
        // 使用类做为模板 获得一个对象
        // 对象的声明  要创建实例化一个Person类对象 对象标识符是p 在内存上没有任何动作
        //Person p;
        // 对象的创建  给p赋值  实例化一个对象并赋值给p  在堆内存上产生一个对象
        //p=new Person();
        // 声明并创建对象
        Person p =new Person();
        // 对象属性的赋值 通过对象名.属性名的语法访问对象属性
        p.name="宇智波赵四儿";
        p.age=8;
        p.gender="男";
        p.address="火之国象牙山村";
        // 调用对象方法  通过对象名.方法名(参数)的语法调用方法
        p.eat("炸鸡");
        p.sleep("按摩店");
        p.work();
        // 对象属性可以输出 也可以修改
        System.out.println(p.name);
        p.age++;
        // 对象的方法也可以反复调用
        p.sleep("浴场");

        // 一个类可以产生多个对象
        Person p2=new Person();
        p2.name="旋涡刘能";
        p2.age=10;
        p2.gender="男";
        p2.address="土之国铁岭";
        p2.eat("烤土豆");
        p2.sleep("洗头房");
        p2.work();


    }
}
