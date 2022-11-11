package com.example.employee_payroll_spring.controller;

import com.example.employee_payroll_spring.model.Employee;
import com.example.employee_payroll_spring.service.EmployeePayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeePayrollController {
    @Autowired
    EmployeePayrollService employeePayrollService;
    @PostMapping("/post")
    public String post(){
        return EmployeePayrollService.printMessages();
    }
    @PostMapping("/add")
    public Employee addEmployeeInfo(@RequestBody Employee employee){
        return employeePayrollService.addEmployee(employee);
    }
    @GetMapping("/search{id}")
    public Optional<Employee> searchEmployeeById(@PathVariable int id){
        return employeePayrollService.searchEmployeeById(id);
    }
    @GetMapping("/searchall")
    public List<Employee> searchAllEmployee(){
        return employeePayrollService.searchAllEmployee();
    }
    @PutMapping(value = "/update/{id}")
    public Employee editName(@PathVariable int id,
                                 @RequestParam(value = "fName") String fname) {
        return (employeePayrollService.editName(id, fname));


    }
    @DeleteMapping("/delete")
    public void delete(@RequestParam int id){
        employeePayrollService.DeleteById(id);
    }
}
