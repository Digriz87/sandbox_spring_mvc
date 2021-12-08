package com.protsenko.spring.dao;

import com.protsenko.spring.entity.Employee;

import java.util.List;

public interface EmployeeDao {
     List<Employee> getAllEmployees();
}
