package com.yj.nz.d11_loop.d4_while;

/*
    需求：求1-100之间的奇数和，并把求和结果在控制台输出
 */
public class WhileTest01 {
    public static void main(String[] args) {
        //定义求和变量，初始化值为0
        int sum = 0;

        //获取1-100之间的数据
//        int i = 1;
//        while (i<=100) {
//            //判断数据是否是奇数
////            if(i%2 != 0) {
////                sum += i;
////            }
//
//            if(i%2 == 1) {
//                sum += i;
//            }
//
//            i++;
//        }

        int i = 1;
        while (i <= 100) {
            sum += i;
            i += 2; //1,3,5,7...99,101
        }

        //输出结果
        System.out.println("1-100之间的奇数和是：" + sum);
    }
}
