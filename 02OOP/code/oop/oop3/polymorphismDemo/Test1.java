package com.yj.nz.oop.oop3.polymorphismDemo;

public class Test1 {
    public static void main(String[] args) {
        /*花木兰替父从军
        子类对象声明成父类对象 OK
        花木兰替父从军   在战场上战斗 >>> 父亲教的
        真正在战斗的是花木兰

        当子类声明成父类对象时
        1只能调用到父类中声明的方法 不能调用到子类中独有的方法
        2子类重写父类方法时
            编译时认为是父类调用的是父类的方法
            执行时认为子类调用的是子类的方法
        */

        F f =new S();
        f.methodF();
       // f.methodS();

    }
}

class F{
    public void methodF(){
        System.out.println("父类的方法");
    }
}
class S extends  F{
    @Override
    public void methodF(){
        System.out.println("子类重写父类的方法");
    }
    public void methodS(){
        System.out.println("子类中独有的方法");
    }
}