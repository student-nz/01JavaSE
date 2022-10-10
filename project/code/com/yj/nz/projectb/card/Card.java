package com.yj.nz.projectb.card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Card {

	private List<String> flower;	//花色
	private List<String> point;		//牌面值
	private List<Integer> cards;	//0-51牌
	
	public Card(){
		flower = new ArrayList<String>();
		flower.add("♠");
		flower.add("♥");
		flower.add("♣");
		flower.add("♦");
		
		point = new ArrayList<String>();
		Collections.addAll(point, "A","2","3","4","5","6","7","8","9","9","J","Q","K");
		
		cards = new ArrayList<Integer>();
		for(int i = 0;i < 52;i++){
			cards.add(i);
		}
	}

	public List<String> getFlower() {
		return flower;
	}

	public List<String> getPoint() {
		return point;
	}

	public List<Integer> getCards() {
		return cards;
	}
	
	
	//方法
	//你给我这张牌的索引，我给你返回这张牌的具体信息
	public String getCardInfo(int index){
		//一张牌，是由花色+ 点数组成
		String str = flower.get(index / 13);
		str += point.get(index %13);
		return str;
	}
	
	//洗牌
	public void washCard(){
		Collections.shuffle(cards);
	}
	
	public static void main(String[] args) {
		
		Card c = new Card();
		//洗牌
		c.washCard();
		
		//发牌
		List<Integer> cards = c.getCards();
		for(int i = 0;i < cards.size();i++){
			int index = cards.get(i);
			System.out.println(c.getCardInfo(index));
		}
	}
	
}
