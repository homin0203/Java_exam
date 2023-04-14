package com.kh.ejkim.func;

import java.util.Scanner;

public class Practice1 {
	Scanner sc = new Scanner(System.in);

	public void exec() {
		// 숫자를 입력받아 짝수/홀수/0이다
		// 총 10회 반복으로 변형
		for (int i = 0; i < 10; i++) {
			System.out.print("숫자를 입력해주세요 : ");
			int num = sc.nextInt();
			if (num == 0) {
				System.out.println("0입니다");
			} else if (num % 2 == 0) {
				System.out.println("짝수입니다");
			} else {
				System.out.println("홀수입니다");
			}
		}

		System.out.println("끝!");
	}

	public void exec2() {
		// 숫자를 입력받아 1~10사이의 정수이면 누적합을 구함.
		// 1~10사이의 정수가 아니라면 "잘못입력하셨습니다."라고 출력
		// 총 3회 반복으로 변형

		int sum = 0;
//		for (int i = 0; i < 3; i++) {
//			System.out.print("1~10사이의 정수를 입력해주세요 : ");
//			int num = sc.nextInt();
//			
//			if (num > 0 && num < 11) {
//					sum += num;
//			} else {
//				System.out.println("잘못입력하셨습니다.");
//			}
//		}

		// 위에 식을 while문으로 수정
		int i = 0;
		while (i < 3) {
			System.out.print("1~10사이의 정수를 입력해주세요 : ");
			int num = sc.nextInt();

			if (num > 0 && num < 11) {
				sum += num;
			} else {
				System.out.println("잘못입력하셨습니다.");
			}
			i++;
		}

		System.out.println(sum);
		System.out.println("끝!");

	}

	//문자를 입력받아 문자의 길이를 구해주세요.
	//입력받은 문자 중 영어에 모음의 글자수는 몇 개입니까?
	//a e i o u
	public void exec3() {
		
		System.out.print("문자를 입력하세요 : ");
		String inputValue = sc.nextLine();
		int inputValueLength = inputValue.length();
		System.out.println(inputValue + "의 길이는 "+ inputValueLength + "입니다.");
		
		int i = 0;
		int count = 0;
		while(i < inputValueLength) {
			char ch = inputValue.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.println(ch + "은 모음입니다.");
				count++;
			}
			i++;
		}
		System.out.println("모음의 글자수 : " + count);
		
		//위 코드를 for문으로 작성
		for(i = 0, count = 0; i < inputValueLength; i++) {
			char ch = inputValue.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.println(ch + "은 모음입니다.");
				count++;
			}
		}
		System.out.println("모음의 글자수 : " + count);
	}
	
	public void exec4() {
		//숫자 입력받아 1~ 해당 숫자까지 총합계, 짝수합계, 홀수합계
		//99 입력할때 까지 반복
		
		while(true) {
			System.out.print("숫자를 입력해주세요 : ");
			int inputValue = sc.nextInt();
			if(inputValue == 99) {
				break;
			}
			int sumTotal = 0;
			int sumOdd = 0;
			int sumEven = 0;
			for(int i = 1; i <= inputValue; i++) {
				if(i % 2 == 0) {
					sumEven += i;
				} else {
					sumOdd += i;
				}
				sumTotal += i;
			}
			System.out.println(sumTotal);
			System.out.println(sumEven);
			System.out.println(sumOdd);
		}
		System.out.println("끝!");
	}
	
	//String 비교
	public void exec5() {
		String a = "aaa";
		String b = "aaa";
		String c = new String("aaa");
		String d = new String("aaa");

		if(a == b) System.out.println("a==b");
		if(a == c) System.out.println("a==c");
		if(a == d) System.out.println("a==d");
		if(b == c) System.out.println("b==c");
		if(b == d) System.out.println("b==d");
		if(c == d) System.out.println("c==d");
		
		if(a.equals(b)) System.out.println("a equals b");
		if(a.equals(c)) System.out.println("a equals c");
		if(a.equals(d)) System.out.println("a equals d");
		if(b.equals(c)) System.out.println("b equals c");
		if(b.equals(d)) System.out.println("b equals d");
		if(c.equals(d)) System.out.println("c equals d");

	}
}
