package com.ideas2it.employee.model;

import org.springframework.data.annotation.Persistent;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table(name = "trainee")

public class Trainee {

    public static String companyName = "Ideas2it";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name ="employeeid")
    private String employeeId;

    @Column(name = "employee_name")
    private String employeeName;

    @Column(name = "Joining_Date")
    private String employeeJoiningDate;

    @Column(name = "employee_gender")
    private String employeeGender;

    @Column(name= "designation")
    private String designation;

    @Column(name = "mobile_number")
    private long mobileNumber;

    @Column (name = "email_id")
    private String emailId;

    @Column (name = "blood_group")
    private String bloodGroup;

    @Column (name = "marital_status")
    private String maritalStatus;

    @Column (name = "pay")
    private int pay;

    @Column (name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "task_assign")
    private String taskAssign;

    public Trainee(){};

    public Trainee(int id, String employeeId,String employeeName, String employeeJoiningDate, String employeeGender, String designation, long mobileNumber,
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

    public void setTaskAssign(String taskAssign){
        this.taskAssign = taskAssign;
    }

    public String getTaskAssign(){
        return taskAssign;
    }

    public String toString() {
        return( "Id :" +getId() +"\n"+
                "Trainee Id :" +getEmployeeId() +"\n" +
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
