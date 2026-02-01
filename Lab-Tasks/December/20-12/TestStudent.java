/*Problem Description
1) Write a Java program to demonstrate constructor overloading by creating a class Student.
The program should accept input from the user and initialize objects using different constructors based on the provided input.
Display the student details for each object.

Examples
Example 1
Input:
2
101
Ravi
Output:
Student Details:
Student ID   : 101
Student Name : Ravi
Student Age  : 0
Explanation:
System.out.println("Choose Constructor"); System.out.println("1. Default Constructor"); System.out.println("2. Constructor with ID and Name"); System.out.println("3. Constructor with ID, Name and Age"); */
public class TestStudent{

  void main(){

    int choice = Integer.parseInt(IO.readln());
    Student s = null;

    if(choice == 1){
        s = new Student();
    }

    else if(choice == 2){
        int id = Integer.parseInt(IO.readln());
        String name = IO.readln();
        s = new Student(id, name);
    }

    else if(choice == 3){
        int id = Integer.parseInt(IO.readln());
        String name = IO.readln();
        int age = Integer.parseInt(IO.readln());
        s = new Student(id, name, age);
    }
    s.getDisplay();
  }
}
class Student{
    private int id;
    private String name;
    private int age;

    Student(){
        id = 0;
        name = "Not Given";
        age = 0;
    }

  
    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public Student(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    void getDisplay(){
        IO.println("Student Details:");
        IO.println("Student ID   : " + id);
        IO.println("Student Name : " + name);
        IO.println("Student Age  : " + age);
    }

}
