package com.yj.nz.d15_integer.demo2;

public class Test2 {
    public static void main(String[] args) {
        // 判断一个字符是不是数字
        System.out.println(Character.isDigit('a'));
        System.out.println(Character.isLetter('7'));
        System.out.println(Character.isLetterOrDigit('#'));
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.isUpperCase('a'));
        //isSpace 转义字符也被判断是空格  isSpaceChar 转义字符不会被判断是空格
        System.out.println(Character.isSpaceChar(' '));
        System.out.println(Character.isSpaceChar('\t'));
        System.out.println(Character.isSpace('\r'));
        System.out.println(Character.isSpace('\n'));

    }
}
