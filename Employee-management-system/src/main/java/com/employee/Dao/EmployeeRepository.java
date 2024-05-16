package com.employee.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.employee.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
}

 