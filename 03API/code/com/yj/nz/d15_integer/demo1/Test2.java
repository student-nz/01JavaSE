package com.yj.nz.d15_integer.demo1;

public class Test2 {
    public static void main(String[] args) {
        /*Integer a =new Integer(10);
        Character c=new Character('x');
        Double d =new Double(3.14);
        Boolean b=new Boolean(true);*/


        // 包装类内部存储的对应基本数据类型的值是不可以修改的
        // 包装类对象名存储的引用地址是可以更换的
        Integer a =new Integer(10);
        System.out.println(a);
        a=new Integer(20);
        System.out.println(a);
    }
}
