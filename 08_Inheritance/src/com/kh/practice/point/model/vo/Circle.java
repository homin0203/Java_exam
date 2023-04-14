package com.kh.practice.point.model.vo;

public class Circle extends Point {
	private int radius;
	
	public Circle() {}
	
	public Circle(int x, int y, int radius) {
		super.setX(x);
		super.setY(y);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return super.toString() + radius + " / ";
	} //필드의 정보를 반환하는 메소드라고 설명되어 있지만 출력시 toString 이용하려고 변형
}
