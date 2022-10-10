package com.yj.nz.oop.oop4.interfaceDemo;

public class Test {
    public static void main(String[] args) {
        MyInterA myInterA=new MyImpl();
        MyInterB myInterB=new MyImpl();
        MyImpl impl =new MyImpl();
        testA(impl);
        testB(impl);
    }
    public static void testA(MyInterA a){
    }
    public static void testB(MyInterB b){
    }
}

interface MyInterA{
    void methodA();
}
interface MyInterB {
    void methodB();
}

class MyImpl implements MyInterA, MyInterB {
    @Override
    public void methodA() {
        System.out.println("实现方法MethodA");
    }
    @Override
    public void methodB() {
        System.out.println("实现方法MethodB");
    }
}

