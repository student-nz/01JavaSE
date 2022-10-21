package com.yj.nz.d7_operator;

public class OperatorDemo5 {
    public static void main(String[] args) {
        // 赋值运算符：= += -= *= /= %=
        int a = 10;
        int b = 200;
        // a = a + b;
        a += b; // a = (int)(a + b)
        System.out.println(a);// 210

        byte i = 10;
        byte j = 20;
        // i = (byte) (i + j);
        i += j; // i = (byte) (i + j);
        System.out.println(i);// 30

        int m = 10;
        int n = 5;
        //m += n;
        //m -= n;  // 等价于： m = (int)(m - n)
        //m *= n;  // 等价于： m = (int)(m * n)
//        m /= n;  // 等价于： m = (int)(m / n)
        m %= n;  // 等价于： m = (int)(m % n)
        System.out.println(m); // 0
    }
}
