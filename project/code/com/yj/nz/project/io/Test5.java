package com.yj.nz.projectb.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Test5 {

	public static void main(String[] args) throws Exception {
		//输出流									如果这个文件不存在，则自动创建，如果存在，就直接覆盖
														//追加
		OutputStream os = new FileOutputStream("a.txt",true);
		String str = "hello world";
		os.write(str.getBytes());
		os.flush();
		os.close();
	}
}
