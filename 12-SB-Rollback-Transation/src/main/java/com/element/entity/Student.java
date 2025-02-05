package com.element.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Stu")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO);
	private int id;
	private String name;
	private String city;
	private int age;
	
}
