package com.yj.nz.oop.oop1.demo2;

/**
 * 直接声明在类中的变量 叫做成员变量 作用是作为当前类的一个属性
 * 声明在方法体重或者方法的参数列表 叫做局部变量 作用仅仅是为了完成当前方法的运算
 * 成员变量的作用范围 是当前类的所有方法
 * 局部变量的作用范围 仅仅是当前方法可用
 */
public class Calculater {
    /**
     * 品牌  String类型
     */
    String brand;
    /**
     * 尺寸 double类型
     */
    double size;
    /**
     * 计算两个整数的和并返回
     * @param a 第一个整数 int类型
     * @param b 第二个整数 int类型
     * @return 两个整数的和 int类型
     */
    public int sum(int a,int b){
        int c = 11;
        int d = 22;
        System.out.println("一个的"+size+"寸的"+brand+"计算器正在计算"+a+"加"+b);
        System.out.println(c);
        return a+b;
    }

    public int testMethod(){
        System.out.println(brand);
        System.out.println(size);
        /*System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);*/
        return 10;
    }

}
