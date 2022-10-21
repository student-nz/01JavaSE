package com.yj.nz.mota.motav2;

/**
 * ClassName:Monster
 * Package:com.yj.nz.mota.motav2
 * Description:描述
 *
 * @Date:2022/10/15 9:10
 * @Author:NieZheng
 * @Version:1.0
 */
public class Monster {
    private String name;
    private int blood;
    private int att;
    private int def;
    private int gold;
    private int exp;

    public String getName() {
        return name;
    }

    public Monster(String name, int blood, int att, int def, int gold, int exp) {
        this.name = name;
        this.blood = blood;
        this.att = att;
        this.def = def;
        this.gold = gold;
        this.exp = exp;
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
}
