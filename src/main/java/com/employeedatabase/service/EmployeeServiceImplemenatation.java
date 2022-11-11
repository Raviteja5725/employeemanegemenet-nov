package com.employeedatabase.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.est.entity.Employee;
import com.est.repo.EmployeeRepository;
@Service
public class EmployeeServiceImplemenatation implements EmployeeService {
	@Autowired 
	private EmployeeRepository employeeRepository;
	@Override
	public Employee findById(long empId) {
		Optional<Employee> result = employeeRepository.findById(empId);
		
		Employee theEmployee = null;
		
		if (result.isPresent()) {
			theEmployee = result.get();
		}
		else {
			// we didn't find the employee
			throw new RuntimeException("Did not find employee id - " + empId);
		}
		
		return theEmployee;
	}

	@Override
	public void deleteById(long empId) {
		employeeRepository.deleteById(empId);
	}

}
