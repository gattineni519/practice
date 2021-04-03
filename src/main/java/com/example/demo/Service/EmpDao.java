package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.Dao.EmployeeDao;
import com.example.demo.entity.Employee;

@Repository
public class EmpDao {
	
	@Autowired
	EmployeeDao empdao;
	
	
	public void setEmployeeDetails(Employee emp) {
		empdao.save(emp);
	}

}
