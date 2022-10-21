package com.yj.nz.pracitice;
import java.util.Scanner;

public class Bmi{
	public static void main(String[] args){
		//BMI: 人的身体健康指数
		//     是一个计算公式：       人的体重（kg）/r人的身高（m）的平方
		/*
			偏瘦    <=18.4
			正常	18.5~23.9
			过重	24.0~27.9
			肥胖	>=28.0
		*/

		//首先，开始提示用户输入值
		Scanner sc=new Scanner(System.in);
		//接着，开始提示用户输入值
		System.out.println("请输入您的身高:（单位：m）");
		double height=sc.nextDouble();

		System.out.println("请输入您的体重:（单位：kg）");
		double weight=sc.nextDouble();

		//开始计算
		double bmi=weight/Math.pow(height,2);
		//System.out.println(bmi);

		//最后判断



		if(bmi<=18.4){
			System.out.println("偏瘦:"+"你再不吃，就瘦成猴了");
		}else if(bmi<=23.9){
			System.out.println("正常:"+"继续保持身材，你非常健康呦！");
		}else if(bmi<=27.9){
			System.out.println("过重："+"继续吃下去，就胖成猪了！");
		}else{
			System.out.println("吃不吃,无所谓");
		}
	}
}
	