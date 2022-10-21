package com.yj.nz.pracitice;

import java.util.Random;
import java.util.Scanner;

public class Link {
    // 全局变量
    public static int row = 10;		// 定义了一个全局的静态变量
    public static int col = 8;

    // 定义游戏的二维数组
    // 1、首先，第一步，二维数组是行和列的排列的最有体现，因此，我们这个游戏区域，就可以用二维数组
    // 注意：10行，8列
    public static int[][] map = new int[row][col];

    public static Random r = new Random();
    public static Scanner sc = new Scanner(System.in);

    // 游戏结束的变量
    public static boolean isGameOver = false;

    // 消除的次数
    public static int count = 0;
    // 开始时间
    public static long startTime = System.currentTimeMillis();
    // 游戏时间为60s
    public static int time = 60;

    public static void main(String[] args){
        // int a = 10;		// 局部变量，只能在main方法里面访问

        // 2、二维数组出来之后，要随机赋值 1~9的数字
        // 注意：为了保证游戏能过顺利结束，我们的随机的数字，必须保证偶数个
        for(int i =0; i < map.length; i++){
            for(int j = 0; j < map[i].length; j += 2){
                int temp = r.nextInt(9) + 1;
                map[i][j] = temp;
                map[i][j+1] = temp;

            }
        }

        // 3、数字随机出来之后，打乱顺序
        for(int i = 0; i < row * col; i++){
            // 随机交换两个值的位置
            // 在数组里面随机取值，应该随机的是索引
            int x1 = r.nextInt(row);
            int y1 = r.nextInt(col);

            int x2 = r.nextInt(row);
            int y2 = r.nextInt(col);

            // 开始交换
            int temp = map[x1][y1];
            map[x1][y1] = map[x2][y2];
            map[x2][y2] = temp;
        }

        // 定义一个方法，用来显示游戏
        show();

        System.out.println("游戏开始");

        // 用户一直来输入
        while( !isGameOver){
            System.out.println("请输入您要消除的两个点的坐标：");
            int x1 = sc.nextInt() - 1; // 索引从0开始，所以要减1
            int y1 = sc.nextInt() - 1;
            int x2 = sc.nextInt() - 1;
            int y2 = sc.nextInt() - 1;

            // 接着，判断能不能消除
            if ( x1 == x2 && y1 == y2){
                System.out.println("同一个点，不能消除");
            }else if( map[x1][y1] != map[x2][y2] ){
                System.out.println("两个点的值不一致，不能消除");
                // 开始判断游戏的消除逻辑了
            }else if( oneLine(x1,y1,x2,y2) || twoLine(x1,y1,x2,y2) || threeLine(x1,y1,x2,y2)){
                // System.out.println("可以消除");
                // 还没有学线程，因此，做不了实时判断，只能消除的时候判断
                long endTime = System.currentTimeMillis();
                // 判断有没有超时
                if( endTime - startTime >= time * 1000){
                    System.out.println("游戏超时");
                    isGameOver = true;
                    break;
                }
                // 消失掉
                map[x1][y1] = 0;
                map[x2][y2] = 0;
                // 消除奖励时间
                time++;

                // 消除一次加一次
                count++;
                if( count == row * col / 2){
                    System.out.println("恭喜过关");
                    isGameOver = true;
                }
            }else{
                System.out.println("规则不符，不能消除");
            }

            // 重新展示游戏区域
            show();
        }
    }


    // 单线消除
    public static boolean oneLine(int x1, int y1, int x2, int y2){
        int min = 0;
        int max = 0;
        if(x1 == x2){
            min = y1 > y2 ? y2 : y1;
            max = y1 > y2 ? y1 : y2;

            // 同行		不能直接从y1循环到y2，应该是从小的循环到大的
            for(int i = min + 1; i < max; i++){
                // 判断，里面的值，有没有不等于0的
                if( map[x1][i] != 0){
                    // 意味着不能通过，单线消除这边不行
                    return false; // return的特点：这个方法，会直接结束，不会再继续往下运行了
                }
            }
            return true;
        }else if(y1 == y2){
            min = x1 > x2 ? x2 : x1;
            max = x1 > x2 ? x1 : x2;

            // 同列
            for(int i = min + 1; i < max; i++){
                if( map[i][y1] != 0){
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    // 双线消除
    public static boolean twoLine(int x1, int y1, int x2, int y2){
        // 先定义两个转折点
        int zx1 = x1;
        int zy1 = y2;

        int zx2 = x2;
        int zy2 = y1;

        // 双线消除，转换为a-z的单线，z-b的单线
        if( map[zx1][zy1] == 0 && oneLine(x1,y1,zx1,zy1) && oneLine(zx1,zy1,x2,y2)){
            return true;
        }
        if( map[zx2][zy2] == 0 && oneLine(x1,y1,zx2,zy2) && oneLine(zx2,zy2,x2,y2)){
            return true;
        }
        return false;
    }

    // 三线消除
    public static boolean threeLine(int x1, int y1, int x2, int y2){
        // 三线消除，与点A的同行/同列，都有可能是我们的转折点
        int zx1 = x1;
        int zy1 = 0;
        for(int i =0; i < col; i++){
            zy1 = i;
            // a-z的单线，z-b的双线
            if(map[zx1][zy1] == 0 && oneLine(x1,y1,zx1,zy1) && twoLine(zx1,zy1,x2,y2)){
                return true;
            }
        }

        // 同列循环行
        int zx2 = 0;
        int zy2 = y1;
        for(int i =0; i < row; i++){
            zx2 = i;
            if(map[zx2][zy2] == 0 && oneLine(x1,y1,zx2,zy2) && twoLine(zx2,zy2,x2,y2)){
                return true;
            }
        }
        return false;
    }

    // 定义方法
    public static void show(){
        for(int[] arr : map){
            for(int num : arr){
                if( num == 0){
                    System.out.print("*" + " ");
                }else{
                    System.out.print(num + " ");
                }
            }

            System.out.println();
        }
    }

}
