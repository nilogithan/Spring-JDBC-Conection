package com.sgic.springJDBC.springJDBC.Employee.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.sgic.springJDBC.springJDBC.Employee.dao.EmployeeDao;
import com.sgic.springJDBC.springJDBC.Employee.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Employee employee) {

		String sql = "insert into employee values(?,?,?)";
		int result = jdbcTemplate.update(sql, employee.getId(), employee.getFirstname(), employee.getLastname());

		return result;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
