package com.exam.service;

import java.sql.SQLException;
import java.util.List;

import com.exam.pojos.Employee;



public interface EmployeeService {
	public String addEmployee(Employee emp);
	public List<Employee> retrieveEmp();
	public String deleteEmp(int eid);

}
