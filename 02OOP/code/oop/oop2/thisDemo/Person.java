package com.yj.nz.oop.oop2.thisDemo;

public class Person {
    // 类中的成员变量
    String firstName;
    String lastName;

    public void showName(){
        // 方法中的局部变量
        String firstName="吴";
        String lastName="宽面";
        /*
        当方法中的局部变量和类中的成员变量同名时
        在当前方法中使用同名的变量时优先选择局部变量
        如果需要使用成员变量时,要在前面加上this.以示区分
        当局部变量和成员变量没有命名冲突时 this可以省略不写
         */
        System.out.println("方法中的局部变量"+firstName+lastName);
        System.out.println("类中的成员变量"+this.firstName+this.lastName);
    }
}
