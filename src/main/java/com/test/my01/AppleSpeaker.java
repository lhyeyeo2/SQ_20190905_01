package com.test.my01;

import org.springframework.stereotype.Component;

@Component
public class AppleSpeaker implements Speaker {
	private int level =5;
	public AppleSpeaker() {
		System.out.println("AppleSpeaker 객체 생성");
	}
	public void volumeUp() {
		level++;
		System.out.println("AppleSpeaker - volumeUp " + level);
	}
	public void volumeDown() {
		level--;
		System.out.println("AppleSpeaker - volumeDown " + level);
	}
}
