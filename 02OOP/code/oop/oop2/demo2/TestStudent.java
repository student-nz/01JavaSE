package com.yj.nz.oop.oop2.demo2;
//普通的方式导入一个类
//import com.yj.nz.oop.oop2.demo1.Student;
// 静态导入  导入另一个类的静态成员
/*import static com.yj.nz.oop.oop2.demo1.Student.aaa;
import static com.yj.nz.oop.oop2.demo1.Student.bbb;
import static com.yj.nz.oop.oop2.demo1.Student.ccc;
import static com.yj.nz.oop.oop2.demo1.Student.ddd;*/
// * 通配符 类下所有的静态成员  静态成员变量和静态成员方法
import static com.yj.nz.oop.oop2.demo1.Student.*;
public class TestStudent {
    public static void main(String[] args) {
        aaa();
        bbb();
        ccc();
        ddd();
    }
}
