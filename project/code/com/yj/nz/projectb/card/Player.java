package com.yj.nz.projectb.card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Player {

	private String name;	//名字
	private List<Integer> playerCard;	//玩家的手牌
	private int playerPoint; 	//玩家的点数
	private Card card;	//牌
	
	public Player(String name, Card card){
		this.name = name;
		this.card = card;
		playerCard = new ArrayList<Integer>();
		playerPoint = 0;
	}

	public String getName() {
		return name;
	}

	public List<Integer> getPlayerCard() {
		return playerCard;
	}

	public int getPlayerPoint() {
		return playerPoint;
	}
	
	
	//方法
	//要牌，发牌
	public void needCard(Integer card){
		//首先，先存起来
		playerCard.add(card);
		
		//计算点数
		//A - 10分别就是1-10点 J Q K三个花色，分别是10点
		int num = card % 13 + 1;
		if(num > 10){
			playerPoint += 10;
		}else{
			playerPoint += num;
			
		}
		
	}
	
	//展示玩家的手牌
	public void showCard(){
		System.out.print("\n" + name + "的手牌为：");
		for(Integer i : playerCard){
			System.out.print(card.getCardInfo(i) + "\t");
			
		}
		System.out.println("当前的点数为：" + this.playerPoint);
	}
	public static void main(String[] args) {
		Card c = new Card();	//先买一副牌
		c.washCard();	 //洗牌
		List<Integer> cards = c.getCards();
		//先决定那几个人玩
		Player p1 = new Player("张三",c);
		Player p2 = new Player("李四",c);
		Player p3 = new Player("王二",c);
		Player p4 = new Player("麻子",c);
		
		List<Player>players = new ArrayList<Player>();
		Collections.addAll(players,p1,p2,p3,p4);
		
		//每个玩家，发5张牌
		int index = 0;
		for(int i = 0; i < 5;i++){
			for(Player p : players){
				p.needCard( cards.get( index++));
				
			}
		}
		//查看结果
		for(Player p : players){
			p.showCard();
		}
	}
}
