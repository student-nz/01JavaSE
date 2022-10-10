package com.yj.nz.projectb.card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		Card c = new Card();	//先买一副牌
		c.washCard();	//洗牌
		List<Integer> cards = c.getCards();		//得到这一副牌
		//决定那几个人玩
		Player p1 = new Player("张三",c);
		Player p2 = new Player("李四",c);
		Player p3 = new Player("王二",c);
		Player p4 = new Player("麻子",c);
		
		//一个个发，太麻烦
		List<Player> players = new ArrayList<Player>();
		Collections.addAll(players,p1,p2,p3,p4);
		
		Game g = new Game(players,c);
		g.startGame();
		
	}
}
//TODO:
//1.这个游戏，不太公平。如果分数相同，那么第一个玩家是赢的，因为，来斗地主。我们在几个玩家当中，随机一个地主处理
//随机出来之后，比大小，就是以地主为准
//如果地主炸了，那么，其他玩家，除开炸了的之外，都赢
//如果地主没炸，那么，就算相同的点数，也是地主赢



//2.为玩家增加一个属性：money
//每个玩家，默认1000块钱，每次玩游戏，低金200
//如果输了，则将输的玩家的钱，给200给赢的玩家
//这个游戏，一直玩，直到其他玩家没钱为止
//并且，如果一个玩家没钱了，则移除游戏