package com.kh.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1() {
		// 길이가 10인 배열을 선언, 반복문으로 통해 1~10까지 값을 순서대로 넣고 출력
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d] : %d \n", i, arr[i]);
		}

	}

	public void practice2() {
		// 위와 같지만 역순으로 값을 넣기
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = 10 - i;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d] : %d \n", i, arr[i]);
		}

	}

	public void practice3() {
		// 사용자에게 입력받은 양의 정수만큼 배열크기를 할당하고
		// 1부터 입력 받은 값까지 배열에 초기화 후 출력

		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		sc.nextLine();

		int[] arr = new int[num];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public void practice4() {
		// 길이가 5인 String배열을 선언하고 "사과","귤","포도","복숭아","참외"로 초기화
		// 배열 인덱스를 활용해서 귤을 출력
		String[] arr = new String[] { "사과", "귤", "포도", "복숭아", "참외" };
		System.out.println(arr[1]);

	}

	public void practice5() {
		// 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열 몇 개 들어가 있는지
		// 개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력
		System.out.print("문자열 : ");
		String str = sc.next();
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);
		sc.nextLine();

		char[] chArr = new char[str.length()];
		for (int i = 0; i < chArr.length; i++) {
			chArr[i] = str.charAt(i);
		}
		int count = 0;
		System.out.printf("%s에 %c가 존재하는 위치(인덱스) : ", str, ch);
		for (int i = 0; i < chArr.length; i++) {
			if (chArr[i] == ch) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println("i 개수 : " + count);
	}

	public void practice6() {
		// "월" ~ "일"까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
		// 입력한 숫자와 같은 인덱스에 있는 요일을 출력하고 범위에 없는 숫자를 입력 시 "잘못 입력하셨습니다."출력

		String[] strArr = { "월", "화", "수", "목", "금", "토", "일" };

		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();

		if (num >= 0 && num <= 6) {
			System.out.println(strArr[num] + "요일");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}

	public void practice7() {
		// 사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당
		// 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인데스에 값을 초기화하세요.
		// 그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력

		System.out.print("정수 : ");
		int num = sc.nextInt();

		int[] nArr = new int[num];

		for (int i = 0; i < nArr.length; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			nArr[i] = sc.nextInt();
		}

		int sum = 0;
		for (int i = 0; i < nArr.length; i++) {
			System.out.print(nArr[i] + " ");
			sum += nArr[i];
		}
		System.out.println();

		System.out.println("총 합 : " + sum);
	}

	public void practice8() {
		// 3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
		// 중간 이후부터는 끝까지 1씩 감소하여 내림차순으로 값을 넣어 출력
		// 단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 "다시 입력하세요"를 출력하고 다시 정수를 받기

		int num = 0;
		int[] nArr;
		while (true) {
			System.out.print("정수 : ");
			num = sc.nextInt();

			if (num < 3 || num % 2 == 0) {
				System.out.println("다시 입력하세요.");
				continue;
			} else {
				nArr = new int[num];
				int sum = 0;
				for (int i = 0; i < nArr.length; i++) {
					if (i <= nArr.length / 2) {
						sum++;
						nArr[i] = sum;
					} else {
						sum--;
						nArr[i] = sum;
					}
				}

				for (int i = 0; i < nArr.length; i++) {
					if (i == nArr.length - 1) {
						System.out.print(nArr[i]);
					} else {
						System.out.print(nArr[i] + ", ");
					}
				}
				break;
			}
		}
	}

	public void practice9() {
		// 사용자가 입력한 값이 배열에 있는지 검색하여
		// 있으면, "@@@ 치킨 배달 가능", 없으면 "@@@ 치킨은 없는 메뉴입니다"를 출력하세요.
		// 단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.

		String[] sArr = { "양념", "불닭", "후라이드", "간장" };

		System.out.print("치킨 이름을 입력하세요 : ");
		String str = sc.next();
		sc.nextLine();

		String check = null;
		for (int i = 0; i < sArr.length; i++) {
			if (sArr[i].equals(str)) {
				check = str;
			}
		}

		if (str.equals(check)) {
			System.out.printf("%s 치킨 배달 가능 \n", str);
		} else {
			System.out.printf("%s 치킨은 없는 메뉴입니다 \n", str);
		}
	}

	public void practice10() {
		// 주민등록번호 성별자리 이후부터 *로 가리고 출력
		// 단, 원본 배열 값은 변경 없이 배열 복사본으로 변경하세요.

		System.out.print("주민등록번호(-포함) : ");
		String nstr = sc.next();
		sc.nextLine();
		char[] cArr = new char[nstr.length()];
		for (int i = 0; i < cArr.length; i++) {
			cArr[i] = nstr.charAt(i);
		}
		char[] cArr2 = new char[cArr.length];
		System.arraycopy(cArr, 0, cArr2, 0, cArr.length);

		for (int i = 8; i < cArr2.length; i++) {
			cArr2[i] = '*';
		}

		for (int i = 0; i < cArr2.length; i++) {
			System.out.print(cArr2[i]);
		}
	}

	public void practice11() {
		// 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		// 1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.

		int[] nArr = new int[10];
		for (int i = 0; i < nArr.length; i++) {
			nArr[i] = (int) (Math.random() * 10 + 1);
		}
		// Math.random() = 0.0****~0.9***** 범위의 랜덤 값
		// Math.random() * 10 = 0.******** ~ 9.******** 범위의 랜덤 값
		// Math.random() * 10 + 1 = 1.******* ~ 10.***** 범위의 랜덤 값이 됨.
		// (int)(Math.random() * 10 + 1) = 1~10의 랜덤 값

		for (int i = 0; i < nArr.length; i++) {
			System.out.print(nArr[i] + " ");
			;
		}
	}

	public void practice12() {
		// 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		// 1~10사이의 난수를 발생시켜 배열에 초기화 후
		// 배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.

		int[] nArr = new int[10];
		for (int i = 0; i < nArr.length; i++) {
			nArr[i] = (int) (Math.random() * 10 + 1);
		}

		for (int i = 0; i < nArr.length; i++) {
			System.out.print(nArr[i] + " ");
			;
		}
		System.out.println();

		int min = 0;
		int max = 0;
		for (int i = 0; i < nArr.length - 1; i++) {
			if (nArr[i] > nArr[i + 1]) {
				max = nArr[i];
				nArr[i] = nArr[i + 1];
				nArr[i + 1] = max;
			}
		}

		for (int i = 0; i < nArr.length - 1; i++) {
			if (nArr[i] < nArr[i + 1]) {
				min = nArr[i];
				nArr[i] = nArr[i + 1];
				nArr[i + 1] = min;
			}
		}

		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}

	public void practice13() {
		// 10개의 값을 저장할 수 있는 정수형배열을 선언 및 할당하고
		// 1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화 후 출력

		int[] nArr = new int[10];
		int i = 0;
		while (i < nArr.length) {
			nArr[i] = (int) (Math.random() * 10 + 1);

			for (int j = 0; j < i; j++) {
				if (nArr[i] == nArr[j]) {
					break;
				} else if (j == i - 1) {
					i++;
					break;
				}
			}
			if (i == 0) {
				i++;
			}
		}

		for (int j = 0; j < nArr.length; j++) {
			System.out.print(nArr[j] + " ");
			;
		}
	}

	public void practice14() {
		// 로또 번호 자동 생성기 프로그램을 작성, 중복 값 없이 오름차순으로 정렬
		int[] nArr = new int[6];
		int i = 0;
		while (i < nArr.length) {
			nArr[i] = (int) (Math.random() * 45 + 1);
			for (int j = 0; j < i; j++) {
				if (nArr[i] == nArr[j]) {
					break;
				} else if (j == i - 1) {
					i++;
					break;
				}
			}
			if (i == 0) {
				i++;
			}
		}

		for (int j = 0; j < nArr.length - 1; j++) {
			for (int k = 0; k < nArr.length - 1 - j; k++) {
				if (nArr[k] > nArr[k + 1]) {
					int temp = nArr[k];
					nArr[k] = nArr[k + 1];
					nArr[k + 1] = temp;
				}
			}
		}

		for (int j = 0; j < nArr.length; j++) {
			System.out.print(nArr[j] + " ");
			;
		}
	}

	public void practice15() {
		// 문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장
		// 문자의 개수와 함께 출력
		System.out.print("문자열 : ");
		String str = sc.next();
		sc.nextLine();

		int count = 0;
		char[] chArr = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			if (i == 0) {
				chArr[i] = str.charAt(i);
				count++;
				continue;
			}
			for (int j = 0; j < i; j++) {
				if (chArr[j] == str.charAt(i)) {
					break;
				} else if (chArr[j] != str.charAt(i) && chArr[j] == '\u0000') {
					chArr[j] = str.charAt(i);
					count++;
					break;
				}
			}
		}
		char[] tcArr = new char[count];
		System.arraycopy(chArr, 0, tcArr, 0, count);

		System.out.print("문자열에 있는 문자 : ");
		for (int i = 0; i < tcArr.length; i++) {
			if (i == tcArr.length - 1) {
				System.out.print(tcArr[i] + "\n");
				break;
			}
			System.out.print(tcArr[i] + ", ");
		}
		System.out.println("문자 개수 : " + tcArr.length);
	}

	public void practice16() {
		String[] strArr = new String[100];

		int num = 0;
		while(true) {
			if(num == 0) {
				System.out.print("배열의 크기를 입력하세요 : ");
				num = sc.nextInt();
				sc.nextLine();
				
				for(int i = 0; i < num; i++) {
					System.out.printf("%d번쨰 문자열 : ", i+1);
					strArr[i] = sc.nextLine();
				}
			} else {
				System.out.print("더 입력하고 싶은 개수 : ");
				int add = sc.nextInt();
				sc.nextLine();
				
				for(int i = num; i < num + add; i++) {
					System.out.printf("%d번쨰 문자열 : ", i+1);
					strArr[i] = sc.nextLine();
				}
				num += add;
			}
			
			String[] strArr2 = Arrays.copyOf(strArr, num); 
			
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			String check = sc.nextLine();
			
			if(check.toUpperCase().equals("N")) {
				for(int i = 0; i < strArr2.length; i++) {
					if(i == 0) {
						System.out.print("[" + strArr2[i]);
					} else if(i == strArr2.length-1) {
						System.out.print(", " + strArr2[i] + "]");
					} else {
						System.out.print(", " + strArr2[i]);
					}
				}
				break;
			}
		} 
	}
}
