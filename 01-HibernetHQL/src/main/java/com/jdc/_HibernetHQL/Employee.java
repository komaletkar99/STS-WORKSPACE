package com.jdc._HibernetHQL;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Employee {
	@Id
	int id;
	String name;
	String city;
	String salary;
	int age;
	
	

}
