package com.kh.hw.employee.controller;

import com.kh.hw.employee.model.vo.Employee;

public class EmployeeController {
//	private Employee e = new Employee();
//	아래 매개변수 있는 생성자를 이용하여 데이터를 저정하는 메소드가 있어서 선언만 하는걸로 수정
	private Employee e; 
	
	public void add(int empNo, String name, char gender, String phone) {
		e = new Employee(empNo, name, gender, phone);
	}
	
	public void add(int empNo, String name, char gender, String phone, String dept, int salary, double bouns) {
		e = new Employee(empNo, name, gender, phone, dept, salary, bouns);
	}
	
	public void modify(String phone) {
		e.setPhone(phone);
	}
	
	public void modify(int salary) {
		e.setSalary(salary);
	}
	
	public void modify(double bouns) {
		e.setBouns(bouns);
	}
	
	public Employee remove() {
		//객체를 삭제하는 메소드이므로 객체 e의 값을 null로 수정
		e = null;
		return e;
	}
	
	public String inform() {
		//객체값이 null이면 null 반환, 아니면 사원 정보 반환(printEmployee()를 반환)
		//그래서 if조건문으로 상황에 따른 return 값을 분리
		if(e == null) {
			return null;
		} else {
			return e.printEmployee();
		}
	}
}
