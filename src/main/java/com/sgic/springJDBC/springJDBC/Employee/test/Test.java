package com.sgic.springJDBC.springJDBC.Employee.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.sgic.springJDBC.springJDBC.Employee.dao.EmployeeDao;
import com.sgic.springJDBC.springJDBC.Employee.dto.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		EmployeeDao dao = (EmployeeDao) context.getBean("employeeDao");
		Employee employee = new Employee();
		employee.setId(2);
		employee.setFirstname("John");
		employee.setLastname("ferguson");
		int result = dao.create(employee);
		System.out.println("Number of records inserted are: " + result);
	}

}
