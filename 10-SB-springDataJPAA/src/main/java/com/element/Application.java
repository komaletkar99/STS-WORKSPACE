package com.element;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.element.dao.StudentDao;
import com.element.entity.Student;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		StudentDao dao = context.getBean(StudentDao.class);

		Student s1 = new Student(101,"komal","pune",24);
//		Student s2 = new Student(102,"punam","mumbai",25);
//		Student s3 = new Student(103,"monika","delhi",27);
//		Student s4 = new Student(104,"yash","pune",19);
//		Student s5 = new Student(105,"sarthak","mumbai",29);
//		Student s6 = new Student(106,"radha","pune",20);

//		Student student1 = dao.save(s1);
//		Student student2 = dao.save(s2);
//		Student student3 = dao.save(s3);
//		Student student4 = dao.save(s4);
//		Student student6 = dao.save(s5);
//		Student student5 = dao.save(s6);
//		
//		List<Student> al = new ArrayList<>();
//		al.add(s1);
//		al.add(s2);
//		al.add(s3);
//		al.add(s4);
//		al.add(s5);
//		al.add(s6);
//
//		
//		dao.saveAll(al);

//			Optional<Student> id = dao.findById(104);
//		
//			if(id.isPresent()) {
//				Student student = id.get();
//				System.out.println(student);
//			}

//		boolean existsById = dao.existsById(105);
//		System.out.println(existsById);

//		Iterable<Student> all = dao.findAll();
//		for(Student s : all) {
//			System.out.println(s);
//		}
		List<Integer> s = new ArrayList<>();
		s.add(103);
		s.add(106);
	
//
//		Iterable<Student> allById = dao.findAllById(s);
//		for (Student s1 : allById) {
//			System.out.println(s1);
//
//		}

//		dao.deleteById(102);
		
//		dao.delete(s1);
		
//		long count = dao.count();
//		System.out.println(count);
		
		
		dao.deleteAllById(s);
	}

}
