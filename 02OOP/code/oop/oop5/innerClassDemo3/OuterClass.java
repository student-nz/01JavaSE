package com.yj.nz.oop.oop5.innerClassDemo3;

public class OuterClass {
    int a=10;
    public  void methodO() {
        /*
        * 局部内部类 声明在方法之中的内部类
        * 仅仅为当前方法服务
        * 不可以使用访问修饰符修饰
        * 在JDK1.7 局部内部类只能使用final修饰的局部常量
        * 在JDK1.8 局部内部类可以使用final修饰的局部常量 也可以使用局部变量
        * 局部内部类在使用外部类的成员变量时 成员变量可以不是final修饰
        * */
        final int a=20;
        class A{
           //int a=30;
            public void methodA(){
                System.out.println(a);
                System.out.println(OuterClass.this.a);
            }
            public A(){
            }
        }
    }
}
