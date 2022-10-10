package com.yj.nz.oop.oop2.encapsulationDemo3;

public class Dog {


    public static void main(String[] args) {
        Dog dog1 =new Dog("泰迪",2,"心情好","小迪");
        dog1.run();
        dog1.bark();
        System.out.println("====================================");
        Dog dog2 =new Dog();
        dog2.setType("哈士奇");
        dog2.setName("怀特");
        dog2.setAge(3);
        dog2.setMood("心情不好");
        dog2.run();
        dog2.bark();
    }

    /**
     * 品种
     */
    private String type;
    /**
     * 狗龄
     */
    private int age;
    /**
     * 心情
     */
    private String mood;
    /**
     * 名字
     */
    private String name;

    /**
     * 向外界返回品种属性的方法
     * @return 品种的属性值
     */
    public String getType() {
        return type;
    }

    /**
     * 设置品种属性的方法
     * @param type 要设置的品种属性值
     */
    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获得狗心情的方法
     * @return 狗的心情 只有心情好和心情不好两个值
     */
    public String getMood() {
        return mood;
    }

    /**
     * 设置狗心情的方法 控制只能设置心情好和心情不好两个值
     * @param mood 狗的心情
     */
    public void setMood(String mood) {
        //如果不是 "心情好" 也不是  "心情不好"
        if(!mood.equals("心情好")&&!mood.equals("心情不好")){
            this.mood="心情好";
        }else{
            this.mood = mood;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 参数缺省的构造方法
     */
    public Dog() {
    }

    /**
     * 完整参数的构造方法
     * @param type 品种
     * @param age  狗龄
     * @param mood 心情
     * @param name 名字
     */
    public Dog(String type, int age, String mood, String name) {
        this.type = type;
        this.age = age;
        if(!mood.equals("心情好")&&!mood.equals("心情不好")){
            this.mood="心情好";
        }else{
            this.mood = mood;
        }
        this.name = name;
    }

    /**
     * 狗叫的方法 根据心情状态执行不同的叫的方式
     */
    public void bark(){
        // 如果心情好
        if(mood.equals("心情好")){
            System.out.println("名叫"+name+"的"+age+"岁的"+type+"犬"+mood+",开心的汪汪叫");
        }
        if(mood.equals("心情不好")){
            System.out.println("名叫"+name+"的"+age+"岁的"+type+"犬"+mood+",伤心呜呜叫");
        }
    }

    /**
     * 狗跑的方法 根据心情状态执行不同的跑的方式
     */
    public void run(){
        // 如果心情好
        if(mood.equals("心情好")){
            System.out.println("名叫"+name+"的"+age+"岁的"+type+"犬"+mood+",围着主人身边转");
        }
        if(mood.equals("心情不好")){
            System.out.println("名叫"+name+"的"+age+"岁的"+type+"犬"+mood+",伤心的一动不动");
        }

    }
}
