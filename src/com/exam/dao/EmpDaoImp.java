package com.exam.dao;

import java.util.List;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exam.pojos.Employee;

@Repository
public class EmpDaoImp implements EmployeeDao {
	
	@Autowired
	private SessionFactory sf;
	

	
	public EmpDaoImp() {
	System.out.println("IN EMP DAO CONST'R");
	}

	@Override
	public String addEmployee(Employee e){
		
			System.out.println("in DAO add emp():"+ e);
			Employee emp= sf.getCurrentSession().get(Employee.class,e.getId());
			System.out.println("in DAO add emp()*****"+ emp);
			if(emp!=null)
				return "ID ALREADY EXISTS!!";
			System.out.println("in DAO add emp()######:"+ e);
			sf.getCurrentSession().save(e);
			return "EMPLOYEE ADDED";
			
	}

	@Override
	public List<Employee> retrieveEmp() {
		String jpql= "select e from Employee e";
		return sf.getCurrentSession().createQuery(jpql, Employee.class).getResultList();		
		
	}

	@Override
	public String deleteEmp(int eid) {
		sf.getCurrentSession().delete(sf.getCurrentSession().get(Employee.class, eid));
		
		return "EMPLOYEE DELETED";
	}

}
