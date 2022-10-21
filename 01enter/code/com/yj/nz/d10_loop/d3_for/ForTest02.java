package com.yj.nz.d10_loop.d3_for;

/*
    需求：求1-5之间的数据和，并把求和结果在控制台输出
 */
public class ForTest02 {
    public static void main(String[] args) {
        //定义一个求和变量，用于保存求和的结果
        int sum = 0;

        //我们通过for循环实现获取数据1-5
        for (int i=1; i<=5; i++) {
            //i,1,2,3,4,5
//            sum = sum + i;
            sum += i;
            /*
                第一次求和：sum = sum + i = 0 + 1 = 1
                第二次求和：sum = sum + i = 1 + 2 = 3
                第三次求和：sum = sum + i = 3 + 3 = 6
                第四次求和：sum = sum + i = 6 + 4 = 10
                第五次求和：sum = sum + i = 10 + 5 = 15
             */
        }

        //输出结果
        System.out.println("1-5的求和结果是：" + sum);
    }
}
