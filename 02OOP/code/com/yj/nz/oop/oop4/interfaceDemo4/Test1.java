package com.yj.nz.oop.oop4.interfaceDemo4;

public class Test1 {
    public static void main(String[] args) {
        FruitFactory factory =new OrangeFactory();
        Fruit fruit= factory.getFruit();
        fruit.plant();
        fruit.grow();
        fruit.ok();
    }
}

interface FruitFactory{
    public  Fruit getFruit();
}
class AppleFactory implements FruitFactory{
    @Override
    public Fruit getFruit() {
        return new Apple();
    }
}
class BananaFactory implements FruitFactory{
    @Override
    public Fruit getFruit() {
        return new Banana();
    }
}
class GrapFactory implements FruitFactory{
    @Override
    public Fruit getFruit() {
        return new Grap();
    }
}
class OrangeFactory implements FruitFactory{
    @Override
    public Fruit getFruit() {
        return new Orange();
    }
}

interface Fruit{
    public void plant();
    public void grow();
    public void ok();
}
class Apple implements Fruit{
    public void plant(){
        System.out.println("我种下一颗种子");
    }
    public void grow(){
        System.out.println("长出了一颗苹果树");
    }
    public void ok(){
        System.out.println("苹果红了");
    }
}
class Banana implements Fruit{
    public void plant(){
        System.out.println("我种下一颗种子");
    }
    public void grow(){
        System.out.println("长出了一颗香蕉树");
    }
    public void ok(){
        System.out.println("香蕉黄了");
    }
}

class Grap implements Fruit{
    public void plant(){
        System.out.println("我种下一颗种子");
    }
    public void grow(){
        System.out.println("长出了一颗葡萄树");
    }
    public void ok(){
        System.out.println("葡萄紫了");
    }
}
class Orange implements Fruit{
    public void plant(){
        System.out.println("我种下一颗种子");
    }
    public void grow(){
        System.out.println("长出了一颗橘子树");
    }
    public void ok(){
        System.out.println("橘子黄了");
    }
}

