package com.example.demo;

public class Employee {
    private String firstname;
    private String lastname;
    private long SSN;
    private String DOB;

    public Employee() {
    }

    public Employee(String firstname, String lastname, long SSN, String DOB) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.SSN = SSN;
        this.DOB = DOB;

    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public long getSSN() {
        return SSN;
    }

    public void setSSN(long SSN) {
        this.SSN = SSN;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

}





