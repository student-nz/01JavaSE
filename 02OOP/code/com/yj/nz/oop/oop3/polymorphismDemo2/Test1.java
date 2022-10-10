package com.yj.nz.oop.oop3.polymorphismDemo2;

public class Test1 {
    public static void main(String[] args) {
        Audi audi =new Audi();
        Toyota toyota =new Toyota();
        Car car =new Car();
        Person p =new Person();
        p.drive(toyota);
    }
}

class Person{
    public void drive(Car car){
        System.out.println("张三开车");
        car.run();
    }
}

class Car{
    public void run(){
        System.out.println("小车飙起来啦");
    }
}
class Audi extends Car{
    @Override
    public void run() {
        System.out.println("奥迪飙起来啦");
    }
}
class Toyota extends Car{
    @Override
    public void run() {
        System.out.println("丰田飙了100公里");
    }
}
