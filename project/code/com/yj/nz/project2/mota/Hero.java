package com.yj.nz.projectb.mota;

public class Hero {
	//生命blood 等级level 攻击att 防御def 金币gold 经验exp yk bk rk
	//记得封装
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
	
	//这个游戏的属性，一开始就是定义好的
	public Hero() {
		this.level = 1;
		this.blood = 1000;
		this.att = 10;
		this.def = 10;
		this.bk = 1;
		this.rk = 2;
	}
	
	//toString   将对象转换为字符串的形式返回
	@Override
	public String toString() {
		return "勇士： level=" + level + ", blood=" + blood + ", att=" + att + ", def=" + def + ", gold=" + gold
				+ ", exp=" + exp + ", yk=" + yk + ", bk=" + bk + ", rk=" + rk;
	}
	
	
	
	
}
