package com.cg.crud.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.crud.dto.Employee;
@Repository("employeedao")
public class EmployeeDaoImpl implements IEmployeeDao {
	
	@PersistenceContext
	EntityManager entitymanager;
	
	@Override
	public int addEmployeeData(Employee emp) {
		entitymanager.persist(emp);
		entitymanager.flush();
		return emp.getEmpId();
	}

	@Override
	public List<Employee> showAllEmployee() {
		Query queryOne = entitymanager.createQuery("from Employee");
		List<Employee> myList =queryOne.getResultList();
		return myList;
	}

	@Override
	public void deleteEmployee(int empId) {
		Query queryTwo = entitymanager.createQuery("DELETE from Employee where empId=:eid");
		queryTwo.setParameter("eid", empId);
		queryTwo.executeUpdate();

	}

	@Override
	public boolean updateEmployee(Employee emp) {
        try {
               entitymanager.merge(emp);
               entitymanager.flush();
               return true;
        } catch (Exception e) {
               return false;
        }

 }


	@Override
	public Employee searchEmployee(int id) {
		Employee emp = entitymanager.find(Employee.class, id);
		return emp;
	}

}
