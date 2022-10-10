package com.yj.nz.oop.oop3.extendsDemo2;

public class Test1 {
    public static void main(String[] args) {
//        Son son =new  Son();
//        son.eat();

    }

}
/*
* 方法重写  子类对于父类同名方法的重新定义
* 1必须要有继承
* 2重写发生在子类中
* 3重写要求方法名必须一样
* 4参数列表必须一样
* 5要求返回值类型必须一致
* 6访问修饰符可以不一致 但是 子类重写父类的方法的修饰符不能小于父类的方法
* 7如果父类要控制子类不能重写某些方法时 可以加final修饰该方法
* 8父类中的静态方法不允许被子类重写
*
* */
class Father{
    public /*final*/ void eat(){
        System.out.println("用筷子吃饭");
    }

    /*public static void aaa(){
        System.out.println("父类中的静态方法");
    }*/

}

class Son extends Father{
    /*
    * @Override 标志着该方法是重写父类的方法
    * java编译器根据该注解自动检索重写的方法是否正确
    * */
    @Override
    public void eat(){
        System.out.println("用刀叉吃饭");
    }

   /* @Override
    public static void aaa(){
        System.out.println("父类中的静态方法");
    }*/
}

