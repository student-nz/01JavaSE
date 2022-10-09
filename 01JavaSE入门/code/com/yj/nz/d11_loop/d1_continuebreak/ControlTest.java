package com.yj.nz.d11_loop.d1_continuebreak;

/*
    需求：小芳的妈妈每天给她2.5元钱，她都会存起来，但是，每当这一天是存钱的第5天或者5的倍数的话，她都会花去6元钱，请问，经过多少天，小芳才可以存到100元钱。
*/
public class ControlTest {
    public static void main(String[] args) {
        //小芳的妈妈每天给她2.5元钱
        double dayMoney = 2.5;

        //她都会存起来，涉及到了求和思想，定义求和变量，初始化值为0
        double sumMoney = 0;

        //存到100元钱
        int result = 100;

        //定义一个统计变量，用来纪录存钱的天数，初始化值为1
        int dayCount = 1;

        //因为不知道要多少天才能够存到100元，所以，这里我们采用死循环来实现，当存到100元的时候，通过break跳转语句让循环结束
        while (true) {
            //存钱
            sumMoney += dayMoney;

            //判断存的钱是否大于等于100了，如果是，就退出循环
            if(sumMoney >= result) {
                break;
            }

            //每当这一天是存钱的第5天或者5的倍数的话，她都会花去6元钱
            if(dayCount%5 == 0) {
                sumMoney -= 6;
                System.out.println("第" + dayCount + "天花了6元");
            }

            dayCount++;
        }

        //输出统计天数的变量
        System.out.println("共花了" + dayCount + "天存了100元");
    }
}
