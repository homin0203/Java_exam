package com.kh.hw.view;

import java.util.Scanner;

import com.kh.hw.controller.Function;

public class Menu {
	public void displayMenu() {
		Scanner sc = new Scanner(System.in);
		Function fc = new Function();
		
		while(true) {
			System.out.println("1. 간단 계산기");
			System.out.println("2. 작은 수에서 큰 수까지 합계");
			System.out.println("3. 신상 정보 확인");
			System.out.println("4. 학생 정보 확인");
			System.out.println("5. 별과 숫자 출력");
			System.out.println("6. 난수까지의 합계");
			System.out.println("7. 구구단");
			System.out.println("8. 주사위 숫자 알아맞추기 게임");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1 :
				fc.calculator(); break;
			case 2 :
				fc.totalCalculator(); break;
			case 3 :
				fc.printPrifile(); break;
			case 4 :
				fc.printScore(); break;
			case 5 :
				fc.printStarNumber(); break;
			case 6 :
				fc.sumRandom(); break;
			case 7 :
				fc.exceptGugu(); break;
			case 8 :
				fc.diceGame(); break;
			case 9 :
				System.out.println("종료합니다.");
				return;
			default : 
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); break;
			}

			sc.close();
		}
	}
}
