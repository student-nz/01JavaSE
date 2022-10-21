package com.yj.nz.d10_loop.d1_continuebreak;

public class ControlDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
//                continue;
                break;
            }

            System.out.println(i);
        }
    }
}
