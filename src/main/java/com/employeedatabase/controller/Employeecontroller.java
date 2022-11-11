package com.employeedatabase.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.employeedatabase.service.EmployeeService;
import com.est.entity.Employee;
@Controller
public class Employeecontroller {
	@Autowired 
	private EmployeeService employeeservice;
	
	
	@DeleteMapping("/employees/{employeeId}")
	@ResponseBody
	public String deleteEmployee(@PathVariable long empId) {
		
		Employee tempEmployee = employeeservice.findById(empId);
		
		// throw exception if null
		
		if (tempEmployee == null) {
			throw new RuntimeException("Employee id not found - " + empId);
		}
		
		employeeservice.deleteById(empId);
		
		return "Deleted employee id - " + empId;
	}
}
