package com.yj.nz.oop.oop4.abstractDemo;

public class Test1 {
    public static void main(String[] args) {
        Erge l=new Xiaodi1();//new Xiaodi1();
        l.getMoney();
        l.doSomethingTerrible();
    }
}
/*
* 1没有方法体的方法 叫做抽象方法 抽象方法由abstract关键字修饰
* 2抽象方法必须放在抽象类中  abstract修饰类就是抽象类
* 3抽象方法必须被子类重写
*       抽象方法是一种要求 是一种设计
*       子类必须将这个要求 这种设计实现
*       面对父类中抽象方法的要求 不同的子类 可以采取不同的算法实现
* 4子类重写抽象方法是 将抽象方法转变为普通方法
* 5抽象类不能被实例化  可以是实例化其子类 生成名父类
* 6如果子类不想重写父类中的抽象方法 那么子类必须也是抽象类
* 7子类必须重写其直接父类和所有间接父类中的抽象方法
* 8抽象类中可以有非抽象方法
* 9子类是否需要重写父类中的非抽象方法是随意
* */
abstract class Ladeng{
    public abstract void doSomethingTerrible();
    public void eat(){
        System.out.println("吃饭");
    }
}
abstract class Erge extends Ladeng{
    /*@Override
    public void doSomethingTerrible() {
        System.out.println("炸大楼");
    }*/
    public abstract void getMoney();
   /* @Override
    public void eat(){
        System.out.println("吃饭");
    }*/
}
class Xiaodi1 extends Erge{
    @Override
    public void getMoney(){
        System.out.println("抢银行");
    }
    @Override
    public void doSomethingTerrible() {
        System.out.println("炸地铁");
    }
}
















