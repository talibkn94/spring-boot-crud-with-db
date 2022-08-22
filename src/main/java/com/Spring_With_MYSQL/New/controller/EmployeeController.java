package com.Spring_With_MYSQL.New.controller;

//import com.springboot.Demo.dto.EmployeeDto;
//import com.springboot.Demo.entity.Employee;
//import com.springboot.Demo.service.EmployeeService;
import com.Spring_With_MYSQL.New.entity.Employee;
import com.Spring_With_MYSQL.New.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {
@Autowired
public EmployeeService employeeService;


    @GetMapping("/welcome")
    public String hello()
    {
        return "Hello SpringBoot";
    }
    @GetMapping("/list")
    public List<Employee> EmployeeList()
    {
        return employeeService.fetchEmployeeList();
    }
    @PostMapping("/addemp")
    public Employee addData(@RequestBody Employee employee)
        {
            return employeeService.addemployee(employee);
        }

    @DeleteMapping("/delete/{id}")
    public String deleteid(@PathVariable("id") Integer id){
        employeeService.deleteEmployeeById(id);
        return "delete data successful";
    }
    @GetMapping("/list/{id}")
    public Optional<Employee> details(@PathVariable("id") Integer id){
        return employeeService.listById(id);}
        @PostMapping("/update/{id}")

        public Employee updateEmployee(@PathVariable ("id") Integer id,@RequestBody Employee employee){
        return employeeService.updateemployee(id,employee);


    }




}
