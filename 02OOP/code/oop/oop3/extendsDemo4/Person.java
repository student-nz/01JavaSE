package com.yj.nz.oop.oop3.extendsDemo4;

import java.util.Objects;

public class Person {
    private String name;
    private String gender;

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

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public Person() {
    }

    public void showInfo(){
        System.out.println(name+gender);
    }

    // alt +insert  hashcode和equals
    /**
     * 重写Object类中的额equals方法 依据属性值来判断两个对象是否可以认为是相同对象
     * @param o 当前对象与之对比的对象
     * @return 如果当前对象和传入的对象 同属一个类且属性值相同 返回true 否则返回false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(gender, person.gender);
    }
}
