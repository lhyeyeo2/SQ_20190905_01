package com.test.my01;

public class SamsungTV implements TV {
	private Speaker speaker;
	private int price;
	
	public void initMethod() {
		System.out.println("SamsungTV--initMethod 초기화 작업 처리를 넣으면 됩니다.");
	}
	public void destroyMethod() {
		System.out.println("SamsungTV--destroyMethod 객체가 삭제되기 전에 처리될 부분을 넣으면 됩니다..");
	}
	public SamsungTV() {
		System.out.println("SamsungTV--SamsungTV(1) 객체 생성");
	}
// 생성자 2 
	public void setSpeaker(Speaker speaker) {
		System.out.println("SamsungTV--setSpeaker()");
		this.speaker = speaker;
	}
	public void setPrice(int price) {
		System.out.println("SamsungTV--setPrice()");
		this.price = price;
	}
	// 전원 켜기
	public void powerOn() {
		System.out.println("SamsungTV--powerOn -가격은 " + price);
	}
	// 전원 끄기
	public void powerOff() {
		System.out.println("SamsungTV--powerOff");
	}	
	// 소리 키우기
	public void volumeUp() {
		System.out.println("SamsungTV--volumeUp");
		speaker.volumeUp();
	}
	// 소리 줄이기
	public void volumeDown() {
		System.out.println("SamsungTV--volumeDown");
		speaker.volumeDown();
	}
	public void changeChannel() {
		System.out.println("SamsungTV--changeChannel");
	}
}















