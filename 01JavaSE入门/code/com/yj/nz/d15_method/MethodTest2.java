package com.yj.nz.d15_method;

/*
    需求：设计一个方法用于打印两个数中的较大数，数据来自于方法参数

    分析：
        1:定义一个方法，用于打印两个数字中的较大数，例如：getMax()
        2:为方法定义两个参数，用于接收两个数字
        3:使用if语句对两个数字的大小关系进行处理
        4:在main()方法中调用定义好的方法（使用字面量）
        5:在main()方法中调用定义好的方法（使用变量）
 */
public class MethodTest2 {
    public static void main(String[] args) {
        //在main()方法中调用定义好的方法（使用字面量）
        getMax(10,20);
//        getMax(a:10,b:20); //idea的智能提示，不要手动的去写a,b
//        getMax(30);
//        getMax(10.0,20,0);
        //调用方法的时候，人家要几个，你就给几个，人家要什么类型，你就给什么类型

        //在main()方法中调用定义好的方法（使用变量）
//        int a = 10;
//        int b = 20;
//        getMax(a,b);
        int x = 10;
        int y = 20;
        getMax(x,y);
    }

    //定义一个方法，用于打印两个数字中的较大数，例如：getMax()
    //为方法定义两个参数，用于接收两个数字
    public static void getMax(int a, int b) {
        //使用if语句对两个数字的大小关系进行处理
        if(a >= b) {
            System.out.println("较大的数是：" + a);
        }else {
            System.out.println("较大的数是：" + b);
        }
    }
}
