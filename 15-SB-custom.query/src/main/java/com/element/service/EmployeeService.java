package com.element.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.element.dao.EmployeeDao;
import com.element.entity.Employee;
@Service
public class EmployeeService implements Serializable {
	@Autowired
	private EmployeeDao edao;
	
	public void AddEmployee() {
		Employee e = new Employee(102, "Punam", 4589.90, "Mumbai");
		Employee e1 = new Employee(103, "Yash", 4559.90, "Pune");
		Employee e2 = new Employee(104, "Monika", 3589.90, "Delhi");
		Employee e3 = new Employee(105, "Sarthak", 2589.90, "Mumbai");
		Employee e4 = new Employee(106, "Kalyani", 44589.90, "Pune");
		
		List<Employee> al = new ArrayList<>();
		al.add(e4);
		al.add(e3);
		al.add(e2);
		al.add(e1);
		al.add(e);
		
		edao.saveAll(al);
	}
	
}
