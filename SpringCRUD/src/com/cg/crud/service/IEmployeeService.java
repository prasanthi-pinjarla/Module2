package com.cg.crud.service;

import java.util.List;

import com.cg.crud.dto.Employee;

public interface IEmployeeService {
	
	public int addEmployeeData(Employee emp);
	public List<Employee> showAllEmployee();
	public void deleteEmployee(int empId);
	
	public Employee searchEmployee(int id);
	public boolean updateEmployee(Employee emp);
}
