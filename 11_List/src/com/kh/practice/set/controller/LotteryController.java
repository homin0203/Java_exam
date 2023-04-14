package com.kh.practice.set.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

import com.kh.practice.set.model.compare.SortedLottery;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryController {
	HashSet<Lottery> lottery = new HashSet<>();
	HashSet<Lottery> win = new HashSet<>();
	
	public boolean insertObject(Lottery l) {
		if(lottery.contains(l) || win.contains(l)) {
			return false;
		} else {
			lottery.add(l);
			return true;
		}
	}
	
	public boolean deleteObject(Lottery l) {
//		Iterator<Lottery> check = lottery.iterator();
//		while(check.hasNext()) {
//			Lottery l2 = check.next();
//			//.contains() 메소드로 비교하는걸로 했었는데 실행해보니 적용이 안되서 수정
//			if(l2.getName().equals(l.getName()) && l2.getPhone().equals(l.getPhone())) {
//				check.remove();
//				if(!(win.isEmpty())) {
//					Iterator<Lottery> check2 = win.iterator();
//					while(check2.hasNext()) {
//						Lottery l3 = check2.next();
//						if(l3.getName().equals(l.getName()) && l3.getPhone().equals(l.getPhone())) {
//							check2.remove();
//						}
//					}
//				}
//				return true;
//			}
//		}
		boolean check = lottery.remove(l);
		if(!win.isEmpty()) {
			win.remove(l);
		}
		return check;
		
	}	
	
	public HashSet<Lottery> winObject() {
		ArrayList<Lottery> list = new ArrayList<>(lottery);
		int i = 0;
		//초기 추첨 0으로 시작,그 이후 삭제된 당첨자에 맞춰 재추첨시에는 i값 아래 코드에서 재설정
		//인덱스를 활용해서 win에 당첨자 저장(당첨자 중복x)
		if(lottery.size() > 3) { //최소 4명이상일 때 추첨
			if(win.size() < 4) {
				switch(win.size()) {
				case 1 : i = 1; break;
				case 2 : i = 2; break;
				case 3 : i = 3; break;
				}
				while(i < 4) { //4명 추첨
					int random = (int)(Math.random() * list.size());
					//List의 들어있는 인원수(인덱스로 0~인원수-1 범위) 만큼 랜덤 추첨
					if(!(win.contains(list.get(random)))) { //이미 당첨된 사람 제외
						win.add(list.get(random));
						i++;
					}
				}
			}
		}
		return win;
	}
	
	public TreeSet<Lottery> sortedWinObject() {
		TreeSet<Lottery> treeWin = new TreeSet<Lottery>(new SortedLottery());
		//TreeSet에 매개인자로 객체를 넣으면 그 객체에 정의해놓은 정렬 기준을 사용
		treeWin.addAll(win);
		
		return treeWin;
	}
	
	public boolean searchWinner(Lottery l) {
//		Iterator<Lottery> w = win.iterator();
//		Lottery check = null;
//		while(w.hasNext()) {
//			check = w.next();
//			if(check.getName().equals(l.getName()) && check.getPhone().equals(l.getPhone())) {
//				return true;
//			}
//		}
//		return false;
		return win.contains(l);
	}
}
