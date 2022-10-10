package com.yj.nz.oop.oop4.interfaceDemo3;

public class Dog  implements  Comparable<Dog>{
    private int age;
    private String type;
    private String color;

    @Override
    public int compareTo(Dog o) {
        return this.age - o.age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public Dog() {
    }

    public Dog(int age, String type, String color) {
        this.age = age;
        this.type = type;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
