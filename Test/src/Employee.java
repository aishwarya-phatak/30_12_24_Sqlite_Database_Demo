public class Employee extends Person{
    private int employeeId;
    private float employeeSalary;

    public Employee(){
        this.employeeId = 101;
        this.employeeSalary = 42324.456f;
    }

    public Employee(int empId, float empSalary){
        this.employeeId = empId;
        this.employeeSalary = empSalary;
    }

//    public void displayEmpDetails(){
//        System.out.println("emp details " + "employee id is : " +
//                employeeId + "employee salary is :" + employeeSalary);
//    }

    @Override
    public void display() {
        super.display();
        System.out.println("Employee Details " + "empId :" + employeeId
                + "empSalary : " + employeeSalary);
    }
}
