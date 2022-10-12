package com.yj.nz.d11_loop.d3_for;

/*
    需求：求1-100之间的偶数和，并把求和结果在控制台输出
 */
public class ForTest03 {
    public static void main(String[] args) {
        //1:求和的最终结果必须保存起来，需要定义一个变量，用于保存求和的结果，初始值为0
        int sum = 0;

        //2:对1-100的数据求和与1-5的数据求和几乎完全一样，仅仅是结束条件不同
        for (int i=1; i<=100; i++) {
            //3:对1-100的偶数求和，需要对求和操作添加限制条件，判断是否是偶数
            if(i % 2 == 0) {
                sum += i;
            }
        }

        //4:当循环执行完毕时，将最终数据打印出来
        System.out.println("1-100之间的偶数和是：" + sum);
    }
}
