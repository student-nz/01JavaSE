package com.yj.nz.d14_array;

/*
    数组使用中的两个小问题
        1：索引越界：访问了数组中不存在的索引对应的元素，造成索引越界问题
            ArrayIndexOutOfBoundsException

        2：空指针异常：对象不再指向堆内存，还想继续访问数据，访问失败
            NullPointerException

        null：空值，引用数据类型的默认值，表示不指向任何有效对象
 */
public class ArrayDemo06 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        //输出元素
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
//        System.out.println(arr[3]);
        System.out.println(arr[2]);

        //把null赋值给arr
        arr = null;
        //输出元素
        //Exception in thread "main" java.lang.NullPointerException: Cannot load from int array because "arr" is null
        if(arr != null) {
            System.out.println(arr[0]);
        }
    }
}
