package com.kh.practice.set.view;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import com.kh.practice.set.controller.LotteryController;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryMenu {
	private Scanner sc = new Scanner(System.in);
	private LotteryController lc = new LotteryController();

	public void mainMenu() {
		System.out.println("========== KH 추첨 프로그램 ==========");

		while (true) {
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 추첨 대상 추가");
			System.out.println("2. 추첨 대상 삭제");
			System.out.println("3. 당첨 대상 확인");
			System.out.println("4. 정렬된 당첨 대상 확인");
			System.out.println("5. 당첨 대상 검색");
			System.out.println("9. 종료");
			System.out.println();
			System.out.print("메뉴 번호 선택 : ");
			int num = Integer.parseInt(sc.nextLine());

			switch (num) {
			case 1:
				insertObject();
				break;
			case 2:
				deleteObject();
				break;
			case 3:
				winObject();
				break;
			case 4:
				sortedWinObject();
				break;
			case 5:
				searchWinner();
				break;
			case 9:
				System.out.println("프로그램 종료.");
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
				break;
			}
		}
	}

	public void insertObject() {
		System.out.print("추가할 추첨 대상 수 : ");
		int num = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < num;) {
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("핸드폰 번호('-' 빼고) : ");
			String phone = sc.nextLine();
			System.out.println();
			Lottery l = new Lottery(name, phone);
			boolean check = lc.insertObject(l);
			if (!check) {
				System.out.println("중복된 대상입니다. 다시 입력하세요.");
			} else {
				i++;
			}
		}
		System.out.println("추가 완료되었습니다.");
	}

	public void deleteObject() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("핸드폰 번호('-' 빼고) : ");
		String phone = sc.nextLine();
		Lottery l = new Lottery(name, phone);
		boolean check = lc.deleteObject(l);
		if (check) {
			System.out.println("삭제 완료 되었습니다.");
		} else {
			System.out.println("존재하지 않는 대상입니다.");
		}
	}

	public void winObject() {
		HashSet<Lottery> hSet = lc.winObject();
		Iterator<Lottery> w = hSet.iterator();

		for (int i = 0; i < hSet.size(); i++) {
			w.hasNext();
			if (i == 0) {
				System.out.print("[" + w.next().toString() + ", ");
			} else if (i == hSet.size()-1) {
				System.out.println(w.next().toString() + "]");
			} else {
				System.out.print(w.next().toString() + ", ");
			}
		}
	}

	public void sortedWinObject() {
		Iterator<Lottery> w = lc.sortedWinObject().iterator();
		while(w.hasNext()) {
			System.out.println(w.next().toString());
		}
	}

	public void searchWinner() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("핸드폰 번호('-'빼고) : ");
		String phone = sc.nextLine();
		Lottery l = new Lottery(name, phone);
		boolean check = lc.searchWinner(l);
		if(check) {
			System.out.println("축하합니다. 당첨 목록에 존재합니다.");
		} else {
			System.out.println("안타깝지만 당첨 목록에 존재하지 않습니다.");
		}
	}
}
