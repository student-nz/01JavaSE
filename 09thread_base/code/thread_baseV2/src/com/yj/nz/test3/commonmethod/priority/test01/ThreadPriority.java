package com.yj.nz.test3.commonmethod.priority.test01;

public class ThreadPriority extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ":" + i);
        }
    }

}
