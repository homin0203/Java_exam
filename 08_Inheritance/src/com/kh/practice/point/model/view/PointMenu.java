package com.kh.practice.point.model.view;

import java.util.Scanner;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

public class PointMenu {
	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();

	public void mainMenu() {
		end: 
		while (true) {
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 원");
			System.out.println("2. 사각형");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				circleMenu();
				break;
			case 2:
				rectangleMenu();
				break;
			case 9:
				System.out.println("종료합니다.");
				break end;
			default:
				break;
			}
		}

	}

	public void circleMenu() {
		System.out.println("===== 원 메뉴 =====");
		System.out.println("1. 원 둘레");
		System.out.println("2. 원 넓이");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			calcCircum();
			break;
		case 2:
			calcCircleArea();
			break;
		case 9:
			break;
		default:
			break;
		}
	}

	public void rectangleMenu() {
		System.out.println("===== 사각형 메뉴 =====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 넓이");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			calcPerimeter();
			break;
		case 2:
			calcRectArea();
			break;
		case 9:
			break;
		default:
			break;
		}
	}

	public void calcCircum() {
		// 받은 데이터를 CircleController(cc)의 calcCircum()의 매개변수로 보내 반환 값 출력
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("반지름 : ");
		int radius = sc.nextInt();

		// 반환값이 String 자료형의 정보이기 때문에 출력메소드 안에 메소드를 입력
		System.out.println(cc.calcCircum(x, y, radius));
	}

	public void calcCircleArea() {
		// 받은 데이터를 CircleController(cc)의 calcArea()의 매개변수로 보내 반환 값 출력
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("반지름 : ");
		int radius = sc.nextInt();

		// 반환값이 String 자료형의 정보이기 때문에 출력메소드 안에 메소드를 입력
		System.out.println(cc.calcArea(x, y, radius));
	}

	public void calcPerimeter() {
		// 받은 데이터를 RectangleController(rc) calcPerimeter()의 매개변수로 보내 반환 값 출력
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("높이 : ");
		int height = sc.nextInt();
		System.out.print("너비 : ");
		int width = sc.nextInt();

		// 반환값이 String 자료형의 정보이기 때문에 출력메소드 안에 메소드를 입력
		System.out.println(rc.calcPerimeter(x, y, height, width));
	}

	public void calcRectArea() {
		// 받은 데이터를 RectangleController(rc) calcArea()의 매개변수로 보내 반환값 출력
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("높이 : ");
		int height = sc.nextInt();
		System.out.print("너비 : ");
		int width = sc.nextInt();

		// 반환값이 String 자료형의 정보이기 때문에 출력메소드 안에 메소드를 입력
		System.out.println(rc.calcArea(x, y, height, width));
	}
}
