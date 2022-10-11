package com.yj.nz.d15_integer.demo2;

public class Test3 {
    public static void main(String[] args) {
        /*
        * 使用基本数据类型的常量直接给包装类对象赋值
        * 在早期的JDK版本中是不允许的
        * 从JDK1.5开始可以使用的一种写法
        * 自动装箱技术帮助我们实现的
        * java自动将基本数据类型的常量值转换成一个包装对象
        * java自动的帮助我们调用 valueOf方法完成
        * */
        byte a1=10;
        Byte a2=a1;
        // ***.valueOf() 将基本数据类型的常量 转换成 包装类对象
        Byte a3=a1;//Byte.valueOf(a1);
        Integer b=10;//Integer.valueOf(10);

        Double aDouble = 3.14;//Double.valueOf(3.14);
        Float aFloat = 3.14f;//Float.valueOf(3.14f);

        Boolean aBoolean = true;//Boolean.valueOf(true);
        Character a = 'a';//Character.valueOf('a');
    }
}
