package com.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.exam.dao.EmpDaoImp;
import com.exam.dao.EmployeeDao;
import com.exam.pojos.Employee;

@Service("dao_service")
@Transactional
public class EmployeeServiceDaoBasedImp implements EmployeeService {
	@Autowired
	private EmployeeDao dao;
	
	public EmployeeServiceDaoBasedImp() {
		System.out.println("IN CONST'R OF  EmployeeService Imp");
	}

	@Override
	public String addEmployee(Employee e){
		System.out.println("in service add emp():"+ e);
		return  dao.addEmployee(e);
	}

	@Override
	public List<Employee> retrieveEmp() {
		
		return dao.retrieveEmp();
	}

	@Override
	public String deleteEmp(int eid) {
		
		return dao.deleteEmp(eid);
		
		
	}

	

}
