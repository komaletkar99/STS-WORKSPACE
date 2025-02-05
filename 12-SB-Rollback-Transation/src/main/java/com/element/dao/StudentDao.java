package com.element.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.element.entity.Student;

public interface StudentDao extends JpaRepository<Student, Integer>{

	public Student findByName(String name);
	
	public List<Student> findByCity(String city);
	
	public List<Student> findByAgeGreaterThan(int age);
	
	public Student findByNameAndCity(String name, String city);

}
