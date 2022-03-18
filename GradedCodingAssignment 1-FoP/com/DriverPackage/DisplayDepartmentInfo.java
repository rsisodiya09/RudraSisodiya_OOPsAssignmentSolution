package com.DriverPackage;
import com.ModalPackage.*;

public class DisplayDepartmentInfo {
    
    public static void displayDepartmentInfo(SuperDepartment dept){
        System.out.println("----------------------------------------------");
        System.out.println("Welcome to "+ dept.getDepartmentName());
        if(dept instanceof HrDepartment){
            System.out.println(((HrDepartment) dept ).doActivity());
        }
        System.out.println(dept.getTodaysWork());
        System.out.println(dept.getWorkDeadLine());
        if(dept instanceof TechDepartment){
            System.out.println(((TechDepartment) dept ).getTechStackInformation());
        }
        System.out.println(dept.isTodayAHoliday());
        System.out.println("----------------------------------------------");
    }
}
