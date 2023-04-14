package com.kh.practice.chap01_poly.model.vo;

public class Member {
	private String name; 	//회원명
	private int age;		//회원나이
	private char gender;	//성별
	private int couponCount;//요리학원쿠폰개수 = 0;
	
	public Member() {}
	public Member(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", gender=" + gender + ", couponCount=" + couponCount + "]";
	}
	
	public int getCouponCount() {
		return couponCount;
	}
	public void setCouponCount() {
		this.couponCount++;
	} //요리책의 쿠폰유무가 "유"일 경우 회원의 couponCount를 1증가하기 위해 기능 수정
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}

	
}
