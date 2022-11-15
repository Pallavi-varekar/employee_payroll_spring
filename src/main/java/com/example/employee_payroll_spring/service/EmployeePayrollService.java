package com.example.employee_payroll_spring.service;

import com.example.employee_payroll_spring.dto.EmployeePayrollDTO;
import com.example.employee_payroll_spring.model.Employee;
import com.example.employee_payroll_spring.repo.EmployeePayrollAppRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service

public class EmployeePayrollService implements EmployeePayrollInterface {
    List<Employee> employeeList = new ArrayList<>();
    @Autowired
    EmployeePayrollAppRepo employeePayrollAppRepo;

    public static String printMessages() {
        return "Employee Payroll App";
    }

@Override
        public Employee addEmployee(EmployeePayrollDTO employeedto) {

            Employee employee=new Employee(employeedto);    
           // employeeList.add(employee);      //add data to arraylist
       employeePayrollAppRepo.save(employee); // add data to repo
            return employee;

    }



@Override
    public Optional<Employee> searchEmployeeById(int id) {
        Employee employee=new Employee( );
       // Employee employee1 = employeeList.get(id);// array list
        return employeePayrollAppRepo.findById(id);
       // return employeeList;
    }
@Override
    public List<Employee> searchAllEmployee() {
        List<Employee> employeeList2 = employeeList.stream().toList();
        return employeePayrollAppRepo.findAll();
     //    return  employeeList2;
    }
@Override
    public Employee editName(int id, EmployeePayrollDTO employeePayrollDTO) {
        Optional<Employee> employee = employeePayrollAppRepo.findById(id);
        Employee employee2 = employeeList.get(id);                                 //arraylist
        if (employee.get().getId() == id){
            Employee employee3 = new Employee(id,employeePayrollDTO);
          Employee employee1=new Employee(id,employeePayrollDTO);
            return employeePayrollAppRepo.save(employee.get());
           // employeeList.add(employee3);                             //arraylist
           // return employeePayrollAppRepo.save(employee3);
        }else {
            return null;
        }


    }
@Override
    public Optional<Employee> DeleteById(int id) {
        Optional <Employee> employee = employeePayrollAppRepo.findById(id);
        employeePayrollAppRepo.deleteById(id);
        employeePayrollAppRepo.delete(employee.get());
      //  employeeList.remove(employee.get());         //array list
        return employee;
    }
}


