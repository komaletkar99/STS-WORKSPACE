package com.element.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.element.dao.StudentDao;
import com.element.dao.StudentFamilyDao;
import com.element.entity.Student;
import com.element.entity.StudentFamily;

import jakarta.transaction.Transactional;
@Service
public class StudentService {

	@Autowired
	private StudentDao sdao;
	@Autowired
	private StudentFamilyDao ssdao;
	
	
	public void saveData() {
		Student s = new Student();
		s.setId(101);
		s.setAge(37);
		s.setCity("Mumbai");
		s.setName("Punam");
		
		sdao.save(s);

		
		
		
		
//		Student s = new Student(101, "komal", "pune", 54);
		//sdao.save(s);
		
		StudentFamily sf = new StudentFamily(101, "Kalyani", "Adhav", 65);
		ssdao.save(sf);
	}
}
