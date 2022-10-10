package com.yj.nz.oop.oop1.demo5;

public class Test1 {
    public static void main(String[] args) {
        Point[] points ={new Point(3,4),new Point(3,5),new Point(4,1)};
        Point target=new Point(3,-4);
        showDistance(target,points);


    }
    // 定义一个方法  输出给的多个点分别到目标点的距离值
    public static void showDistance(Point target,Point... points){
        for(Point p:points){
            double distance = getDistance(target, p);
            System.out.println("当前点("+p.x+","+p.y+")与目标点("+target.x+","+target.y+")的长度为"+distance);
        }
    }
    // 定义一个方法 计算两个点之间的距离
    public static double getDistance(Point p1,Point p2){
        int x1=p1.x;
        int x2=p2.x;
        int y1 =p1.y;
        int y2=p2.y;
        int temp=(x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
        double distance = Math.sqrt(temp);
        return distance;
    }
}
