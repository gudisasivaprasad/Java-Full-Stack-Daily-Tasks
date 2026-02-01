/*Create a BLC class Employee. 

Field/Attribute/Properties [Access modifier : private]

name : String
id : int
department : String
salary : double

Take a private parameterized constructor to initialize the field so, We can call the Constructor from BLC class only.

Methods :
----------
1)
Name of the Method : createEmployeeObject()
         Parameter : 4 parameters name, id, department and salary 
       return type : Employee
   Access modifier : public
   Non access modifier : static
In this method return the Employee Object.


2) Generate toString() method. Call calculateAnnualSalary() method from
   this method to display deatils.

3)
Name of the Method : calculateAnnualSalary()
         Parameter : No Parameter 
       return type : double
   Access modifier : public
  
In this method with the help of switch case calculates and returns the annual salary of the employee based on their salary (monthly salary).
Adds a bonus based on the department:
Sales: 10% bonus of annual salary.
Engineering: 15% bonus of annual salary.
HR: 8% bonus of annual salary.
Other: 5% bonus of annual salary.

Create a ELC class TestEmployee
Main Method: In the main method, write code to:

Take an Infinite while loop, Prompt the user to enter values for name, id,department and salary through IO class. Call the createEmployeeObject() with specified value which will return Employee object. Print Employee data using toString() method and print the
calculateAnnualSalary() also.

Ask choice from the user, whether the user wants to continue to create and return more Employee object or not. By using equalsIgnoreCase() come out from the Infinite loop, If the user choice is - no

Test Case :
-------------
How many employees do you want to create? 2

--- Employee Details ---

Enter details for Employee 1:
Enter Employee ID: 111
Enter Employee Name: Scott
Enter Monthly Salary: 40000
Enter Department (Sales, Engineering, HR, Other): HR
ID: 111, Name: Scott, Department: HR, Monthly Salary: 40000.00, 
Annual Salary (with Bonus): 518400.00

Enter details for Employee 2:
Enter Employee ID: 222
Enter Employee Name: Smith
Enter Monthly Salary: 60000
Enter Department (Sales, Engineering, HR, Other): Sales
ID: 222, Name: Smith, Department: Sales, Monthly Salary: 60000.00, 
Annual Salary (with Bonus): 792000.00*/

public class TestEmployee{
    void main(){

    int a = Integer.parseInt(IO.readln());
        for(int i = 0 ; i < a ; i++){
            int id = Integer.parseInt(IO.readln());
            String name = IO.readln();
            double salary = Integer.parseInt(IO.readln());
            String dept = IO.readln();

            Employee emp = Employee.createEmployeeObject(name,id,dept,salary);
            IO.println(emp.toString());
            //System.out.println("Annual Salary (with Bonus): %.2f", emp.calculateAnnualSalary());
        }
    }
}

class Employee{
    private String name;
    private int id;
    private String department;
    private double salary;

    private Employee(String name, int id, String department, double salary){
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
    }
    public static Employee createEmployeeObject(String name, int id, String department, double salary){
        return new Employee (name, id, department,salary);
    }

    public String getName(){ //no parameters
        return name;         // has it return type
    }

    public void setName(String name){ // it has void and parameters
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getDepartment(){
        return department;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public String toString(){
        double annualwithbonus = calculateAnnualSalary();
        return "ID: " +  id + ", Name: " + name + ", Department: "+ department + ", Monthly Salary: "+ String.format("%.2f",salary) + ",\nAnnual Salary (with Bonus): " + String.format("%.2f",annualwithbonus);
    }

    public double calculateAnnualSalary(){
        double annualsalary =  salary * 12.0;
        String dept = department == null ? "" : department.trim().toLowerCase();
        double bonusRate = switch (dept){
            case "sales" -> 0.10;
            case "engineering" -> 0.15;
            case "hr" -> 0.08;
            default -> 0.05;
        };

        return annualsalary * (1.0 + bonusRate);
    }

}

/*public class TestStudent {
    void main(){
        
           // IO.print("Enter Student Name: ");
            String name = IO.readln();
           // IO.print("Enter Student age");
            int age = Integer.parseInt(IO.readln());

           // IO.print("Enter Student Grade");
            String grade = IO.readln();

            String choice = IO.readln();
            Student s = Student.createStudentObject(name,age,grade);
            IO.println(s);

            //IO.println("wanna continue(s/no): ");
            
        }
    }





class Student{
    private String name;
    private int age;
    private String grade;

    private Student(String name, int age, String grade){
        this.name = name;
        this.age = age;
        this.grade = grade;

    }
    public static Student createStudentObject(String name, int age, String grade){
        return new Student(name, age, grade);
    }

    public String toString(){
        return "Student Details [Name= " + name + ",Age=" + age + ", Grade=" + grade + "]";
    }
}  */