package com.yj.nz.oop.oop1.demo1;

public class TestDog {
    public static void main(String[] args) {
        Dog dog1=new Dog();
        dog1.type="泰迪";
        dog1.month=10;
        dog1.color="棕";
        dog1.weight=5.6;
        dog1.bark();
        dog1.play();
        dog1.eat("翔");

        Dog dog2=new Dog();
        dog2.type="谢逊";
        dog2.month=20;
        dog2.color="金";
        dog2.weight=30;
        dog2.bark();
        dog2.play();
        dog2.eat("骨头");

    }
}
