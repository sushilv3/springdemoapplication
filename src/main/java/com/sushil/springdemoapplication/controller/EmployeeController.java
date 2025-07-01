package com.sushil.springdemoapplication.controller;

import com.sushil.springdemoapplication.dto.EmployeeDto;
import com.sushil.springdemoapplication.entity.Employee;
import com.sushil.springdemoapplication.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/getEmployee/{id}")
    public ResponseEntity<EmployeeDto> getEmpolyee(@PathVariable Integer id) {
        return ResponseEntity.ok(employeeService.getEmployee(id));
    }
}
