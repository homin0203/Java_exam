package com.kh.practice.list.library.controller;

import java.util.*;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {
	private List<Book> bookList = new ArrayList<Book>();
	
	public BookController() {
		bookList.add(new Book("자바의 정석", "남궁 성", "기타", 20000));
		bookList.add(new Book("쉽게 배우는 알고리즘", "문병로", "기타", 15000));
		bookList.add(new Book("대화의 기술", "강보람", "인문", 17500));
		bookList.add(new Book("암 정복기", "박신우", "의료", 21000));
	}
	
	public void insertBook(Book bk) {
		bookList.add(bk);
	}
	
	public ArrayList<Book> selectList() {
		//해당 북리스트의 주소값 반환
		//그냥 bookList로는 그냥 반환이 안되서 다운캐스팅
		return (ArrayList<Book>)bookList;
	}
	
	public ArrayList<Book> searchBook(String keyword) {
		ArrayList<Book> searchList = new ArrayList<Book>();
		
		for(Book b : bookList) {
			if(b.getTitle().contains(keyword)) {
				//contains로 keyword존재하는 객체 확인
				//.add로 담을 리스트에 추가
				searchList.add(b);
			}
		}
		return searchList;
	}
	
	public Book deleteBook(String title, String author) {
		Book removeBook = null;
		for(Book b : bookList) {
			if(b.getTitle().equals(title) && b.getAuthor().equals(author)) {
				//title,author 둘다 동일할 경우 removeBook에 해당 인덱스 값을 넣고 삭제
				removeBook = b;
				bookList.remove(b);
				break;
			}
		}
		return removeBook;
	}
	
	public int ascBook() {
		List<String> sList = new ArrayList<String>();
		for(int i = 0; i < bookList.size(); i++) {
			sList.add(bookList.get(i).getTitle());
		}
		Collections.sort(sList);
		List<Book> reBList = new ArrayList<Book>();
		for(String s : sList) {
			for(Book b : bookList) {
				if(b.getTitle().equals(s)) {
					reBList.add(b);
					bookList.remove(b);
					break;
					//책 이름이 같을 경우를 생각해서 한번 책이름이 맞아서 객체를 추가한 경우는 삭제
				}
			}
		}
		bookList = reBList; //오름차순으로 새로 저정한 리스트를 다시 bookList에 얕은 복사
		
		Collections.sort(bookList);
		return 1;
	}
	
}
