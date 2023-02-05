package com.yj.nz.mota.motav1;

public class Hero {
	//生命blood 等级level 攻击att 防御def 金币gold 经验exp yk bk rk
	//记得封装
	private String name;
	private int level;
	private int blood;
	private int att;
	private int def;
	private int gold;
	private int exp;
	private int yk;
	private int bk;
	private int rk;
	
	//alt + shift + s

	public Hero() {
		// this 调用当前构造器
		new Hero("yjxz",1,2000,200,200,200,200,3,3,3);
	}

	public Hero(String name, int level, int blood, int att, int def, int gold, int exp, int yk, int bk, int rk) {
		this.name = name;
		this.level = level;
		this.blood = blood;
		this.att = att;
		this.def = def;
		this.gold = gold;
		this.exp = exp;
		this.yk = yk;
		this.bk = bk;
		this.rk = rk;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getBlood() {
		return blood;
	}

	public void setBlood(int blood) {
		this.blood = blood;
	}

	public int getAtt() {
		return att;
	}

	public void setAtt(int att) {
		this.att = att;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getYk() {
		return yk;
	}

	public void setYk(int yk) {
		this.yk = yk;
	}

	public int getBk() {
		return bk;
	}

	public void setBk(int bk) {
		this.bk = bk;
	}

	public int getRk() {
		return rk;
	}

	public void setRk(int rk) {
		this.rk = rk;
	}
	//打印对象默认调用toString方法，需要重写toString 以便打印对象内容


	@Override
	public String toString() {
		return "Hero{" +
				"name='" + name + '\'' +
				", level=" + level +
				", blood=" + blood +
				", att=" + att +
				", def=" + def +
				", gold=" + gold +
				", exp=" + exp +
				", yk=" + yk +
				", bk=" + bk +
				", rk=" + rk +
				'}';
	}
}
