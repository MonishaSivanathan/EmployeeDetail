package com.ideas2it.employee.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Column;
import java.util.List;
import java.time.LocalDate;
import java.time.Period;


public class TrainerDto {

    public static String companyName = "Ideas2it";
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

    public String projectName;

    public TrainerDto(int id, String employeeId, String employeeName, String employeeJoiningDate, String employeeGender, String designation, long mobileNumber,
                      String emailId, String bloodGroup, String maritalStatus, int pay, LocalDate dateOfBirth, String projectName) {
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
        this.projectName = projectName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectName() {
        return projectName;
    }

    public String toString() {
        return ("Id :" +getId()+ "\n" +
                "Trainer Id :" + getEmployeeId() + "\n" +
                "Trainer Name :" + getEmployeeName() + "\n" +
                "Trainer JoiningDate :" + getEmployeeJoiningDate() + "\n" +
                "Trainer Gender :" + getEmployeeGender() + "\n" +
                "Trainer Designation :" + getDesignation() + "\n" +
                "Trainer MobileNumber :" + getMobileNumber() + "\n" +
                "Trainer Email :" + getEmailId() + "\n" +
                "Trainee Age :" + getAge() + "\n" +
                "Trainer BloodGroup :" + getBloodGroup() + "\n" +
                "Trainee MaritalStatus :" + getMaritalStatus() + "\n" +
                "Trainer Pay :" + getPay() + "\n" +
                "Trainer ProjectName :" + getProjectName() + "\n");
    }
}

