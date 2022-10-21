package com.yj.nz.d10_loop.d3_for;

/*
    需求：在控制台输出所有的“水仙花数”
 */
public class ForTest04 {
    public static void main(String[] args) {
        //1:获取三位数，通过循环实现
//        for (int i=100; i<=999; i++) {
//
//        }

        for (int i = 100; i < 1000; i++) {
            //2:获取每一个三位数的个位，十位，百位
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;

            //3:判断该三位数是否是水仙花数
            if ((ge * ge * ge + shi * shi * shi + bai * bai * bai) == i) {
                //4:输出水仙花数
                System.out.println(i);
            }

        }




    }
}
