package com.yj.nz.d14_method;

/*
    定义格式：
        public static void 方法名() {
	        //方法体
	    }
 */
public class MethodDemo1 {
    public static void main(String[] args) {
        //调用方法
        isEvenNumber();
    }

    //需求：定义一个方法，在方法中定义一个变量，判断该数据是否是偶数
    public static void isEvenNumber() {
        //在方法中定义一个变量
        int number = 10;
        number = 9;

        //判断该数据是否是偶数
        if (number % 2 == 0) {
            System.out.println(number + "是偶数");
        } else {
            System.out.println(number + "不是偶数");
        }
    }
}
