package com.yj.nz.oop.oop4.interfaceDemo3;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        // Dog数组
        Dog[] dogs ={
                new Dog(10,"金毛","黄"),
                new Dog(8,"泰迪","棕"),
                new Dog(11,"哈士奇","黑白"),
                new Dog(7,"边牧","黑白"),
                new Dog(9,"黑背","黑棕")
        };
        // Person数组
        Person[] persons ={
                new Person(1,"张三",10),
                new Person(5,"李四",9),
                new Person(3,"王五",8),
                new Person(2,"赵六",11),
        };
        //定一个方法 既可以对Dog数组排序  有可以对 Person数组排序
        System.out.println("排序前");
        for (Dog d:dogs){
            System.out.println(d);
        }
        System.out.println("=====================");
        for (Person p :persons){
            System.out.println(p);
        }
        Arrays.sort(dogs);
        Arrays.sort(persons);
        System.out.println("排序后");
        for (Dog d:dogs){
            System.out.println(d);
        }
        System.out.println("=====================");
        for (Person p :persons){
            System.out.println(p);
        }


        Student[] stus ={
                new Student("namea",10,63),
                new Student("namex",8,69),
                new Student("namef",11,87),
                new Student("namee",9,81),
        };

        Arrays.sort(stus);
        for(Student stu:stus){
            System.out.println(stu);
        }

    }

}
