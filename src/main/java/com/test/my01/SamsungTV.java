package com.test.my01;

public class SamsungTV implements TV {
	// 해상도
	// 밝기
	//private SonySpeaker speaker = new SonySpeaker();
	private Speaker speaker;
	//private SonySpeaker speaker; 만 쓰면  틀이라 작동 x
	private int price;
	
	public void initMethod() {
		System.out.println("SamsungTV--initMethod 초기화 작업 처리를 넣으면 됩니다.");
	}
	public void destroyMethod() {
		System.out.println("SamsungTV--destroyMethod 객체가 삭제되기 전에 처리될 부분을 넣으면 됩니다..");
	}
	public SamsungTV() {
		System.out.println("SamsungTV--SamsungTV 객체 생성");
	}
	public SamsungTV(Speaker speaker , int price) {
		System.out.println("SamsungTV--SamsungTV 객체 생성");
		this.speaker = speaker;		
		this.price = price;
	}
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
		System.out.println("SamsungTV--powerOn");
	}
	// 전원 끄기
	public void powerOff() {
		System.out.println("SamsungTV--powerOff");
	}	
	// 소리 키우기
	public void volumeUp() {
		System.out.println("SamsungTV--volumeUp");
		speaker = new SonySpeaker();
		speaker.volumeUp();
	}
	// 소리 줄이기
	public void volumeDown() {
		System.out.println("SamsungTV--volumeDown");
		speaker = new SonySpeaker();
		speaker.volumeDown();
	}
	public void changeChannel() {
		System.out.println("SamsungTV--changeChannel");
	}
}
