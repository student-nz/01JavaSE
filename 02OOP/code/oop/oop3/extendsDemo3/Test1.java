package com.yj.nz.oop.oop3.extendsDemo3;

public class Test1 {
    public static void main(String[] args) {
        final int a=10;
        S s =new S();

    }

}
/*final */class F{
    String name="父类的name属性";
    public void showName(){
        System.out.println("父类的方法");
    }

    public F(String s){
        System.out.println("父类中的构造方法");
    }
    /*public F(){}*/
}


/*当一个类继承另一个类报错 可能有哪些原因
* 1当父类是final修饰的最终类时
* 2父类中构造方法都是有参数的  子类的构造方法必须显示调用父类构造方法并传参数
*
* final的用法
* 1修饰变量 常量 只能赋值一次
* 2final修饰方法 最终方法 不能被子类重写
* 3final修饰类   最终类   不能被继承的类
* */
class S extends F{
    /*
    * 构造方法 于成员变量成员方法不同
    * 构造方法是不能被继承
    * 在执行子类构造方法的时候 子类的构造方法一定会调用父类的构造方法
    * 在子类构造方法中 默认使用super() 调用父类构造方法的
    * 当super()小括号中需要传递参数时 super() 可以省略不写的
    * super()必须是子类构造方法中的第一行代码
    * */
    public S(){
        super("asdfasdf");
        System.out.println("子类中的构造方法");

    }

}
