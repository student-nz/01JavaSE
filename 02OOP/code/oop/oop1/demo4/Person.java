package com.yj.nz.oop.oop1.demo4;

public class Person {
    /**
     * 姓氏
     */
    String firstName;
    /**
     * 名字
     * */
    String lastName;
    /**
     * 向控制台输出姓名的方法
     */
    public void showName(){
        System.out.println("我叫:"+firstName+lastName);
    }
    /**
     * 参数缺省的构造方法
     */
    public Person(){
    }
    /**
     * 包含全部属性的构造方法
     * @param firstName 姓氏
     * @param lastName 名字
     */
    public Person(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
}
