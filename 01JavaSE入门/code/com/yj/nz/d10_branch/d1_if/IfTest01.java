package com.yj.nz.d10_branch.d1_if;
import java.util.Scanner;

/*
	奇偶数
	需求：
		任意给出一个整数，请用程序实现判断该整数是奇数还是偶数，并在控制台输出该整数是奇数还是偶数。
*/
public class IfTest01 {
	public static void main(String[] args) {
		//为了体现任意给出一个整数，采用键盘录入一个数据(导包，创建对象，接收数据)
		Scanner sc = new Scanner(System.in);

		System.out.println("请输入一个整数：");
		int number = sc.nextInt();

		if(number%2 == 0) {
			System.out.println(number + "是偶数");
		} else {
			System.out.println(number + "是奇数");
		}
		System.out.println("-------------------------");

	}
}