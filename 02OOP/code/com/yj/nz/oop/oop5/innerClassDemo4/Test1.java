package com.yj.nz.oop.oop5.innerClassDemo4;

public class Test1 {
    public static void main(String[] args) {
        /*
        * 当一个抽象类仅仅需要其子类对象使用一次  需要实现的抽象方法还比较少时
        * 完全没有必要单独声明一个类去继承/实现接口
        * 可以使用匿名内部类 快速的产生一个抽象类的子类对象  / 接口的一个实现类对象
        * */


        A a =new A(){
            @Override
            public void methodA() {
                System.out.println("类重写methodA方法");
            }
        };
        a.methodA();


        Inter inter =new Inter(){
            // 成员变量
            // 匿名内部类中没有静态成员变量
            String name;
            public void setName(String name){
                this.name =name;
            }
            public String getName(){
                return name;
            }
            // 成员方法
            public void showName(){

            }
            // 匿名内部类没有构造方法
            // 只能通过代码块初始化成员变量
            // 匿名内部类没有静态代码块
            {
                name="张三";
            }

            public void methodInter(){
                System.out.println("实现类methodInter方法");
            }
        };
        inter.methodInter();


    }
}

abstract class A{
    public abstract void methodA();
}

interface Inter{
    void methodInter();
}



