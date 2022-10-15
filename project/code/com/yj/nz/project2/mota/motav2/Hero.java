package com.yj.nz.mota.motav2;

/**
 * ClassName:Hero
 * Package:com.yj.nz.mota.motav2
 * Description:描述
 *
 * @Date:2022/10/15 8:49
 * @Author:NieZheng
 * @Version:1.0
 */
public class Hero {
    // 英雄有什么属性吗？
    // level blood att def gold exp rK yK bK
    private String name;
    private int level;
    private int blood;
    private int att;
    private int def;
    private int gold;
    private int exp;
    private int rK;
    private int yK;
    private int bK;
    // Alte + Insert


    public Hero() {
        this("yjxz",1,2000,200,200,200,200,3,3,3);
    }

    public Hero(String name, int level, int blood, int att, int def, int gold, int exp, int rK, int yK, int bK) {
        this.name = name;
        this.level = level;
        this.blood = blood;
        this.att = att;
        this.def = def;
        this.gold = gold;
        this.exp = exp;
        this.rK = rK;
        this.yK = yK;
        this.bK = bK;
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

    public int getrK() {
        return rK;
    }

    public void setrK(int rK) {
        this.rK = rK;
    }

    public int getyK() {
        return yK;
    }

    public void setyK(int yK) {
        this.yK = yK;
    }

    public int getbK() {
        return bK;
    }

    public void setbK(int bK) {
        this.bK = bK;
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
                ", rK=" + rK +
                ", yK=" + yK +
                ", bK=" + bK +
                '}';
    }
}
