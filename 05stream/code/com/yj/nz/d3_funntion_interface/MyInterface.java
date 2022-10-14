package com.yj.nz.d3_funntion_interface;

public interface MyInterface {
    void show1();

    void show2();

//    void show3();

//    public default void show3() {
//        System.out.println("show3");
//    }

    default void show3() {
        System.out.println("show3");
    }
}
