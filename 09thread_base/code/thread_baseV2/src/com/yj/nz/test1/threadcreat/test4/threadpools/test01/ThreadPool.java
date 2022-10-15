package com.yj.nz.test1.threadcreat.test4.threadpools.test01;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;

/**
 * 简单的线程池
 * @author ConstXiong
 */
public class ThreadPool {
    
    //阻塞队列实现生产者-消费者
    BlockingQueue<Runnable> taskQueue;
    
    //工作线程集合
    List<Thread> threads = new ArrayList<Thread>();
    
    //线程池的构造方法
    ThreadPool(int poolSize, BlockingQueue<Runnable> taskQueue) {
        this.taskQueue = taskQueue;
        
        //启动线程池对应 size 的工作线程
        for (int i = 0; i < poolSize; i++) {
            Thread t = new Thread(() -> {
                while (true) {
                    Runnable task;
                    try {
                        task = taskQueue.take();//获取任务队列中的下一个任务
                        task.run();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            t.start();
            threads.add(t);
        }
    }
    
    //提交执行任务
    void execute(Runnable task) {
        try {
            //把任务方法放到任务队列
            taskQueue.put(task);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}