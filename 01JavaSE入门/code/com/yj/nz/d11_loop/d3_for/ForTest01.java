package com.yj.nz.d11_loop.d3_for;

/*
    需求：在控制台输出1-5的数据
 */
public class ForTest01 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println("--------------");

        for (int i = 1; i <= 5; i += 1) {
            System.out.println(i);
        }
        System.out.println("--------------");

        for (int i = 1; i <= 5; i += 2) {
            System.out.println(i);
        }
        System.out.println("--------------");

        //自增运算符：++
        //它跟在变量的后面表示变量的值+1
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println("--------------");

        for (int i = 1; i <= 5; i++,i++) {
            System.out.println(i);
        }
        System.out.println("--------------");

        //我要获取数据5-1该怎么办呢？
        for (int i=5; i>=1; i-=1) {
            System.out.println(i);
        }
        System.out.println("--------------");

        for (int i=5; i>=1; i--) {
            System.out.println(i);
        }

    }
}
