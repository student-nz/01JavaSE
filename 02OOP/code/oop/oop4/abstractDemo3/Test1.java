package com.yj.nz.oop.oop4.abstractDemo3;

public class Test1 {
    public static void main(String[] args) {
        Employee em= new HTMLProgrammer();
        Boss boss=new Boss();
        boss.addMoney(em);
    }
}

class Boss{
    public void addMoney(Employee a){
        if(a instanceof Account || a instanceof Chuna){
            System.out.println("财务和出纳暂时不加工资");
        }else if(a instanceof Programmer){
            System.out.println("程序员加1000工资");
        }else if(a instanceof ProjectManager){
            System.out.println("项目经理加500元薪资");
        }else if(a instanceof ProductManager){
            System.out.println("产品经理开除");
        } else if (a instanceof HTMLProgrammer) {
            System.out.println("前端加2000工资");
        }else{
            System.out.println("其他岗位不加工资");
        }
    }
}

abstract class Employee{}
class Account extends  Employee{}
class Chuna extends  Employee{}
class Programmer extends  Employee{}
class ProjectManager extends  Employee{}
class ProductManager extends  Employee{}
class HTMLProgrammer extends  Employee{}
