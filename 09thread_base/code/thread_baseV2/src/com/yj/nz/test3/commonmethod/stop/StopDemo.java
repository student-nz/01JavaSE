package com.yj.nz.test3.commonmethod.stop;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class StopDemo {
    public static void main(String[] args) {
        StopThread thread = new StopThread();
        thread.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            //一般会处理中断异常，这里作为例子就直接打印到控制台了
            e.printStackTrace();
        }
        //暂停线程
        thread.stop();
        while (thread.isAlive()) {//确保线程已经终止

        }
    }

    private static class StopThread extends Thread {
        private int i = 0;

        @Override
        public void run() {
            synchronized (this) {//增加同步锁，确保线程安全
                BufferedWriter out = null;
                try {
                    out = new BufferedWriter(new OutputStreamWriter(
                            new FileOutputStream("test3stopdemo.txt", true)));
                    while (i < 1000) {
                        // 将i 写入文件
                        //休眠1秒,模拟耗时操作
                        out.write("写入" + i + "\r\n");
                        i++;
                        Thread.sleep(1000);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    try {
                        assert out != null;
                        out.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}