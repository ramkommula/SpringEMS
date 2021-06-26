package com.employee.service;

import java.util.List;

import com.employee.entity.Employee;

public interface EmployeeService 
{
	public List<Employee> getAllEmployees();
	
	Employee saveEmployee(Employee employee);
	
	Employee getEmployeeById(Long id);
	
	Employee updateEmployee(Employee employee);
	
	void deleteEmployeeById(Long id);
}
