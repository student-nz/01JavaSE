package com.yj.nz.d8_annotation;

/**
   目标：学会自定义注解。掌握其定义格式和语法。
 */
@MyBook(name="《精通JavaSE》",authors = {"政哥", "dlei"} , price = 199.5)
//@Book(value = "/delete")
// @Book("/delete")
@Book(value = "/delete", price = 23.5)
//@Book("/delete")
public class AnnotationDemo1 {

    @MyBook(name="《精通JavaSE2》",authors = {"政哥", "dlei"} , price = 199.5)
    private AnnotationDemo1(){

    }

    @MyBook(name="《精通JavaSE1》",authors = {"政哥", "dlei"} , price = 199.5)
    public static void main(String[] args) {
        @MyBook(name="《精通JavaSE2》",authors = {"政哥", "dlei"} , price = 199.5)
        int age = 21;
    }
}

