package com.yj.nz.oop.oop3.combainDemo2;

public class Test {
    public static void main(String[] args) {
        // 三个点
        Point p1 =new Point(0,0);
        Point p2 =new Point(0,3);
        Point p3 =new Point(4,0);
        // 三个线
        Line l1=new Line(p1,p2);
        Line l2=new Line(p3,p2);
        Line l3=new Line(p1,p3);
        // 一个三角形
        Triangle triangle =new Triangle(l1,l2,l3);
        // 获取周长和 面积
        System.out.println("周长为:"+ triangle.getPre());
        System.out.println("面积为:"+ triangle.getAreas());
    }
}
