package com.workwell.service;

import java.util.List;

//import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
import com.workwell.model.Employee;
//import com.workwell.repository.EmployeeRepository;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    Employee getEmployeeById(Long id);

    Employee addEmployee(Employee employee);

    List<Employee> searchEmployees(String searchTerm);
}

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

	public List<Employee> searchEmployees(String searchTerm) {
		// TODO Auto-generated method stub
		return null;
	}
}

