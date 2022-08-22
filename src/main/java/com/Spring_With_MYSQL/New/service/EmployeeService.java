package com.Spring_With_MYSQL.New.service;
import com.Spring_With_MYSQL.New.entity.Employee;
import com.Spring_With_MYSQL.New.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements EmployeeServiceInterface{
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public Employee addemployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> fetchEmployeeList() {
        return employeeRepository.findAll();
    }

    @Override
    public void deleteEmployeeById(Integer id) {
        employeeRepository.deleteById(id);
        return ;
    }

    @Override
    public Optional<Employee> listById(Integer id) {
        return employeeRepository.findById(id);
    }

    @Override
    public Employee updateemployee(Integer id,Employee employee) {
       Employee emp = employeeRepository.findById(id).get();
       emp.setName(employee.getName());
       emp.setDepartment(employee.getDepartment());
       emp.setSalary(employee.getSalary());
       return employeeRepository.save(emp);
    }


//    private   List<Employee> ls= new ArrayList<Employee>();
////             {
////                 ls.add(new Employee(01,"talib","backend","25000"));
////                 ls.add(new Employee(02,"manish","fullstack","30000"));
////                 ls.add(new Employee(03,"akash","F.End","35000"));
////                 ls.add(new Employee(04,"shashank","DevOpps","40000"));
////                 ls.add(new Employee(05,"prince","PHP","45000"));
////                 ls.add(new Employee(06,"ashwin","Python","50000"));
////             }
//private List<EmployeeDto> dto= new ArrayList<EmployeeDto>();
//    public List<EmployeeDto> getLs() {
//        dto.removeAll(dto);
//        for(Employee e:ls)
//        {
//            dto.add(employeeDto(e));
//        }
//        return this.dto;
//    }
//    public String updateEmployee(int id, Employee employee)
//    {
//        for (Employee e:ls)
//        {
//            if (e.getId() == id)
//            {
//                e.setName(employee.getName());
//                e.setDepartment(employee.getDepartment());
//                e.setSalary(employee.getSalary());
//                return "Employee Details Update Successful";
//            }
//        }
//        return "Employee Not Available";
//    }
//    public String addEmployee(Employee employee)
//    {
//        ls.add(employee);
//        Iterator it=ls.iterator();
//        while (it.hasNext())
//        {
//            Employee e= (Employee) it.next();
//            if (e.getId() == employee.getId())
//            {
//               return "ID is already available";
//            }
//        }
//        return "Employee Add Successful";
//    }
//    public String DeleteEmployee(int id1)
//    {
//        Iterator ite= ls.iterator();
//                while(ite.hasNext())
//                {
//                    Employee e1=(Employee) ite.next();
//                    if(e1.getId() ==id1){
//                        ite.remove();
//                        return "Employee Delete Successful";
//                    }
//                }
//        return "Employee Not Available";
//    }
//    public Employee EmpDetails(int id2) {
//       /* Iterator itr = ls.iterator();
//        while (itr.hasNext())
//        {
//         Employee e2=(Employee) itr.next();
//         if(e2.id==id2){
//             return e2.getId()+e2.getName()+e2.getDepartment()+e2.getSalary();
//                     //"Employee ID-->"+e2.id+"\n"+"Employee Name -->"+e2.name+"\n"+"Department-->"+e2.department+"\n"+"Employee Salary-->"+e2.salary;
//         }*/
//        Employee employee=null;
//        employee=ls.stream().filter(e->e.getId()==id2).findFirst().get();
//        return employee;
//
//       /* }
//        return "Id Is Not Available";*/
//
//    }
//    public EmployeeDto employeeDto(Employee employee)
//    {
//        EmployeeDto empDto=new EmployeeDto();
//        empDto.setId(employee.getId());
//        empDto.setName(employee.getName());
//        empDto.setDepartment(employee.getDepartment());
//        return empDto;
//    }

}