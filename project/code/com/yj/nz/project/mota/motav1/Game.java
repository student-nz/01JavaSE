package com.yj.nz.mota.motav1;

import java.util.Scanner;

public class Game {
    private Scanner sc = new Scanner(System.in);
    private Hero hero = new Hero();
    private int mapIndex = 1;        //第一层
    private int hindex = 136;
    private int pindex = -1;        // 记录上楼位置
    private boolean isGameOver = false;
    private int fistMove = 1;

    public void startGame() {
        //首先，先显示地图
        System.out.println("游戏开始");
        System.out.println(hero);
        showMap();

        //开始行动
        System.out.println("请输入wsad来进行操作：");
        while (!isGameOver) {
            String choice = sc.next();
            //根据不同的指令，我们应该做不同的移动
            if ("w".equals(choice)) {
                move(-13);
            } else if ("s".equals(choice)) {
                move(13);
            } else if ("a".equals(choice)) {
                move(-1);
            } else if ("d".equals(choice)) {
                move(1);
            }
        }
    }

    //控制勇士移动
    private void move(int num) {
        String[] map = Maps.maps[mapIndex - 1];

        //移动之前的判断
        if ("x".equals(map[hindex + num])) {
            //不动
            showMap();
            return;
        } else if ("a".equals(map[hindex + num])) {
            //加攻击力
            hero.setAtt(hero.getAtt() + 3);
            System.out.println("捡到红宝石，攻击力 + 3");
            System.out.println(hero);
        } else if ("i".equals(map[hindex + num])) {
            hero.setYk(hero.getYk() + 1);
            map[hindex] = " ";
            //移动之后的位置，变成勇士
            map[hindex + num] = "h";
            //勇士的位置发生改变
            hindex += num;
            System.out.println("捡到黄钥匙，黄钥匙 + 1");
            System.out.println(hero);
        } else if("k".equals(map[hindex + num])){
            hero.setRk(hero.getRk() + 1);
            System.out.println("捡到红钥匙，红钥匙 + 1");
            map[hindex] = " ";
            //移动之后的位置，变成勇士
            map[hindex + num] = "h";
            //勇士的位置发生改变
            hindex += num;
            System.out.println(hero);
        } else if ("K".equals(map[hindex + num])) {
            //遇到了红色的门
            if (hero.getRk() <= 0) {
                //不动
                showMap();
                return;
            }
            map[hindex] = " ";
            //移动之后的位置，变成勇士
            map[hindex + num] = "h";
            //勇士的位置发生改变
            hindex += num;
            hero.setRk(hero.getRk() - 1);
            System.out.println(hero);
        } else if (" ".equals(map[hindex + num])) {
            map[hindex] = " ";
            //移动之后的位置，变成勇士
            map[hindex + num] = "h";
            //勇士的位置发生改变
            hindex += num;
        } else if ("s".equals(map[hindex + num])) {
            System.out.println("欢迎进入小商店");
            System.out.println("如果你有25个金币，你可以选择以下任何一项!");
            System.out.println("1. 增加800生命力\t2. 增加4点攻击力 \t3. 增加4点防御\t4. 离开商店");
            int choiceBuy = sc.nextInt();
            buyAttr(choiceBuy);
        } else if ("p".equals(map[hindex + num])) {
            mapIndex++;
            pindex = hindex + num;
        }else {
            //除开，墙，宝石，钥匙，门，空地，血瓶，之外，全部都是怪物了
            //索引是整型  int
            //String index = map[hindex + num];
            int index = Integer.parseInt(map[hindex + num]);

            //打架      原数据不要动
            Monster data = Monsters.ms[index - 1];
            Monster m = new Monster(data.getName(), data.getBlood(), data.getAtt(),
                    data.getDef(), data.getGold(), data.getExp());
            fight(m);
            System.out.println(hero);
        }

        //首先，勇士原先的位置，应该变成：空地

        //重新显示地图
        showMap();
    }

    private void buyAttr(int choiceBuy) {
        if (hero.getGold() > 25) {
            switch (choiceBuy) {
                case 1:
                    hero.setDef(hero.getBlood() + 800);
                    System.out.println("增加800生命力");
                    break;
                case 2:
                    hero.setBlood(hero.getAtt() + 4);
                    System.out.println("增加4点攻击");
                    break;
                case 3:
                    hero.setDef(hero.getDef() + 800);
                    System.out.println("增加4点防御");
                    break;
                case 4:
                    System.out.println("离开商店");
                    break;
                default: {
                    System.out.println("输入错误");
                }
            }
        } else {
            System.out.println("很遗憾，你没有足够的金币!");
        }
    }


    //打架，你打我，我打你
    private void fight(Monster m) {
        //先计算一下，伤害
        int h2m = hero.getAtt() - m.getDef();
        int m2h = m.getAtt() - hero.getDef();

        if (h2m <= 0) {
            System.out.println("砍不动怪物，被怪物乱刀砍死，游戏结束");
            isGameOver = true;
            return;
        }
        m2h = m2h < 0 ? 0 : m2h;

        //开始打
        while (hero.getBlood() > 0 && m.getBlood() > 0) {
            //首先，勇士攻击怪物
            m.setBlood(m.getBlood() - h2m);
            if (m.getBlood() <= 0) {
                System.out.println("战斗胜利，获得" + m.getGold() + "金币，" + m.getExp() + "经验");
                hero.setGold(hero.getGold() + m.getGold());
                hero.setExp(hero.getExp() + m.getExp());
                break;
            }
            hero.setBlood(hero.getBlood() - m2h);
            if (hero.getBlood() <= 0) {
                System.out.println("被怪物乱刀砍死，游戏结束");
                break;
            }
        }


    }

    private void showMap() {
        showMonsterAttr();
        //先得到这一层地图的数组
        String[] map = Maps.maps[mapIndex - 1];        //静态变量，直接调用
            //循环显示
            for (int i = 0; i < map.length; i++) {
                if (pindex == i) {
                    map[pindex] = "h";
                    hindex = pindex;
                    pindex = -1;
                }
                System.out.print(map[i] + " ");
                //什么时候换行？
                if ((i + 1) % 13 == 0) {
                    System.out.println();
                }
            }
        System.out.println();
    }

    // 显示所有怪物
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
