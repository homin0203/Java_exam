package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {
	public void exec() {
		//키보드로 가로, 세로 값을 실수형으로 입력 받아 사각형의 면적과 둘레를 계산하시오
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로길이 : ");
		double line = sc.nextDouble();
		System.out.print("세로길이 : ");
		double high = sc.nextDouble();
		
		System.out.println("면적 : " + (line * high));
		System.out.println("둘레 : " + (line * 2 + high * 2));
		sc.close();
	}
}
