package com.yj.nz.oop.oop1.demo4;

public class Test1 {
    public static void main(String[] args) {
        /*
        * 数组  一组性质相同或者相近的数据的集合
        * 数组中的数据只能是基本数据类型和String吗?
        * 数组的元素可以java中的任何一种数据类型
        * 基本数据类型 8个
        * 引用类型  数组 类 抽象类 接口  枚举 注解  ...
        * */
        // 在程序中声明一个数组 可以装多个 Person对象
        Person p1=new Person("日向","广坤");
        Person p2=new Person("千手","老七");
        Person p3=new Person("日向","永强");
        Person p4=new Person("千手","小蒙");
        //静态创建
        Person[] persons={p1,p2,p3,p4};
        //动态创建
        Person[] persons2 =new Person[4];
        persons2[0]=p1;
        persons2[1]=p2;
        persons2[2]=p3;
        persons2[3]=p4;
        // 遍历数组
        for (int i = 0; i < persons.length; i++) {
            persons[i].showName();
        }
        for (Person i:persons2) {
            i.showName();
        }
        showPersons(persons);
    }
    /*定义一个方法 向控制输出多个Person对象的名字
    * 对象数组作为方法参数可以传递的数据量更大了
    * */
    public static void showPersons(Person[] persons){
        System.out.println("showPersons方法执行了");
        for (Person i:persons) {
            i.showName();
        }
    }
}
