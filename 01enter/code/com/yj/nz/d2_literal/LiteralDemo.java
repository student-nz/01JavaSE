package com.yj.nz.d2_literal;

/**
 * ClassName:LiteralDemo
 * Package:com.yj.nz.d2_literal
 * Description:描述
 *
 * @Date:2022/10/9 18:09
 * @Author:NieZheng
 * @Version:1.0
 */
/*
* 6种字面量
* */
public class LiteralDemo {
    public static void main(String[] args) {
        // 1. 整数字面量
        System.out.println(1);
        System.out.println(-1);

        // 2. 小数字面量
        System.out.println(2.4);
        System.out.println(-2.4);

        // 3. 字符字面量，必须单引号围起来，且仅能有一个字符
        System.out.println('a');
        System.out.println('你');

        // 4. 字符串字面量
        System.out.println("政哥牛逼");
        // 5. 布尔型字面量
        System.out.println(true);
        System.out.println(false);

        //6. 空类型字面量 null
        System.out.println("null");
    }
}
