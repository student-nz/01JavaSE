package com.yj.nz.oop.oop4.objectDemo2;

public class Test2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            Dog dog =new Dog();
            dog.id=i;
            // 催促垃圾回收器立刻运行
            System.gc();
        }
    }
}

class Dog{
    int id;

    @Override
    public void finalize() throws Throwable {
        super.finalize();
        System.out.println("dog"+id+"被Java垃圾回收机制回收了");
    }
}
