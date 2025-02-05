package com.element;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.element.dao.StudentDao;
import com.element.entity.Student;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		StudentDao bean = context.getBean(StudentDao.class);
		
		PageRequest req = PageRequest.of(0, 2);
		Page<Student> all = bean.findAll(req);
		for(Student stu : all) {
			System.out.println(stu);
		}
		
//		Student s = new Student();
//		s.setAge(24);
//		s.setCity("pune");
		
		
//		Student s = new Student();
//		s.setCity("pune");
//		
//		Example<Student> of = Example.of(s);
//		List<Student> findAll = bean.findAll(of);
//		for(Student s1 : findAll) {
//			System.out.println(s1);
//		}
//		
		
		
		
//		Student byName = bean.findByName("Komal");
//		System.out.println(byName);
		
//		List<Student> city = bean.findByCity("pune");
//		for(Student s : city) {
//			System.out.println(s);
//		}
		
//		List<Student> byAgeGreaterThan = bean.findByAgeGreaterThan(24);
//		for(Student s : byAgeGreaterThan) {
//			System.out.println(s);
//		}
		
//		bean.findAll(Sort.by("age").reverse());
		
//		Student city = bean.findByNameAndCity("yash", "pune");
//		System.out.println(city);
		
//		Student s1 = new Student(101,"komal","pune",24);
//		Student s2 = new Student(102,"punam","mumbai",25);
//		Student s3 = new Student(103,"monika","delhi",27);
//		Student s4 = new Student(104,"yash","pune",19);
//		Student s5 = new Student(105,"sarthak","mumbai",29);
//		Student s6 = new Student(106,"radha","pune",20);
//		
//		List<Student> al = new ArrayList<>();
//		al.add(s1);
//		al.add(s2);
//		al.add(s3);
//		al.add(s4);
//		al.add(s5);
//		al.add(s6);
//		
//		bean.saveAll(al);
		
		
	}

}
