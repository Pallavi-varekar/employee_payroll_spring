package com.example.employee_payroll_spring.controller;

import com.example.employee_payroll_spring.service.EmployeePayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeePayrollController {
    @Autowired
    EmployeePayrollService employeePayrollService;
    @PostMapping("/post")
    public String post(){
        return EmployeePayrollService.printMessages();
    }
}
