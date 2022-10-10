package com.yj.nz.oop.oop2.staticDemo3;

public class Test1 {
    public static void main(String[] args) {
        Person p1=new Person();
        Person p2=new Person();
        p1.showName();
        p2.showName();
    }


}

class Person{
    /*代码块
    * {}
    * 局部代码块 方法体中的代码  然并卵
    * 成员代码块 直接声明在类中  偶尔见到
    *     普通代码
    *     静态代码块
    *
    *
    * 普通代码块
    *       先于构造方法执行
    *       每次实例化对象都会执行一次
    *       一般可以用于初始化一些实例成员变量
    *       可以直接使用静态和非静态成员变量
    *       可以直接调用当前类中的其他静态和非静态方法
    * 静态代码
    *       先于普通代码块执行
    *       仅仅在类加载的时候执行一次
    *       一般可以用于初始化一些静态成员变量
    *       仅可以直接使用静态的成员变量
    *       只能直接调用当前类中的其他静态方法
    * */


    {
        System.out.println("block A invoked");
        firstName="李";
        lastName="洛克"+(int)(Math.random()*10);
       /*showName();
       viewName();*/
    }
    {
        System.out.println("block B invoked");
    }
    {
        System.out.println("block C invoked");
    }
    static{
        System.out.println("static block A invoked");
        firstName="张";
        /*lastName="洛克";*/
       /* showName();
        viewName();*/
    }
    static{
        System.out.println("static block B invoked");
    }

    public Person(){
        System.out.println("constructor invoked");
    }

    static String firstName;
    String lastName;

    public void showName(){
        System.out.println(firstName+lastName);
    }

    public static void viewName(){
        System.out.println(firstName);
    }
}




