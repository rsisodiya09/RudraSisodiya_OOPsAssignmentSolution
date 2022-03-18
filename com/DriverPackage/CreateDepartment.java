package com.DriverPackage;
import com.ModalPackage.*;

public class CreateDepartment {
    
    public static AdminDepartment adminDepartment(){
        return new AdminDepartment();
    }

    public static HrDepartment hrDepartment(){
        return new HrDepartment();
    }

    public static TechDepartment techDepartment(){
        return new TechDepartment();
    }
}
