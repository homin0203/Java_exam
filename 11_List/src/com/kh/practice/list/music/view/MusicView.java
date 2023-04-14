package com.kh.practice.list.music.view;

import java.util.List;
import java.util.Scanner;

import com.kh.practice.list.music.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

public class MusicView {
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("===***** 메인 메뉴 *****===");
			System.out.println("1. 마지막 위치에 곡 추가");
			System.out.println("2. 첫 위치에 곡 추가");
			System.out.println("3. 전체 곡 목록 출력");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 삭제");
			System.out.println("6. 특정 곡 정보 수정");
			System.out.println("7. 곡명 오름차순 정렬");
			System.out.println("8. 가수명 내림차순 정렬");
			System.out.println("9. 종료");
			System.out.println();
			System.out.print("메인 번호 선택 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			case 1 : addList(); break;
			case 2 : addAtZero(); break;
			case 3 : printAll(); break;
			case 4 : searchMusic(); break;
			case 5 : removeMusic(); break;
			case 6 : setMusic(); break;
			case 7 : ascTitle(); break;
			case 8 :descSinger(); break;
			case 9 : System.out.println("프로그램 종료"); return;
			default : System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
	
	public void addList() {
		System.out.println("******* 마지막 위치에 곡 추가 *******");
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		System.out.print("가수 명 : ");
		String singer = sc.nextLine();
		if(mc.addList(new Music(title, singer)) == 1) {
			System.out.println("추가 성공");
		} else {
			System.out.println("추가 실패");
		}
		System.out.println();
	}
	
	public void addAtZero() {
		System.out.println("******* 첫 위치에 곡 추가 *******");
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		System.out.print("가수 명 : ");
		String singer = sc.nextLine();
		if(mc.addAtZero(new Music(title, singer)) == 1) {
			System.out.println("추가 성공");
		} else {
			System.out.println("추가 실패");
		}
		System.out.println();
	}
	
	public void printAll() {
		System.out.println("******* 전체 곡 목록 출력 *******");
//		Iterator<Music> m =  mc.printAll().iterator();
//		while(m.hasNext()) {
//			System.out.println(m.next().toString());
//		} 
		
		//[ , ] 예시와 맞게 출력할려고 일반 for문으로 수정
		List<Music> m = mc.printAll();
		for(int i = 0; i < m.size(); i++) {
			if(i == 0) {
				System.out.print("[" + m.get(i).toString() + ", ");
			} else if(i == m.size()-1) {
				System.out.println(m.get(i).toString() + "]");
			} else {
				System.out.print(m.get(i).toString() + ", ");
			}
		}
		System.out.println();
	}
	
	public void searchMusic() {
		System.out.println("******* 특정 곡 검색 *******");
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		Music m = mc.searchMusic(title);
		System.out.printf("검색한 곡은 %s 입니다. \n \n", m.toString());
	}
	
	public void removeMusic() {
		System.out.println("******* 특정 곡 삭제 *******");
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		Music m = mc.removeMusic(title);
		if(m == null) {
			System.out.println("수정할 곡이 없습니다.");
			return;
		} 
		System.out.printf("%s을 삭제 했습니다. \n \n", m.toString());
		
	}
	
	public void setMusic() {
		System.out.println("******* 특정 곡 수정 *******");
		System.out.print("검색할 곡 명 : ");
		String title = sc.nextLine();
		System.out.print("수정할 곡 명 : ");
		String tCheck = sc.nextLine();
		System.out.print("수정할 가수 명 : ");
		String sCheck = sc.nextLine();
		
		Music m = mc.setMusic(title, new Music(tCheck, sCheck));

		System.out.printf("%s가 값이 변경되었습니다. \n \n", m.toString());
		
	}
	
	public void ascTitle() {
		if(mc.ascTitle() == 1) {
			System.out.println("정렬 성공");
		} else {
			System.out.println("정렬 실패");
		}
		System.out.println();
	}
	
	public void descSinger() {
		if(mc.descSinger() == 1) {
			System.out.println("정렬 성공");
		} else {
			System.out.println("정렬 실패");
		}
		System.out.println();
	}
}
