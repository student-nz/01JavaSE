package com.yj.nz.projectb.typing;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private Player player;
    private Levels ls;

    private Random r = new Random();
    private Scanner sc = new Scanner(System.in);
    private long startTime;

    public void startGame(){
        player = new Player();
        ls = new Levels();

        System.out.println("开始游戏");

        //一开始，有多少关，循环多少关
        Level[] data = ls.levels;
        for( int i = 0; i < data.length; i++){
            player.setNo( i+1 );

            //记录一下第i+1关的开始时间
            startTime = System.currentTimeMillis();

            //循环这关需要输入正确多少次
            for(int j = 0; j < data[i].getLimit(); j++){
                String out = print( data[i] );
                //用户输入
                String in = sc.next();

                //判断一下是否超时
                long endTime = System.currentTimeMillis();
                if( (endTime - startTime) > data[i].getTimes() * 1000 ){
                    System.out.println("超时了，游戏结束，您的最终得分为：" + player.getScore());
                    return;
                }

                if( result(out, in) ){
                    player.setScore( player.getScore() + data[i].getScore() );
                    System.out.println("输入正确，您的目前得分为: " + player.getScore());
                }else{
                    System.out.println("输入错误，游戏结束，您的最终得分为：" + player.getScore());
                    return;
                }
            }
            System.out.println( i == data.length - 1 ? "恭喜通关" : "恭喜过关");
            //将剩余的时间，加到分数上面去
            long endTime = System.currentTimeMillis();
            int scores = (int)((endTime - startTime) / 1000 / 5 * data[i].getScore());
            player.setScore( player.getScore() + scores );

            System.out.println("您的得分为：" + player.getScore());
        }
    }

    //系统随机输出
    public String print( Level level ){
        String str = "";

        for(int i = 0; i < level.getStrLength(); i++){
            if( r.nextDouble() <= 0.3333 ){
                str += r.nextInt(10);     //33%的概率，拼接一个0-9的数字
            }else if( r.nextDouble() <= 0.6666 ){
                //0-9,A-Z,a-z
                int num = r.nextInt(26) + 97;
                str += (char)num;
            }else{
                str += (char)(r.nextInt(26) + 65);
            }
        }

        System.out.println( str );
        return str;
    }


    public boolean result(String out, String in){
        if( out.equals(in) ){
            return true;
        }else{
            return false;
        }
    }
}
