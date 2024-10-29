package edu.uptc.swi.employeeapp.service;

import java.util.List;
import edu.uptc.swi.employeeapp.model.Employee;


public interface IEmployeeDAO {
    List<Employee> findAll();
    Employee findById(String id);
    boolean save(Employee product);
    boolean deleteEmployeeById(String id);
}
