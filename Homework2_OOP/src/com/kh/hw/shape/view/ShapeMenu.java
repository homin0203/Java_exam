package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {
	private Scanner sc = new Scanner(System.in);
	private SquareController scr = new SquareController();
	private TriangleController tc = new TriangleController();
	
	public void inputMenu() {
		end:
		while(true) {
			System.out.println("===== 도형 프로그램 =====");
			System.out.println("3. 삼각형");
			System.out.println("4. 사각형");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 3 :
				triangleMenu(); break;
			case 4 :
				squareMenu(); break;
			case 9 : 
				System.out.println("프로그램 종료합니다."); break end;
			default : 
				System.out.println("잘못된 번호입니다. 다시 입력해주세요."); break;
			}
		}
	}
	
	public void triangleMenu() {
		end:
		while(true) {
			System.out.println("===== 삼각형 =====");
			System.out.println("1. 삼각형 면적");
			System.out.println("2. 삼각형 색칠");
			System.out.println("3. 삼각형 정보");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1 : this.inputSize(3, 1); break;
			case 2 : this.inputSize(3, 2); break;
			case 3 : this.printInformatin(3); break;
			case 9 : System.out.println("메인으로 돌아갑니다."); break end;
			default : System.out.println("잘못된 번호입니다. 다시 입력해주세요."); break;
			}
		}
		
	
	}
	
	public void squareMenu() {
		end:
		while(true) {
			System.out.println("===== 사각형 =====");
			System.out.println("1. 사각형 둘레");
			System.out.println("2. 사각형 면적");
			System.out.println("3. 사각형 색칠");
			System.out.println("4. 사각형 정보");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1 : this.inputSize(4, 1); break;
			case 2 : this.inputSize(4, 2); break;
			case 3 : this.inputSize(4, 3); break;
			case 4 : this.printInformatin(4); break;
			case 9 : System.out.println("메인으로 돌아갑니다."); break end;
			default : System.out.println("잘못된 번호입니다. 다시 입력해주세요."); break;
			}
		}
	}
	
	public void inputSize(int type, int menuNum) {
		if(type == 3) {
			switch(menuNum) {
			case 1 : 
				System.out.print("높이 : ");
				double height = sc.nextDouble();
				System.out.print("너비 : ");
				double width = sc.nextDouble();
				System.out.println("삼각형 면적 : " + tc.calcArea(height, width));
				break;
			case 2 :
				System.out.print("색깔을 입력하세요 : ");
				String color = sc.next();
				tc.paintColor(color);
				System.out.println("색이 수정되었습니다.");
				break;
			}
		} else {
			switch(menuNum) {
			case 1 : 
			case 2 :
				System.out.print("높이 : ");
				double height = sc.nextDouble();
				System.out.print("너비 : ");
				double width = sc.nextDouble();
				if(menuNum == 1) {
					System.out.println("사각형 둘레 : " + scr.calcPerimeter(height, width));
				} else {
					System.out.println("사각형 면적 : " + scr.calcArea(height, width));
				}
				break;
			case 3 :
				System.out.print("색깔을 입력하세요 : ");
				String color = sc.next();
				scr.paintColor(color);
				System.out.println("색이 수정되었습니다.");
				break;
			}
		}
	}
	
	public void printInformatin(int type) {
		if(type == 3) {
			System.out.println(tc.print());
		} else {
			System.out.println(scr.print());
		}
	}
	
}
