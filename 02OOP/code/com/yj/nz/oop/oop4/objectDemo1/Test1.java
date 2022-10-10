package com.yj.nz.oop.oop4.objectDemo1;

import java.util.Objects;

public class Test1 {
    public static void main(String[] args) {
        Person p =new Person(1,"张三","男");
        Person p2 =new Person(1,"张三","男");
        System.out.println(p.equals(p2));
        /*hashCode方法 为对象生成哈希码的方法
        哈希码 散列码 唯一 无序  随机
        父类中定义的hashcode方法目的是给任何一个对象都生成一个唯一的号码
        一般在重写equals方法的时候 我们都会顺带重写 hashcode方法
        一般equals方法重写后  对象的属性值相同 返回的就是true
        目标:当一个类的两个对象 所有的属性值都相同时 hash码也一样

        容器 集合
            集合中可以存放大量对象
            容器如何判断存储的对象是否重复
            HashSet根据 根据对象的equals方法阿和hashCode方法判断对象是否重复
        */
        System.out.println(p.hashCode());
        System.out.println(p2.hashCode());
    }
}

class Person{
    private int id;
    private String name;
    private String gender;

    public Person() {
    }

    public Person(int id,String name, String gender) {
        this.id=id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        // 如果当前对象和传过来的对象内存同一
        if (this == o){
            return true;
        }
        // 如果传过来的对象和当前对象不是一个类的对象
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        // 判断属性是否相同
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name) && Objects.equals(gender, person.gender);
    }



    @Override
    public int hashCode() {
        return Objects.hash(id, name, gender);
    }
}
