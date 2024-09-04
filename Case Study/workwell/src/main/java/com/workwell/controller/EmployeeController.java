package com.workwell.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.workwell.model.Employee;
import com.workwell.service.EmployeeService;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public String getHomePage() {
        return "home";
    }

    @GetMapping("/employees")
    public String getEmployees(Model model) {
        List<Employee> employees = employeeService.getAllEmployees();
        model.addAttribute("employees", employees);
        return "employees";
    }

    @GetMapping("/addEmployee")
    public String getAddEmployeeForm() {
        return "addEmployee";
    }

    @PostMapping("/addEmployee")
    public String addEmployee(@ModelAttribute Employee employee) {
        employeeService.addEmployee(employee);
        return "redirect:/";
    }

    @GetMapping("/searchEmployees")
    public String searchEmployees(@RequestParam("searchTerm") String searchTerm, Model model) {
        List<Employee> employees = employeeService.searchEmployees(searchTerm);
        model.addAttribute("employees", employees);
        return "searchResults";
    }
        
        
}


