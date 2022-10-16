package com.yj.nz.d2_api.sleep.test03;

/*
* sleep睡眠太久了，如果希望半道上醒来，可以使用interrupt()方法
* 注意：这个不是终断线程的执行，是终止线程的睡眠
* */

public class SleepDemo03 {
    public static void main(String[] args) {

        Thread t = new Thread(new MyRunable2());
        t.setName("t");
        t.start();

        //希望5秒以后，t线程醒来（5秒以后主线程的活干完了）
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //终断t线程的睡眠（这种终断睡眠的方式依靠了java的异常处理机制。）
        t.interrupt();//干扰，一盆冷水过去！！
    }
}

class MyRunable2 implements Runnable{
    //重点：run()当中的异常不能throws，只能try..catch
    //因为run()方法在父类中没有抛出异常，子类不能比父类抛出更多异常。
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "--> begin");
        try {
            //睡眠1年
            Thread.sleep(1000*60*60*24*365);
        } catch (InterruptedException e) {
            //打印异常信息
            e.printStackTrace();
        }
        //一年之后才会执行这里
        System.out.println(Thread.currentThread().getName() + "--> end");
    }
}
