package com.protsenko.spring.dao;

import com.protsenko.spring.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
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

    @Override
    public void saveEmployee(Employee employee) {
        Session session = sessionFactory.getCurrentSession();
        session.save(employee);
    }
}
