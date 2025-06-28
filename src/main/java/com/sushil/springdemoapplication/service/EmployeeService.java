package com.sushil.springdemoapplication.service;

import com.sushil.springdemoapplication.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public String getEmployee(Integer id) {
        return  employeeRepository.getEmployee(id);
    }
}
