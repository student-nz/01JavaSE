package com.yj.nz.oop.oop2.encapsulationDemo1;

public class Test1 {
    public static void main(String[] args) {
        Student stu=new Student();
        stu.setName("小明");
        stu.setGender("男");
        stu.setScore(96.3);
        stu.introduce();

        System.out.println("一年之后");
        stu.setName("小黑");
        stu.setGender("女");
        stu.setScore(-10);
        stu.introduce();

        double score =stu.getScore();
        System.out.println(score);
        String gender = stu.getGender();
        System.out.println(gender);
        String name = stu.getName();
        System.out.println(name);
    }
}
