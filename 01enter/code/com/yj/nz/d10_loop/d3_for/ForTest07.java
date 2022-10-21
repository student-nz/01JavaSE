package com.yj.nz.d10_loop.d3_for;

/*
    需求：朋友聚会的时候可能会玩一个游戏：逢七过。
 */
public class ForTest07 {
    public static void main(String[] args) {
        //1:获取1-100之间的数据，通过循环实现
        for (int i = 1; i <= 100; i++) {
            //2:判断数字包含7或者是7的倍数(判断数据：要么个位是7，要么十位是7，要么能够被7整除)
            if ((i % 10 == 7) || (i / 10 % 10 == 7) || (i % 7 == 0)) {
                //3:在控制台输出满足条件的数据
                System.out.println(i);
            }
        }

    }
}
