package com.ModalPackage;
public class HrDepartment extends SuperDepartment{
    private String activity;
    public HrDepartment(){
        setDefaultValues();
    }

    public String getDepartmentName(){
        return departmentName;
    }

    public String getWorkDeadLine(){
        return workDeadLine;
    }

    public String doActivity(){
        return activity;
    }

    private void setDefaultValues(){
        departmentName  = "Hr Department";
        todaysWork  = "Fil today's worksheet and mark your attendance";
        workDeadLine = "Complete by EOD";
        activity  = "team Lunch";
    }
}