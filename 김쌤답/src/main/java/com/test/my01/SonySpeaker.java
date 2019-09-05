package com.test.my01;

public class SonySpeaker implements Speaker {
	private int level =5;
	public SonySpeaker() {
		System.out.println("SonySpeaker 객체 생성");
	}
	public void volumeUp() {
		level++;
		System.out.println("SonySpeaker - volumeUp " + level);
	}
	public void volumeDown() {
		level--;
		System.out.println("SonySpeaker - volumeDown " + level);
	}
}
