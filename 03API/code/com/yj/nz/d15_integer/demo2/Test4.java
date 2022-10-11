package com.yj.nz.d15_integer.demo2;

public class Test4 {
    public static void main(String[] args) {
        Integer i=new Integer(10);
        Byte j=new Byte("10");
        /*
        * 包装类对象直接给一个基本数据类型的变量赋值
        * ***value() 获取一个包装类对象所存储的对应的基本数据类型的值
        * 自动拆箱技术
        * 从JDK1.5开始 可以不用调用***Value方法了 有java自动帮我们调用
        * */
        int i2=i;//i.intValue();
        byte j2=j;//j.byteValue();
    }
}
