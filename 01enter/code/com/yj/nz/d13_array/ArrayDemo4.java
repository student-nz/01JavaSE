package com.yj.nz.d13_array;

public class ArrayDemo4 {
    public static void main(String[] args) {
        // 动态初始化数组的定义和使用。
        double[] scores = new double[3]; // [0.0, 0.0, 0.0]
        //                                    0    1    2

        // 赋值
        scores[0] = 99.5;
        System.out.println(scores[0]);

        System.out.println(scores[2]);


        String[] names = new String[90];
        names[0] = "迪丽热巴";
        names[2] = "马尔扎哈";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

    }
}
