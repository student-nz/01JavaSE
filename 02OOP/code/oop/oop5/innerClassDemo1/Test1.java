package com.yj.nz.oop.oop5.innerClassDemo1;

public class Test1 {
    public static void main(String[] args) {
        // 获得外部类对象
        OuterClass oc =new OuterClass();
        // 获得内部类对象的语法
        // 外部类类名.内部类类名  对象名 = 外部类对象.new 内部类构造方法
        OuterClass.InnerClass ic =oc.new InnerClass();
    }
}
