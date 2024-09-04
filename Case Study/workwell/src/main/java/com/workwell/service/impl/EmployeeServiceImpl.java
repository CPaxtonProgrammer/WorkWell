package com.workwell.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workwell.model.Employee;
import com.workwell.repository.EmployeeRepository;
import com.workwell.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> searchEmployees(String searchTerm) {
        List<Employee> employees = new ArrayList<>();
        List<Employee> allEmployees = getAllEmployees();
        for (Employee employee : allEmployees) {
            if (employee.getFirstName().contains(searchTerm)
                    || employee.getLastName().contains(searchTerm)) {
                employees.add(employee);
            }
        }
        return employees;
    }

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}
}
