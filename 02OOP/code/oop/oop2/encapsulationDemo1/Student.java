package com.yj.nz.oop.oop2.encapsulationDemo1;

public class Student {
    /*
    * java中的类不是所有的属性都可以随意访问
    * 金融数据  工资社保缴存比例
    * 人员的工资
    * 对于类封装要解决的问题就是如何避免属性的暴露
    * 1解决属性暴露
    *     使用访问修饰符控制属性的作用范围
    *     private 修饰成员变量  让成员变量仅仅能在当前类内部使用
    *     属性如何赋值???
    * 2通过共有的set方法给属性赋值
    * 3如果要单独获得某个属性的值 那么要给该属性提供共有的get方法
    * */


    private String name;
    private String gender="男";
    private double score;

    /**
     * 向外界 返回score属性值的方法
     * @return
     */
    public double getScore(){
        return score;
    }
    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }

    /**
     * 给当前类的name属性赋值的set方法
     * @param name
     */
    public void setName(String name){
        this.name=name;
    }

    public void setGender(String gender){
        // 如果没有设置过值 那么允许赋值
        if(this.gender == null){
            this.gender=gender;
        }
    }
    public void setScore(double score){
        if(score >=0){
            this.score=score;
        }
    }


    public void introduce(){
        System.out.println("我叫"+name+"是"+gender+"孩儿,这次考试打了"+score+"分");
    }
}


