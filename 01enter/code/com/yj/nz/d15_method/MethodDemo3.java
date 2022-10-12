package com.yj.nz.d15_method;

/*
    带返回值方法的定义和调用

    定义格式：
        public static 数据类型 方法名(参数) {
	        return 数据;
	    }
 */
public class MethodDemo3 {
    public static void main(String[] args) {
//        isEvenNumber(10);
//        //true;

        boolean flag = isEvenNumber(10);
        //boolean flag = true;
        System.out.println(flag);

//        if(flag) {
//            System.out.println("是偶数就输出这句话");
//        }
    }

    //需求：定义一个方法，该方法接收一个参数，判断该数据是否是偶数，并返回真假值
    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
