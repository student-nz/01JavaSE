package com.yj.nz.d15_integer.demo3;

public class Test3 {
    public static void main(String[] args) {
        Integer i =10;
        change(i);
        System.out.println(i);
        Integer.valueOf(10);
        Double.valueOf(3.14);
        Character.valueOf('a');
        Boolean.valueOf(true);
    }
    public static void change(Integer i){
        i=100;
    }
}
