package com.Geekster.AwsDeploymentTesting.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {
    private Integer employeeId;
    private String name;
    private Integer age;
    private String companyName;

}
