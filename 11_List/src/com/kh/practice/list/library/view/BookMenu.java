package com.kh.practice.list.library.view;

import java.util.*;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	
	public void mainMenu() {
		System.out.println("== Welcome KH Library");
		while(true) {
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색 조회");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서 명 오름차순 정렬");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			int num = Integer.parseInt(sc.nextLine());
			
			switch(num) {
			case 1 :
				insertBook(); break;
			case 2 :
				selectList(); break;
			case 3 :
				searchBook(); break;
			case 4 :
				deleteBook(); break;
			case 5 :
				ascBook(); break;
			case 9 :
				System.out.println("프로그램을 종료합니다."); return;
			default :
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요."); break;
			}
		}
	}
	
	public void insertBook() {
		System.out.println("책 정보를 입력해주세요.");
		System.out.print("도서명 : ");
		String title = sc.nextLine();
		System.out.print("저자 명 : ");
		String author = sc.nextLine();
		int category = 0;
		String sCategory = null;
		end:
		while(true) {
			try {
				System.out.print("장르(1. 인문 / 2. 과확 / 3. 외국어 / 4. 기타) : ");
				String categoryStr = sc.nextLine();
				category = Integer.parseInt(categoryStr);	
				
				//반복문을 통해 category의 선택 값에 따른 장르 명으로 값 넣기
				switch(category) {
				case 1 : sCategory = "인문"; break end;
				case 2 : sCategory = "과학"; break end;
				case 3 : sCategory = "외국어"; break end;
				case 4 : sCategory = "기타"; break end;
				default : throw new NumberFormatException();
				}
			} catch(NumberFormatException e) {
				System.out.println("1-4까지의 장르를 선택해주세요.");
			}
		}
		System.out.print("가격 : ");
		int price = Integer.parseInt(sc.nextLine());
		
		
		
		//입력받은 값으로 Book객체 만들어서 insertBook()으로 전달
		bc.insertBook(new Book(title, author, sCategory, price));
	}
	
	public void selectList() {
		ArrayList<Book> bookList = bc.selectList();
		
		if(bookList.isEmpty()) { //isEmpty : 해당 리스트가 비어있는지 확인하는 메소드 비어있으면 true값 반환
			System.out.println("존재하는 도서가 없습니다.");
		} else { //비어 있지 않을 경우 for문을 통해서 각 객체들 출력
			for(Book b : bookList) {
				System.out.println(b.toString());
			}
		}
	}
	
	public void searchBook() {
		System.out.print("검색 키워드 : ");
		String keyword = sc.nextLine();
		ArrayList<Book> searchList = bc.searchBook(keyword);
		
		//키워드로 받아온 리스트 값의 공간이 비어있는지 체크 및 출력
		if(searchList.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			for(Book b : searchList) {
				System.out.println(b.toString());
			}
		}
	}
	
	public void deleteBook()  {
		System.out.print("삭제할 도서명 : ");
		String title = sc.nextLine();
		System.out.print("삭제할 저자명 : ");
		String author = sc.nextLine();
		
		Book b = bc.deleteBook(title, author);
		if(b == null) {
			System.out.println("삭제할 도서를 찾기 못했습니다.");
		} else {
			System.out.println("성공적으로 삭제되었습니다.");
		}
	}
	
	public void ascBook() {
		if(bc.ascBook() == 1) {
			System.out.println("정렬에 성공하였습니다.");
		} else {
			System.out.println("정렬에 실패하였습니다.");
		}
	}

}
