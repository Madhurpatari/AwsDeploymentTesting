package com.Geekster.AwsDeploymentTesting.Repository;

import com.Geekster.AwsDeploymentTesting.Model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {

    private static List<Employee> employees;

    public static String addEmployee(Employee employee) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Madhur",25,"TNQ" ));
        employees.add(employee);
        System.out.println("Dummy user created");
        return "Added";
    }

    public static List<Employee> getEmployees() {
        return employees;
    }
}
