import com.DriverPackage.*;
public class Department
{
    public static void main(String[] agrs){
        DisplayDepartmentInfo.displayDepartmentInfo(CreateDepartment.adminDepartment());
        DisplayDepartmentInfo.displayDepartmentInfo(CreateDepartment.hrDepartment());
        DisplayDepartmentInfo.displayDepartmentInfo(CreateDepartment.techDepartment());
    }
}