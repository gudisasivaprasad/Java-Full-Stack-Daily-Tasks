/*Create a program to find out the Student Grade based on Student Marks :

Create a BLC class Student

Instance Variables :
name : String : private 
marks : int : private

Create a parameterized constructor to initialize all the fields.

Define setter and getter for all fields.

Override toString() method which will return only the name of the 
student from this method.

Creaate another BLC class StudentGrade.

Instance Variables :
student : Student : private 
studentGrade : char : private

Create a parameterized constructor to initialize all the fields.

Define setter and getter for all fields.

Override toString() method to print the following details :

[The Student Raj has 'A' Grade]


Create another class CalculateStudentGrade which does not contain any field (Variable)

Methods :
Name of the Method : calculateGrade()  [Factory Method]
return type : StudentGrade 
Access Modifier : public, static
Argument : Student 

In calculateGrade() method, task is to find the Student grade based on the Student marks and create and return the StudentGrade
object on the following criteria :

Student Marks                 Grade
> 90                            A
>= 75                           B
>= 60                           C
< 60                            D

Create an ELC class StudentGradeCalculator which contains main method to test the application.

Examples
Example 1
Input:
Enter Student Name : Raj
Enter Student Marks : 92
Output:
[The Student Raj has 'A' Grade] */


public class StudentGradeCalculator {

    void main(){

        String name = IO.readln();
        int marks = Integer.parseInt(IO.readln());

        Student student = new Student(name , marks);

        StudentGrade result = CalculateStudentGrade.calculateGrade(student);
        //    StudentGrade result= new StudentGrade(student, grade);
        IO.println(result);
    }
}



class Student{

    private String name;
    private int marks;

    public Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    public String getName(){
        return name;
    }

    public int getMarks(){
        return marks;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setMarks(int marks){
        this.marks = marks;
    }

    public String toString(){
        return name;
    }
}

//Student Grade

class StudentGrade{
    private Student student;
    private char studentGrade;

    public StudentGrade(Student student, char studentGrade){
        this.student = student;
        this.studentGrade = studentGrade;
    }

    public Student getStudent(){
        return student;
    }

    public char getStudentGrade(){
        return studentGrade;
    }

    public void setStudent(Student student){
        this.student = student;
    }

    public void setStudentGrade(char studentGrade){
        this.studentGrade = studentGrade;
    }

    public String toString(){
        return "[The Student " + student + " has '" + studentGrade + "' Grade]" ;
    }

}

 class CalculateStudentGrade 
 {

    public static StudentGrade calculateGrade(Student student){

        int marks = student.getMarks();
        char grade = 'D';

        if(marks > 90){
            grade = 'A';
        }else if(marks >= 75){
            grade = 'B';
        }else if(marks >= 60){
            grade = 'C';
        }else if(marks< 60){
            grade = 'D';
        }

        return new StudentGrade(student, grade);
    }
}

    