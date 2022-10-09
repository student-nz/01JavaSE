package com.yj.nz.projectb.secondshop;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private Scanner sc = new Scanner(System.in);
    private Random r = new Random();
    //定死一个用户的文件
    private static File userFile = new File("user.txt");

    private User user;//当前操作的用户对象
    private static List<User> users = new ArrayList<User>();

    public void start(){
        System.out.println("欢迎进入二手交易平台");
        System.out.println("请选择你要操作的功能");
        System.out.println("1、登录");
        System.out.println("2、注册");
        System.out.println("3、退出");
        System.out.println("请选择编号：");

        int choise = sc.nextInt();
        if( choise == 1 ){
            user = login();
            if(user != null){
                //登录成功，进入主界面
                Menu menu = new Menu();
                menu.showMenu( user );
            }
        }else if( choise == 2 ){
            reg();
        }else{
            //强行退出系统
            System.exit(1);
        }
    }

    //主界面
    private void showMenu() {
        System.out.println("我是主界面");
    }

    private User login() {
        System.out.println("请输入您的用户名：");
        String uname = sc.next();
        System.out.println("请输入您的密码：");
        String pwd = sc.next();

        try {
            for (int i = 0; i < users.size(); i++){
                if( users.get(i).getUname().equals(uname) && users.get(i).getPwd().equals(pwd) ){
                    user = users.get(i);
                    System.out.println("登录成功");
                    return user;
                }
            }
            System.out.println("账号或者密码错误，请验证后重新登录");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private void reg() {
        //说白了，就是将我们输入的数据，存入到文件中
        System.out.println("请输入您的用户名：");
        String uname = sc.next();
        System.out.println("请输入您的密码：");
        String pwd = sc.next();
        //随机出一个ID出来     1000000 ~ 999999
        int id = r.nextInt( 999999 - 100000 + 1 ) + 1000000;

        //写入到文件中
        try {
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(userFile, true));
            //  id_name_pwd_money，金额默认设置为0
            String str = id + "_" + uname + "_" + pwd + "_0";
            bos.write(str.getBytes());
            bos.flush();
            bos.close();
            System.out.println("用户注册成功，重新登录");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("网络连接错误，请稍后重试");
        }

    }

    //我们干脆，再程序加载的时候，就直接读取出来
    static{
        try{
            if( !userFile.exists() ){
                userFile.createNewFile();
            }else{
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(userFile));
                byte[] bs = new byte[bis.available()];
                bis.read();
                String str = new String(bs);

                //接着，循环判断
                String[] arr = str.split(";");
                for (int i = 0; i < arr.length; i++) {
                    //判断 652148 yzw 123 0
                    String[] temp = arr[i].split("_");
                    User u = new User( Integer.parseInt(temp[0]), temp[1], temp[2], Double.parseDouble(temp[3]) );
                    //将所有的user对象，添加到list中
                    users.add(u);
                }
                bis.close();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
