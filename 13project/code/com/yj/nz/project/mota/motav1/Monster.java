package com.yj.nz.mota.motav1;

public class Monster {
	//名字name 生命blood 等级level 攻击att 防御def 金币gold 经验exp
	private String name;
	private int blood;
	private int att;
	private int def;
	private int gold;
	private int exp;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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

	public Monster() {
	}


	public Monster(String name, int blood, int att, int def, int gold, int exp) {
		this.name = name;
		this.blood = blood;
		this.att = att;
		this.def = def;
		this.gold = gold;
		this.exp = exp;
	}

	@Override
	public String toString() {
		return "Monster{" +
				"name='" + name + '\'' +
				", blood=" + blood +
				", att=" + att +
				", def=" + def +
				", gold=" + gold +
				", exp=" + exp +
				'}';
	}
}
