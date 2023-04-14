package com.kh.practice.chap01.hard;

import java.util.Scanner;

public class ControlPractice {
	Scanner sc = new Scanner(System.in);
	public void practice1() {
		//정수를 이용해서 4자리 비번을 만들려고 한다
		//이 때 4자리 정수를 입력 받아 각 자리 수에 중복되는 값이 없을 경우 "생성 성공"
		//중복 값이 있으면 "중복 값 있음", 자리수가 안 맞으면 "자리 수 안 맞음" 출력
		//단, 제일 앞자리 수의 값은 1~9 사이 정수
		
		System.out.print("비밀번호 입력(1000~9999) :");
		String pw = sc.next();
		sc.nextLine();
		
		boolean check = true;
		if(pw.length() == 4) {
			for(int i = 0; i < pw.length(); i++) {
				for(int j = 0; j < pw.length(); j++) {
					if(!(i == j)) {
						if(pw.charAt(i) == pw.charAt(j)) {
							check = false;
							break;
						}
					}
				}
			}
			if(check == false) {
				System.out.println("실패");
			} else {
				System.out.println("성공");
			}
		} else {
			System.out.println("자리수 안맞음");
		}
		
		
	}
}
