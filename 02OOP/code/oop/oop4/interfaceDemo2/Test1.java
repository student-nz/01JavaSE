package com.yj.nz.oop.oop4.interfaceDemo2;

public class Test1 {
    public static void main(String[] args) {

    }
}

interface  MyInterA{
    void methodA();
}
interface  MyInterB{
    void methodB();
}
/*
* 普通java类只能实现接口 不能继承接口
* 只有接口能够继承接口 一个接口可以同时继承多个不同的接口
* 实现类要实现其直接父接口和所有间接父接口中的所有抽象方法
* */
interface MyInterX extends MyInterA,MyInterB{
    void methodX();
    public default void methodD(){

    }
}
class MyImpl implements MyInterX{
    @Override
    public void methodA() {

    }
    @Override
    public void methodB() {

    }
    @Override
    public void methodX() {

    }

    @Override
    public void methodD() {

    }
}


