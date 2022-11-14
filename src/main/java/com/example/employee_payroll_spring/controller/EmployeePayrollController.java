package com.example.employee_payroll_spring.controller;

import com.example.employee_payroll_spring.dto.EmployeePayrollDTO;
import com.example.employee_payroll_spring.dto.ResponseDto;
import com.example.employee_payroll_spring.model.Employee;
import com.example.employee_payroll_spring.service.EmployeePayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<ResponseDto> addEmployeeInfo(@RequestBody EmployeePayrollDTO employeePayrollDTO){
     Employee employee=employeePayrollService.addEmployee(employeePayrollDTO) ;
        ResponseDto responseDto=new ResponseDto(" successfully added employee details",employee);
        return new ResponseEntity<>(responseDto, HttpStatus.OK);
       // return employeePayrollService.addEmployee(employeePayrollDTO);
    }
    @GetMapping("/search/{id}")
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
