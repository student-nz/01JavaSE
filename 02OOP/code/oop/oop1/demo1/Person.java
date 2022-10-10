package com.yj.nz.oop.oop1.demo1;
public class Person {
    /*
    *世间万物 都有特点 功能
    * 特征   >>>>  属性  姓名 性别 年龄 身高 体重(根据需要) >>>  成员变量
    * 行为   >>>>  方法  吃饭 休息 工作 说话 思考(根据需要) >>>  成员方法
    * */
    //姓名、年龄、性别、住址
    // 成员变量用于模拟人类的特征  >>> 属性
    String name;
    int age;
    String gender;
    String address;

    /*成员方法用于模拟人类的功行为 >>> 功能*/
    // 吃饭的功能
    public void eat(String food){
        System.out.println("一个家住"+address+age+" 岁"+gender+"孩儿名字叫"+name+"正在吃"+food);
    }
    // 休息的功能
    public void sleep(String place){
        System.out.println("一个家住"+address+age+" 岁"+gender+"孩儿名字叫"+name+"正在"+place+"休息");
    }
    // 工作的功能
    public void work(){
        System.out.println("一个家住"+address+age+" 岁"+gender+"孩儿名字叫"+name+"正在努力工作");
    }
}
