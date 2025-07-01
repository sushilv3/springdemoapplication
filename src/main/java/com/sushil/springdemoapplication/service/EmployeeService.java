package com.sushil.springdemoapplication.service;

import com.sushil.springdemoapplication.dto.EmployeeDto;
import com.sushil.springdemoapplication.entity.Employee;
import com.sushil.springdemoapplication.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public EmployeeDto getEmployee(Integer id) {
        Employee emp = employeeRepository.getEmployee(id);
        EmployeeDto employeeDto = new EmployeeDto();
        return employeeDto.EmployeeMapper(emp);
    }
}
