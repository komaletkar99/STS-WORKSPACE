package com.element.beans;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	public Engine() {
		System.out.println("Engine const");
	}
	
	public int startEngine() {
		return 1;
	}
}
