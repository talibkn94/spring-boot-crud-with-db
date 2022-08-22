package com.Spring_With_MYSQL.New.service;

import com.Spring_With_MYSQL.New.entity.Employee;

import java.util.List;
/*@Auther Talib Mohammad*/
public interface EmployeeServiceInterface {
    Employee addemployee(Employee employee);

    List<Employee> fetchEmployeeList();

    void deleteEmployeeById(Integer id);

     Object listById (Integer id);

     Employee updateemployee(Integer id,Employee employee);
}
