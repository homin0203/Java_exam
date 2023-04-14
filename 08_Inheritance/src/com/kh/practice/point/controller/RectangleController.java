package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {
	private Rectangle r = new Rectangle();

	public String calcArea(int x, int y, int height, int width) {
		// 받은 매개변수를 이용하여 필드들을 초기화하고 초기화한 정보와 면적 반환

		// setter를 이용해 초기화
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);

		// 면적 : 높이 * 너비 //getter를 이용해 높이,너비 값 호출해서 계산
		int area = r.getHeight() * r.getWidth();
//		return "면적 : " + r.getX() + ", " + r.getY() + ", " + r.getHeight() + ", " + r.getWidth() + " / " + area;
		return "면적 : " + r.toString() + area; //위에 방식으로 했다가 toSting() 사용하려고 변경.
	}

	public String calcPerimeter(int x, int y, int height, int width) {
		// 받은 매개변수를 이용하여 필드들을 초기화하고 초기화한 정보와 둘레 반환

		// setter를 이용해 초기화
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);

		// 면적 : 2 * (높이 + 너비) //getter를 이용해 높이,너비 값 호출해서 계산
		int perimeter = 2 * (r.getHeight() + r.getWidth());
		
//		return "둘레 : " + r.getX() + ", " + r.getY() + ", " + r.getHeight() + ", " + r.getWidth() + " / " + perimeter;
		return "둘레 : " + r.toString() + perimeter;	
	}
}
