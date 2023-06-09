package com.kh.practice.chap02_abstractNInterface.model.vo;

public class V40 extends SmartPhone implements NotePen {

	public V40() {
		super.setMaker("LG");
	}
	
	@Override
	public String charge() {
		return "고속 충전, 고속 무선 충전 \n";
	}

	@Override
	public String makeCall() {
		return "번호를 누르고 통화버튼을 누름 \n";
	}

	@Override
	public String takeCall() {
		return "수신 버튼을 누름 \n";
	}

	@Override
	public String picture() {
		return "1200, 1600만 트리플 카메라 \n";
	}

	@Override
	public String touch() {
		return "정전식 \n";
	}

	@Override
	public boolean bluetoothPen() {
		return false;
	}
	
	@Override
	public String printlnformation() {
		return "V40는" + super.getMaker() + "에서 만들어졌고 제원은 다음과 같다. \n" + makeCall() +  takeCall()
				+ picture() + charge() + touch() + "블루투스 팬 탑재 여부 : " + bluetoothPen();
	}

}
