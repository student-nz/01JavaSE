package com.yj.nz.d2_api.sleep.test01;

/*
 * static void sleep(long mills)
 * 作用：让当前线程进入休眠，进入“阻塞”状态，放弃占有CPU时间片，让给其他线程使用
 * */

public class SleepDemo01 {
    public static void main(String[] args) {
        //让当前线程进入休眠，睡眠5秒
        //当前线程是主线程！！!
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		//5秒之后执行这里的代码
        System.out.println("hello world!");
    }
}