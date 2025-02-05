package com.element.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.element.entity.Employee;

import jakarta.transaction.Transactional;

public interface EmployeeDao extends JpaRepository<Employee, Serializable> {
	
//	@Query("from Employee where name =:name")
//	public Employee findByEmpNaame(String name);
	
//	@Query(value = "select * from employee where city =:city", nativeQuery = true)
//	public Employee findByEmpCity(String city);
//	
//	@Transactional
//	@Modifying
//	@Query("update employee set city =:name where id =:id")
//	public Employee updateData(int id, String name);
	                                        
//	@Transactional
//	@Modifying
//	@Query(value = "delete from employee where id =:id", nativeQuery = true)
//	public void DeleteData(int id);

//	@Transactional
//	@Modifying
//	@Query("delete from employee where id =:id")
//	public void DeleteData(int id);
	
//	@Transactional
//	@Modifying
//	@Query(value = "update employee set name = 'Monu' where id =:id", nativeQuery = true)
//	public void updateData(int id);
	
	@Transactional
	@Modifying
	@Query(value = "insert into employee(id, name, salary, city) values(id =:id, name =:name,salary =:salary,city =:city)", nativeQuery = true)
	public Employee insertData(int id, String name, double salary, String city);

	
//	@Query("INSERT INTO Employee (id, name, salary, city) " +
//	           "VALUES (:id, :name, :salary, :city)")
//	   public Employee insertIntoEmployee(int id, String name, double salary, String city);
	}

