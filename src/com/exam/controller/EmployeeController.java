package com.exam.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.exam.pojos.Employee;
import com.exam.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	@Qualifier("dao_service") 
	private EmployeeService service;
	
	
	public EmployeeController() {
		System.out.println("IN CONST'R OF EMP CONTROLLER");
	}

	@GetMapping("/add")
	public String showAdd(Employee e)
	{
		System.out.println("in show reg  form " + e);
		return "employee/register";
	}
	
	@PostMapping("/add")
	public String processAdd(Employee e,HttpSession flash)
	{
		System.out.println("in process reg  form " + e);
		String sts=service.addEmployee(e);
		if(sts.equals("EMPLOYEE ADDED"))
			flash.setAttribute("status1",sts);
		else
			flash.setAttribute("status2", sts);

		return "redirect:/";
	}
	
	@GetMapping("/retrieve")
	public String retrieveEmpList(HttpSession map)
	{
		System.out.println("IN retrieve() " + map);
		map.setAttribute("emp_dtls",service.retrieveEmp());
		return "employee/display";
	}

	@GetMapping("/delete")
	public String deleteEmp(@RequestParam int eid,Model map,HttpSession hs)
	{
		map.addAttribute("status", service.deleteEmp(eid));
		hs.setAttribute("emp_dtls", service.retrieveEmp());
		
		return "employee/display";
	}
	
	
}
