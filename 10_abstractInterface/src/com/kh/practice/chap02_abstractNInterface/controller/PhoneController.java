package com.kh.practice.chap02_abstractNInterface.controller;

import com.kh.practice.chap02_abstractNInterface.model.vo.GalaxyNote9;
import com.kh.practice.chap02_abstractNInterface.model.vo.Phone;
import com.kh.practice.chap02_abstractNInterface.model.vo.V40;

public class PhoneController {
	private String[] result = new String[2];
	
	public String[] method() {
		Phone[] p = new Phone[]{new GalaxyNote9(), new V40()};
		for(Phone e : p) {
			if(e instanceof GalaxyNote9) {
				result[0] = ((GalaxyNote9)e).printlnformation();
			} else if(e instanceof V40) {
				result[1] = ((V40)e).printlnformation();
			}
		}
		
		return result;
	}
}
