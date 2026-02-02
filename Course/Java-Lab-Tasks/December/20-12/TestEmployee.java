/*. EmployeeSalarySystemUsingEncapsulation
Easy
100 points
• 130 min suggested
Problem Description
Write a Java program to demonstrate Encapsulation using an Employee Salary system.
Employee details should be private and accessed only through public methods.
Read input from the user and display the employee details.

Examples
Example 1
Input:
Enter Employee ID: 101
Enter Employee Name: Ravi
Enter Salary: 25000
Output:
--- Employee Details ---
Employee ID   : 101
Employee Name : Ravi
Salary        : 25000.0
Explanation:
The setter methods check the values before storing them to ensure valid data. setEmpId() allows only positive IDs, printing an error for invalid input. setSalary() ensures the salary is non-negative, preventing incorrect or harmful values from being stored. */

public class TestEmployee{
    void main(){
        Employee e1 = new Employee();

        int id = Integer.parseInt(IO.readln());
        String name = IO.readln();
        double sal = Double.parseDouble(IO.readln());
        e1.setEmpID(id);
        e1.setEmpName(name);
        e1.setSalary(sal);


    
        IO.println("--- Employee Details ---");
        IO.println("Employee ID   : "+ e1.getID());
        IO.println("Employee Name : "+ e1.getName());
        IO.println("Salary        : "+e1.getSalary());
        
    }
}



class Employee{
    private int ID;
    private String name;
    private double Salary;

    public void setEmpID(int ID){
        if (ID > 0){
            this.ID = ID;
            
        }
        else {
            IO.println("Invalid Employee ID");
            IO.println("");
        }
    }

    public void setEmpName(String name){
        this.name = name;

    }

    public void setSalary(double Salary){
        if(Salary > 0){
            this.Salary = Salary;
        }
        else if(Salary < 0){
            IO.println("Salary cannot be negative");
            IO.println("");
        }
    }

    public int getID(){
        return ID;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return Salary;
    }
}