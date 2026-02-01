/*Description
MultiLevel Inheritance
A university management system needs to store academic details of students.
Riteshry Person has basic personal details. A Student inherits from Person, and a GraduateStudent 
inherits from Student and adds degree-specific information.

Requirements:
Create three classes: Person, Student, and GraduateStudent.

The Person class should contain:
Instance variables: name, age
A method displayPersonDetails() to print the details.

The Student class should:
Inherit from Person
Contain: studentId, course
A method displayStudentDetails() to print all student details along with personal details 
by calling displayPersonDetails().

The GraduateStudent class should:
Inherit from Student
Contain: degreeType, yearOfPassing
A method displayGraduateDetails() to print all graduate student details, including inherited
details.

In the Main class:
Create an object of GraduateStudent.
Call displayGraduateDetails().
Examples
Input

Name: "Adya" 
Age: 23 
Student ID: "C13001" 
Course: "Artificial Intelligence" 
Degree Type: "M.Tech" 
Year of Passing: 2024
Output

Degree Type: M.Tech 
Year of Passing: 2024 
Student ID: C13001 
Course: Artificial Intelligence 
Name: Adya 
Age: 23 */
import java.util.*;

public class Mains {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        sc.nextLine();
        String studentId = sc.nextLine();
        String course = sc.nextLine();
        String degreeType = sc.nextLine();
        int yearOfPassing = sc.nextInt();
        sc.nextLine();
        GraduateStudent grad = new GraduateStudent(degreeType,yearOfPassing,name,age,studentId,course);
        grad.displayGraduateDetails();
        
    }
}

class Person{
    int age;
    String name;

    Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public  void displayPersonDetails(){
        IO.println("Name: "+name + "\nAge: "+age);
    }

}

class Student extends Person{
    String studentId;
    String course;

    Student(String name,int age,String studentId, String course){
        super(name,age);
        this.studentId = studentId;
        this.course = course;
    }

    public void displayStudentDetails(){
        IO.println("Student ID: "+ studentId + "\nCourse: "+ course);
        super.displayPersonDetails();
    }


}

class GraduateStudent extends Student{
    String degreeType;
    int yearOfPassing;

    GraduateStudent(String degreeType,int yearOfPassing,String name,int age,String studentId, String course){
        super(name,age,studentId,course);
        this.degreeType = degreeType;
        this.yearOfPassing = yearOfPassing;
    }

    public void displayGraduateDetails(){
        IO.println("Degree Type: "+ degreeType + "\nYear of Passing: " + yearOfPassing);
        super.displayStudentDetails();
    }

}

