package com.kh.hw.member.model.controller;

import java.util.Arrays;

import com.kh.hw.member.model.vo.Member;

public class MemberController {
	private Member[] m = new Member[SIZE];
	public static final int SIZE = 10;
	
	public int existMemberNum() {
		int count = 0;
		if(m != null) {
			for(int i = 0; i < m.length; i++) {
				if(m[i] != null) count++;
			}
		}
		return count;
	}
	
	public Boolean checkld(String inputId) {
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null) {
				if(m[i].getId().equals(inputId)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		for(int i = 0; i < m.length; i++) {
			if(m[i] == null) {
				m[i] = new Member(id, name, password, email, gender, age);
				break;
			}
		}
	}
	
	public String searchId(String id) {
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null) {
				if(m[i].getId().equals(id)) {
					return m[i].inform();
				}
			}
		}
		return null;
	}
	
	public Member[] searchName(String name) {
		Member[] result = new Member[m.length];
		int sum = 0;
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null) {
				if(m[i].getName().equals(name)) {
					result[sum] = m[i];
					sum++;
				}
			}
		}
		if(sum == 0) return null;
		
		return Arrays.copyOf(result, sum);
	}
	
	public Member[] searchEmail(String email) {
		Member[] result = new Member[m.length];
		int sum = 0;
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null) {
				if(m[i].getEmail().equals(email)) {
					result[sum] = m[i];
					sum++;
				}
			}
		}
		if(sum == 0) return null;
		
		return Arrays.copyOf(result, sum);
	}
	
	public Boolean updatePassword(String id, String password) {
		for(int i = 0; i < m.length; i++) {
			if(m[i].getId().equals(id)) {
				m[i].setPassword(password);
				return true;
			}
		}
		return false;
	}
	
	public Boolean updateName(String id, String name) {
		for(int i = 0; i < m.length; i++) {
			if(m[i].getId().equals(id)) {
				m[i].setName(name);
				return true;
			}
		}
		return false;
	}
	
	public Boolean updateEmail(String id, String email) {
		for(int i = 0; i < m.length; i++) {
			if(m[i].getId().equals(id)) {
				m[i].setEmail(email);
				return true;
			}
		}
		return false;
	}
	
	public Boolean delete(String id) {
		for(int i = 0; i < m.length; i++) {
			if(m[i].getId().equals(id)) {
				m[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public void delete() {
		for(int i = 0; i < m.length; i++) {
				m[i] = null;
		}
	}
	
	public Member[] printAll() {
		return m;
	}
}
