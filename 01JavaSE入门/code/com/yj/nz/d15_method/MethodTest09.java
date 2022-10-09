package com.yj.nz.d15_method;

/*
    需求：设计一个方法用于判断一个整数是否是水仙花数，调用方法，把结果在控制台输出。
 */
public class MethodTest09 {
    public static void main(String[] args) {
//        boolean flag = isFlower(111);
//        System.out.println(flag);
//
//        flag = isFlower(153);
//        System.out.println(flag);

        for (int i=100; i<1000; i++) {
            //i
//            boolean flag = isFlower(i);
//            if(flag) {
//                System.out.println(i);
//            }
            if(isFlower(i)) {
                System.out.println(i);
            }
        }
    }

    /*
    	使用两个明确分析该方法的参数和返回值
        参数：int number
        返回值类型：boolean
     */
    public static boolean isFlower(int number) {
        //判断一个整数是否是水仙花数
        int ge = number % 10;
        int shi = number / 10 % 10;
        int bai = number / 100 % 10;

        if ((ge * ge * ge + shi * shi * shi + bai * bai * bai) == number) {
            return true;
        } else {
            return false;
        }
    }
}
