package com.example.employee_payroll_spring.service;

import com.example.employee_payroll_spring.dto.EmployeePayrollDTO;
import com.example.employee_payroll_spring.model.Employee;

import java.util.List;
import java.util.Optional;

public interface IEmployeePayrollService {
    Employee addEmployee(EmployeePayrollDTO employeedto);
    Optional<Employee> searchEmployeeById(int id);
    List<Employee> searchAllEmployee();
    Employee editName(int id,EmployeePayrollDTO employeePayrollDTO);
    Optional<Employee> DeleteById(int id) ;
}
