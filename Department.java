package EmployeeDetails;
public class Department {
    private int departmentId;
    private String departmentName;
    
    public Department(int departmentId, String departmentName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }
    public int getDepartmentId() {
        return departmentId;
    }
    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }
    public String getDepartmentName() {
        return departmentName;
    }
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    public static void main(String[] args) {
        Department accountingDept = new Department(101, "Accounting");
        Department marketingDept = new Department(102, "Marketing");

        System.out.println("Department ID: " + accountingDept.getDepartmentId());
        System.out.println("Department Name: " + accountingDept.getDepartmentName());

        System.out.println("Department ID: " + marketingDept.getDepartmentId());
        System.out.println("Department Name: " + marketingDept.getDepartmentName());
    }
}