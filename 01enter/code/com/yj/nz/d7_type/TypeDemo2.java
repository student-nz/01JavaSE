package com.yj.nz.d7_type;

public class TypeDemo2 {
    public static void main(String[] args) {
        byte a = 10;
        int b = 20;
        double c = 1.0;
        double rs = a + b + c;
        System.out.println(rs);// 31.0

        double rs2 = a + b - 2.3;
        System.out.println(rs2);// 27.7

        // 面试题
        byte i = 100;
        byte j = 120;
        int k = i + j;
        System.out.println(k);// 220
    }
}
