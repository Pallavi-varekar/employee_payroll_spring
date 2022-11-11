package com.example.employee_payroll_spring.service;

import com.example.employee_payroll_spring.model.Employee;
import com.example.employee_payroll_spring.repo.EmployeePayrollAppRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class EmployeePayrollService {
    @Autowired
    EmployeePayrollAppRepo employeePayrollAppRepo;

    public static String printMessages() {
        return "Employee Payroll App";
    }
    public Employee addEmployee(Employee employee) {

    return employeePayrollAppRepo.save(employee);
    }

    public Optional<Employee> searchEmployeeById(int id) {
        return employeePayrollAppRepo.findById(id);
    }

    public List<Employee> searchAllEmployee() {
        return employeePayrollAppRepo.findAll();
    }

    public Employee editName(int id, String fname) {
        Optional<Employee> employee = employeePayrollAppRepo.findById(id);
        if (employee.get().getId() == id){
            employee.get().setfNname(fname);
            return employeePayrollAppRepo.save(employee.get());
        }else {
            return null;
        }


    }

    public void DeleteById(int id) {
        employeePayrollAppRepo.deleteById(id);
    }
}


