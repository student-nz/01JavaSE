package com.yj.nz.oop.oop3.combainDemo;

public class Test {
    public static void main(String[] args) {
        /*分别准备和尚对象  庙对象  山对象 完成讲故事*/
        Mountain moun =new Mountain();
        moun.setName("嵩山");

        Temple temple =new Temple();
        temple.setName("少林寺");

        Monk oldMonk=new Monk();
        oldMonk.setName("鲁智深");
        oldMonk.setAge(69);

        Monk youngMonk =new Monk();
        youngMonk.setName("释小龙");
        youngMonk.setAge(6);

        // 把和尚装进庙里
        temple.setOldMonk(oldMonk);
        temple.setYoungMonk(youngMonk);
        // 把庙装进山里
        moun.setTemple(temple);

        tellStory(moun);
    }
    // 定义一个方法 完成讲故事
    public static void tellStory(Mountain moun){
        System.out.println("从前有座山,山叫"+moun.getName());
        Temple temple=moun.getTemple();
        System.out.println("山里有座庙,庙叫"+temple.getName());
        Monk oldMonk = temple.getOldMonk();
        Monk youngMonk = temple.getYoungMonk();
        System.out.println("山里有两个和尚");
        System.out.println(oldMonk.getAge()+"岁的"+oldMonk.getName()+"在给"+youngMonk.getAge()+"岁的"+youngMonk.getName()+"讲故事,从前有座山");
    }
}
