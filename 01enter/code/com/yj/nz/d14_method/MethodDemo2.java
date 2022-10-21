package com.yj.nz.d14_method;

/*
    带参数方法的定义和调用

    定义格式：
        public static void 方法名(参数) { … … }
 */
public class MethodDemo2 {
    public static void main(String[] args) {
        //字面量值调用
        isEvenNumber(10);
        isEvenNumber(9);

        //变量的调用
        int number = 11;
        isEvenNumber(number);
        number = 12;
        isEvenNumber(number);
    }

    //需求：定义一个方法，该方法接收一个参数，判断该数据是否是偶数
    public static void isEvenNumber(int number) {
        if (number % 2 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
