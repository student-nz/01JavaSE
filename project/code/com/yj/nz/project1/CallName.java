package com.yj.nz.project;

import java.util.Random;

/*
	随机点名器
	1 存储姓名
	2 预览所有人的姓名
	3 随机抽取一个人的姓名
*/
public class CallName{
    public static void main(String[] args){
        //存储姓名，姓名存储到数组容器中
        //数组存储姓名，姓名的数据类型 String
        String[] names={"聂政","蒋学","雷青","杨军","袁桂清","朱正阳","邓拓","邓鹏飞","小王","小黑","小黑"};
        //预览：遍历数组，打印所有姓名
        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }
        System.out.println("=====================================");
        //随机出一个人的姓名
        //利用随机数，生成一个整数，作为索引，到数组中找到对应的元素
        Random ran=new Random();
        int index=ran.nextInt(names.length);//index 就是随机数作为索引
        System.out.println(names[index]);
    }
}