package com.yj.nz.mota.motav2;

import com.yj.nz.mota.motav1.Monster;
import com.yj.nz.mota.motav1.Monsters;

import java.util.Scanner;

/**
 * ClassName:Game
 * Package:com.yj.nz.mota.motav2
 * Description:描述
 *
 * @Date:2022/10/15 9:22
 * @Author:NieZheng
 * @Version:1.0
 */
public class Game {
    private Hero hero = new Hero();
    private Scanner sc = new Scanner(System.in);
    private int mapIndex = 1;
    private int hindex = 136;
    private boolean isGameOver = false;
    private int hpm = 0;// 英雄上楼是否是第一次移动
    private int npm = 0;// 英雄下楼是否是第一次移动


    public void startGame(){
        System.out.println("游戏开始");
        System.out.println(hero.getName());
        showMap();
        System.out.println("请输入wasd进行上下左右移动");
        while(!isGameOver){
            String m = sc.next();
            if ( m.equals("w") ){
                move(-13);
            }else if ( m.equals("s") ){
                move(13);

            }else if ( m.equals("a") ){
                move(-1);
            }else if ( m.equals("d")){
                 move(1);
            }
        }
    }

    private void move(int hm) {
         String[] map = Maps.maps[mapIndex - 1];
         if( "x".equals( map[hindex + hm] ) ){
             // 碰到墙，原地不懂
             showMap();
             return;
         }else if ( " ".equals( map[hindex + hm] ) ){
             if ( hpm == 1 ){
             }else {
                 map[hindex] = " ";
             }
             hpMove();
            // 碰到空格，直接交换位置
             map[hindex + hm] = "h";
             hindex = hindex + hm;
             showMap();
             return;
         }else if ("i".equals(map[hindex + hm])) {
             if ( hpm == 1 ){
             }else {
                 map[hindex] = " ";
             }
             map[hindex + hm] = "h";
             //勇士的位置发生改变
             hindex = hindex + hm;
             hero.setyK(hero.getyK() + 1);
             System.out.println(hero.getName() + "捡到黄钥匙，黄钥匙 + 1");
             showMap();
         }else if("I".equals( map[hindex + hm ])){
             hpMove();
            // 如果碰到的黄色的门，看英雄是否有钥匙
             if ( hero.getyK() > 0 ){
                 if ( hpm == 1 ){
                 }else {
                     map[hindex] = " ";
                 }
                 map[hindex + hm] = "h";
                 hindex = hindex + hm;
                 hero.setyK(hero.getyK() - 1 );
                 showMap();
             }else {
                 showMap();
             }
         }else if("J".equals( map[hindex + hm])){
             hpMove();
             if ( hero.getyK() > 0 ){
                 if ( hpm == 1 ){
                 }else {
                     map[hindex] = " ";
                 }
                  map[hindex + hm] = "h";
                  hindex = hindex + hm;
                  hero.setrK(hero.getrK() - 1);
                  showMap();
             }else {
                 showMap();
             }
         }else if("K".equals( map[hindex + hm])){
             hpMove();
             // 类推
             if ( hero.getbK() > 0 ){
                 if ( hpm == 1 ){
                 }else {
                     map[hindex] = " ";
                 }
                 map[hindex + hm] = "h";
                 hindex = hindex + hm;
                 hero.setbK(hero.getbK() - 1);
                 showMap();
             }else {
                 showMap();
             }
         }else if("s".equals( map[hindex + hm])){
             hpMove();
             // 碰到商店购买属性
             System.out.println("欢迎进入魔塔商店");
             System.out.println("如果你有25个金币，你可以选择以下任何一项!");
             System.out.println("1. 增加800生命力\t2. 增加4点攻击力 \t3. 增加4点防御\t4. 离开商店");
             String choice = sc.next();
             buyAttr(Integer.parseInt(choice));
             showMap();
         }else if("p".equals( map[hindex + hm])){
             mapIndex++;
             // 英雄上楼
             if ( hpm != 1 ){
                 Maps.maps[mapIndex-1][hindex] = " ";
                 Maps.maps[mapIndex-1][hindex + hm] = "h";
                 hindex = hindex + hm;
                 hpm++;// 英雄上楼移动记录
             }

             showMap();
         }else if("n".equals( map[hindex + hm])){
             mapIndex--;
             showMap();
         }else {
             hpMove();
             //除开，墙，宝石，钥匙，门，空地，血瓶，之外，全部都是怪物了
             int index = Integer.parseInt(map[hindex + hm]);

             //打架      原数据不要动
             Monster data = Monsters.ms[index - 1];
             Monster m = new Monster(data.getName(), data.getBlood(), data.getAtt(),
                     data.getDef(), data.getGold(), data.getExp());
             boolean isFlight = fight(m);
             if (isFlight){
                 map[hindex] = " ";
                 map[hindex + hm] = "h";
                 hindex = hindex + hm;
                 showMap();
             }else {
                 // 战斗失败，游戏结束！
                 return;
             }
         }
    }

    private boolean fight(Monster m) {
        boolean isFlight = false;
        //先计算一下，伤害
        int h2m = hero.getAtt() - m.getDef();
        int m2h = m.getAtt() - hero.getDef();

        if (h2m <= 0) {
            System.out.println("砍不动怪物，被怪物乱刀砍死，游戏结束");
            isGameOver = true;
            return false;
        }
        m2h = m2h < 0 ? 0 : m2h;

        //开始打
        while (hero.getBlood() > 0 && m.getBlood() > 0) {
            //首先，勇士攻击怪物
            m.setBlood(m.getBlood() - h2m);
            if (m.getBlood() <= 0) {
                isFlight = true;
                System.out.println(hero.getName() + "战斗胜利，获得" + m.getGold() + "金币，" + m.getExp() + "经验");
                hero.setGold(hero.getGold() + m.getGold());
                hero.setExp(hero.getExp() + m.getExp());
                break;
            }
            hero.setBlood(hero.getBlood() - m2h);
            if (hero.getBlood() <= 0) {
                System.out.println("被怪物乱刀砍死，游戏结束");
                isGameOver = true;
                return false;
            }
        }
        return isFlight;
    }

    private void buyAttr(int choice) {
        if (hero.getGold() > 25) {
            switch (choice) {
                case 1:
                    System.out.println(hero.getName() + "增加前的生命力：" + hero.getBlood());
                    hero.setBlood(hero.getBlood() + 800);
                    System.out.println("增加800生命力");
                    System.out.println(hero.getName() + "增强后的生命力：" + hero.getBlood());
                    break;
                case 2:
                    System.out.println(hero.getName() + "增加前的攻击力：" + hero.getAtt());
                    hero.setAtt(hero.getAtt() + 4);
                    System.out.println("增加4点攻击力");
                    System.out.println(hero.getName() + "增加后的攻击力：" + hero.getAtt());
                    break;
                case 3:
                    System.out.println(hero.getName() + "增加前的防御力：" + hero.getDef());
                    hero.setDef(hero.getDef() + 4);
                    System.out.println("增加4点防御力");
                    System.out.println(hero.getName() + "增加后的防御力：" + hero.getDef());
                    break;
                case 4:
                    System.out.println("离开商店，咋也不购买！");
                    break;
                default: {
                    System.out.println("输入错误");
                }
            }
        } else {
            System.out.println("很遗憾，你没有足够的金币!");
        }
    }

    // 上楼移动
    public void hpMove(){
        if ( hpm == 1){ // 上楼第一次移动
            Maps.maps[mapIndex-1][hindex] = "n";
            hpm = 0;
        }
    }
    private void showMap() {
        showMonsterAttr();
        System.out.println("--------------------------");
        String[] map = Maps.maps[mapIndex-1];
        for (int i = 0; i < map.length; i++) {
            System.out.print(map[i] + " ");
            if ( (i + 1) % 13 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
    // 显示当前层级别所有怪物属性
    private void showMonsterAttr() {
        Monster[] levelMonster = new Monster[9];
        System.out.println("第" + mapIndex + "关卡怪物");
        for (int i = 0; i < Maps.maps[mapIndex - 1].length; i++) {
            if (Character.isDigit(Maps.maps[mapIndex - 1][i].toCharArray()[0])) {
                levelMonster[Integer.parseInt(Maps.maps[mapIndex - 1][i]) - 1] = Monsters.ms[Integer.parseInt(Maps.maps[mapIndex - 1][i]) - 1];
            }
        }
        for (int i = 0; i < levelMonster.length; i++) {
            if (levelMonster[i] != null) {
                System.out.println(levelMonster[i]);
            }
        }
    }
}
