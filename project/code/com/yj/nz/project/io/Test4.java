package com.yj.nz.projectb.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Test4 {

	public static void main(String[] args) throws Exception {
		
		//字节输入流：InputStream
		InputStream is = new FileInputStream("a.txt");
//		System.out.println(is.available()); 	//在没有读取之前，大小就等于文件大小
//		int result = is.read();
//		System.out.println(result);
//		
//		byte[] bs = new byte[is.available()];
//		is.read(bs);
//		//转换为字符串
//		String str = new String(bs);
//		System.out.println(str);
		
		//上面的写法，一次性，最多只能读2GB的内容
		//解决，读多次
		byte[] bs = new byte[3000];
		int length = -1;
		String str = "";
		while((length = is.read(bs)) != -1){
			//没读完，继续读
			str += new String(bs,0,length);
			
		}
		System.out.println(str);
		String xxx = "helloworld";
		System.out.println(xxx.equals(str));
	}
}
