package com.protsenko.spring.dao;

import com.protsenko.spring.entity.Employee;
import org.springframework.stereotype.Component;

import java.util.List;

public interface EmployeeDao {
     List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);
}
