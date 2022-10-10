package com.yj.nz.oop.oop5.innerClassDemo2;

/*
内部类可以直接使用外部类的属性和方法
外部类的成员对内部类都是公开的
内部类可以使用四个访问修饰符修饰
外部类类名.内部类类名  对象名 = 外部类对象.new 内部类构造方法
        OuterClass.InnerClass ic =oc.new InnerClass();
内部类可以实现很好的隐藏
当内部类和外部类有同名的属性和方法时 通过 外部类类名.this.属性名/方法名 进行区分
内部类编译后会形成一个独立的字节码文件 名字为 外部类类名$内部类类名.class

静态成员内部类 只能直接使用外部类静态的成员变量
创建方式 外部类类名.内部类类名  对象名 = 外部类对象.new 内部类构造方法
        OuterClass.InnerClass ic =new OuterClass.InnerClass();
 */
public class OuterClass {
    static int a =10;
    int c=20;
    public static void methodA(){
        // 在外部类中使用内部类
        InnerClass ic1 =new InnerClass();
        System.out.println(ic1.b);
        ic1.methodB();
    }
    public OuterClass(){}
    static class InnerClass{
        int a =20;
        int b;
        public void methodA(){

        }
        public void methodB(){
            System.out.println(this.a);
            System.out.println(OuterClass.a);
            methodA();
            OuterClass.methodA();
        }
        public InnerClass(){}
    }
}
