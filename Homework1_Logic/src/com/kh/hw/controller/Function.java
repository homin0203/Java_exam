package com.kh.hw.controller;

import java.util.Random;
import java.util.Scanner;

public class Function {
	Random rd = new Random();
	Scanner sc = new Scanner(System.in);
	public void calculator() {
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자(+, - , x, /) : ");
		char ch = sc.next().charAt(0);
		
		switch(ch) {
		case '+':
			System.out.printf("%d %c %d = %d \n", num1, ch, num2, num1+num2); break;
		case '-':
			System.out.printf("%d %c %d = %d \n", num1, ch, num2, num1-num2); break;
		case 'x':
		case 'X':
			System.out.printf("%d %c %d = %d \n", num1, ch, num2, num1*num2); break;
		case '/':
			if(num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
				System.out.printf("%d %c %d = %d \n", num1, ch, num2, 0);
			} else {
				System.out.printf("%d %c %d = %d \n", num1, ch, num2, num1/num2);
			}
			break;
		}
	}
	
	public void totalCalculator() {
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		
		int max = 0;
		int min = 0;
		
		if(num1 > num2) {
			max = num1;
			min = num2;
		} else {
			max = num2;
			min = num1;
		}
		
		int sum = 0;
		for(int i = min; i < max+1; i++) {
			sum += i;
		}
		
		System.out.printf("%d부터 %d까지 정수들의 합 : %d \n", min, max, sum);
	}
	
	public void printPrifile() {
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("성별 : ");
		String gender = sc.next();
		System.out.print("성격 : ");
		String crt = sc.next();
		sc.nextLine();
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.println("성격 : " + crt);
	}
	
	public void printScore() {
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		System.out.print("반 : ");
		int group = sc.nextInt();
		System.out.print("번 : ");
		int num = sc.nextInt();
		System.out.print("성별(M/F) : ");
		String gd = sc.next();
		System.out.print("성적 : ");
		double score = sc.nextDouble();
		sc.nextLine();
		
		char level = (score >= 90)? 'A' : (score >= 80)? 'B' : (score >= 70)? 'C' : (score >= 60)? 'D' : 'F'; 
		String gender = (gd.toUpperCase().equals("M"))? "남학생" : "여학생";
		System.out.printf("%d학년 %d반 %d번 %s %s의 점수는 %.2f이고 %c학점입니다. \n", grade, group, num, gender, name, score, level);
	}
	
	public void printStarNumber() {
		System.out.print("정수 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num > 0) {
			for(int i = 1; i < num+1; i++) {
				for(int j = 0; j < i; j++) {
					if(j == i-1) {
						System.out.println(i);
					} else {
						System.out.print("*");
					}
				}
			}
		} else {
			System.out.println("양수가 아닙니다.");
		}
	}
	
	public void sumRandom() {
		
		int num = rd.nextInt(100) + 1;
		
		int sum = 0;
		
		for(int i = 1; i < num+1; i++) {
			sum += i;
		}
		System.out.printf("1부터 %d까지의 합 : %d \n", num, sum);
	}
	
	public void exceptGugu() {
		System.out.print("정수 : ");
		int dan = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1; i < 10; i++) {
			if(i % dan != 0) {
				System.out.printf("%d * %d = %-2d \n", dan, i, dan*i);
			}
		}
	}
	
	public void  diceGame() {
		
		int check = rd.nextInt(12) +1;
		while(true) {
			System.out.print("주사위 두 개의 합을 맟줘보세요(1~12입력) : ");
			int num = sc.nextInt();
			sc.nextLine();
		
//			check = rd.nextInt(12) +1; //여기서 주사위의 합을 재설정할경우 틀린경우에 또다시 값이 재입력되서 맞추려면 답이없음..ㅠ
			if(num == check) {
				System.out.println("정답입니다.");
				System.out.println("주사위의 합 : " + check);
				System.out.print("계속 하시겠습니까?(y/n) : ");
				String str = sc.nextLine();
				
				if(str.toUpperCase().equals("N")) {
					System.out.println("종료합니다.");
					break;
				}
				check = rd.nextInt(12) +1; //정답을 맞추고나서 계속 할경우에 다시 새로운 주사위의 합을 주기 위해 여기 위치에서 재설정
			} else {
				System.out.println("틀렸습니다.");
			}
		}
	}
}
