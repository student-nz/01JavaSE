package com.yj.nz.oop.oop4.objectDemo2;

public class Test3 {
    public static void main(String[] args) {
        Fruit fruit= FruitFactory.getFruit("葡萄");
        fruit.plant();
        fruit.grow();
        fruit.ok();
    }
}

class FruitFactory{
    public static Fruit getFruit(String name){
        if(name.equals("苹果")){
            return new Apple();
        }else if(name.equals("香蕉")){
            return new Banana();
        }else{
            return new Grap();
        }
    }
}

abstract class Fruit{
    public abstract void plant();
    public abstract void grow();
    public abstract void ok();
}
class Apple extends Fruit{
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
class Banana extends Fruit{
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

class Grap extends Fruit{
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


