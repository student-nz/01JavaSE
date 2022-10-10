package com.yj.nz.oop.oop2.demopackage.util;

// 导入当前类要是用的其他类
import com.yj.nz.oop.oop2.demopackage.controller.Student;

import java.util.Date;

public class TestStudent {
    public static void main(String[] args) {
        /*
        类的全限定名  类的全路径名
        包含包的类名
         */
        com.yj.nz.oop.oop2.demopackage.pojo.Student stu =new com.yj.nz.oop.oop2.demopackage.pojo.Student();
        Student stu2=new Student();

        Date date =new  Date();
        java.sql.Date date2 =new java.sql.Date(System.currentTimeMillis());



    }
}
