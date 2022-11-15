package com.example.employee_payroll_spring.exception;

public class CustomException extends RuntimeException
     {
    public CustomException(String messages) {
            super(messages);
        }
}
