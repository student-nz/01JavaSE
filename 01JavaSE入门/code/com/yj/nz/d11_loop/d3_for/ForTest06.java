package com.yj.nz.d11_loop.d3_for;

/*
    需求：输出所有五位数的回文数
 */
public class ForTest06 {
    public static void main(String[] args) {
        //1:获取五位数，通过循环实现
        for (int i = 10000; i < 100000; i++) {
            //2:获取每一个五位数的个位，十位，千位，万位
            int ge = i % 10;
            int shi = i / 10 % 10;
            int qian = i / 1000 % 10;
            int wan = i / 10000 % 10;

            //3:判断该五位数是否是回文数
            if ((ge == wan) && (shi == qian)) {
                //4:输出回文数
                System.out.println(i);
            }
        }

        //练习：统计五位数的回文数个数，并在控制台输出个数

    }
}
