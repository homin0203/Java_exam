package com.kh.practice.snack.controller;

import com.kh.practice.snack.model.vo.Snack;

public class SnackController {
	private Snack s = new Snack();
	
	public SnackController() {}
	
	public String saveData(String kind, String name, String flavor, int numOf, int price) {
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		
//		s = new Snack(kind, name, flavor, numOf, price);
		//위에 setter를 사용하는 방식과 생성자를 통해서 한번에 하는것의 결과는 같음
		//프로그램의 요구 방향에 따라 두가지 방식을 맞춰 쓰는 것이고, 
		//아래는 한번에 적어 넣는것이고 위에는 좀 각각의 값중 빼먹는게 있어도 괜찮다는 느낌?
		return "저장 완료되었습니다.";
	}
	
	public String confirmData() {
		return s.information();
	}
}
