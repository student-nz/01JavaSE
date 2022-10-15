package com.yj.nz.test2.getsetnameandcurrentthread.test02;

public class MyThreadDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " 开始运行...");

        new Demo_Thread().start(); // start() 启动线程

        new Thread(new Demo_Runnable()).start();

        System.out.println("程序运行完成");
    }
}

// 外部类实现方式
class Demo_Thread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; ++ i) {
            System.out.println(Thread.currentThread().getName() + " 这是一个比较耗时的操作...");
            try {
                Thread.sleep(1000); // 当前线程休眠1秒钟
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

class  Demo_Runnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; ++ i) {
            System.out.println(Thread.currentThread().getName() + " 这是另外一个比较耗时的操作...");
            try {
                Thread.sleep(1000); // 当前线程休眠1秒钟
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}