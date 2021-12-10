package com.protsenko.spring.service;

import com.protsenko.spring.entity.Employee;

import java.util.List;

public interface EmployeeService {

     List<Employee> getAllEmployees();

     void saveEmployee (Employee employee);

     Employee getEmployee(int id);
}
