package com.yj.nz.projecta;

import java.util.Random;
import java.util.Scanner;


public class Mine {
    //先定义一些全局变量
    public static int[][] map;
    public static int row;
    public static int col;
    public static int mineCount;
    public static boolean isGameOver = false;

    //随机数和用户输入
    public static Random r = new Random();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        //首先，先提示用户选择游戏难度
        System.out.println("欢迎进入简易版扫雷，请选择您的游戏难度：1、简单		2、普通		3、困难");
        //根据用户的选择，确定游戏的数据
        int choise = sc.nextInt();
        if(choise == 1){
            row = 9;
            col = 9;
            mineCount = 10;
        }else if(choise == 2){
            row = 16;
            col = 16;
            mineCount = 99;
        }else{
            row = 16;
            col = 30;
            mineCount = 99;
        }

        //创建游戏区域
        map = new int[row][col];

        //埋雷
        burnMine();

        //游戏开始之前，整个游戏区域应该先遮住
        for( int i=0; i < map.length; i++){
            for(int j=0; j < map[i].length; j++){
                map[i][j] = map[i][j] | 0b0000110;
            }
        }

        //然后，开始游戏，用户翻开一块区域
        while( !isGameOver ){
            //显示地图
            show();

            System.out.println("请输入您要翻开的位置");
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;

            //打开		0bxxxx11x -> 0bxxxx00x
            map[x][y] = map[x][y] & 0b1111001;

            int i,j;
            //1、雷，游戏结束
            if( (map[x][y] & 0b0000001) == 0b1){
                isGameOver = true;
                System.out.println("你炸了，游戏结束");
                for( i = 0; i < map.length; i++){
                    for( j = 0; j < map[i].length; j++){
                        map[i][j] = map[i][j] & 0b1111001;
                    }
                }
                show();
                break;
            }else if( (map[x][y]>>3) == 0){
                //3、如果是空格，则打开这个位置周围的8个方位，如果打开的还是空格则延续
                open(x,y);
            }
            //2、如果是数字，则翻开数字
        }


    }

    public static void open( int x, int y){
        if( x-1 >= 0){
            openZone(x-1, y);//正上方
            if( y-1 >= 0){
                openZone(x-1, y-1);//左上方
            }
            if( y+1 < col){
                openZone(x-1, y+1);	//右上方
            }
        }
        if( x+1 < row){
            openZone(x+1, y);//正下方
            if( y-1 >= 0){
                openZone(x+1, y-1);//左下方
            }
            if( y+1 < col){
                openZone(x, y+1);//右下方
            }
        }
        if( y-1 >= 0){
            openZone(x, y-1);				//正左
        }
        if( y+1 < col){
            openZone(x, y+1);				//正右
        }
    }

    //打开周围8个方向
    public static void openZone(int x, int y){
        //最后一个数字，如果是0，代表不是雷，如果是1，则代表是雷
        //0bxxxxxx0：不是雷，0bxxxxxx1：是雷
        //接着两个数字，来代表，是打开的00，还是插旗01，还是遮盖11
        //0bxxxx00x：打开，0bxxxx01x：插旗，0bxxxx11x：遮盖
        //最后四个数字代表真正的数字
        //0b0000xxx：为0，以此类推
        if( (map[x][y] & 0b0000001) == 0b1 || (map[x][y] & 0b0000110) == 0b0){
            //扩展到雷和已经打开的就return
            return;
        }
        map[x][y] = map[x][y] & 0b1111001;
        if( (map[x][y] >> 3) == 0){
            open(x,y);
        }
    }

    public static void burnMine(){
        //开始随机埋雷：类的位置不能重复
        for(int i=0; i<mineCount; i++){
            int x = r.nextInt(row);
            int y = r.nextInt(col);
            if( map[x][y] == 9){
                i--;
                continue;
            }
            map[x][y] = 9;		//暂且认为9是雷

            //雷的四周的值，要发生变化	!!!注意不能超出边界
            //判断上方
            if( x-1 >= 0){
                //正上方
                map[x-1][y] = map[x-1][y] + 0b0001000;	//数字位+1
                if( y-1 >= 0){
                    //左上方
                    map[x-1][y-1] = map[x-1][y-1] + 0b0001000;
                }
                if( y+1 < col){
                    //右上方
                    map[x-1][y+1] = map[x-1][y+1] + 0b0001000;
                }
            }
            if( x+1 < row){
                map[x+1][y] = map[x+1][y] + 0b0001000;			//正下方
                if( y-1 >= 0){
                    map[x+1][y-1] = map[x+1][y-1] + 0b0001000;				//左上方
                }
                if( y+1 < col){
                    map[x+1][y+1] = map[x+1][y+1] + 0b0001000;				//右上方
                }
            }
            if( y-1 >= 0){
                map[x][y-1] = map[x][y-1] + 0b0001000;				//正左
            }
            if( y+1 < col){
                map[x][y+1] = map[x][y+1] + 0b0001000;				//正右
            }
        }
    }


    //展示地图
    public static void show(){
        for( int i=0; i < map.length; i++){
            for( int j=0; j < map[i].length; j++){
                //判断输出
                if( (map[i][j] & 0b0000110 ) == 0b0000110 ){
                    System.out.print("*" + " ");
                }else if( (map[i][j] & 0b0000001) == 0b1){
                    System.out.print("M" + " ");
                }else{
                    System.out.print((map[i][j]>>3) + " ");
                }
            }
            System.out.println();
        }
    }

}
