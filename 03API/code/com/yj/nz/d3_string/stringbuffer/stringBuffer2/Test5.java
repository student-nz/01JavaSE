package com.yj.nz.d3_string.stringbuffer.stringBuffer2;

public class Test5 {
    public static void main(String[] args) {
        String s ="101010a1";
        StringBuilder sbd=new StringBuilder(s);
        sbd.reverse();
        String s2 = sbd.toString();
        System.out.println(s.equals(s2)?"是回文":"不是回文");


    }
}
