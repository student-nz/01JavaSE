package com.yj.nz.oop.oop3.combainDemo2;
public class Triangle {
    private Line l1;
    private Line l2;
    private Line l3;
    // 定义一个方法 返回当前三角形的周长
    public double getPre(){
        double len1 = l1.getLength();
        double len2 = l2.getLength();
        double len3 = l3.getLength();
        if(len1+len2>len3&& len1+len3>len2&& len2+len3>len1){
            return len1+len2+len3;
        }
        return 0;
    }
    // 定义一个方法 返回当前三角形的面积
    public double getAreas(){
        double len1 = l1.getLength();
        double len2 = l2.getLength();
        double len3 = l3.getLength();
        if(len1+len2>len3&& len1+len3>len2&& len2+len3>len1){
            double p=(len1+len2+len3)/2;
            double s=p*(p-len1)*(p-len2)*(p-len3);
            return Math.sqrt(s);
        }
        return 0;
    }
    public Triangle() {
    }

    public Triangle(Line l1, Line l2, Line l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    public Line getL1() {
        return l1;
    }

    public void setL1(Line l1) {
        this.l1 = l1;
    }

    public Line getL2() {
        return l2;
    }

    public void setL2(Line l2) {
        this.l2 = l2;
    }

    public Line getL3() {
        return l3;
    }

    public void setL3(Line l3) {
        this.l3 = l3;
    }
}
