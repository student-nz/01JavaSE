package com.yj.nz.projectb.mota;

import java.util.Scanner;

public class Game {
	private Scanner sc = new Scanner(System.in);
	private Hero hero = new Hero();
	private int mapIndex = 1;		//第一层
	private int hindex = 136;
	private boolean isGameOver = false;
			
	public void startGame() {
		//首先，先显示地图
		System.out.println("游戏开始");
		System.out.println( hero );
		showMap();
		
		//开始行动
		System.out.println("请输入wsad来进行操作：");
		while(!isGameOver) {
			String choice = sc.next();
			//根据不同的指令，我们应该做不同的移动
			if( "w".equals(choice) ) {
				move(-13);
			}else if( "s".equals(choice) ) {
				move(13);
			}else if( "a".equals(choice) ) {
				move(-1);
			}else if( "d".equals(choice) ) {
				move(1);
			}
		}
	}

	//控制勇士移动
	private void move(int num) {
		String[] map = Maps.maps[mapIndex-1];
		
		//移动之前的判断
		if( "x".equals( map[hindex + num] ) ) {
			//不动
			showMap();
			return;
		}else if( "a".equals( map[hindex + num] ) ) {
			//加攻击力
			hero.setAtt( hero.getAtt() + 3 );
			System.out.println("捡到红宝石，攻击力 + 3");
			System.out.println( hero );
		}else if( "i".equals( map[hindex + num] ) ) {
			hero.setYk( hero.getYk() + 1 );
			System.out.println("捡到黄钥匙，黄钥匙 + 1");
			System.out.println( hero );
		}else if( "K".equals( map[hindex + num] ) ) {
			//遇到了红色的门
			if( hero.getRk() <= 0 ) {
				//不动
				showMap();
				return;
			}
			hero.setRk( hero.getRk() - 1 );
			System.out.println( hero );
		}else if( " ".equals( map[hindex + num] ) ) {
			//空地，什么都不管
		}else {
			//除开，墙，宝石，钥匙，门，空地，血瓶，之外，全部都是怪物了
			//索引是整型  int
			//String index = map[hindex + num];
			int index = Integer.parseInt( map[hindex + num] );
			
			//打架      原数据不要动
			Monster data = Monsters.ms[index - 1];
			Monster m = new Monster(data.getName(), data.getBlood(), data.getAtt(),
					data.getDef(), data.getGold(), data.getExp());
			fight( m );
			System.out.println( hero );
		}
		
		
		//首先，勇士原先的位置，应该变成：空地
		
		map[hindex] = " ";
		//移动之后的位置，变成勇士
		map[hindex + num] = "h";
		//勇士的位置发生改变
		hindex += num;
		
		//重新显示地图
		showMap();
	}

	//打架，你打我，我打你
	private void fight(Monster m) {
		//先计算一下，伤害
		int h2m = hero.getAtt() - m.getDef();
		int m2h = m.getAtt() - hero.getDef();
		
		if( h2m <= 0 ) {
			System.out.println("砍不动怪物，被怪物乱刀砍死，游戏结束");
			isGameOver = true;
			return;
		}
		m2h = m2h < 0 ? 0 : m2h;
		
		//开始打
		while( hero.getBlood() > 0  &&  m.getBlood() > 0 ) {
			//首先，勇士攻击怪物
			m.setBlood(  m.getBlood() - h2m  );
			if( m.getBlood() <= 0 ) {
				System.out.println("战斗胜利，获得"+m.getGold()+"金币，"+m.getExp()+"经验");
				hero.setGold( hero.getGold() + m.getGold() );
				hero.setExp( hero.getExp() + m.getExp() );
				break;
			}
			hero.setBlood( hero.getBlood() - m2h );
			if( hero.getBlood() <= 0 ) {
				System.out.println("被怪物乱刀砍死，游戏结束");
				break;
			}
		}
		
		
	}

	private void showMap() {
		//先得到这一层地图的数组
		String[] map = Maps.maps[mapIndex-1];		//静态变量，直接调用
		//循环显示
		for(int i = 0; i < map.length; i++) {
			System.out.print( map[i] + " " );
			//什么时候换行？
			if( (i + 1) % 13 == 0 ) {
				System.out.println();
			}
		}
		System.out.println();
	}
}
