package com.cg.crud.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="Spr1_employee")
public class Employee {
	
	@Id
	/*@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="emp_seq")
	@SequenceGenerator(name="emp_seq",sequenceName="emp_seq_eid")*/
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="emp_id")
	private Integer empId;
	
	@Column(name="emp_name")
	@NotEmpty(message="Name should not be empty")
	private String empName;
	
	@Column(name="emp_designation")
	private String empDesignation;
	
	@Column(name="emp_salary")
	@NotNull(message="Salary should not be blank")
	private Double empSalary;
	
	@Column(name="emp_gender")
	private String empGender;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	public Double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpGender() {
		return empGender;
	}

	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}

}
