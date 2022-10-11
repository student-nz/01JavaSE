package com.yj.nz.d3_string.stringbuffer.stringBuffer2;

public class Test1 {
    public static void main(String[] args) {
        String str= "asdf";
        // 构造方法
        StringBuffer sbf=new StringBuffer(str);
        // 初始化容量
        StringBuffer sbf2 =new StringBuffer(32);

        // 删除
        StringBuffer s=new StringBuffer("asdfqwerzxcv");
        s.delete(4,8);
        System.out.println(s);
        s.deleteCharAt(3);
        System.out.println(s);

        // 插入
        s.insert(3,"uuuu");
        System.out.println(s);

        // 替换
        s.replace(3,7,"xxxx");
        System.out.println(s);

        // 翻转
        s.reverse();
        System.out.println(s);

        // 修改
        s.setCharAt(8,'V');
        System.out.println(s);

        // String 和Stringbuffer对象转换
        // String >>> StringBuffer  构造方法
        String str2 =s.toString();

        // 去除空余元素位
        StringBuffer sbf3 =new StringBuffer("asdf");
        System.out.println(sbf3.capacity());
        sbf3.trimToSize();
        System.out.println(sbf3.capacity());
    }
}
