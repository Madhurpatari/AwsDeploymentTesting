package com.Geekster.AwsDeploymentTesting.Controller;

import com.Geekster.AwsDeploymentTesting.Model.Employee;
import com.Geekster.AwsDeploymentTesting.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping
    public String addEmployee(@RequestBody Employee employee){
       return EmployeeRepository.addEmployee(employee);
    }

    @GetMapping("/home")
    public String welcome(){
        return "Welcome home..!!";
    }

    @GetMapping
    public List<Employee> getEmployees(){
        return EmployeeRepository.getEmployees();
    }
}
