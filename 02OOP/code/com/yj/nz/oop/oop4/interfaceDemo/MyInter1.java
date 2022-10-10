package com.yj.nz.oop.oop4.interfaceDemo;
/*
* 接口是一种抽象的数据类型
* 比抽象类还抽象的一种数据类型 不能被实例化
* */
public interface MyInter1 {
    //接口中的成员变量都是共有的静态常量
    /*public final static*/ int A=10;
    /*
    接口中的方法都是共有的抽象方法
    在JDK1.8中 允许default修饰的方法和static修饰的方法允许有方法体
    default 修饰的方法能被实现类重写
    static  静态方法不允许被重写
     */
    /*public abstract*/ void testMethod();
    default void methodA(){

    }
    static void methodB(){

    }
    //接口没有构造方法 接口中没有代码块
}
