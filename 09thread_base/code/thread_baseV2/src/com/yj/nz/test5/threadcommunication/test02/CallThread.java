package com.yj.nz.test5.threadcommunication.test02;

public class CallThread extends Thread{
    @Override
    public void run() {
        // 不断的打入电话
        while (true){
            CallSystem.call();
        }
    }
}
