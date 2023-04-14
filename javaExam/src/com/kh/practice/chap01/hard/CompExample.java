package com.kh.practice.chap01.hard;

import java.util.Random;
import java.util.Scanner;

public class CompExample {
	Scanner sc = new Scanner(System.in);
	public void practice1() {
		//정수를 입력 받아 양수일때만 1부터 입력 받은 수까지 홀수/짝수를 나눠서
		//홀수면 '박, 짝수면 '수'를 출력하도록 하세요.
		//단, 입력 받은 수가 양수가 아니면 "양수가 아닙니다"를 출력
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			for(int i = 1; i <= num; i++) {
				if(i % 2 == 0) {
					System.out.print("수");
				} else {
					System.out.print("박");
				}
			}
			System.out.println();
		} else {
			System.out.println("양수가 아닙니다.");
		}
	}
	public void practice2() {
		//위와 동일하나, 1미만의 숫자가 입력됐다면 "양수가 아닙니다"가 출력되면서 다시 값을 입력하도록하기
		while(true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
			if(num > 0) {
				for(int i = 1; i <= num; i++) {
					if(i % 2 == 0) {
						System.out.print("수");
					} else {
						System.out.print("박");
					}
				}
				System.out.println();
				break;
			} else {
				System.out.println("양수가 아닙니다.");
			}
		}
	}
	public void practice3() {
		//사용자로부터 문자열을 입력 받고 문자열에서 검색될 문자를 입력 받아 
		//해당 문자열에 그 문자가 몇 개 있는지 개수를 출력
		
		System.out.print("문자열 : ");
		String str = sc.next();
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);
		
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ch) {
				count++;
			}
		}
		System.out.printf("%s 안에 포함된 %c 개수 : %d \n", str, ch, count);
	}
 	public void practice4() {
		//위 문제와 모든 것이 동일, "더 하시겠습니까?"라고 추가로 물어보도록 하세요.
 		//이때, N이나 n이 나오면 프로그램을 끝내고 Y나 y면 계속 진행하되 Y,y,N,n이 아닌
 		//다른 문자 입력시 "잘못된 대답입니다. 다시 입력해주세요"를 출력하고 더하겠냐고 다시 물음 반복
 		char check = '\u0000';
 		do {
 			System.out.print("문자열 : ");
 			String str = sc.next();
 			System.out.print("문자 : ");
 			char ch = sc.next().charAt(0);
 			
 			int count = 0;
 			for(int i = 0; i < str.length(); i++) {
 				if(str.charAt(i) == ch) {
 					count++;
 				}
 			}
 			System.out.printf("포함된 개수 : %d \n", count);
 	 		
 			while(true) {
 	 			System.out.print("더 하시겠습니까?(y/n) : ");
 	 			check = sc.next().charAt(0);
 	 			if(check == 'Y' || check == 'y' || check == 'n' || check == 'N') {
 	 				break;
 	 			}
 	 			System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
 			}
 		} while(check == 'Y' || check == 'y');
	}
	public void practice5() {
		//1부터 100사이의 정수 중 임의의 난수가 정해지고 사용자는 정해진 난수를 맞추는데 몇번 만에 맞췄는지 출력
		
		Random rd = new Random();
		
		int answer = rd.nextInt(100) + 1;
		int count = 0;
		while(true) {
			System.out.print("1~100 사이의 임의의 난수를 맞춰보세요 : ");
			int check = sc.nextInt();
			
			if(check < 1 || check > 100) {
				System.out.println("1~100사이의 숫자를 입력해주세요.");
				continue;
			} else if(answer == check) {
				count++;
				break;
			} 
			if(check < answer) {
				System.out.println("UP !");
				count++;
			} else {
				System.out.println("DOWN !");
				count++;
			}
		}
		System.out.printf("정답입니다 !! \n%d회만에 맞추셨습니다. \n", count);
	}
	public void practice6() {
		//사용자의 이름을 입력하고 컴퓨터와 가위바위보, 컴퓨터가 가위인지 보인지 주먹인지 랜덤한 수를 통해 결정
		//사용자에게는 직접 가위바위보를 받고, 사용자가 "exit"를 입력하기 전까지 가위바위보를 계속 진행하고 
		//"exit"가 들어가면 반복을 멈추고 몇 번의 승부에서 몇 번 이기고 몇 번 비기고 몇 번 졌는지 출력
		
		Random rd = new Random();
		
		System.out.print("당신의 이름을 입력해주세요 : ");
		String name = sc.next();
		
		int count1 = 0;
		int count2 = 0;
		int count3 = 0; //승 무 패 를 기록하기 위한 변수 
		while(true) {
			System.out.print("가위바위보 : ");
			String str = sc.next();
			if(str.equals("exit")) { //exit 입력시 종료
				break;
			} else if(str.equals("가위") || str.equals("바위") || str.equals("보")) { 
				int comNum = rd.nextInt(3) + 1;
				String comStr = (comNum == 1)? "가위" : (comNum == 2)? "바위" : "보";
				//컴퓨터가 낼 가위바위보를 위해 랜덤 1~3을 받은 후 그거에 맞춰 가위바위보 대입
				
				System.out.printf("컴퓨터 : %s \n", comStr);
				System.out.printf("%s : %s \n", name, str);
				
				if(str.equals(comStr)) { //비겼을경우
					System.out.println("비겼습니다.");
					count2++;
				} else if((str.equals("가위") && comStr.equals("바위")) ||  //조건문이 너무 길어서 아래줄로 내렸음
						(str.equals("바위") && comStr.equals("보")) || (str.equals("보") && comStr.equals("가위"))) { //졌을 때
					System.out.println("졌습니다 ㅠㅠ");
					count3++;
				} else { // 나머지 이겼을 때
					System.out.println("이겼습니다 !");
					count1++;
				}
			} else { //가위,바위,보 외에 입력시 안내 문구
				System.out.println("잘못 입력하셨습니다.");
			}
			System.out.println();
		}
		System.out.printf("%d전 %d승 %d무 %d패", count1 + count2 + count3, count1, count2, count3);
	}
}
