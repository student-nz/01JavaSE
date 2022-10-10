package com.yj.nz.oop.oop2.encapsulationDemo2.b;

public class Student {
    /*
    * private 仅在当前类中
    * 默认的   同一个包中
    * portected 跨包继承可以访问
    * public   当前项目中任何包
    * 四个权限修饰符可以修饰如下成员
    * 成员变量
    * 成员方法
    * 构造方法
    * 内部类
    *
    *
    * */
    public String name;


    /*
    权限修饰符修饰方法
     */
    private void showName(){
        System.out.println(name);
    }
    public void viewName(){
        showName();
    }


    /*
    * 权限修饰符修饰构造方法
    * */
    public Student(){

    }
}
