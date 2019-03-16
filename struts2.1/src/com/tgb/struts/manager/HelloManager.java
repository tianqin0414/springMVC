package com.tgb.struts.manager;

public class HelloManager implements IHello {
	
	
	public String get(){
		System.out.println("----manager----");
		return "I am manager";
	}
}
