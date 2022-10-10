package com.yj.nz.oop.oop3.extendsDemo4;

public class Test1 {
    public static void main(String[] args) {
        Person p1 =new Person("张三","男");
        p1.showInfo();
        Person p2 =new Person("张三","男");
        p2.showInfo();

        /*
        * ==
        * 当两端是基本数据类型时 判断的是两个变量的值是否相同
        * 当两端是引用数据类型时 判断的两个对象存储的对于堆内存的引用地址是否相同
        * */
        //如果两个对象的属性值相同 那么就认为是相同对象
        //判断两个对象是否相同
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

        String s =new String("asdf");
        String s2 =new String("asdf");
        System.out.println(s==s2);
        System.out.println(s.equals(s2));


    }
}

