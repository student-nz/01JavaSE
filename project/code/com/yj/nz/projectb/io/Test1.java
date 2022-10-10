package com.yj.nz.projectb.io;

import java.io.File;
import java.io.IOException;

public class Test1 {

	public static void main(String[] args) throws IOException {
		
		File f1 = new File("a.txt");	//相对路径  ，默认是当前项目的路径
		File f2 = new File("d:\\a.txt");	//绝对路径：带盘符
		//创建文件
		if(f1.exists()){	//判断文件是否存在
			f1.delete();	//删除文件
			
		}
		f1.createNewFile();		//文件不存在，则创建；存在，则不管
		f2.createNewFile();
		
		//File不单指文件，还指目录
		File f3 = new File("abc");//不带后缀名则文文件夹
		f3.mkdir();		//创建文件夹
		
		File f4 = new File("a\\b\\c");		//注意：双斜杆
		f4.mkdirs();//一次性创建多级目录
		
		System.out.println(f3.getAbsolutePath());//返回相对路径
		
		System.out.println(f3.isFile());//判断是否是文件
		System.out.println(f3.isDirectory());//判断是否是目录
		
		
		//获取父级目录
		System.out.println(f2.getParent());
		
	}
	
}
