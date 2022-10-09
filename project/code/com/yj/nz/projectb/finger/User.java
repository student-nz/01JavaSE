package com.yj.nz.projectb.finger;

import java.util.Scanner;

public class User {
    //属性私有化
    private String name;
    private int score;

    //人的出拳，是由自己决定的
    public int showFist() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请出拳：1、剪刀	2、石头　	3、布");
        //接收用户输入的值
        int choise = sc.nextInt();
        if( choise == 1) {
            System.out.println(name + "输出的是剪刀");
        }else if( choise == 2) {
            System.out.println(name + "输出的是石头");
        }else {
            //除了1和2，剩下的都是3
            choise = 3;
            System.out.println(name + "输出的是布");
        }
        return choise;
    }

    //alt +shift + s
    public User() {
        super();
    }

    public User(String name, int score) {
        super();
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", score=" + score + "]";
    }

}

