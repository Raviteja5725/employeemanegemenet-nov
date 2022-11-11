package com.employeedatabase.service;

import com.est.entity.Employee;

public interface EmployeeService {
	public Employee findById(long empId);
	public void deleteById(long empId);
}
