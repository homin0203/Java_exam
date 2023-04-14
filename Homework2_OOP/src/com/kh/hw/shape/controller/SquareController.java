package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class SquareController {
//	private Shape s = new Shape();
	private Shape s;
	
	public double calcPerimeter(double height, double width) {
		//모양 타입 번호와 받은 매개변수를 매개변수 있는 생성자로 초기화 후 둘레 반환
		s = new Shape(4, height, width);
//		s.setHeight(height);
//		s.setWidth(width); 
		//private Shape s = new Shape();위에 이런식으로 할경우 setter를 통해 입력해야함
		return s.getHeight() * 2 + s.getWidth() * 2;
	}
	
	public double calcArea(double height, double width) {	
		//모양타입 번호와 받은 매개변수를 매개변수 있는 생성자로 초기화 시킨 후 넓이 반환
		s = new Shape(4, height, width);
		return s.getHeight() * s.getWidth();
	}

	public void paintColor(String color) {
		s.setColor(color);
	}
	
	public String print() {
		//모양과 Shape의 information()메소드 반환 값 합쳐 반환
		return "사각형" + s.information();
	}
}
