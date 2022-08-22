package com.Spring_With_MYSQL.New.repository;

import com.Spring_With_MYSQL.New.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
