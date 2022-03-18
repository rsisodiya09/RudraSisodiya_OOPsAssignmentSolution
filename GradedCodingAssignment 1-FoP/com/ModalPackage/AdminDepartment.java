package com.ModalPackage;
public class AdminDepartment extends SuperDepartment{

    public AdminDepartment(){
        setDefaultValues();
    }

    public String getDepartmentName(){
        return this.departmentName;
    }

    public String getTodaysWork(){
        return this.todaysWork;
    }

    public String getWorkDeadLine(){
        return this.workDeadLine;
    }

    private void setDefaultValues(){
        departmentName  = "Admin Department";
        todaysWork  = "Complete your documents Submission";
        workDeadLine  = "Complete by EOD";
    }
}