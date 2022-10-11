package com.yj.nz.projectb.io;

import java.io.File;

public class Test3 {

	public static void main(String[] args) {
		
		File f = new File("d:\\a");
		//delete可以删除文件，和文件夹
		//f.delete(); 	只能删除空的文件夹
	
	//del(f);
	
	//最后删除自己
	f.delete();
}
	//删除   给一个文件夹，直接删除这个文件夹下面的所有子文件和 子目录
	public static void del(File f ){
		//先判断是不是文件
		if(f.isFile()){
			System.out.println("删除文件；"  + f.getName());
			f.delete();
			return;			//删完之后，就不要再继续往下运行了
		}
		//是目录
		File[] fs = f.listFiles(); 		//得到当前对象下的所有的子文件
		if(fs != null && fs.length > 0 ){
			//递归思想
			for(int i = 0;i < fs.length;i++){
				del(fs[i]);
			}
		}
		//执行到这里，意味着递归执行完毕，则直接删除这个空的文件夹
		System.out.println("删除目录：" + f.getAbsolutePath());
		f.delete();
		
	}
}