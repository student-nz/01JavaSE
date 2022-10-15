package com.yj.nz.test1.threadcreat.test4.threadpools.test01;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 测试线程池的使用
 * @author ConstXiong
 */
public class TestThreadPool {

    public static void main(String[] args) {
        // 创建有界阻塞任务队列
        BlockingQueue<Runnable> taskQueue = new LinkedBlockingQueue<>(10);
        // 创建 3个 工作线程的线程池
        ThreadPool tp = new ThreadPool(3, taskQueue);
        
        //提交 10 个任务
        for (int i = 1; i <= 10; i++) {
            final int j = i;
            tp.execute(() -> {
                System.out.println("执行任务" + j);
            });
        }
    }
    
}
