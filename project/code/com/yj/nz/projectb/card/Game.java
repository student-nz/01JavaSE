package com.yj.nz.projectb.card;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

	private List<Player> players;	//所有的玩家
	private Card card;	//一副牌
	private List<Boolean> bls;	//玩家要牌的状态
	
	public Game(List<Player> players, Card card){
		this.card = card;
		this.players = players;
		
		bls = new ArrayList<Boolean>();
		for(int i = 0;i < players.size();i++){
			bls.add(true);	//先默认为true，代表所有的玩家，都可以叫牌
			
			
		}
	}
	//开始游戏
	public void startGame(){
		//首先，先得到洗好的牌
		List<Integer> cards = card.getCards();
		int index = 0;	//发牌的索引
		
		//每个玩家，发两张牌
		for(int i  = 0 ;i < 2 ;i++){
			for(Player p : players){
				p.needCard(cards.get(index++));
				
			}
		}
		
		//首先，展示手牌
		for(Player p : players){
			p.showCard();
		}
		//然后，逐个询问玩家是否要牌
		Scanner sc = new Scanner(System.in);
		String flag = "";
		Player p ;
		
		do{
			for(int i = 0;i < players.size();i++){
				//先判断一下，这个玩家，还能不能要牌
				if(bls.get(i)){
					p = players.get(i);
					p.showCard();
					
					System.out.println("玩家:" + p.getName() + "是否要牌？");
					flag = sc.next();
					
					if("y".equalsIgnoreCase(flag)){
						//发一张牌
						p.needCard( cards.get( index++));
						p.showCard();
						//判断，有没有超过21点
						if(p.getPlayerPoint() > 21){
							System.out.println("对不起，你已经炸了");
							bls.set(i, false);
							continue;
						}
					}else{
						bls.set(i, false);	//不要牌了，就设置为false
						
					}
				}
			}
		}while(bls.contains(true));
		
		
		//所有的玩家都不要牌了，则判断结果
		result();
	}
	private void result() {
		Player player = null;
		int max = 0;
		for(Player p : players){
			p.showCard();
			if(p.getPlayerPoint() >21){
				continue;
			}
			if(p.getPlayerPoint() > max){
				player = p;
				max = p.getPlayerPoint();
			}
		}
		System.out.println("赢家为：" + player.getName() + ",点数为：" + max);
	}
	
}
