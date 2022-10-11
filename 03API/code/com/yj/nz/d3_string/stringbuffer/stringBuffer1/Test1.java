package com.yj.nz.d3_string.stringbuffer.stringBuffer1;

public class Test1 {
    public static void main(String[] args) {
        long l1 = System.currentTimeMillis();
        // String完成字符串拼接
        /*String s ="asdf";
        for (int i = 0; i <1000000; i++) {
            s=s.concat("a");
        }*/
        //StringBuffer完成字符串拼接
        StringBuffer sbf =new StringBuffer("asdf");
        for (int i = 0; i <1000000; i++) {
            sbf.append("a");
        }
        long l2= System.currentTimeMillis();
        System.out.println(l2-l1);
    }
}
