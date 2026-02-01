/*Create a class Employee (Business Logic Class)

Non static Fields :

employeeNumber : private-int
employeeName : private-String
employeeSalary:private -double

Create a parameterized constructor to initialilize all the fields.

Create a pair of setter and getter methods for all the Non static fields.

Methods :
---------
1)
Method Name : getEmployeeDesignation()
Parameter : double salary [Here method should receive updated salary]
Return Type : String
Access modifier : public

In this method, Take the updated salary in the parameter variable and return the employee
designation based on the following criteria :

a) If updatedSalary is 120000, return Employee is a HR Manager.
b) If updatedSalary is 90000, return Employee is a Developer.
c) If updatedSalary is 60000, return Employee is a Designer.
d) In the else part, return Employee is a Tester.

Take toString() method to print Employee Object properties.


Create an ELC class EmployeeDemo which contains main method, with the help of IO class take the input from the user to initialize the non static field through parameterized constructor.

Print the employee details using toString() method.

Take the salary increment amount from the user using IO class, update the employee
salary using setter and getter.

Print the employee data with updated salary.

Pass this updated salary to getEmployeeDesignation() method to get and print the 
Employee Designation as per below output.

Sample Output :
----------------
Enter Employee Number : 101
Enter Employee Name   : Scott
Enter Employee Salary : 90000

Employee Details :
Employee Number : 101
Employee Name   : Scott
Employee Salary : 90000.0

Enter Increment Amount : 30000

Updated Employee Details :
Employee Number : 101
Employee Name   : Scott
Employee Salary : 120000.0

Scott is a HR Manager.

Examples
Example 1
Input:
Enter Employee Number : 101
Enter Employee Name   : Raju
Enter Employee Salary : 60000
Enter Salary Increment Amount : 30000
Output:
--- Updated Employee Details ---
Employee Number : 101
Employee Name   : Raju
Employee Salary : 90000

Employee is a Developer. 

class EmployeeDemo{
    void main(){
        int number = Integer.parseInt(IO.readln());
        String name = IO.readln();
        double salary = Double.parseDouble(IO.readln());
        double newsalary = Double.parseDouble(IO.readln());
    
    Employee e1 = new Employee(number, name, salary);
    e1.setemployeeSalary(newsalary);
    IO.println("--- Updated Employee Details ---");
    IO.println(e1);
    double incre = e1.getemployeeSalary();
    IO.println(e1.getEmployeeDesignation(incre));

    }
}




 class Employee{
    private int employeeNumber;
    private String employeeName;
    private double employeeSalary;

    public Employee(int employeeNumber, String employeeName, double employeeSalary){
    this.employeeNumber = employeeNumber;
    this.employeeName = employeeName;
    this.employeeSalary = employeeSalary;
    }

    public int getemployeenumber(){
        return this.employeeNumber;
    }

    public String getemployeeName(){
        return this.employeeName;
    }

    public double getemployeeSalary(){
        return this.employeeSalary;
    }

    public void setemployeeName(String employeeName){
        this.employeeName = employeeName;
    }

    public void setemployeeNumber(int employeeNumber){
        this.employeeNumber = employeeNumber;
    }

    public void setemployeeSalary(double employeeSalary){
        this.employeeSalary += employeeSalary;
    }



    public String getEmployeeDesignation(double Salary){
        if(Salary == 120000) return "Employee is a HR Manager.";
        else if( Salary == 90000) return "Employee is a Developer.";
        else if(Salary == 60000) return "Employee is a Designer.";
        else 
        return "Employee is a Tester.";
    }
 
    public String toString(){
        return "Employee Number : " + employeeNumber +"\n" +     "Employee Name   : " + employeeName+"\n" +
        "Employee Salary : " + employeeSalary +"\n";
    }



}*/