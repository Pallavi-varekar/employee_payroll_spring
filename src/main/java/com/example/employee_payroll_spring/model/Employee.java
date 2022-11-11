package com.example.employee_payroll_spring.model;

import javax.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue
    private int Id;
    private String fNname;
    private String lNamne;
    private long salary;
    private String note;
    private String profilepic;
    private String startDate;

    public Employee(int id, String fNname, String lNamne, long salary, String note, String profilepic, String startDate) {
        Id = id;
        this.fNname = fNname;
        this.lNamne = lNamne;
        this.salary = salary;
        this.note = note;
        this.profilepic = profilepic;
        this.startDate = startDate;
    }

    public Employee() {
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
    }
}




