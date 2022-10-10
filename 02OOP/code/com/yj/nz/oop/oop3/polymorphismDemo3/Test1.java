package com.yj.nz.oop.oop3.polymorphismDemo3;

public class Test1 {
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

class Fruit{
    public void plant(){
        System.out.println("水果种植了");
    }
    public void grow(){
        System.out.println("水果正在生长");
    }
    public void ok(){
        System.out.println("水果OK了");
    }
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


