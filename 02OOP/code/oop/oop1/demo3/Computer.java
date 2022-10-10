package com.yj.nz.oop.oop1.demo3;

public class Computer {
    String brand;
    String type;
    String cpu;
    String gpu;
    int ram;
    /*通过构造器赋值
    * 一个类三大成员   成员变量  成员方法   构造器(构造方法)
    * 构造方法 又叫做构造器 帮我们初始化对象的一种手段
    * 方法组成部分  方法头 [访问修饰符 返回值类型 方法名 参数列表 ] 方法体
    * 构造器 有访问修饰符  没有返回值类型也没有void关键字
    * 构造器的标识符(方法名) 必须和类名同名
    * 构造器的作用帮助我们初始化对象后将产生的对象返回给我们
    * 构造器不能以传统调用方法的方式使用  只能通过new关键调用
    * 当我们没有定义构造器是java会默认提供一个参数缺省的构造器
    * 当我们自己定义了构造的器的时候 java提供的构造器就会被覆盖
    * 1为对象分配空间  初始化成员变量
    * 2执行显示的初始化赋值
    * 3执行构造方法中我们定义的代码
    * 4构造方法执行完毕 向我们返回一个对象
    * 构造器是可以重载的
    *
    *
    * */
    public Computer(String b,String t){
        System.out.println("Computer 构造器 执行了");
        brand=b;
        type=t;
    }

    public Computer(String cpu,String gpu,int ram){
        /*
        * 局部变量和成员变量同名了 在方法体中 如果没有特殊声明 默认使用的局部变量
        * 可以使用this关键字区分成员变量和局部变量
        * this.成员变量名
        * */
        // 成员变量=传入的参数
        this.cpu=cpu;
        this.gpu=gpu;
        this.ram =ram;
    }


    public void start(){
        System.out.println("一台CPU为"+cpu+"GPU为"+gpu+"内存为"+ram+"个G"+brand+type+"正在开机");
    }
    public void run(){
        System.out.println("一台CPU为"+cpu+"GPU为"+gpu+"内存为"+ram+"个G"+brand+type+"正在运行吃鸡");
    }
    public void shutDown(){
        System.out.println("一台CPU为"+cpu+"GPU为"+gpu+"内存为"+ram+"个G"+brand+type+"正在关机");
    }


}
