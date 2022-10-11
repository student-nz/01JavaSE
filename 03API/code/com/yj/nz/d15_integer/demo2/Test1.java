package com.yj.nz.d15_integer.demo2;

public class Test1 {
    public static void main(String[] args) {
        String n="10";
        // 将字符串解析成基本数据类型的数据
        byte a =Byte.parseByte(n);
        System.out.println(a);
        short b =Short.parseShort(n);
        System.out.println(b);
        int c = Integer.parseInt(n);
        System.out.println(c);
        long l = Long.parseLong(n);
        System.out.println(l);
        String n2="3.14";
        float e = Float.parseFloat(n2);
        System.out.println(e);
        double f = Double.parseDouble(n2);
        System.out.println(f);
        boolean aTrue = Boolean.parseBoolean("true");
        System.out.println(aTrue);
    }
}
