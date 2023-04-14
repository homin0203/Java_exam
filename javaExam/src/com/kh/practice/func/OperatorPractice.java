package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {

	Scanner sc = new Scanner(System.in);
	public void practice1() {
		//키보드로 입력 받은 하나의 정수가 양수이면 "양수다", 양수가 아니면 "양수가 아니다"를 출력
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("양수다");
		} else {
			System.out.println("양수가 아니다");
		}
	}
	
	public void practice2() {
		//키보드로 입력받은 정수가 양수면 "양수다",양수가 아닌 경우중에 0이면 "0이다", 0이 아니면 "음수다"
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("양수다");
		} else if(num == 0) {
			System.out.println("0이다");
		} else {
			System.out.println("음수다");
		}
		
	}
	
	public void practice3() {
		//키보드로 입력받은 정수가 짝수면 "짝수다", 아니면 "홀수다"
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("짝수다");
		} else {
			System.out.println("홀수다");
		}
	}
	
	public void practice4() {
		//모든 사람이 사탕을 골고루 나눠가지려한다. 인원 수와 사탕 개수를 키보드로 입력받고
		//1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕 개수를 출력
		
		System.out.print("인원 수 : ");
		int people = sc.nextInt();
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : " + (candy / people));
		System.out.println("남는 사탕 개수 : " + (candy % people));
	}
	
	public void practice5() {
		//키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수값을 화면에 출력하여 확인하세요
		//이떄 성별이 'M'이면 남학생, 'M'이 아니면 여학생으로 출력 처리
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		System.out.print("반(숫자만) : ");
		int cla = sc.nextInt();
		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();
		System.out.print("성별(M/F) : ");
		char gender = sc.next().charAt(0);
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double score = sc.nextDouble();
		sc.nextLine();
		
		if(gender == 'M') {
			System.out.printf("%d학년 %d반 %d번 %s 남학생의 성적은 %.2f이다.", grade, cla, num, name, score);
		} else {
			System.out.printf("%d학년 %d반 %d번 %s 여학생의 성적은 %.2f이다.", grade, cla, num, name, score);
		}
		
	}
	
	public void practice6() {
		//나이를 키보드로 입력 받아 어린이(13세 이하)인지, 청소년(13세초과 ~ 19세 이하)인지, 성인(19세초과)인지 출력
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		if(age <= 13) {
			System.out.println("어린이");
		} else if(age > 13 && age <= 19) {
			System.out.println("청소년");
		} else {
			System.out.println("성인");
		}
	}
	
	public void practice7() {
		//국어,영어,수학 점수 키보드로 정수로 입력받고, 세 과목에 대한 합계와 평균(합계/3.0)을 구하세요.
		//세 과목의 점수와 평균을 가지고 합격여부를 처리, 세 과목 점수가 각가 40점이상이면서 평균 60점이상일 합격, 아님 불합격
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		sc.nextLine();
		
		int sum = kor + eng + math;
		double avr = sum / 3.0;

		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avr);
		
		if(sum >= 60 && kor >= 40 && eng >= 40 && math >= 40) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
	}
	
	public void practice8() {
		//주민번호를 이용하여 남자인지 여자인지 구분하여 출력하세요.
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		String strNum = sc.next();
		sc.nextLine();
		
		char check = strNum.charAt(7);
		if(check == '1' || check == '3') {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}
	}
	
	public void practice9() {
		//키보드로 정수 두 개를 입력 받아 각각 변수(num1,num2)에 저장
		//그리고 또 다른 정수를 입력 받아 그 수가 num1이하거나 num2초과이면 true를 출력 아니면 false를 출력(단 num1은 num2보다 작아야함)
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		System.out.print("입력 : ");
		int check = sc.nextInt();
		sc.nextLine();
		
		if(check <= num1 || check > num2) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	
	public void practice10() {
		//3개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 false를 출력
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();
		sc.nextLine();
		
		if(num1 == num2 && num2 == num3) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	
	public void practice11() {
		//A, B, C 사원의 연봉을 입력 받고 각 사원의 연봉과 인센티브를 포함한 연봉을 계산하여 출력하고
		//인센티브 포함 급여가 3000만원 이상이면 "3000 이상", 미만이면 "3000 미만"을 출력
		//(A 사원의 인센티브는 0.4, B 사원은 없음, C 사원의 인센티브는 0.15)
		System.out.print("A사원의 연봉 : ");
		int aNum = sc.nextInt();
		System.out.print("B사원의 연봉 : ");
		int bNum = sc.nextInt();
		System.out.print("C사원의 연봉 : ");
		int cNum = sc.nextInt();
		sc.nextLine();
		
		double aAll = aNum * 1.4;
		double bAll = bNum * 1.0;
		double cAll = cNum * 1.15;
		String aCheck = (aAll >= 3000)? "이상" : "이하";
		String bCheck = (bAll >= 3000)? "이상" : "이하";
		String cCheck = (cAll >= 3000)? "이상" : "이하";
		
		System.out.printf("A사원 연봉/연봉+a : %d/%.1f \n3000 %s \n", aNum, aAll, aCheck);
		System.out.printf("B사원 연봉/연봉+a : %d/%.1f \n3000 %s \n", bNum, bAll, bCheck);
		System.out.printf("C사원 연봉/연봉+a : %d/%.13f \n3000 %s \n", cNum, cAll, cCheck);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
