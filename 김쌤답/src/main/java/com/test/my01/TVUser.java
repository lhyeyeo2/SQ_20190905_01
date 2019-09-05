package com.test.my01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		//BeanFactory factory = new BeanFactory();
				
		//tv= new LgTV();  
		//TV tv= (TV)factory.getBean(args[0]);
		TV tv= (TV)factory.getBean("ltv");
		tv.powerOn();
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeDown();
		tv.volumeDown();
		tv.powerOff();
		
		//SonySpeaker speaker  = new SonySpeaker();
		//tv= new SamsungTV(speaker);
		//tv= (TV)factory.getBean(args[1]);
		tv= (TV)factory.getBean("stv");
		tv.powerOn();
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeDown();
		tv.volumeDown();
		tv.powerOff();
		
//		TV tv1= (TV)factory.getBean("stv");
//		TV tv2= (TV)factory.getBean("stv");
//		TV tv3= (TV)factory.getBean("stv");
//		tv1.powerOn();
//		tv2.powerOn();
//		tv3.powerOn();
//		
//		TV tv4= (TV)factory.getBean("ltv");
//		TV tv5= (TV)factory.getBean("ltv");
//		TV tv6= (TV)factory.getBean("ltv");
//		tv4.powerOn();
//		tv5.powerOn();
//		tv6.powerOn();
		
		factory.close();
	}
}


















