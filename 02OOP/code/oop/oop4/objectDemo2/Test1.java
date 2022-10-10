package com.yj.nz.oop.oop4.objectDemo2;


public class Test1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 0x16
        Person p =new Person(1,"张三","男");
        // 0x16
        Person p2 =(Person)p.clone();

        System.out.println(p==p2);
        System.out.println(p);
        System.out.println(p2);

    }
}

class Person implements Cloneable {
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
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
