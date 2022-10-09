package com.yj.nz.projectb.twentyonepoint;

import java.util.Random;

public class Computer {
	//属性私有化
	private String name;
	private int score;
	
	//扩展，疯狂电脑
	private double pre;
	
	//电脑出拳，随机出，随机1-3
	
	public int showFist() {
		
		Random r = new Random();
		int choise = r.nextInt(3) + 1;
		
		if( choise == 1 ) {
			System.out.println(name + "输出的是剪刀");
		}else if( choise == 2 ) {
			System.out.println(name + "输出的是石头");
		}else{
			System.out.println(name + "输出的是布");
		}
		return choise;
	}
	
	//电脑出拳，随机出，随机1-3
	public int showFist(int uNum) {
		Random r = new Random();
		int choise = 0;
		//在随即之前先验证有没有即死
		if( r.nextDouble() <= pre ) {
			// 1 -> 2
			choise = uNum % 3 + 1;
		}else {
			//随机1 - 3
			 choise = r.nextInt(3) + 1;
		}
		
	
		
		if( choise == 1 ) {
			System.out.println(name + "输出的是剪刀");
		}else if( choise == 2 ) {
			System.out.println(name + "输出的是石头");
		}else{
			System.out.println(name + "输出的是布");
		}
		return choise;
	}
	
	public String getName() {
		return name;
	}
	
	//一旦名字确定，我们的概率也就确定了
	public void setName(String name) {
		//注意，字符串，不能用 == 来比较
		if( "简单电脑".equals( name )) {
			pre = 0;
		}else if("普通电脑".equals( name )) {
			pre = 0.5;
		}else {
			pre = 0.998;
		}
		this.name = name;
	}
	//我们只能得到概率，不能修改概率
	public double getPre() {
		return pre;
	}
	
	
	
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Computer(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	public Computer() {
		super();
	}
	
	@Override
	public String toString() {
		return "Computer [name=" + name + ", score=" + score + "]";
	}
	
}
