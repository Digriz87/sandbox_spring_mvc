package com.protsenko.spring.dao;

import com.protsenko.spring.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override

    public List<Employee> getAllEmployees() {
        Session session = sessionFactory.getCurrentSession();
      //  List<Employee> allEmployees = session.createQuery("from Employee", Employee.class)
     //           .getResultList();
        Query<Employee> query = session.createQuery("from Employee", Employee.class);
        List<Employee> allEmployees = query.getResultList();

        return allEmployees;
    }
}
