package com.yj.nz.oop.oop1.demo6;

public class Test2 {

    public static void change(Point p1){
        // 让p1 执行了内存上的另一个对象
        // 那么此时 形参和实参在内存上指向的就不是同一个区域了
        p1 =new Point(10,10);
    }

    public static void main(String[] args) {
        Point p1 =new Point(1,1);
        p1.showPosition();
        change(p1);
        p1.showPosition();

    }
}
