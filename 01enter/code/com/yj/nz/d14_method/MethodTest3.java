package com.yj.nz.d14_method;

/*
    需求：设计一个方法可以获取两个数的较大值，数据来自于参数

    分析：
        1:定义一个方法，用于获取两个数字中的较大数，例如：getMax()
        2:使用if语句对两个数字的大小关系进行处理
        3:根据题设分别设置两种情况下对应的返回结果
        4:在main()方法中调用定义好的方法并使用变量保存
 */
public class MethodTest3 {
    public static void main(String[] args) {
        //在main()方法中调用定义好的方法并使用变量保存
//        int max = getMax(10,20);
//        System.out.println(max);

        int max = getMax(10, 20); //.var的使用，它能够帮我们自动补齐左边的内容
        System.out.println(max); //max.sout，能够把max变量放到输出语句中

        System.out.println(getMax(10,20));
        System.out.println(getMax(10, 20));
    }

    //定义一个方法，用于获取两个数字中的较大数，例如：getMax()
    public static int getMax(int a,int b) {
        //使用if语句对两个数字的大小关系进行处理
        //根据题设分别设置两种情况下对应的返回结果
        if(a >= b) {
            return a;
        } else {
            return b;
        }
    }
}
