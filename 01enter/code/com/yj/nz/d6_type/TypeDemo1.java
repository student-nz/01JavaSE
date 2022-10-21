package com.yj.nz.d6_type;

public class TypeDemo1 {
    public static void main(String[] args) {
        byte a = 20;
        int b = a; // 发生了自动类型转换
        System.out.println(a); // 20
        System.out.println(b); // 20

        int age = 23;
        double db = age; // 自动类型转换
        System.out.println(db);// 23.0

        char ch = 'a'; // 00000000 01100001
        int code = ch; // 00000000 00000000 00000000 01100001
        System.out.println(code);// 97
    }
}
