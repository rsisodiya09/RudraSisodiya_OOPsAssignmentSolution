package com.ModalPackage;
public class TechDepartment extends SuperDepartment{
    private String techStackInformation;

    public TechDepartment(){
        setDefaultValues();
    }

    public String getDepartmentName(){
        return departmentName;
    }

    public String getTodaysWork(){
        return todaysWork;
    }

    public String getTechStackInformation(){
        return techStackInformation;
    }

    public String getWorkDeadLine(){
        return workDeadLine;
    }

    private void setDefaultValues(){
        departmentName  = "Tech Department";
        todaysWork  = "Complete coding of Module 1";
        techStackInformation  = "core Java";
        workDeadLine  = "Complete by EOD";
    }
}