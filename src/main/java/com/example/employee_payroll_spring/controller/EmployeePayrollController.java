package com.example.employee_payroll_spring.controller;

import com.example.employee_payroll_spring.dto.EmployeePayrollDTO;
import com.example.employee_payroll_spring.dto.ResponseDto;
import com.example.employee_payroll_spring.model.Employee;
import com.example.employee_payroll_spring.service.IEmployeePayrollService;
import com.example.employee_payroll_spring.service.EmployeePayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
public class EmployeePayrollController {
    @Autowired
    IEmployeePayrollService iEmployeePayrollService;
    @PostMapping("/post")
    public String post(){
        return EmployeePayrollService.printMessages();
    }
    @PostMapping("/add")
    public ResponseEntity<ResponseDto> addEmployeeInfo(@Valid @RequestBody EmployeePayrollDTO employeePayrollDTO){
     Employee employee= iEmployeePayrollService.addEmployee(employeePayrollDTO) ;
        ResponseDto responseDto=new ResponseDto(" successfully added employee details",employee);
        return new ResponseEntity<>(responseDto, HttpStatus.OK);
       // return employeePayrollService.addEmployee(employeePayrollDTO);
    }
    @GetMapping("/search/{id}")
    public ResponseEntity<ResponseDto> searchEmployeeById(@PathVariable int id){
        Optional<Employee> employee= iEmployeePayrollService.searchEmployeeById(id) ;
        ResponseDto responseDto=new ResponseDto(" successfully searching employee details by id",employee);
        return new ResponseEntity<>(responseDto, HttpStatus.OK);
       // return employeePayrollService.searchEmployeeById(id);
    }
    @GetMapping("/searchall")
    public ResponseEntity<ResponseDto> searchAllEmployee(){
        List<Employee> employee= iEmployeePayrollService.searchAllEmployee() ;
        ResponseDto responseDto=new ResponseDto(" successfully searching all employee details ",employee);
        return new ResponseEntity<>(responseDto, HttpStatus.OK);

       // return employeePayrollService.searchAllEmployee();
    }
    @PutMapping(value = "/update/{id}")
    public ResponseEntity<ResponseDto> editName(@PathVariable int id,
                             @RequestBody EmployeePayrollDTO employeePayrollDTO) {
        Employee editName = iEmployeePayrollService.editName(id, employeePayrollDTO);
        ResponseDto responseDTO = new ResponseDto("Updated employee data successfully", editName);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
       // return (employeePayrollService.editName(id, fname))


    }
    @DeleteMapping("/delete")
    public ResponseEntity<ResponseDto> delete(@RequestParam int id){
        Optional<Employee> employee= iEmployeePayrollService.DeleteById(id) ;
        ResponseDto responseDto = new ResponseDto(" Successfully delete employee detail ",employee);

        return  new ResponseEntity<>(responseDto, HttpStatus.OK);
       // employeePayrollService.DeleteById(id);
    }
}
