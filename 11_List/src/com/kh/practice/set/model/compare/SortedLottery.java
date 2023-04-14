package com.kh.practice.set.model.compare;

import java.util.Comparator;

import com.kh.practice.set.model.vo.Lottery;

public class SortedLottery implements Comparator<Lottery> {
	public int compare(Lottery o1, Lottery o2) {
		int check = 0;
		check = o1.getName().compareTo(o2.getName());
		if(check == 0) {
			check = o1.getPhone().compareTo(o2.getPhone());
		}
		return check;
	}
}
