package com.example.employee_payroll_spring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
@Slf4j
public class EmployeePayrollSpringApplication {

    public static void main(String[] args) {
      // SpringApplication.run(EmployeePayrollSpringApplication.class, args);
        ApplicationContext context = SpringApplication.run(EmployeePayrollSpringApplication.class, args);
        log.info("Employee payroll app started in {} Environment " + context.getEnvironment().getProperty("environment"));
    }
    }


