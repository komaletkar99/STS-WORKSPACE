package com.element.service;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.element.dao.StudentDao;
import com.element.dao.StudentFamilyDao;
import com.element.entity.Student;
import com.element.entity.StudentFamily;
@Service
public class StudentService {

	@Autowired
	private StudentDao sdao;
	@Autowired
	private StudentFamilyDao ssdao;
	
	@Transactional(rollbackFor = Exception.class)
	public void saveData() {
		Student s = new Student(101, "komal", "pune", 54);
		sdao.save(s);
		
		int n = 10/0;
		
		StudentFamily sf = new StudentFamily(101, "Kalyani", "Adhav", 65);
		ssdao.save(sf);
	}
}
