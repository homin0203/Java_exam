package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {
	public void exec() {
		//실수형으로 국어,영어,수학 세 과목의 점수를 입력 받아 총점과 평균을 출력
		//이때 총점과 평균은 정수형으로 처리
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double kor = sc.nextDouble();
		System.out.print("영어 : ");
		double eng = sc.nextDouble();
		System.out.print("수학 : ");
		double math = sc.nextDouble();
		
		int all = (int)(kor + eng + math);
		System.out.println("총점 : " + all);
		System.out.println("평균 : " + (all / 3));
		
		sc.close();
	}
}
