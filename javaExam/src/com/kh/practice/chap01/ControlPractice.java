package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		//아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 "@@메뉴입니다"를, 
		//종료 번호를 누르면 "프로그램이 종료됩니다"출력
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 : 
			System.out.println("입력 메뉴입니다."); break;
		case 2 : 
			System.out.println("수정 메뉴입니다."); break;
		case 3 : 
			System.out.println("조회 메뉴입니다."); break;
		case 4 : 
			System.out.println("삭제 메뉴입니다."); break;
		case 7 :
			System.out.println("프로그램을 종료합니다."); break;
		default : 
			break;
		}
	}
	
	public void practice2() {
		//키보드로 정수를 입력 받은 정수가 양수이면서 짝수일 때만 "짝수다"를 출력하고
		//짝수가 아니면 "홀수다"를 출력하세요.
		//양수가 아니면 "양수만 입력해주세요"를 출력하세요.
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		if(num > 0) {
			if(num % 2 == 0) {
				System.out.println("짝수다");
			} else {
				System.out.println("홀수다");
			}
		} else {
			System.out.println("양수만 입력해주세요.");
		}
	}
	public void practice3() {
		//국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
		//합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
		//(합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
		//합격 했을 경우 과목 별 점수와 합계, 평균, "축하합니다, 합격입니다!"를 출력하고 불합격인 경우 "불합격입니다." 출력
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		int allScore = kor + math + eng;
		double avr = allScore / 3.0;
		
		if(kor >= 40 && math >= 40 && eng >= 40 && avr >= 60.0) {
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + allScore);
			System.out.println("평균 : " + avr);
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
	}
	public void practice4() {
		//수업 자료(7page)에서 if문으로 되어있는 봄, 여름, 가을, 겨울 예제를 switch문을오 바꿔서 출력하세요.
		System.out.print("1~12 사이의 정수 입력 : ");
		int num = sc.nextInt();
		String season = null;
		
		switch(num) {
		case 12 :
		case 1 :
		case 2 :
			season = "겨울";
			break;
		case 3 :
		case 4 :
		case 5 :
			season = "봄";
			break;
		case 6 :
		case 7 :
		case 8 :
			season = "여름";
			break;
		case 9 :
		case 10 :
		case 11 :
			season = "가을";
			break;
		default : 
			season = "해당하는 계절이 없습니다.";
			break;
		}
		System.out.println(num + "월은 " + season + "입니다.");
	}
	public void practice5() {
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("비밀번호 : ");
		String pw = sc.next();
		sc.nextLine();
		
		String checkId = "myId";
		String checkPw = "myPassword12";
		
		if(id.equals(checkId) && pw.equals(checkPw)) {
			System.out.println("로그인 성공");
		} else if(id.equals(checkId) && !pw.equals(checkPw)) {
			System.out.println("비밀번호가 틀렸습니다.");
		} else {
			System.out.println("아이디가 틀렸습니다.");
		}
	}
	public void practice6() {
		//회원 각 등급 및 권한 출력
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String grade = sc.next();
		sc.nextLine();
		
		switch(grade) {
		case "관리자" : 
			System.out.print("회원관리, 게시글 관리, ");
		case "회원" :
			System.out.print("게시글 작성, 게시글 조회, ");
		case "비회원" : 
			System.out.println("게시글조회");
			break;
		default :
			break;
		}
		
	}
	public void practice7() {
		//키, 몸무게를 double로 받고 BMI지수에 따라 저체중/정상체중/과체중/비만 출력
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double heigh = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (heigh * heigh);
		
		System.out.println("BMI 지수 : " + bmi);
		if(bmi < 18.5) {
			System.out.println("저체중");
		} else if(bmi < 23) {
			System.out.println("정상체중");
		} else if(bmi < 25) {
			System.out.println("과체중");
		} else if(bmi < 30) {
			System.out.println("비만");
		} else {
			System.out.println("고도비만");
		}
	}
	public void practice8() {
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		char opt = sc.next().charAt(0);
		sc.nextLine();
		if(opt == '+' || opt == '-' || opt == '*' || opt == '/' || opt == '%') {
			if(num1 > 0 && num2 > 0) {
				switch(opt) {
				case '+' :
					System.out.printf("%d %c %d = %d", num1, opt, num2, num1+num2); break;
				case '-' :
					System.out.printf("%d %c %d = %d", num1, opt, num2, num1-num2); break;
				case '*' :
					System.out.printf("%d %c %d = %d", num1, opt, num2, num1*num2); break;
				case '/' :
					System.out.printf("%d %c %d = %.6f", num1, opt, num2, (double)num1/num2); break;
				case '%' :
					System.out.printf("%d %c %d = %d", num1, opt, num2, num1%num2); break;
				default :
						break;
				}
			}
		} else {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}
	}
	public void practice9() {
		//중간,기말,과제,출석회수를 입력 Pass 또는 Fail 출력
		//비율 : 중간 20, 기말30, 과제30, 출석20(20회중 출석한 날만 따진값)
		//70점이상 Pass, 미만이거나 강의 30%이상 결석 시 Fail
		
		System.out.print("중간 고사 점수 : ");
		int score1 = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		int score2 = sc.nextInt();
		System.out.print("과제 점수 : ");
		int score3 = sc.nextInt();
		System.out.print("출석 회수 : ");
		int date= sc.nextInt();
		sc.nextLine();
		int dateScore = date * 5;
		
		double allScore = score1*0.2 + score2*0.3 + score3*0.3 + dateScore*0.2;
		
		if(date <= 14) {
			System.out.printf("Fail [출석 회수 부족 (%d/20)] \n", date);
		} else {
			System.out.println("========== 결과 ==========");
			System.out.println("중간 고사 점수(20) : " + score1*0.2);
			System.out.println("기말 고사 점수(30) : " + score2*0.3);
			System.out.println("과제 점수    (30) : " + score3*0.3);
			System.out.println("출석 점수    (20) : " + dateScore*0.2);
			System.out.println("총점 : " + allScore);
			if(allScore < 70) {
				System.out.println("Fail [점수 미달]");
			} else {
				System.out.println("Pass");
			}
		}
		
	}
	public void practice10() {
		//앞에 실습문제를 선택하여 실행할 수 있는 메뉴화면 구현
		
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F");
		System.out.print("선택 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		switch(num) {
		case 1 :
			practice1(); break;
		case 2 :
			practice2(); break;
		case 3 :
			practice3(); break;
		case 4 :
			practice4(); break;
		case 5 :
			practice5(); break;
		case 6 :
			practice6(); break;
		case 7 :
			practice7(); break;
		case 8 :
			practice8(); break;
		case 9 :
			practice9(); break;
		default :
			break;
		}
	}
}
