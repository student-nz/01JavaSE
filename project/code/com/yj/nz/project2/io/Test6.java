package com.yj.nz.projectb.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Test6 {

	public static Scanner sc = new Scanner(System.in);
	public static String fileName = "a.txt";

	public static void main(String[] args) {

		System.out.println("请输入您的操作");
		System.out.println("1.登录");
		System.out.println("2.注册");
		int choice = sc.nextInt();
		try {
			if(choice == 1){

				login();

			}else{

				reg();

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//注册
	private static void reg() throws Exception{
		System.out.println("请输入您要注册的账号：");
		String account = sc.next();
		System.out.println("请输入您要注册的密码：");
		String pwd = sc.next();
		System.out.println("请再次输入您的密码：");
		String rePwd = sc.next();

		if(!pwd.equals(rePwd)){
			System.out.println("两次密码不一致，请重新输入");
			reg();
		}else{
			//存数据
			OutputStream os = new FileOutputStream(fileName,true);
			//使用特殊字符进行分割
			String str = account + "_" + pwd + ";";
			os.write(str.getBytes());
			os.flush();
			os.close();

			System.out.println("注册成功");

		}
	}
	private static void login() throws Exception{
		System.out.println("请输入您的账号：");
		String account = sc.next();
		System.out.println("请输入您的密码：");
		String pwd = sc.next();

		//先从文件里面读取账号，然后循环对比
		InputStream is = new FileInputStream(fileName);
		byte[] bs = new byte[is.available()];
		is.read();
		is.close();
		String users = new String(bs);

		boolean flag = false;

		//先进行账号信息分割
		String[] us = users.split(";");
		for(String s : us){
			//继续分割，账号和密码
			if(account.equals(s.split("_")[0]) && pwd.equals(s.split("_")[1])){
				flag = true;
				System.out.println("登录成功");
				break;
			}
		}
		if(!flag){
			System.out.println("登录失败");
		}
	}
}
