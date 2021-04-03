package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.EmployeeService;
import com.example.demo.entity.Employee;

@RestController
public class EmployeeController {
@Autowired
EmployeeService employeeService;
	public Employee getEmployeeDetails() {
		
		return null;
		
	}
	/*@GetMapping("/abcd")
	public void setEmployeeDetails() {
		Employee emp=new Employee("Rama",50000,0,"female");
		employeeService.setEmployeeDetails(emp);
	}*/
	@PostMapping("/abcd")
	public void setEmployeeDetails(@RequestBody Employee emp) {
		//Employee emp=new Employee("Rama",50000,0,"female");
		employeeService.setEmployeeDetails(emp);
}
}