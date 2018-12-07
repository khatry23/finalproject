package com.exam.pojos;

import javax.persistence.*;



@Entity
@Table(name="emps")
public class Employee {
	
	private Integer id=00;
	private String empName="ANY NAME";
	private double sal=00000.00;
	private String dept="ANY DEPT";
	

	public Employee() {
		System.out.println("IN EMPLOYEE DEFAULT CONST'R");
	}

	public Employee(Integer id, String empName, double sal, String dept) {
		super();
		System.out.println("IN POJO CONST'R");
		this.id = id;
		this.empName = empName;
		this.sal = sal;
		this.dept = dept;
	}

	//-----SETTERS---GETTERS--------
	
	@Id 
	@Column(unique=true)
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name="Emp_Name", length=20)
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	@Column(name="Salary")
	public double getSal() {
		return sal;
	}
	
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	@Column(name="Department", length=20)
	public String getDept() {
		return dept;
	}
	

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	
	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", sal=" + sal + ", dept=" + dept + "]";
	}
	
	
	
	
}
