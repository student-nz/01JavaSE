package com.yj.nz.d8_operator;

public class OperatorDemo4 {
    public static void main(String[] args) {
        // 自增自减运算符： ++ --
        int a = 10;
        // a++; // a = a + 1
        ++a; // a = a + 1
        System.out.println(a);// 11

        int b = 10;
        //b--; // b = b -1
        --b;
        System.out.println(b);// 9

        System.out.println("------------------------------");
        // ++ -- 在变量前面 先 +1 | -1 再使用。
        int i = 10;
        int j = ++i;
        System.out.println(i); // 11
        System.out.println(j); // 11

        // ++ -- 在变量的后面 先使用再 +1 | -1
        int m = 10;
        int n = m++;
        System.out.println(m); // 11
        System.out.println(n); // 10

        System.out.println("-------------------------");
        int k = 3;
        int p = 5;
        // k  3 4 5 4
        // p  5 4 3 4
        // rs    3  +  5  -   4  + 4   - 5   +  4 + 2
        int rs = k++ + ++k - --p + p-- - k-- + ++p + 2;
        System.out.println(k); // 4
        System.out.println(p); // 4
        System.out.println(rs); // 9
    }
}
