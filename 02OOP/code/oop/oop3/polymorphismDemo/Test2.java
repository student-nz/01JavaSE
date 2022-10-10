package com.yj.nz.oop.oop3.polymorphismDemo;

public class Test2 {
    public static void main(String[] args) {

        /*
        * 父类默认情况下不可以声明成子类的
        * 可以通过强制转换让代码通过编译
        * ClassCastException 类转换异常
        *
        * 花木兰可以替父从军 但是花木兰的父亲不能代替花木兰出嫁
        * 花木兰的父亲可以乔装打扮版扮成女儿 可以完成婚礼 但是入洞房......
        *
        * 为什么父类不能声明成子类对象
        * 父类的功能 子类一定有
        * 子类的功能 父类未必有
        * 子类可以替代父类  但是父类不能替代子类
        *
        * 当一个父类对象原本就是有一个子类对象声明而成的 那么再转换为子类对象OK
        * */
        A a =new B();
       // B b =(B)new A();
        B b=(B)a;


    }
}


class A{
    public void methodA(){

    }
}
class B extends A{
    public void methodB(){

    }
}
