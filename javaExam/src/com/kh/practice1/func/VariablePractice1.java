package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {
	//이름, 성별, 나이, 키를 사용자에게 입력받아 각각의 값을 변수에 담고 출력
	public void exec() {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.print("성별을 입력하세요(남/여) : ");
		String gender = sc.nextLine();
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.print("키를 입력하세요(cm) : ");
		double height = sc.nextDouble();
		
		System.out.println("키 " + height + "cm인 " + age + "살 " + gender + " " + name + "님 반갑습니다.");
		System.out.printf("키 %.2fcm인 %d살 %s %s님 반갑습니다.\n", height, age, gender, name);
		sc.close(); // Scanner를 다 쓰고 닫아주는거임 경고표시도 지우기 위한것.
		
		System.out.println("======\t==\n=\'=\"=\\="); //escape문자 연습
		
		
	}
}
