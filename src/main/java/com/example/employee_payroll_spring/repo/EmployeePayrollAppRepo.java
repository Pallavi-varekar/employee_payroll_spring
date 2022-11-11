package com.example.employee_payroll_spring.repo;

import com.example.employee_payroll_spring.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeePayrollAppRepo  extends JpaRepository<Employee,Integer> {
}
