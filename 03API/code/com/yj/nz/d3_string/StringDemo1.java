package com.yj.nz.d3_string;

/**
     目标：了解String类的特点：String类不可变的原理。
 */
public class StringDemo1 {
    public static void main(String[] args) {
        String name = "政哥";
        name += "教育"; // name = name + "教育"
        name += "中心";
        System.out.println(name);
    }
}
