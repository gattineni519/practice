package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.EmployeeDao;
import com.example.demo.entity.Employee;

@Service
public class EmployeeService {
	@Autowired
	EmpDao empdao;
	
	public Employee getEmployeeDetails() {
		
		return null;
		
	}
	public void setEmployeeDetails(Employee emp) {
		empdao.setEmployeeDetails(emp);
	}
}
