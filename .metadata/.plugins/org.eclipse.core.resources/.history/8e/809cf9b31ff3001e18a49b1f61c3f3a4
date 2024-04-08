package com.element;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.element.dao.StudentFamilyDao;
import com.element.entity.StudentFamily;
import com.element.service.StudentService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		StudentService bean = context.getBean(StudentService.class);
		bean.saveData();
	}

}
