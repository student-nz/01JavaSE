package com.yj.nz.projectb.typing;

public class Level {
	private int levelNo; // 第几关 1
	private int strLength; // 字符串的长度 3
	private int times; // 这一关限制的时间 40
	private int score; // 输入一次正确的分数 10
	private int limit; // 这一关需要输入正确多少次 10

	public Level() {
	}

	public Level(int levelNo, int strLength, int times, int score, int limit) {
		this.levelNo = levelNo;
		this.strLength = strLength;
		this.times = times;
		this.score = score;
		this.limit = limit;
	}

	public int getLevelNo() {
		return levelNo;
	}

	public int getStrLength() {
		return strLength;
	}

	public int getTimes() {
		return times;
	}

	public int getScore() {
		return score;
	}

	public int getLimit() {
		return limit;
	}

}
