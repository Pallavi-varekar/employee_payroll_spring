package com.example.employee_payroll_spring.model;

import com.example.employee_payroll_spring.dto.EmployeePayrollDTO;
import lombok.*;

import javax.persistence.*;

@Entity
@Data

@NoArgsConstructor
//@AllArgsConstructor
//@Getter
@Table

public class Employee {
    @Id
    @GeneratedValue
    private int Id;
    private String fName;
    private String lName;
    private long salary;
    private String note;
    private String profilepic;
    private String startDate;
     public Employee(int id,EmployeePayrollDTO employee) {
        this.Id = id;
        this.fName = employee.getFName();
        this.lName = employee.getLName();
        this.salary = employee.getSalary();
        this.note = employee.getNote();
        this.profilepic = employee.getProfilepic();
        this.startDate = employee.getStartDate();
    }

    public Employee(EmployeePayrollDTO employeePayrollDTO) {

        this.fName = employeePayrollDTO.getFName();
        this.lName = employeePayrollDTO.getLName();
        this.salary = employeePayrollDTO.getSalary();
        this.note = employeePayrollDTO.getNote();
        this.profilepic = employeePayrollDTO.getProfilepic();
        this.startDate = employeePayrollDTO.getStartDate();
    }

  /*  public Employee() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getfNname() {
        return fNname;
    }

    public void setfNname(String fNname) {
        this.fNname = fNname;
    }

    public String getlNamne() {
        return lNamne;
    }

    public void setlNamne(String lNamne) {
        this.lNamne = lNamne;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getProfilepic() {
        return profilepic;
    }

    public void setProfilepic(String profilepic) {
        this.profilepic = profilepic;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }*/
}




