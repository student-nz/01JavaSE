package com.yj.nz.projectb.cmd;

import java.io.*;
import java.util.Scanner;

public class Cmd {
    public String path;

    public static void main(String[] args) {
        Cmd c = new Cmd();
        c.showCopy();
        c.showRoot();

        //用户输入了
        Scanner sc = new Scanner(System.in);
        while( true ){
            c.show();

            String op = sc.nextLine();

            //开始判断输入的指令
            c.operate( op );
        }
    }


    //主要的方法就在这里
    //"help".equals(op)     如果op是空，不报错
    //op.equals("help")     如果op为空，会报错
    private void operate( String op ) {
        if( "help".equals(op) ){
            helpOp();
        }else if( op.endsWith(":") ){
            //切换之前，先判断一下
            File f = new File(op);
            if( f.exists() ){
                path = op.toUpperCase() + "\\";
                return;
            }
            System.out.println("系统找不到指定的驱动器。");
        }else if( op.startsWith("cd") ){
            cdOp(op);
        }else if( op.startsWith("copy") ){
            copyOp(op);
        }else{
            System.out.println( op + "不是内部或外部指令，也不是可执行的批处理文件" );
        }
    }

    private void copyOp( String op ) {
        try {
            //copy a.txt b.txt
            String cFile = op.split(" ")[1];    //截取a.txt
            String rFile = op.split(" ")[2];    //截取b.txt
            //各种判断
            File cf;
            File rf;
            if( cFile.indexOf(":") == -1 ){     //没有：   c:\\a.txt   当前目录下的文件夹
                cf = new File( path, cFile );   //当前目录下面的文件
            }else{      //有冒号，其他盘符
                cf = new File(cFile);
            }

            if( rFile.indexOf(":") == -1 ){
                rf = new File( path, rFile );
            }else{
                rf = new File( rFile );
            }

            if( !cf.exists() ){
                System.out.println("系统找不到指定的文件！");
                return;
            }

            //万事具备，开始复制
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(cf));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(rf));

            byte[] bs = new byte[bis.available()];
            bis.read(bs);
            bos.write(bs);
            bos.flush();

            bis.close();
            bos.close();

            System.out.println("复制成功");
//            cf.delete();  剪切ctrl + x

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }


    }

    //切换文件夹
    private void cdOp(String op) {
        if( op.split(" ").length <= 1 ){
            return;
        }

        //String str = op.split(" ")[1];
        String str = op.substring(3);       //cd a，跳过”cd “查看后面的内容
        //开始判断
        if( ".".equals(str) ){
            System.out.println("dddddddddddddd");
            System.out.println( path );
            return;
        }else if( "..".equals(str) ){
            //先看一下，这个文件存在不存在
            File f = new File(path);
            String father = f.getParent();
            if( father == null || "".equals(father) ){
                return;
            }
            path = father;
        }else{
            //也是先看看，这个文件存在不存在
            File f = new File(path, str);
            if( f.exists() ){
                path = f.getAbsolutePath();
            }else{
                System.out.println("系统找不到指定的路径");
            }
        }
    }

    //读入帮助文档 "help.txt" 并打印在控制台
    private void helpOp() {
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("help.txt"));
            byte[] bs = new byte[bis.available()];      //在明确的知道这个文件的大小，不会超过2个G时，这个方法最简单
            bis.read(bs);
            String str = new String(bs);
            System.out.println( str );
            bis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //显示当前所在目录位置
    private void show() {
        System.out.print("\n" + path + ">");
    }

    //显示根目录
    private void showRoot(){
        //首先，先显示根目录
        File[] fs = File.listRoots();
        path = fs[0].getAbsolutePath();

        for (File f : fs) {
            System.out.println( f.getAbsolutePath() + "\t" );
        }

        System.out.println();
    }

    //显示版权
    private void showCopy() {
        System.out.println("简化版cmd，版权所有：yc114");
    }
}
