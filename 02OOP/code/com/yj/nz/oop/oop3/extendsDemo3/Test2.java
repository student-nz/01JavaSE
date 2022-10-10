package com.yj.nz.oop.oop3.extendsDemo3;

public class Test2 {
    public static void main(String[] args) {
        // 实例化子类对象是时 一定会调用父类的构造方法
        // 父类的构造方法被调用 在内存上就一定会产生一个父类对象
        // 实例化子类对象时 内存你上一定会产生一个父类对象
        B b =new B();
    }
}
class A {
    String name="父类name属性";
    public void showName() {
        System.out.println("父类中的方法:"+name);
    }
    public A(){
    }
}
class B extends A{
    String name="子类name属性";
    public void showName() {
        System.out.println("子类中的方法:"+name);
        System.out.println(super.name);
        super.showName();
    }
    public B(){
        super();
    }
}
