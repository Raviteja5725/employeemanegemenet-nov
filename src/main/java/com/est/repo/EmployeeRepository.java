package com.est.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.est.entity.Employee;



@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
