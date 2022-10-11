package com.yj.nz.d3_string.stringbuffer.stringBuffer2;

public class Test3 {
    public static void main(String[] args) {
        int a=789;
        String binary = getBinary(a);
        System.out.println(binary);
        int integer = getInteger(binary);
        System.out.println(integer);
    }
    // 将1010字符串 转换为整数
    public static int getInteger(String num){
        int sum =0;
        for (int i = 0; i <num.length() ; i++) {
            char c = num.charAt(i);
            int j = Integer.parseInt(c + "");
            sum+=j*pow(2,num.length()-1-i);
        }
        return sum;
    }
    // 返回a的b次方
    public static int pow(int a,int b){
        // 3  5
        int j=1;
        for (int i = 0; i < b; i++) {
            j*=a;
        }
        return j;
    }


    // 将整数转化为1010字符串
    public static String getBinary(int num){
        StringBuilder sbd=new StringBuilder();
        while(num>0){
            int x =num%2;
            sbd.append(x);
            num/=2;
        }
        sbd.reverse();
        return sbd.toString();
    }
}
