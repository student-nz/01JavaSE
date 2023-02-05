package com.yj.nz.projectb.typing;

public class Player {
	private String name;
	private int score;
	private int no;

	public Player() {
	}

	public Player(String name, int score, int no) {
		this.name = name;
		this.score = score;
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

}
