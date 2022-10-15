package com.yj.nz.test2.getsetnameandcurrentthread.test04;

/**
 * ClassName:MyCallableLambdaDemo
 * Package:PACKAGE_NAME
 * Description:描述
 *
 * @Date:2022/7/15 14:45
 * @Author:NieZheng
 * @Version:1.0
 */
public class MyThreadDemo implements Runnable{
    public int flag = 1;
    static Object o1 = new Object();
    static Object o2 = new Object();

    public static void main(String[] args) {
        MyThreadDemo d1 = new MyThreadDemo();
        MyThreadDemo d2 = new MyThreadDemo();

        d1.flag = 1;
        d2.flag = 2;

        Thread th1 = new Thread(d1,"笔线程");
        Thread th2 = new Thread(d2,"本子线程");

        th1.start();
        th2.start();

    }
    @Override
    public void run() {
        System.out.println("flag = " + flag);

        if ( flag == 1 ){
            synchronized (o1){ // 先获得笔
                System.out.println(Thread.currentThread().getName() + " 获得了笔...");
                try {
                    Thread.sleep(500);// 休眠500毫秒,好让另外一个线程去锁定o2资源
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " 准备去拿本子...");
                synchronized (o2){
                    System.out.println("1");
                }
            }
        }
        if ( flag == 2 ){
            synchronized (o2){ // 先锁定o2,即先拿到本子
                System.out.println(Thread.currentThread().getName() + " 获得了本子...");
                try {
                    Thread.sleep(500); // 休眠500毫秒,好让另外一个线程去锁定o2资源
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " 准备去拿笔...");
                synchronized (o1){
                    System.out.println("2");
                }
            }
        }
    }
}
