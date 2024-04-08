package com.element.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	Engine engine;

	@Autowired
	public Car(Engine engine) {
		this.engine = engine;
	}

	public Car() {
		System.out.println("car const");
	}

	public void drive() {
		int startEngine = engine.startEngine();
		if(startEngine==1) {
		System.out.println("journy started");
		}
	}
}
