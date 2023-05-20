package com.Geekster.AwsDeploymentTesting.Model;
public class Employee {
    private Integer employeeId;
    private String name;
    private Integer age;
    private String companyName;

    public Employee(Integer employeeId, String name, Integer age, String companyName) {
        this.employeeId = employeeId;
        this.name = name;
        this.age = age;
        this.companyName = companyName;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
