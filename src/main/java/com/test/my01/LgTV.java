package com.test.my01;

public class LgTV implements TV {
	private Speaker speaker;
	private int price;
	
	// 해상도
	// 밝기
	public void initMethod() {
		System.out.println("LgTV--initMethod 초기화 작업 처리를 넣으면 됩니다.");
	}
	public void destroyMethod() {
		System.out.println("LgTV--destroyMethod 객체가 삭제되기 전에 처리될 부분을 넣으면 됩니다..");
	}
	public LgTV() {
		System.out.println("LgTV--LgTV 객체 생성");			
	}
	public LgTV(Speaker speaker , int price) {
		System.out.println("LgTV--LgTV 객체 생성");	
		this.speaker = speaker;		
		this.price = price;
	}
	// 전원 켜기
	public void powerOn() {
		System.out.println("LgTV--powerOn");
	}
	// 전원 끄기
	public void powerOff() {
		System.out.println("LgTV--powerOff");
	}	
	// 소리 키우기
	public void volumeUp() {
		System.out.println("LgTV--volumeUp");
	}
	// 소리 줄이기
	public void volumeDown() {
		System.out.println("LgTV--volumeDown");
	}
	public void changeChannel() {
		System.out.println("LgTV--changeChannel");
	}
}
