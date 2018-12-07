package com.exam.dao;

import java.sql.SQLException;
import java.util.List;

import com.exam.pojos.Employee;

public interface EmployeeDao {

	public String addEmployee(Employee emp) ;
	public List<Employee> retrieveEmp();
	public String deleteEmp(int eid);
}
