package com.element.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	private Engine engine;
	
	@Autowired
	public void setEngine(Engine engine) {
		this.engine=engine;
		
	}
	 public Car() {
		 System.out.println("car const");
	 }

	 public void Drive() {
			 int startEngine = engine.startEngine();
			 if(startEngine==1) {
		 System.out.println("journy startd");
	 }
	 }
}
