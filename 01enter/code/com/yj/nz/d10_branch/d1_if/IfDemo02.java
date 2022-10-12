package com.yj.nz.d10_branch.d1_if;

public class IfDemo02 {
	public static void main(String[] args) {
		System.out.println("开始");

		//定义两个变量
		int a = 10;
		int b = 20;
		b = 5;

		//需求：判断a是否大于b，如果是，在控制台输出：a的值大于b，如果不是，在控制台输出：a的值不大于b
		if(a > b) {
			System.out.println("a的值大于b");
		} else {
			System.out.println("a的值不大于b");
		}

		System.out.println("结束");
	}
}