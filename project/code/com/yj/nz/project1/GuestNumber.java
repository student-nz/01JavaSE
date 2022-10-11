package com.yj.nz.project;

/*
实现猜数字的小游戏
随机一个数字，让用户猜
结果三种情况：
中了，大了，小了
随机数：Random
键盘输入：Scanner
猜的数字，和随机数进行比较 if判断
	直到猜中为止，反复去猜，循环while
*/
import java.util.Random;
import java.util.Scanner;

public class GuestNumber{
    public static void main(String[] args){
        System.out.println("猜数字游戏开始:");
        System.out.println("请输入1—100之间的数据");
        //创建Random类型变量
        Random ran=new Random();
        //变量。使用功能 nextInt()获取1-100随机数
        int ranNumber=ran.nextInt(100)+1;
        //System.out.println(ranNumber);
        //创建Scanner类变量
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println(ranNumber);
            //获取键盘输入
            int number=sc.nextInt();
            //随机数和用户输入的数据进行比较数据
            if(number>ranNumber){
                System.out.println("很遗憾，你猜大了！");
            }else if (number<ranNumber){
                System.out.println("很遗憾，你猜小了！");
            }else{
                System.out.println("恭喜你！你猜对了！");
            }
            //break;
        }

    }
}
