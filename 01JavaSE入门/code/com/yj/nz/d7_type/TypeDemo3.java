package com.yj.nz.d7_type;

public class TypeDemo3 {
    public static void main(String[] args) {
        int a = 20;
        byte b = (byte)a;
        System.out.println(a);// 20
        System.out.println(b);// 20

        int i = 1500;
        byte j = (byte) i;
        System.out.println(j);// -36

        double score = 99.5;
        int it = (int) score;
        System.out.println(it); // 99
    }
}
