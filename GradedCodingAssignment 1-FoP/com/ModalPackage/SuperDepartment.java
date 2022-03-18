package com.ModalPackage;
public class SuperDepartment{

    public String departmentName;
    public String todaysWork;
    private String todayAHoliday;
    public String workDeadLine;

    public SuperDepartment(){
        setDefaultValues();
    }

    public String getDepartmentName(){
        return departmentName;
    }

    public String getTodaysWork(){
        return todaysWork;
    }

    public String isTodayAHoliday(){
        return todayAHoliday;
    }

    public String getWorkDeadLine(){
        return workDeadLine;
    }

    private void setDefaultValues(){
        departmentName  = "Super Department";
        todaysWork  = "No Work as of now";
        todayAHoliday  = "Today is not a holiday";
        workDeadLine  = "Nil";
    }
}