package com.yj.nz.d5_variable;

public class VariableDemo {
    public static void main(String[] args) {
        System.out.println("----------------基本数据类型类型四类八种--------------------------");
        // 数据类型 变量名称 = 初始值;
        // 1. byte字节型 占1个字节  -128 - 127
        byte bt1 = 98;
        System.out.println(bt1);
        // byte bt2 = 128; // 超出范围报错

        // 2. 短整型 short 占2个字节
        short st1 = 30000;

        // 3. 整型 int 默认类型 占4个字节
        int it1 = 232442442;

        // 4. 长整型 long 占8个字节
        long lg1 = 133244244;
        // 随便写一个整数字面量默认是int类型的，132223243244244虽然没有超过long的范围，但是它超过了本身int类型的表示范围。
        // 如果希望随便写一个整数字面量当成long类型，需要在其后加L/l
        long lg2 = 132223243244244L;

        // 5. 浮点型（小数）
        // 单精度浮点型 float 占4个字节
        // 随便写一个小数字面量默认是double类型，如果希望随便写一个小数字面量是float类型的需要在其后加上F/f
        float ft1 = 98.5F;

        // 6. 双精度浮点型 double 占8个字节
        double de1 = 999.99;

        // 7. 字符型 char
        char ch1 = 'a';
        char ch2 = '中';
        // char ch3 = '中国'; //报错,字符类型用单引号包括且只能包括一个字符

        // 8. 布尔类型 boolean
        boolean bn1 = true;
        boolean bn2 = false;

        System.out.println("----------------引用数据类型--------------------------");
        String name = "政哥";
        System.out.println(name);

        System.out.println("---------------------------------------------------");
        // 1. 什么类型的变量一定是存放什么类型的数据
        int it2 = 21;
        // 2. 同一个范围内不能定义重名的变量
        // int it2 = 25;
        it2 = 25; // 这里是赋值不是定义！

        // 3. 变量定义的时候可以不给初始化值，但是使用的时候必须有初始化值。
        double de2 ;
        de2 = 10000;
        System.out.println(de2);

        {
            int it3 = 90;
            System.out.println(it3);
        }
        // System.out.println(it3); 报错，因为代码块作用域问题
        System.out.println(it2);

    }

}
