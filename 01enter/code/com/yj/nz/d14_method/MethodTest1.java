package com.yj.nz.d14_method;

/*
    需求：设计一个方法用于打印两个数中的较大数

    分析：
        1:定义一个方法，用于打印两个数字中的较大数，例如：getMax()
        2:方法中定义两个变量，用于保存两个数字
        3:使用if语句对两个数字的大小关系进行处理
        4:在main()方法中调用定义好的方法
 */
public class MethodTest1 {
    public static void main(String[] args) {
        //在main()方法中调用定义好的方法
        getMax();
    }

    //定义一个方法，用于打印两个数字中的较大数，例如：getMax()
    public static void getMax() {
        //方法中定义两个变量，用于保存两个数字
        int a = 10;
        int b = 20;

        //使用if语句对两个数字的大小关系进行处理
        if(a >= b) {
            System.out.println("较大的数是：" + a);
        } else {
            System.out.println("较大的数是：" + b);
        }
    }
}
