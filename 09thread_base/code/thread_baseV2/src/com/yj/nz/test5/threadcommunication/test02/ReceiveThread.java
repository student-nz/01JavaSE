package com.yj.nz.test5.threadcommunication.test02;

/**
   接电话线程类
 */
public class ReceiveThread extends Thread{
    @Override
    public void run() {
        // 1号  2号
        while (true){
            CallSystem.receive();
        }
    }
}
