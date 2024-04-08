package com.element;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.element.dao.EmployeeDao;
import com.element.entity.Employee;
import com.element.service.EmployeeService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		EmployeeDao bean = context.getBean(EmployeeDao.class);
		
//	 bean.DeleteData(102);
		
	
//		bean.updateData(102);
		
		bean.insertData(101, "Amruta", 3456.76, "Pune");
		
		
//		Employee employee = bean.insertIntoEmployee(107,"Pooja",6789.45,"Nagpur");
//		System.out.println(employee);
		
//		Employee naame = bean.findByEmpNaame("yash");
//		System.out.println(naame);
		
		
//		Employee emp = bean.findByEmpCity("Delhi");
//		System.out.println(emp);
//		
		
//	EmployeeService service = context.getBean(EmployeeService.class);
//	service.AddEmployee();
		
	}

}
