package com.yj.nz.oop.oop3.polymorphismDemo;

public class Test3 {
    public static void main(String[] args) {
        A1 a =new C1();
        methodA(a);
    }

    public static void methodA(A1 a){
        // 判断传过来的对象 到底是由哪个子类声明而成的
        if(a instanceof B1){
            System.out.println("属于B1类");
        }

        if(a instanceof B2){
            System.out.println("属于B2类");
        }

        if(a instanceof C){
            System.out.println("属于C类");
        }

        if(a instanceof C1){
            System.out.println("属于C1类");
        }

        if(a instanceof C2){
            System.out.println("属于C2类");
        }
    }
}


class A1{

}
class B1 extends A1{

}
class B2 extends A1{

}

class C extends A1{

}
class C1 extends C{

}
class C2 extends C{

}