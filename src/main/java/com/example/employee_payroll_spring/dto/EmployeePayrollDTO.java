package com.example.employee_payroll_spring.dto;

import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;


@Data
@NoArgsConstructor
//@AllArgsConstructor
//@Getter
public class EmployeePayrollDTO {
    @NotEmpty(message = "Employee First name is mandatory")
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z]{2,}$", message = "Employee First Name Invalid")
    private String fName;
    @NotEmpty(message = "Employee First name is mandatory")
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z]{2,}$", message = "Employee First Name Invalid")
    private String lName;
    @Min(15000)
    private long salary;
    @NotEmpty(message = "Notes is mandatory")
    private String note;

    private String profilepic;
    @NotEmpty(message = "Start Date is mandatory")
    private String startDate;






}
