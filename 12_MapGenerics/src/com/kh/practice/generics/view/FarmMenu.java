package com.kh.practice.generics.view;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import com.kh.practice.generics.controller.FarmController;
import com.kh.practice.generics.model.vo.Farm;
import com.kh.practice.generics.model.vo.Fruit;
import com.kh.practice.generics.model.vo.Nut;
import com.kh.practice.generics.model.vo.Vegetable;

public class FarmMenu {
	private Scanner sc = new Scanner(System.in);
	private FarmController fc = new FarmController();
	
	public void mainMenu() {
		System.out.println("========== KH 마트 ==========");
		while(true) {
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 직원메뉴");
			System.out.println("2. 손님 메뉴");
			System.out.println("9. 종료");
			System.out.println();
			System.out.print("메뉴 번호 선택 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			case 1 : adminMenu(); break;
			case 2 : customerMenu(); break;
			case 9 :
				System.out.println("프로그램 종료.");
				return;
			default :
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요."); 
				break;
			}			
		}
	}
	
	public void adminMenu() {
		while(true) {
			System.out.println("******* 직원 메뉴 *******");
			System.out.println("1. 새 농산물 추가");
			System.out.println("2. 종류 삭제");
			System.out.println("3. 수량 수정");
			System.out.println("4. 농산물 목록");
			System.out.println("9. 메인으로 돌아가기");
			System.out.println();
			System.out.print("메뉴 번호 선택 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			case 1 : addNewKind(); break;
			case 2 : removeKind(); break;
			case 3 : changeAmount(); break;
			case 4 : printFarm(); break;
			case 9 :
				return;
			default :
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요."); 
				break;
			}			
		}
	}
	
	public void customerMenu() {
		HashMap<Farm, Integer> hMap = fc.printFarm();
		while(true) {
			System.out.println("현재 KH마트 농산물 수량");
			Iterator<Farm> itr = hMap.keySet().iterator();
			Farm f = null;
			while(itr.hasNext()) {
				f = itr.next();
				System.out.println(f.toString() + "(" + hMap.get(f) + "개)");
			}
			System.out.println("******* 고객 메뉴 *******");
			System.out.println("1. 농산물 사기");
			System.out.println("2. 농산물 빼기");
			System.out.println("3. 구입한 농산물 보기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.println();
			System.out.print("메뉴 번호 선택 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			case 1 : buyFarm(); break;
			case 2 : removeFarm(); break;
			case 3 : printBuyFarm(); break;
			case 9 :
				return;
			default :
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요."); 
				break;
			}	
		}
	}
	
	public void addNewKind() {
		while(true) {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("추가할 종류 번호 : ");
			int kindNum = sc.nextInt();
			sc.nextLine();
			if(kindNum < 0 || kindNum > 3) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("수량 : ");
			int amount = sc.nextInt();
			sc.nextLine();

			Farm kind = null;
			switch(kindNum) {
			case 1 :
				kind = new Fruit(name, "과일"); break;
			case 2 :
				kind = new Vegetable(name, "채소"); break;
			case 3 :				
				kind = new Nut(name, "견과"); break;
			}
			if(fc.addNewKind(kind, amount)) {
				System.out.println("새 농산물이 추가되었습니다.");
				break;
			} else {
				System.out.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void removeKind() {
		while(true) {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("삭제할 종류 번호 : ");
			int kindNum = sc.nextInt();
			sc.nextLine();
			if(kindNum < 0 || kindNum > 3) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
			System.out.print("이름 : ");
			String name = sc.next();
			sc.nextLine();
			
			Farm kind = null;
			switch(kindNum) {
			case 1 :
				kind = new Fruit(name, "과일"); break;
			case 2 :
				kind = new Vegetable(name, "채소"); break;
			case 3 :				
				kind = new Nut(name, "견과"); break;
			}
			if(fc.removeKind(kind)) {
				System.out.println("농산물 삭제에 성공하였습니다.");
				break;
			} else {
				System.out.println("농산물 삭제에 실패하였습니다. 다시 입력해주세요.");
			}
			
		}
	}
	
	public void changeAmount() {
		while(true) {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("수정할 종류 번호 : ");
			int kindNum = sc.nextInt();
			sc.nextLine();
			if(kindNum < 0 || kindNum > 3) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("수정할 수량 : ");
			int amount = sc.nextInt();
			sc.nextLine();
			
			Farm kind = null;
			switch(kindNum) {
			case 1 :
				kind = new Fruit(name, "과일"); break;
			case 2 :
				kind = new Vegetable(name, "채소"); break;
			case 3 :				
				kind = new Nut(name, "견과"); break;
			}
			if(fc.changeAmount(kind, amount)) {
				System.out.println("농산물 수량이 수정되었습니다.");
				break;
			} else {
				System.out.println("농산물 수량 수정에 실패하였습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void printFarm() {
		HashMap<Farm, Integer> hMap = fc.printFarm();
		Iterator<Farm> f = hMap.keySet().iterator();
		Farm fResult = null;
		while(f.hasNext()) {
			fResult = f.next();
			System.out.println(fResult.toString() + "(" + hMap.get(fResult) + "개)");
		}
	}
	
	public void buyFarm() {
		while(true) {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("구매할 종류 번호 : ");
			int kindNum = sc.nextInt();
			sc.nextLine();
			if(kindNum < 0 || kindNum > 3) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
			System.out.print("이름 : ");
			String name = sc.next();
			sc.nextLine();
			
			Farm kind = null;
			switch(kindNum) {
			case 1 :
				kind = new Fruit(name, "과일"); break;
			case 2 :
				kind = new Vegetable(name, "채소"); break;
			case 3 :				
				kind = new Nut(name, "견과"); break;
			}
			if(fc.buyFarm(kind)) {
				System.out.println("구매에 성공하였습니다.");
				break;
			} else {
				System.out.println("마트에 없는 물건이거나 수량이 없습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void removeFarm() {
		while(true) {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("구매 취소할 종류 번호 : ");
			int kindNum = sc.nextInt();
			sc.nextLine();
			if(kindNum < 0 || kindNum > 3) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
			System.out.print("이름 : ");
			String name = sc.next();
			sc.nextLine();
			
			Farm kind = null;
			switch(kindNum) {
			case 1 :
				kind = new Fruit(name, "과일"); break;
			case 2 :
				kind = new Vegetable(name, "채소"); break;
			case 3 :				
				kind = new Nut(name, "견과"); break;
			}
			if(fc.removeFarm(kind)) {
				System.out.println("구매 취소에 성공하였습니다.");
				break;
			} else {
				System.out.println("구매매 목록에 존재하지 않습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void printBuyFarm() {
		Iterator<Farm> f = fc.printBuyFarm().iterator();
		while(f.hasNext()) {
			System.out.println(f.next().toString());
		}
	}
}
