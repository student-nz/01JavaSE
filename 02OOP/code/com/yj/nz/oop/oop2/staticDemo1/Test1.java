package com.yj.nz.oop.oop2.staticDemo1;

public class Test1 {
    public static void main(String[] args) {
        Person.firstName="张";

        Person p1 =new Person();
        p1.lastName="三";
        p1.showName();

        Person p2 =new Person();
        p2.lastName="四";
        p2.showName();

        Person p3 =new Person();
        p3.lastName="老七";
        p3.showName();

    }
}

class Person{
    /*
    * static 修饰的成员变量叫做静态成员变量/类变量
    *        static修饰的成员变量存储于方法区中 并被当前类的所有的对象所共享
    *        静态成员变量可以用 对象.变量名的方式访问  不推荐
    *        静态成员变量还可以用  类名.变量名的方式访问  推荐
    *        静态成员变量 常驻内存  一般在程序运行的整个过程中一直存在
    * 没有static修饰的成员变量叫做实例变量
    *        实例变量存储于堆内存中 当前类的每个对象都有自己独立的实例变量
    *        实例成员变量只能用对象名.变量名方式访问
    *        实例成员变量随着当前对象的回收而同时被回收
    * */
    static String firstName;
    String lastName;
    public void showName(){
        System.out.println(firstName+lastName);
    }
}




