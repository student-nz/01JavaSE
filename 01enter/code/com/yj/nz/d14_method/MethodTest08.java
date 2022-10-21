package com.yj.nz.d14_method;

/*
    需求：设计一个方法用于获取三个整数较大值，调用方法，把结果在控制台输出。
 */
public class MethodTest08 {
    public static void main(String[] args) {
        int max = getMax(10, 20, 30);
        System.out.println("10,20,30中的较大值是：" + max);
    }

    /*
        使用两个明确分析该方法的参数和返回值
        参数：int a,int b,int c
        返回值类型：int
     */
    public static int getMax(int a, int b, int c) {
        //获取三个整数较大值
//        if (a >= b) {
//            if (a >= c) {
//                return a;
//            } else {
//                return c;
//            }
//        } else {
//            if (b >= c) {
//                return b;
//            } else {
//                return c;
//            }
//        }

        int tempMax = a > b ? a : b;
        int max = tempMax > c ? tempMax : c;
        return max;
    }
}
