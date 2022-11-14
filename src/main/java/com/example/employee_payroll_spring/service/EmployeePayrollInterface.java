package com.example.employee_payroll_spring.service;

import com.example.employee_payroll_spring.dto.EmployeePayrollDTO;
import com.example.employee_payroll_spring.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeePayrollInterface {
    Employee addEmployee(EmployeePayrollDTO employeedto);
    Optional<Employee> searchEmployeeById(int id);
    List<Employee> searchAllEmployee();
    Employee editName(int id, String fname);
    void DeleteById(int id) ;
}
