package com.yj.nz.projectb.secondshop;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Menu {
    private Scanner sc = new Scanner(System.in);
    private Random r = new Random();
    //定死一个用户的文件
    private static File goodFile = new File("goods.txt");

    private static List<Good> goods = new ArrayList<Good>();
    private User user;//当前用户操作的对象

    //主界面
    protected void showMenu( User user ){
        this.user = user;

        while( true ){
            System.out.println("尊敬的用户：" + user.getUname() + ",欢迎您！");
            System.out.println("1、浏览商品");
            System.out.println("2、购买商品");
            System.out.println("3、发布商品");
            System.out.println("4、修改已发布商品");
            System.out.println("5、下架已发布商品");
            System.out.println("6、退出系统");
            System.out.println("请选择编号：");
            int choise = sc.nextInt();

            switch (choise){
                case 1:
                    showGoods();
                    break;
                case 2:
                    buy();
                    break;
                case 3:
                    add();
                    break;
                case 4:
                    update();
                    break;
                case 5:
                    del();
                    break;
                default:
                    System.exit(1);
            }
        }
    }

    //下架商品
    private void del() {

    }

    //修改商品
    private void update() {

    }

    //发布商品
    private void add() {
        System.out.println("请输入您要上架的商品名：");
        String gname = sc.next();
        System.out.println("请输入价格：");
        double price = sc.nextDouble();
        System.out.println("请输入数量：");
        int num = sc.nextInt();

        //ID也随机
        int id = r.nextInt( 999999 - 100000 + 1 ) + 1000000;

        Good g = new Good(id, gname, price, num, user.getId());
        goods.add(g);


    }

    //购买商品
    private void buy() {

    }

    //浏览商品
    private void showGoods() {
        for (int i = 0; i < goods.size(); i++) {
            System.out.println( goods.get(i).toString() );
        }
        System.out.println("\n");
    }

    static{
        try{
            if( !goodFile.exists() ){
                goodFile.createNewFile();
            }else{
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(goodFile));
                byte[] bs = new byte[bis.available()];
                bis.read(bs);
                String str = new String(bs);

                //接着，循环判断
                String[] arr = str.split(";");
                for (int i = 0; i < arr.length; i++) {
                    //判断 652148 yzw 123 0
                    String[] temp = arr[i].split("_");
                    Good g = new Good( Integer.parseInt(temp[0]), temp[1], Double.parseDouble(temp[2]),
                                                        Integer.parseInt(temp[3]), Integer.parseInt(temp[4]) );
                    //将所有的user对象，添加到list中
                    goods.add(g);
                }
                bis.close();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
