package com.ideas2it.employee.utility;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.time.Period;
import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeUtility {

    public static String generateId() {
        Random random = new Random();
        int randomValue = random.nextInt(10000);
        String c = "I";
        String employeeId = c+""+randomValue;
        return employeeId;
    }

    public static boolean isValidMobileNumber(String number) {
        Pattern p = Pattern.compile("^\\d{10}$");
        Matcher m = p.matcher(number);
        return (m.matches());
    }

    public static boolean isValidEmailId(String emailId) {
        String id = "^[a-zA-Z0-9+_.-]+@[a-zA-Z+.-]+(.+)+[com | in]$";
        Pattern patternEmailId = Pattern.compile(id);
        Matcher matcherEmailId = patternEmailId.matcher(emailId);
        return matcherEmailId.find();
    }

    public static boolean isValidName(String employeeName) {
        String regex = "^[A-Za-z]\\w{2,30}$";
        if(employeeName.matches(regex)) {
            return true;
        }
        return false;
    }

    public static boolean isValidDateOfBirth(String dateOfBirth) {
        Pattern pattern = Pattern.compile("([0-3][0-9])-([0-1][0-9])-([0-9]{4})$");
        Matcher match = pattern.matcher(dateOfBirth);
        if ( match.find()) {
            return true;
        }
        return false;
    }

    public static boolean isValidDesignation(String designation) {
        String regex = "^[A-Za-z]\\w{2,30}$";
        if(designation.matches(regex)) {
            return true;
        }
        return false;
    }

    public static boolean isValidDateOfJoining(String employeeJoiningDate) {
        Pattern pattern = Pattern.compile("([0-3][0-9])-([0-1][0-9])-([0-9]{4})$");
        Matcher match = pattern.matcher(employeeJoiningDate);
        if ( match.find()) {
            return true;
        }
        return false;
    }
}
