package com.Geekster.AwsDeploymentTesting.Repository;

import com.Geekster.AwsDeploymentTesting.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,  Integer> {

}
