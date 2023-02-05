package com.yj.nz.projectb.io;

import java.io.File;

public class Test2 {

	public static void main(String[] args) {
		
		File[] fs = File.listRoots();//得到根，也就是盘符
		for(int i = 0;i < fs.length;i++){
			//盘符没有名字
			System.out.println(fs[i].getPath()); 	//返回盘符
			System.out.println(toSize(fs[i].getTotalSpace()));//返回文件所在盘的大小getTotalSpace()单位Byte
		}
	}
	public static String toSize(long size){
		double num = 0;
		if(size < 1024){
			return size + "B";
			
		}else if(size < 1024 * 1024){
			num = size * 1.0 /1024;
			return (int)(num * 100) /100.0 + "KB";
		}else if(size < 1024 * 1024* 1024){
			num = size / 1024 / 1024;
			return (int)(num * 100) / 100.0 + "MB";
		}else if(size < 1024 * 1024 * 1024 * 1024L){
			num = size * 1.0 / 1024 / 1024 / 1024;
			return  (int)(num * 100) /100.0 + "GB";
		}else{
			num = size * 1.0 / 1024 / 1024 / 1024 / 1024;
			return  (int)(num * 100) / 100.0 + "TB";
		}
	}
}
