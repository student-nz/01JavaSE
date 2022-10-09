package com.yj.nz.projectb.mota;

import java.util.Scanner;

public class Game {
	//对象也是一种数据类型,引用数据类型
	private User user;
	private Computer computer;
	private int count;

	public void init() {
		//对象 要想使用里面的方法或者属性，必须先实例化
		user = new User();
		computer = new Computer();

	}

	public void startGame() {
		//先初始化
		init();
		Scanner sc = new Scanner(System.in);
		System.out.println("开始游戏，请选择对战局数：1、3局		2、5局		3、7局");
		int choise = sc.nextInt();
		count = choise == 1 ? 3:choise == 2 ? 5:7;		//三元运算符

		System.out.println("请输入你的名字");
		String name = sc.next();
		user.setName(name);

		System.out.println("请输入你选择的对手：1、简单电脑	2、普通电脑		3、疯狂电脑");
		choise = sc.nextInt();
		name = choise == 1 ? "简单电脑":choise == 2 ? "普通电脑" : "疯狂电脑";
		computer.setName(name);

		//正式开始游戏
		for(int i = 0;i < count;i++) {
			//首先，人出拳
			int uNum = user.showFist();		//定义一个uNum，来接收你这个方法的返回值
			int cNum = computer.showFist();

			//判断结果，输出最终成绩
			result(uNum,cNum);	//实参	实际的参数
		}

		//游戏结束，输出最终成绩
		showInfo();
	}

	public void result(int uNum,int cNum) {
		if(uNum == cNum ) {
			System.out.println("平局继续");
			//1、剪刀		2、石头		3、布
			//uNUm == 1 && cNum == 2 || uNum == 2 && cNum == 3 || uNum == 3 && cNum == 1
		}else if(uNum % 3 + 1 == cNum) {
			System.out.println(computer.getName() + "赢了");
			//加分
			computer.setScore(computer.getScore() + 1);
		}else {
			System.out.println(user.getName() + "赢了");
			user.setName(user.getName() + 1);
		}

	}

	public void showInfo() {
		if( user.getScore() > computer.getScore() ) {
			System.out.println("赢个电脑。也就这样");
		}else {
			System.out.println("渣渣辉");
		}
	}

}
