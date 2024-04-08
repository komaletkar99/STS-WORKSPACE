package com.element;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jms.artemis.ArtemisProperties.Embedded;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.element.beans.Employee;
import com.element.beans.Student;

@SpringBootApplication
public class Application {
	@Bean
   public Student getStudent() {
	Student student = new Student();
	return student;
}
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		System.out.println("Employee objects");
		Employee employee1 = context.getBean(Employee.class);
		System.out.println(employee1.hashCode());
		
		
		Employee employee2 = context.getBean(Employee.class);
		System.out.println(employee2.hashCode());
		
		Employee employee3 = context.getBean(Employee.class);
		System.out.println(employee3.hashCode());
		
		Employee employee4 = context.getBean(Employee.class);
		System.out.println(employee4.hashCode());
		
		System.out.println("Student objects");
		Student Student1 = context.getBean(Student.class);
		System.out.println(Student1.hashCode());
		
		
		Student Student2 = context.getBean(Student.class);
		System.out.println(Student2.hashCode());
		
		Student Student3 = context.getBean(Student.class);
		System.out.println(Student3.hashCode());
		
		Student Student4 = context.getBean(Student.class);
		System.out.println(Student4.hashCode());
		
	}

}
