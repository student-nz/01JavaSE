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
    private int rk;
    private int yk;
    private int bk;
    // Alte + Insert


    public Hero() {
        this("yjxz",1,2000,200,200,200,200,3,3,3);
    }

    public Hero(String name, int level, int blood, int att, int def, int gold, int exp, int rk, int yk, int bk) {
        this.name = name;
        this.level = level;
        this.blood = blood;
        this.att = att;
        this.def = def;
        this.gold = gold;
        this.exp = exp;
        this.rk = rk;
        this.yk = yk;
        this.bk = bk;
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

    public int getRk() {
        return rk;
    }

    public void setRk(int rk) {
        this.rk = rk;
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
                ", rk=" + rk +
                ", yk=" + yk +
                ", bk=" + bk +
                '}';
    }
}
