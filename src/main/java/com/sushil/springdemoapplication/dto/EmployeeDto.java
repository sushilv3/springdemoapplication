package com.sushil.springdemoapplication.dto;

import com.sushil.springdemoapplication.entity.Employee;

public class EmployeeDto {
    String name;
    String dept;
    Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    public EmployeeDto EmployeeMapper(Employee employee){
        this.setName(employee.getName());
        this.setAge(employee.getAge());
        this.setDept(employee.getDept());
        return this;
    }
}
