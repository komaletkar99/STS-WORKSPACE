package com.element.entity;

import jakarta.annotation.sql.DataSourceDefinition;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	@Id
	int id;
	String name;
	double salary;
	String city;
	
}
