package com.kh.practice.dimension;

import java.util.Random;
import java.util.Scanner;

public class DimensionPractice {
	Scanner sc = new Scanner(System.in);
	Random rd = new Random();
	
	public void practice1() {
		// 3행3열 문자열 배열을 선언 및 할당
		// 인덱스 0행0열부터 2행2열까지 차례대로 접근해여 "(0, 0)"과 같은 형식으로 저장 후 출력
		String[][] arr = new String[3][3];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = "(" + i + ", " + j + ")";
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

	}

	public void practice2() {
		// 4행4열짜리 정수형 배열을 선언 및 할당
		// 1~16까지 값을 차례대로 저장 및 저장된 값 출력
		int[][] arr = new int[4][4];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i * 4 + j + 1;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}

	public void practice3() {
		// 2번과 동일하나 값을 역순으로 저장
		int[][] arr = new int[4][4];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = 16 - (i * 4 + j);
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice4() {
		//4행 4열 2차원 배열을 생성하여 0행0열부터 2행2열까지는 
		//1~10까지의 임의의정수 값 저장 후 아래 내용처럼 처리
		
		int[][] nArr = new int[4][4];
		
		for(int i = 0; i < nArr.length; i++) {
			for(int j = 0; j < nArr[i].length; j++) {
				if(i < nArr.length-1 && j < nArr.length-1) {
					nArr[i][j] = rd.nextInt(10)+1;
					nArr[3][j] += nArr[i][j];
					nArr[i][3] += nArr[i][j];
					nArr[3][3] += nArr[i][j]*2;
				}
			}
		}

		for(int i = 0; i < nArr.length; i++) {
			for(int j = 0; j < nArr[i].length; j++) {
				System.out.printf("%3d \t", nArr[i][j]);
			} 
			System.out.println();
		}
	}
	
	public void practice5() {
		//2차원 배열의 행과 열의 크기를 사용자에게 직접 입력받되, 1~10사이 숫자가 아니면
		//"반드시 1~10 사이의 정수를 입력해야 합니다." 출력 후 다시 정수를 받게 하세요.
		//크기가 정해진 이차원 배열 안에는 영어 대문자가 랜덤으로 들어가게 한 뒤 출력하세요.
		//(char형은 숫자를 더해서 문자를 표현할 수 있고 65는 A를 나타냄)
		
		int hnum = 0;
		int lnum = 0;
		while(true) {
			System.out.print("행 크기 : ");
			hnum = sc.nextInt();
			System.out.print("열 크기 : ");
			lnum = sc.nextInt();
			
			if(hnum < 1 || hnum > 10 || lnum < 1 || lnum > 10) {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
			} else {
				break;
			}
		}
		
		char[][] chArr = new char[hnum][lnum];
		for(int i = 0; i < chArr.length; i++) {
			for(int j = 0; j < chArr[i].length; j++) {
				chArr[i][j] = (char)(rd.nextInt(26) + 65);
			}		//알파벳 대문자는 숫자로 65~90사이숫자로 그 범위를 랜덤후 강제 형변환
		}
		
		for(int i = 0; i < chArr.length; i++) {
			for(int j = 0; j < chArr[i].length; j++) {
				System.out.printf("%c \t", chArr[i][j]);
			} 
			System.out.println();
		}
	}
	
	public void practice6() {
		String[][] strArr = new String[][] {{"이", "까", "왔", "앞", "힘"}, {"차", "지", "습", "으",	"냅"},  {"원", 
			"열", "니", "로", "시"}, {"배", "심", "다", "좀", "다"}, {"열", "히", "! ", "더", "!!"}};
			
			
		for(int i = 0; i < strArr.length; i++) {
			for(int j = 0; j < strArr[i].length; j++) {
				System.out.print(strArr[j][i] + " ");
			}
			System.out.println();
		}
	}
	
	public void practice7() {
		//사용자에게 행의 크기를 입력받고 그 수만큼의 반복을 통해 열의 크기도 받아
		//문자형 가변 배열을 선언 및 할당하세요.
		//그리고 각 인덱스에 'a'부터 총 인덱스의 개수만큼 하나씩 늘려 저장하고 출력하세요
		
		System.out.print("행의 크기 : ");
		int hnum = sc.nextInt();
		char[][] chArr = new char[hnum][];
		chArr[0]= new char[2];
		for(int i = 0; i < chArr.length; i++) {
			System.out.printf("%d행의 열 크기 : ", i);
			int num = sc.nextInt();
			chArr[i] = new char[num];
		}
		
		int uni = 97; //알파벳 a의 유니코드인 97부터 시작을 위해 선언및 초기화
		for(int i = 0; i < chArr.length; i++) {
			for(int j = 0; j < chArr[i].length; j++) {
				chArr[i][j] = (char)uni; // 숫자를 알파벳으로 강제형변환
				uni++; // 한칸에 a(97)이 들어가면 다음 알파벳이다은칸에 들어가기위해 +1씩 추가
			}
		}
		
		for(int i = 0; i < chArr.length; i++) {
			for(int j = 0; j < chArr[i].length; j++) {
				System.out.print(chArr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void practice8() {
		//1차원 배열에 12명의 학생들을 출석부 순으로 초기화, 2열3행으로 2차원 배열 2개를 이용하여 분단을 나눠
		//1분단 왼쪽부터 오른쪽, 1행에서 아래 행 순으로 자리를 배치
		
		String[] strArr = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", 
				"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		String[][] ownArr = new String[3][2];
		String[][] twoArr = new String[3][2];
		
		int count = 0; 
		for(int i = 0; i < ownArr.length; i++) {
			for(int j = 0; j < ownArr[i].length; j++) {
				ownArr[i][j] = strArr[count];
				count++;
			}
		}
		for(int i = 0; i < twoArr.length; i++) {
			for(int j = 0; j < twoArr[i].length; j++) {
				twoArr[i][j] = strArr[count];
				count++;
			}
		}
		
		System.out.println("== 1분단 ==");
		for(int i = 0; i < ownArr.length; i++) {
			for(int j = 0; j < ownArr[i].length; j++) {
				System.out.print(ownArr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("== 2분단 ==");
		for(int i = 0; i < twoArr.length; i++) {
			for(int j = 0; j < twoArr[i].length; j++) {
				System.out.print(twoArr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public void practice9() {
		String[] strArr = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", 
				"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		String[][] ownArr = new String[3][2];
		String[][] twoArr = new String[3][2];
		
		int count = 0; 
		for(int i = 0; i < ownArr.length; i++) {
			for(int j = 0; j < ownArr[i].length; j++) {
				ownArr[i][j] = strArr[count];
				count++;
			}
		}
		for(int i = 0; i < twoArr.length; i++) {
			for(int j = 0; j < twoArr[i].length; j++) {
				twoArr[i][j] = strArr[count];
				count++;
			}
		}
		
		System.out.println("== 1분단 ==");
		for(int i = 0; i < ownArr.length; i++) {
			for(int j = 0; j < ownArr[i].length; j++) {
				System.out.print(ownArr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("== 2분단 ==");
		for(int i = 0; i < twoArr.length; i++) {
			for(int j = 0; j < twoArr[i].length; j++) {
				System.out.print(twoArr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("=======================");
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String search = sc.next();
		
		int group = 0;
		char line = '\u0000';
		String way = null;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 2; j++) {
				if(ownArr[i][j].equals(search) || twoArr[i][j].equals(search)) {
					if(ownArr[i][j].equals(search)) {
						group = 1;
					} else {
						group = 2;
					}
					switch(i) {
					case 0 : line = '첫'; break;
					case 1 : line = '두'; break;
					case 2 : line = '세'; break;
					}
					switch(j) {
					case 0 : way = "왼쪽"; break;
					case 1 : way = "오른쪽"; break;
					}
				}
			}
		}
		//다른사람의 경우 1분단 2분단 출력코드를 나누고 안에 swhich가 아닌 삼항연산자로 처리했음
		
		System.out.printf("검색하신 %s 학생은 %d분단 %c 번째 줄 %s에 있습니다.", search, group, line, way);
	}
	
	
	public void practice10() {
		//String 2차원 배열 6행 6열을 만들고 행의 맨 위와 열의 맨 앞은 각 인덱스를 저장하세요.
		//그리고 사용자에게 행과 열을 입력 받아 해당 좌표의 값을 'X'로 변환해 2차원 배열을 출력하세요.
		String[][] strArr = new String[6][6];
		
		for(int i = 0; i < strArr.length; i++) {
			for(int j = 0; j < strArr[i].length; j++) {
				strArr[i][j] = " ";
			}
		}
		
		strArr[0] = new String[]{" ", "0", "1", "2", "3", "4"};
		strArr[1][0] = "0";
		strArr[2][0] = "1";
		strArr[3][0] = "2";
		strArr[4][0] = "3";
		strArr[5][0] = "4";
		
		System.out.print("행 인덱스 입력 : ");
		int hnum = sc.nextInt();
		System.out.print("열 인덱스 입력 : ");
		int lnum = sc.nextInt();
		
		strArr[hnum+1][lnum+1] = "X";
		
		for(int i = 0; i < strArr.length; i++) {
			for(int j = 0; j < strArr[i].length; j++) {
				System.out.print(strArr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void practice11() {
		//위 문제와 내용은 같으나 행 입력 시 99가 입력되지 않으면 무한반복
		String[][] strArr = new String[6][6];
		
		for(int i = 0; i < strArr.length; i++) {
			for(int j = 0; j < strArr[i].length; j++) {
				strArr[i][j] = " ";
			}
		}
		
		strArr[0] = new String[]{" ", "0", "1", "2", "3", "4"};
		strArr[1][0] = "0";
		strArr[2][0] = "1";
		strArr[3][0] = "2";
		strArr[4][0] = "3";
		strArr[5][0] = "4";
		
		while(true) {
			System.out.print("행 인덱스 입력 : ");
			int hnum = sc.nextInt();
			if(hnum == 99) {
				System.out.println("프로그램 종료");
				break;
			}
			System.out.print("열 인덱스 입력 : ");
			int lnum = sc.nextInt();
			
			strArr[hnum+1][lnum+1] = "X";
			
			for(int i = 0; i < strArr.length; i++) {
				for(int j = 0; j < strArr[i].length; j++) {
					System.out.print(strArr[i][j] + " ");
				}
				System.out.println();
			}
		}
		
	}
}
