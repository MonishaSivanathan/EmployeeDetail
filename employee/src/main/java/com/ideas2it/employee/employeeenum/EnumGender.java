package com.ideas2it.employee.employeeenum;

public class EnumGender {
    public enum Gender {
        male,female,transgender
    }

    public static boolean isEnumEmployeeGender(String employeeGender) {
        boolean genderValidate = true;
        try {
            Gender genderEnum = Gender.valueOf(employeeGender);
            genderValidate = true;
        } catch(Exception e) {
            genderValidate = false;
        }
        return genderValidate;
    }
}
