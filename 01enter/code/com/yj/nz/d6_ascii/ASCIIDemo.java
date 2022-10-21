package com.yj.nz.d6_ascii;

/**
 * ClassName:ASCIIDemo
 * Package:nz.d5_variable
 * Description:描述
 *
 * @Date:2022/10/9 19:22
 * @Author:NieZheng
 * @Version:1.0
 */
public class ASCIIDemo {
    public static void main(String[] args) {
        char ch1 = 'a';
        // ch = 0000 0000 0110 0001
        System.out.println(ch1 + 10); // 97 + 10

        // ch2 = 0000 0000 0100 0001
        char ch2 = 'A';
        System.out.println(ch2 + 10); // 65 + 10

        // ch3 = 0011 0000
        char ch3 = '0';
        System.out.println(ch3 + 10); // 48 + 10
    }
}
