package com.yj.nz.test3.commonmethod.currentthread;

public class CurrentthreadDemo {
    public static void main(String[] args) {
        String name = Thread.currentThread().getName();
        System.out.println(name);
    }
}
