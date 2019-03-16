package com.tgb.struts;

import com.tgb.struts.manager.IHello;

public class HelloAction {
	
	private IHello hello;
	
	
	public void setHello(IHello hello) {
		this.hello = hello;
	}


	public String execute(){
		
		System.out.println("----struts2----");
		
		System.out.println(hello.get());
		
		return "success";
	}
}
