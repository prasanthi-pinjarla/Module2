package com.cg.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.crud.dao.IEmployeeDao;
import com.cg.crud.dto.Employee;

@Service("employeeservice")
@Transactional
public class EmployeeServiceImpl implements IEmployeeService {
	
	@Autowired
	IEmployeeDao employeedao;
	

	@Override
	public int addEmployeeData(Employee emp) {
		// TODO Auto-generated method stub
		return employeedao.addEmployeeData(emp);
	}

	@Override
	public List<Employee> showAllEmployee() {
		// TODO Auto-generated method stub
		return employeedao.showAllEmployee();
	}
	
	@Override
	public void deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		employeedao.deleteEmployee(empId);
	}
	
	@Override
	public boolean updateEmployee(Employee emp) {
		return employeedao.updateEmployee(emp);
		
	}

	@Override
	public Employee searchEmployee(int id) {
		
		return employeedao.searchEmployee(id);
	}

}
