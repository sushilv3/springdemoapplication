package com.sushil.springdemoapplication.repository;

import com.sushil.springdemoapplication.entity.Employee;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {

    public Employee getEmployee(Integer id){
        return new Employee(1,"sushil","Development",33);
    }
}
