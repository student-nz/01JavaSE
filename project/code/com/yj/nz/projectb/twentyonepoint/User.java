package com.yj.nz.projectb.twentyonepoint;

import java.util.Scanner;

public class User {
	
	//属性私有化
	private String name;
	private int score;
	
	//人的出拳，由自己决定
	public int showFist() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请出拳： 1、剪刀	2、石头	3、布" );
		//接受用户输入的值
		int choise = sc.nextInt();
		if(choise == 1) {
			System.out.println(name + "输出的是剪刀");
		}else if(choise == 2) {
			System.out.println(name + "输出的是石头");
		}else {
			//除了1，和2，剩下都是3
			choise = 3;
			System.out.println(name + "输出的是布");
		}
		return choise;		//因为要告诉Game对象，我出的是什么
	}
	
	//alt + shift + s
	public String getName() {
		return name;
	}
	
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	public User() {
		super();
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", score=" + score + "]";
	}

	
	
}
