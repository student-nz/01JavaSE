package com.yj.nz.d10_loop.d3_for;

/*
    需求：统计“水仙花数”一共有多少个，并在控制台输出个数
 */
public class ForTest05 {
    public static void main(String[] args) {
        //定义一个统计变量，用于数据的统计，初始化值为0
        int count = 0;

        for (int i = 100; i < 1000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;

            if ((ge * ge * ge + shi * shi * shi + bai * bai * bai) == i) {
//                System.out.println(i);
                //1,2,3,...
                count++;
            }
        }

        //输出水仙花的个数
        System.out.println("水仙花数一共有：" + count + "个");
    }
}
