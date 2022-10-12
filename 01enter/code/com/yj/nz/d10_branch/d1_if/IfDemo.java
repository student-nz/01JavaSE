package com.yj.nz.d10_branch.d1_if;

public class IfDemo {
	public static void main(String[] args) {
		System.out.println("开始");

		//定义两个变量
		int a = 10;
		int b = 20;

		//需求：判断a和b的值是否相等，如果相等，就在控制台输出：a等于b
		if(a == b) {
			System.out.println("a等于b");
		}

		//需求：判断a和c的值是否相等，如果相等，就在控制台输出：a等于c
		int c = 10;
		if(a == c) {
			System.out.println("a等于c");
		}

		System.out.println("结束");
	}
}