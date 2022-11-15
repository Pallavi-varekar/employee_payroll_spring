package com.example.employee_payroll_spring.exception;

import com.example.employee_payroll_spring.dto.ResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;
import java.util.stream.Collectors;


@ControllerAdvice
public class ExceptionHandling {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ResponseDto> handleMethodNotValidException(MethodArgumentNotValidException exception){
        List<ObjectError> errorList = exception.getBindingResult().getAllErrors();
        List<String> errMessages = errorList.stream().map(objectErr -> objectErr.getDefaultMessage()).collect(Collectors.toList());
        ResponseDto responseDto= new ResponseDto("Exception while processing REST Request ",errMessages);
        return new ResponseEntity<>(responseDto, HttpStatus.CREATED);}
}
