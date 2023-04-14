package com.kh.practice.chap02;

import java.util.Scanner;

public class LoopPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		//사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력
		//단, 입력한 수는 1보다 크거나 같아야 한다.
		//만일 1미만의 숫자가 입력됐다면 "1 이상의 숫자를 입력해주세요"를 출력
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num >= 1) {
			for(int i = 1; i <= num; i++) {
				System.out.print(i +" ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}
	
	public void practice2() {
		//위 문제와 모든 것이 동일하나, 1미만의 숫자가 입력됐다면 "1이상의 숫자를 입력해주세요"를 출력하면서
		//다시 사용자가 값을 입력하도록 하세요.
		
		do {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			if(num >= 1) {
				for(int i = 1; i <= num; i++) {
					System.out.print(i +" ");
				}
				break;
			} else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
		} while(true);
	}
	
	public void practice3() {
		//사용자로부터 한개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력
		//단, 입력한 수는 1보다 크거나 같아야합니다.
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num >= 1) {
			for(int i = num; i >= 1; i--) {
				System.out.print(i +" ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}
	
	public void practice4() {
		//위 문제와 동일하나 1미만의 숫자 입력시 다시 실행
		do {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			if(num >= 1) {
				for(int i = num; i >= 1; i--) {
					System.out.print(i +" ");
				}
				break;
			} else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
		} while(true);
	}
	
	public void practice5() {
		//1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요.
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			sum += i;
			if(i == num) {
				System.out.print(i);
				break;
			}
			System.out.print(i + " + ");
		} 
		System.out.print(" = " + sum);
	}
	
	public void practice6() {
		//사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력
		//만일 1 미만의 숫자가 입력됐다면 "1 이상의 숫자를 입력해주세요"를 출력
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
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

		if(num1 >= 1 && num2 >= 1) {
			for(int i = min; i <= max; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요");
		}
	}
	
	public void practice7() {
		//위 문제와 모든 것이 동일, 1미만의 숫자를 입력하면 동일문구 출력 및 다시 실행
		
		int num1 = 0;
		int num2 = 0;
		int max = 0;
		int min = 0;
		
		do {
			System.out.print("첫 번째 숫자 : ");
			num1 = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			num2 = sc.nextInt();
			
			if(num1 > num2) {
				max = num1;
				min = num2;
			} else {
				max = num2;
				min = num1;
			}
	
			if(num1 >= 1 && num2 >= 1) {
				for(int i = min; i <= max; i++) {
					System.out.print(i + " ");
				}
				break;
			} else {
				System.out.println("1 이상의 숫자를 입력해주세요");
			}
		} while(true);
	}
	
	public void practice8() {
		//사용자로부터 입력 받은 숫자의 단을 출력하세요.
		
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		System.out.println("===== " + dan + "단 =====");
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
	}
	
	public void practice9() {
		//사용자로부터 입력 받은 숫자의 단부터 9단까지 출력
		//단, 9를 초과하는 숫자가 들어오면 "9 이하의 숫자만 입력해주세요"를 출력
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num <= 9) {
			for(int dan = num; dan <= 9; dan++) {
				System.out.println("===== " + dan + "단 =====");
				for(int i = 1; i <= 9; i++) {
					System.out.println(dan + " * " + i + " = " + (dan * i));
				}
			}
		} else {
			System.out.println("9 이하의 숫자만 입력해주세요.");
		}
	}
	
	public void practice10() {
		//위와 동일하나 9초과 입력시 안내문구 및 다시 실행
		
		do {
			System.out.print("숫자 : ");
			int num = sc.nextInt();
			
			if(num <= 9) {
				for(int dan = num; dan <= 9; dan++) {
					System.out.println("===== " + dan + "단 =====");
					for(int i = 1; i <= 9; i++) {
						System.out.println(dan + " * " + i + " = " + (dan * i));
					}
				}
				break;
			} else {
				System.out.println("9 이하의 숫자만 입력해주세요.");
			}
		} while(true);
	}
	
	public void practice11() {
		//사용자로부터 시작 숫자와 공차를 입력 받아 일정한 값으로 숫자가 커지거나 작아지는 프로그램 구현
		//단, 출력되는 숫자는 총 10개
		
		System.out.print("시작 숫자 : ");
		int start = sc.nextInt();
		System.out.print("공차 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			System.out.print(start + " ");
			start += num; 
		}
	}
	
	public void practice12() {
		//정수 두 개와 연산자를 입력받고 입력된 연산자에 따라 알맞은 결과를 출력
		//단, 해당 프로그램은 연산자 입력에 "exit"라는 값이 들어올때까지 무한반복
		//"exit"값이 들어오면 "프로그램을 종료합니다."를 출력하고 종료
		//또한 연산자가 나누기이면서 두번째 정수가 0으로 들어오면 "0으로 나눌 수 없습니다. 다시 입력해주세요."를 출력,
		//없는 연산자가 들어올 시 "없는 연산자입니다. 다시 입력해주세요."라고 출력하고 두 경우 모두 처음으로 돌아가 사용자가 다시 연산자부터 입력
		String str = null;
		do {
			System.out.print("연산자(+, -, *, /, %) : ");
			str = sc.next();
			if(str.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if(!str.equals("+") && !str.equals("-") && !str.equals("*") && !str.equals("/") && !str.equals("%")) {
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
				continue;
			}
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			sc.nextLine();
			
			if(str.equals("/") && num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
			} else {					
				switch(str) {
				case "+":
					System.out.printf("%d %s %d = %d \n", num1, str, num2, num1+num2); break;
				case "-":
					System.out.printf("%d %s %d = %d \n", num1, str, num2, num1-num2); break;
				case "*":
					System.out.printf("%d %s %d = %d \n", num1, str, num2, num1*num2); break;
				case "/":
					System.out.printf("%d %s %d = %d \n", num1, str, num2, num1/num2); break;
				case "%":		
					System.out.printf("%d %s %d = %d \n", num1, str, num2, num1%num2); break;
				default:
					break;
				}
			}
		} while(true);
	}
	public void practice13() {
		//다음과같은 실행예제를 구현하세요
		// 정수입력 : 4
		// *
		// **
		// ***
		// ****
		
		System.out.print("정수 입력 : ");
		int star = sc.nextInt();
		
		for(int i = 1; i <= star; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void practice14() {
		//다음과같은 실행예제를 구현하세요
		// 정수입력 : 4			
		// ****
		// ***
		// **
		// *
		
		System.out.print("정수 입력 : ");
		int star = sc.nextInt();
		
		for(int i = star; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
