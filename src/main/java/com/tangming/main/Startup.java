package com.tangming.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Startup {
	public static void main(String[] args) throws InterruptedException {
		 ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		 Person bean = context.getBean("person",Person.class);
	}
}
