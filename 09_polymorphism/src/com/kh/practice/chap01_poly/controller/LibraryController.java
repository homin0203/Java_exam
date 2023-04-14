package com.kh.practice.chap01_poly.controller;

import java.util.Arrays;

import com.kh.practice.chap01_poly.model.vo.*;

public class LibraryController {
	private Member mem = null;
	private Book[] bList = new Book[5];
	
	{
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
	}
	
	public void insertMember(Member mem) {
		this.mem = mem;
	}
	
	public Member myInfo() {
		return mem;
	}
	
	public Book[] selectAll() {
		return bList;
	}
	
	public Book[] searchBook(String keyword) {
		Book[] cList = new Book[5];
		int count = 0;
		for(int i = 0; i < bList.length; i++) {
			if(bList[i].toString().contains(keyword)) {
				cList[count] = bList[i];
				count++;
			}
		}
		Book[] lList = Arrays.copyOf(cList, count);
		//위 공식에서 keyword가 포함되어있는 목록은 새로운 cList에 저장하는데 그 마지막 index 자리는
		//마지막에 자리에 값을 넣은후 ++;이 됐으므로 count-1
		//그리고 cList에서 null값은 제외면 keyword가 포함된 정보가 저장된 부분의 크기는 count
		return lList;
	}
	
	public int rentBook(int index) {
		int result = 0;
		
		//전달 받은 index의 bList 객체가 만화책을 참조하고 있고 나이제한에 걸릴경우 result를 1로 초기화
		if (bList[index].toString().contains("AniBook")) {
			if(mem.getAge() < ((AniBook)bList[index]).getAccessAge()) {
				result = 1;
			}
		}
		//전달 받은 index의 bList 객체가 요리책을 참조하고 있고 해당 책의 쿠폰유무가 "유"일 경우
		//회원의 couponCount를 1증가 처리후 result를 2로 초기화
		if (bList[index].toString().contains("CookBook")) {
			if(((CookBook)bList[index]).isCoupon()) {
				mem.setCouponCount();
				result = 2;
			}
		}
		return result;
	}
}
