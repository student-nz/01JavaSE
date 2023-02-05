package com.yj.nz.projectb.cmd;

import java.io.*;

public class help {
    public static void main(String[] args) {
        //尝试一次读取完毕      当文件大的时候（2G），这种写法就有问题
        try {
            InputStream is = new FileInputStream( new File("help.txt") );
            //先定义一个数组，来读取
            byte[] bs = new byte[is.available()];   //当这个文件的大小超过2G，就会出问题
            is.read(bs);        //注意，如果你输出的是空的，但是你保证你的文件里面是有内容的，并且保存了的，那不想要了，你必定没写这个bs

            //转换
            String str = new String(bs);
            System.out.println(str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
