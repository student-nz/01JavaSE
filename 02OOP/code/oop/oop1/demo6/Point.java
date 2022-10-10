package com.yj.nz.oop.oop1.demo6;

public class Point {
    int x;
    int y;
    //显示坐标的一个方法
    public void showPosition(){
        System.out.println("("+x+","+y+")");
    }

    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }
}
