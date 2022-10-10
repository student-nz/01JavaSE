package com.yj.nz.oop.oop3.combainDemo;

public class Mountain {
    private String name;
    // 组合关系  另一个类作为当前的一个属性
    private Temple temple;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Temple getTemple() {
        return temple;
    }

    public void setTemple(Temple temple) {
        this.temple = temple;
    }

    public Mountain(String name, Temple temple) {
        this.name = name;
        this.temple = temple;
    }

    public Mountain() {
    }
}
