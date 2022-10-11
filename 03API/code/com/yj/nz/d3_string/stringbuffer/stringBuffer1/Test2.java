package com.yj.nz.d3_string.stringbuffer.stringBuffer1;


public class Test2 {
    public static void main(String[] args) {
        StringBuffer sbf =new StringBuffer("asdf");
        // 当前存储的字符串长度
        System.out.println(sbf.length());
        // 当前StringBuffer内部数组的容量
        System.out.println(sbf.capacity());

        sbf.append("aaaaaaaaaaaaaaaaa");

        // 当前存储的字符串长度
        System.out.println(sbf.length());
        // 当前StringBuffer内部数组的容量
        System.out.println(sbf.capacity());
    }
}
