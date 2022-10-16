package com.yj.nz.d2_api.sleep.test02;

/*
* 分析哪个线程是休眠的
* */

public class SleepDemo02 {
    public static void main(String[] args) {
        Thread t = new MyThread();
        t.setName("t");
        t.start();
        //调用sleep方法
        try {
            //
            t.sleep(1000*5);//在执行过程中还是会被转换为：Thread.sleep(1000*5);
            //这行代码的作用是：让当前的线程进入休眠，也就是说说main线程进入休眠。
            //这样代码出现在main方法中，main线程休眠。
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("hello world!");
    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName() + "-->" + i);
        }
    }
}