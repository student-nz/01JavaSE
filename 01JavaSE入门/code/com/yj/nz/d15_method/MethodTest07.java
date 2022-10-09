package com.yj.nz.d15_method;

/*
    需求：设计一个方法用于比较两个整数是否相等，调用方法，把结果在控制台输出。
 */
public class MethodTest07 {
    public static void main(String[] args) {
        boolean flag = compare(10, 20);
        System.out.println("10和20相等吗：" + flag);

        flag = compare(10,10);
        System.out.println("10和10相等吗：" + flag);
    }

    /*
        使用两个明确分析该方法的参数和返回值
        参数：int a,int b
        返回值类型：boolean
     */
    public static boolean compare(int a,int b) {
        //比较两个整数是否相等
//        if(a == b) {
//            return true;
//        } else {
//            return false;
//        }

//        boolean flag = (a == b) ? true : false;
//        return flag;

//        boolean flag = (a == b);
//        return flag;

        return a == b;
    }
}
