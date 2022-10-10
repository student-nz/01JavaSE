package com.yj.nz.oop.oop3.b;

import com.yj.nz.oop.oop3.a.A ;

public class B extends A {
    public void test(){
        // 输出继承的属性
        System.out.println(name);
        // 调用继承的方法
        showName();
    }
}
