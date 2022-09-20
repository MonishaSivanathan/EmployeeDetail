package com.ideas2it.employee.dto;

import java.time.LocalDate;
import java.time.Period;

public class TraineeDto {

    private int id;
    private String employeeId;
    private String employeeName;
    private String employeeJoiningDate;
    private String employeeGender;
    private String designation;
    private long mobileNumber;
    private String emailId;
    private String bloodGroup;
    private String maritalStatus;
    private int pay;
    private LocalDate dateOfBirth;
    private String taskAssign;

    public TraineeDto(int id, String employeeId,String employeeName, String employeeJoiningDate, String employeeGender, String designation, long mobileNumber,
                      String emailId, String bloodGroup, String maritalStatus, int pay, LocalDate dateOfBirth, String taskAssign) {
        this.id = id;
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeJoiningDate = employeeJoiningDate;
        this.employeeGender = employeeGender;
        this.designation = designation;
        this.mobileNumber = mobileNumber;
        this.emailId = emailId;
        this.bloodGroup = bloodGroup;
        this.maritalStatus = maritalStatus;
        this.pay = pay;
        this.dateOfBirth = dateOfBirth;
        this.taskAssign = taskAssign;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeJoiningDate(String employeeJoiningDate) {
        this.employeeJoiningDate = employeeJoiningDate;
    }

    public String getEmployeeJoiningDate() {
        return employeeJoiningDate;
    }

    public void setEmployeeGender(String employeeGender) {
        this.employeeGender = employeeGender;
    }

    public String getEmployeeGender() {
        return employeeGender;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    public int getPay() {
        return pay;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        return Period.between(dateOfBirth, currentDate).getYears();
    }

    public void settaskAssign(String taskAssign){
        this.taskAssign = taskAssign;
    }

    public String getTaskAssign(){
        return taskAssign;
    }

    public String toString() {
        return("Trainee Id :" +getEmployeeId() +"\n" +
                "Trainee Name :" +getEmployeeName() +"\n" +
                "Trainee JoiningDate :" +getEmployeeJoiningDate() +"\n" +
                "Trainee Gender :" +getEmployeeGender()+"\n" +
                "Trainee Designation :" +getDesignation()+"\n" +
                "Trainee MobileNumber :" +getMobileNumber() +"\n" +
                "Trainee Email :" +getEmailId() +"\n" +
                "Trainee Age :" +getAge() +"\n" +
                "Trainee BloodGroup :" +getBloodGroup() +"\n" +
                "Trainee MaritalStatus :" +getMaritalStatus() +"\n" +
                "Trainee Pay :" +getPay() +"\n" +
                "Trainee TaskAssign :" +getTaskAssign() +"\n" );
    }
}
