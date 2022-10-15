package com.yj.nz.test2.getsetnameandcurrentthread.test03;

public class MyThreadDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " 开始运行...");

        (new Thread() {
            @Override
            public void run() { // 当启动线程时会自动运行这个方法里面的代码
                for (int i = 0; i < 10; ++ i) {
                    System.out.println(Thread.currentThread().getName() + " 这是一个比较耗时的操作...");
                    try {
                        Thread.sleep(1000); // 当前线程休眠1秒钟
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        new Thread( () -> {
            for (int i = 0; i < 10; ++ i) {
                System.out.println(Thread.currentThread().getName() + " 这是另外一个比较耗时的操作...");
                try {
                    Thread.sleep(1000); // 当前线程休眠1秒钟
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();

        System.out.println("程序运行完成...");
    }
}