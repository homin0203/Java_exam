package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.CookBook;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryMenu {
	private Scanner sc = new Scanner(System.in);
	private LibraryController lc = new LibraryController();
	
	public void mainMenu() {
		//이름, 나이, 성별을 입력 받아 Member객체 생성 후 lc.insertMember()에 전달
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("성별 : ");
		char gender = sc.next().charAt(0);
		Member mem = new Member(name, age, gender);
		lc.insertMember(mem);
		
		while(true) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1 :
				System.out.println(lc.myInfo().toString());
				break;
			case 2 :
				selectAll();
				break;
			case 3 :
				searchBook();
				break;
			case 4 :
				rentBook();
				break;
			case 9 :
				System.out.println("프로그램을 종료합니다.");
				return;
			default :
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
	}
	
	public void selectAll() {
		Book[] bList = lc.selectAll();
		
//		for(int i = 0; i < bList.length; i++) {
//			System.out.printf("%d번도서 : %s / %s / %s /", i, bList[i].getTitle(), bList[i].getAuthor(), bList[i].getPublisher());
//			
//			if(bList[i].toString().contains("AniBook")) {
//				System.out.printf("%d \n", ((AniBook)bList[i]).getAccessAge());
//			} else {
//				System.out.printf("%b \n", ((CookBook)bList[i]).isCoupon());
//			}
//		}
		for(int i = 0; i < bList.length; i++) {
			System.out.println(bList[i].toString());
		}
	}
	
	public void searchBook() {
		System.out.print("검색할 제목 키워드 : ");
		String keyword = sc.next();
		
		Book[] searchList = lc.searchBook(keyword);
		
		for(int i = 0; i < searchList.length; i++) {
			System.out.println(searchList[i].toString());
		}
		
	}
	
	public void rentBook() {
		//도서목록 출력
		Book[] bList = lc.selectAll();
		for(int i = 0; i < bList.length; i++) {
			System.out.println(i + "번 도서 : " + bList[i].toString());
		}
		
		System.out.print("대여할 도서 번호 선택 : ");
		int index = sc.nextInt();
		
		//입력받은 도서 번호 값을 대여코드에 입력 후 대여 성공 여부 출력
		switch(lc.rentBook(index)) {
		case 0 :
			System.out.println("성공적으로 대여되었습니다.");
			break;
		case 1 :
			System.out.println("나이 제한으로 대여 불가능입니다.");
			break;
		case 2 :
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요.");
			break;
		}
		
	}
}
