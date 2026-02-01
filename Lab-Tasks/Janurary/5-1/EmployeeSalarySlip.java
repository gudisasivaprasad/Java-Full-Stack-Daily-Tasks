/*

Create a Employee Salary calculation Application project by using Method Overriding Concept to 
display
different kinds of salary for PartTimeEmployee and FullTimeEmployee.
Validate all the inputs properly and generate error message, if any input is not appropriate. 

Create a BLC class called Employee
Fields :
 id  int  protected
 name String protected
	
Use a parameterized constructor to initialize all the fields, 

 Methods :
 
 1) Method Name 	: calculateSalary()
    Argument   		: No Argument
    Return Type 	: double
    Access modifier	: public
    In this method return 0.0 for generic salary

 Create another BLC class FullTimeEmployee which is sub class of Employee.

  
  Field :
  protected double salary;
  
  Take a parameterized constructor to initialize super class and sub class properties.
  Validate all the inputs properly and generate error message, if any input is not appropriate. 
  [See the Test cases for Input Validation]

 Method :
  
 1) Method Name 	: calculateSalary()
    Argument   		: No Argument
    Return Type 	: double
    Access modifier	: public
    
    In this overridden method return the salary of employee as a non static variable

    
Create another BLC class PartTimeEmployee which is sub class of Employee
  
  Field :
  protected double hourlyRate;
  protected int hoursWorked; 
  
  Take a parameterized constructor to initialize super class and sub class properties.
  Validate all the inputs properly and generate error message, if any input is not appropriate. 
  [See the Test cases for Input Validation]
  
 Method :
  
 1) Method Name 	: calculateSalary()
    Argument   		: No Argument
    Return Type 	: double
    Access modifier	: public
    In this overridden method return the salary of employee as based on number of hours, he has
    worked in the Organization.
        
    Create an ELC class EmployeeSalarySlip with main method to test this application.
    


Examples
Example 1
Input:
Test Case 1 :
-------------
		***Salary Calculation Menu***		
		 1) FullTime Employees 
		 2) PartTime Employees  
Please select the Employee type
1
Enter Fulltime Employee Id :101
Enter Fulltime Employee Name :Scott
Enter the Salary :90000
Scott Salary is :90000.0
Output:
Scott Salary is :10500.0
Explanation:
Based on the test cases develop the switch case based on the choice only it will take the required type input.

*/

//ELC class
import java.util.*;
public class EmployeeSalarySlip
{
    void main()
    {
        try(Scanner sc = new Scanner(System.in))
        {
            int choice = sc.nextInt();
            sc.nextLine();
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            Employee emp = null;

            switch(choice)
            {
                case 1 ->
                {
                    double salary = sc.nextDouble();
                    emp = new FullTimeEmployee(id,name,salary);
                    IO.println(name+" Salary is : "+emp.calculateSalary());
                }
                case 2 ->
                {
                    double hourlyRate = sc.nextDouble();
                    int hoursWorked = sc.nextInt();
                    emp = new PartTimeEmployee(id,name,hourlyRate,hoursWorked);
                    IO.println(name+" Salary is :"+emp.calculateSalary());
                }
                default ->IO.println("Invalid input");
            };
        }
    }
}

//BLC classes

class Employee
{
    protected int id;
    protected String name;
    Employee(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    public double calculateSalary()
    {
        return 0.0;
    }
}

class FullTimeEmployee extends Employee
{
    protected double salary;
    FullTimeEmployee(int id,String name,double salary)
    {
        if(salary < 0 )
        {
            IO.println("Salary can't be negative!!!");
            System.exit(0);
        }
        super(id,name);
        this.salary = salary;
    }
    public double calculateSalary()
    {
        return this.salary;
    }
}

class PartTimeEmployee extends Employee
{
    protected double hourlyRate;
    protected int hoursWorked;
    PartTimeEmployee(int id,String name,double hourlyRate,int hoursWorked)
    {
        if(hourlyRate <= 0)
        {
            IO.println("Employee hourly rate can't be zero OR Negative");
            System.exit(0);
        }
        super(id,name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    public double calculateSalary()
    {
        return hourlyRate*hoursWorked;
    }
}