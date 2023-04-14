package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {
	private Circle c = new Circle();

	public String calcArea(int x, int y, int radius) {
		// 받은 매개변수를 이용하여 필드들을 초기화하고 초기화한 정보와 면적 반환

		// setter를 이용해 초기화
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		// 면적 : PI * 반지름 * 반지름 // Math.PI는 파이 값, getter로 호출해서 계산
		double area = Math.PI * c.getRadius() * c.getRadius();

//		return "면적 : " + c.getX() + ", " + c.getY() + ", " + c.getRadius() + " / " + area;
		return "면적 : " + c.toString() + area; //위에 방식으로 했다가 toSting() 사용하려고 변경.
	}

	public String calcCircum(int x, int y, int radius) {
		// 받은 매개변수를 이용하여 필드들을 초기화하고 초기화한 정보와 둘레 반환

		// setter를 이용해 초기화
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		// 면적 : PI * 반지름 * 2 // getter로 호출해서 계산
		double circum = Math.PI * c.getRadius() * 2;
		
//		return "둘레 : " + c.getX() + ", " + c.getY() + ", " + c.getRadius() + " / " + circum;
		return "둘레 : " + c.toString() + circum;
	}
}
