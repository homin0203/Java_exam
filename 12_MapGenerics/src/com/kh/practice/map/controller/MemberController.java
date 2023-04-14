package com.kh.practice.map.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

import com.kh.practice.map.model.vo.Member;

public class MemberController {
	private HashMap<String, Member> map = new HashMap<String, Member>();
	
	public boolean joinMembership(String id, Member m) {
		if(map.containsKey(id)) {
			return false;
		} 
		map.put(id, m);
		return true;
	}
	
	public String logIn(String id, String password) {
		if(map.containsKey(id)) {
			if(map.get(id).getPassword().equals(password)) {
				return map.get(id).getName();
			}
		}
		return null;
	}
	
	public boolean changePassword(String id, String oldPw, String newPw) {
		if(map.containsKey(id)) {
			if(map.get(id).getPassword().equals(oldPw)) {
				map.get(id).setPassword(newPw);
				return true;
			}
		}
		return false;
	}
	
	public void changeName(String id, String newName) {
		map.get(id).setName(newName);
	}
	
	public TreeMap<String, String> sameName(String name) {
		TreeMap<String, String> treeMap = new TreeMap<String, String>();
		Iterator<String> mKey = map.keySet().iterator();
		String m = null;
		while(mKey.hasNext()) {
			m = mKey.next();
			if(map.get(m).getName().equals(name)) {
				treeMap.put(m, name);
			}
		}
		return treeMap;
	}
}
