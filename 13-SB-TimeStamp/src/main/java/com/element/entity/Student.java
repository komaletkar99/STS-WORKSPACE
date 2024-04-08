package com.element.entity;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
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
	@CreationTimestamp
	@Column(updatable = false)
	private Date createdDate;
	@UpdateTimestamp
	@Column(insertable = false)
	private Date updatedDate;
	
}
