package com.yj.nz.d7_operator;

public class OperatorDemo1 {
    public static void main(String[] args) {
        // 基本的算术算术运算符的使用：+ - * / %
        int a = 10;
        int b = 3;
        System.out.println(a + b);// 13
        System.out.println(a - b);// 7
        System.out.println(a * b);// 30
        System.out.println(a / b); // 3.3333  ==>  3
        System.out.println(a * 1.0 / b); // 3.3333
        System.out.println(3 / 2);// 1
        System.out.println(3 * 1.0 / 2); // 1.5
        System.out.println(3  / 2 * 1.0); // 1.0
        System.out.println(a % b); // 1
    }
}
