package com.protsenko.spring.controller;

import com.protsenko.spring.entity.Employee;

import com.protsenko.spring.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/")
    public String showAllEmployees(Model model){

        List<Employee> allEmployee = employeeService.getAllEmployees();
        model.addAttribute("allEmps", allEmployee);
        return "all-employees";
    }
}
