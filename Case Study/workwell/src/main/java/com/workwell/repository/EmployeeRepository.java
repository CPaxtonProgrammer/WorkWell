package com.workwell.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.workwell.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}


