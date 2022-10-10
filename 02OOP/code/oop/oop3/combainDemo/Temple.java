package com.yj.nz.oop.oop3.combainDemo;

public class Temple {
    private String name;
    // 组合关系  另一个类作为当前类的属性
    private Monk oldMonk;
    private Monk youngMonk;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Monk getOldMonk() {
        return oldMonk;
    }

    public void setOldMonk(Monk oldMonk) {
        this.oldMonk = oldMonk;
    }

    public Monk getYoungMonk() {
        return youngMonk;
    }

    public void setYoungMonk(Monk youngMonk) {
        this.youngMonk = youngMonk;
    }

    public Temple(String name, Monk oldMonk, Monk youngMonk) {
        this.name = name;
        this.oldMonk = oldMonk;
        this.youngMonk = youngMonk;
    }

    public Temple() {
    }
}
