package com.yj.nz.d15_method;

/*
    需求：设计一个方法用于求1-n之间的数据和(n>1)，返回求和结果。调用方法，把结果在控制台输出。
 */
public class MethodTest06 {
    public static void main(String[] args) {
        int result = sum(5);
        System.out.println("1-5的和是：" + result);

        result = sum(100);
        System.out.println("1-100的和是：" + result);
    }

    /*
    	使用两个明确分析该方法的参数和返回值
        参数：int n
        返回值类型：int
     */
    public static int sum(int n) {
        int sum = 0;

        for (int i=1; i<=n; i++) {
            sum += i;
        }

        return sum;
    }
}
