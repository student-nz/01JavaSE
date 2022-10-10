package com.yj.nz.oop.oop5.innerClassDemo5;

import java.util.Arrays;
import java.util.Comparator;

public class TestSort {
    public static void main(String[] args) {
        // 准备对象数组
        Student[] stus =new Student[5];
        stus[0]=new Student("小明",10,95);
        stus[1]=new Student("小红",8,93);
        stus[2]=new Student("小花",6,100);
        stus[3]=new Student("小东",9,92);
        stus[4]=new Student("小军",11,96);
        System.out.println("排序之前");
        for(Student stu:stus){
            System.out.println(stu);
        }
        // 排序对象数组
        /*方案1 让类实现Comparable接口
        * 代表当前类是可以排序的
        * Arrays.sort 方法在执行时 会调用对象的compareTo方法去对比数组中的两个元素
        * 缺点:在同一时间内 排序的规则只有一种
        * */
        //Arrays.sort(stus);

        /*方案2
        * 通过定义外部比较器
        * 自己定义一个类作为比较器来使用
        * 如果一个类是比较器类 那么该类必须实现Comparator接口
        *
        * */
        // 先获得一个比较器对象

        /*Comparator<Student> studentComparator1=new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();
            }
        };*/
       /* Comparator<Student> studentComparator2=new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getAge()-o1.getAge();
            }
        };
        Comparator<Student> studentComparator3=new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getScore()-o2.getScore();
            }
        };
        Comparator<Student> studentComparator4=new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //分数降序
                return o2.getScore()-o1.getScore();
            }
        };*/


        // 在排序的时候传入比较器对象作为参数
        Arrays.sort(stus,new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        System.out.println("排序之后");
        for(Student stu:stus){
            System.out.println(stu);
        }
    }
}

