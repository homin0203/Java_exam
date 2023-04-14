package com.kh.hw.member.model.view;

import java.util.Scanner;

import com.kh.hw.member.model.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

public class MemberMenu {
	private	Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public void mainMenu() {
		while(true) {
			int memberNum = mc.existMemberNum();
			System.out.println("최대 등록 가능한 회원 수는 10명입니다.");
			System.out.printf("현재 등록된 회원 수는 %d명입니다. \n", memberNum);
			
			if(memberNum == 10) {
				System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
			} else {
				System.out.println("1. 새 회원 등록");			
			}
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 삭제");
			System.out.println("5. 모두 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			case 1 : insertMember(); break;
			case 2 : searchMember(); break;
			case 3 : updateMember(); break;
			case 4 : deleteMember(); break;
			case 5 : printAll(); break;
			case 9 :
				System.out.println("프로그램을 종료합니다.");
				return;
			default :
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				break;
			}
		}
	}
	
	public void insertMember() {
		System.out.println("새 회원을 등록합니다.");
		String id = null;
		while(true) {
			System.out.print("아이디 : ");
			id = sc.nextLine();		
			if(!mc.checkld(id)) {
				break;
			}
			System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
		}
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("비밀번호 : ");
		String password = sc.next();
		System.out.print("이메일 : ");
		String email = sc.next();
		sc.nextLine();
		char gender = '\u0000';
		while(true) {
			System.out.print("성별(M/F) : ");	
			String str = sc.nextLine();
			if(str.toUpperCase().equals("M") || str.toUpperCase().equals("F")) {
				gender = str.charAt(0);
				break;
			}
			System.out.println("성별을 다시 입력하세요.");
		}
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		mc.insertMember(id, name, password, email, gender, age);
		System.out.println();
	}
	
	public void searchMember() {
		System.out.println("1. 아이디로 검색하기");
		System.out.println("2. 이름으로 검색하기");
		System.out.println("3. 이메일로 검색하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		switch(num) {
		case 1 : searchId(); break;
		case 2 : searchName(); break;
		case 3 : searchEmail(); break;
		case 9 :
			System.out.println("메인으로 돌아갑니다. \n");
			return;
		default :
			System.out.println("잘못 입력하셨습니다. \n");
			return;
		}
		System.out.println();
	}
	
	public void searchId() {
		System.out.print("검색할 아이디 : ");
		String id = sc.nextLine();
		String result = mc.searchId(id);
		if(result == null) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			System.out.println("찾으신 회원 조회 결과입니다.");
			System.out.println(result);
		}
		System.out.println();
	}
	
	public void searchName() {
		System.out.print("검색할 이름 : ");
		String name = sc.nextLine();
		Member[] result = mc.searchName(name);
		if(result == null) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			System.out.println("찾으신 회원 조회 결과입니다.");
			for(Member mb : result) {
				if(mb != null)
				System.out.println(mb.inform());
			}
		}
		System.out.println();
	}
	
	public void searchEmail() {
		System.out.print("검색할 이메일 : ");
		String email = sc.nextLine();
		Member[] result = mc.searchEmail(email);
		if(result == null) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			System.out.println("찾으신 회원 조회 결과입니다.");
			for(Member mb : result) {
				if(mb != null)
				System.out.println(mb.inform());
			}
		}
		System.out.println();
	}
	
	public void updateMember() {
		System.out.println("1. 비밀번호 수정하기");
		System.out.println("2. 이름 수정하기");
		System.out.println("3. 이메일 수정하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		switch(num) {
		case 1 : updatePassword(); break;
		case 2 : updateName(); break;
		case 3 : updateEmail(); break;
		case 9 :
			System.out.println("메인으로 돌아갑니다."); break;
		default :
			System.out.println("잘못 입력하셨습니다."); break;
		}
		System.out.println();
	}
	
	public void updatePassword() {
		System.out.print("수정할 회원의 아이디 : ");
		String id = sc.nextLine();
		System.out.print("수정할 비밀번호 : ");
		String password = sc.nextLine();
		if(mc.updatePassword(id, password)) {
			System.out.println("수정이 성공적으로 되었습니다.");
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
		System.out.println();
	}
	
	public void updateName() {
		System.out.print("수정할 회원의 아이디 : ");
		String id = sc.nextLine();
		System.out.print("수정할 이름 : ");
		String name = sc.nextLine();
		if(mc.updateName(id, name)) {
			System.out.println("수정이 성공적으로 되었습니다.");
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
		System.out.println();
	}
	
	public void updateEmail() {
		System.out.print("수정할 회원의 아이디 : ");
		String id = sc.nextLine();
		System.out.print("수정할 이메일 : ");
		String email = sc.nextLine();
		if(mc.updateEmail(id, email)) {
			System.out.println("수정이 성공적으로 되었습니다.");
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
		}

		System.out.println();
	}
	
	public void deleteMember() {
		System.out.println("1. 특정 회원 삭제하기");
		System.out.println("2. 모든 회원 삭제하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		switch(num) {
		case 1 : deleteOne(); break;
		case 2 : deleteAll(); break;
		case 9 :
			System.out.println("메인으로 돌아갑니다."); break;
		default :
			System.out.println("잘못 입력하셨습니다."); break;
		}

		System.out.println();
	}
	
	public void deleteOne() {
		System.out.print("삭제할 회원의 아이디 : ");
		String id = sc.nextLine();
		System.out.print("정말 삭제하시겠습니까?(y/n) : ");
		String check = sc.nextLine();
		if(check.toUpperCase().equals("Y")) {
			if(mc.delete(id)) {
				System.out.println("성공적으로 삭제하였습니다.");
			} else {
				System.out.println("존재하지 않는 아이디입니다.");
			}
		}
		System.out.println();
	}
	
	public void deleteAll() {
		System.out.print("정말 삭제하시겠습니까?(y/n) : ");
		String check = sc.nextLine();
		if(check.toUpperCase().equals("Y")) {
			mc.delete();
			System.out.println("성공적으로 삭제하였습니다.");
		}
		System.out.println();
	}
	
	public void printAll() {
		Member[] m = mc.printAll();
		int count = 0;
		for(Member mb : m) {
			if(mb != null) {
				System.out.println(mb.inform());
				count++;
			}
		}
		if(count == 0) System.out.println("저장된 회원이 없습니다.");
		
		System.out.println();
	}
}
