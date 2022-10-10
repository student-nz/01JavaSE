package com.yj.nz.oop.oop5.innerClassDemo5;

public class Student implements  Comparable<Student>{
    private String name;
    private int age;
    private int score;

    @Override
    public int compareTo(Student o) {
        //return this.age-o.age;
        //return o.age-this.age;
        //return  this.score-o.score;
        return o.score-this.score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    public Student() {
    }

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
