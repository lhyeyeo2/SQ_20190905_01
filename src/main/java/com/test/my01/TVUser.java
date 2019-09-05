package com.test.my01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

//import가.. 안된다.아아아아ㅏ앙
public class TVUser {
	public static void main(String[] args) {
		
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("applicationContext.xml");
		
		//BeanFactory factory = new BeanFactory();
		
	
		//TV tv = new SamsungTV();
		//TV tv= (TV)factory.getBeans("samsung");
		//new가 ~하도록 디자인중 지금까지 디자인 한 이유..
		//TV tv= (TV)factory.getBean("args[0]");
		TV tv= (TV)factory.getBean("ltv");
		tv.powerOn();
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		//tv= new LgTV();
		//LgTV ltv= (TV)factory.getBean("lg");
		//SonySpeaker speaker  = new SonySpeaker();
		//tv= new SamsungTV(speaker);
		//LgTV ltv= (TV)factory.getBean("args[1]");
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


