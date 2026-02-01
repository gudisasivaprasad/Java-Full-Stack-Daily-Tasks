/*Skip to main content
Google Classroom
Classroom
Core Java by Ravishankar Sir (6th Nov 2025)
Java Batch 53 ( 6th Nov 2025 )
Home
Calendar
Enrolled
To-do
O
ORACLE by Vijay Kumar Sir
JAVA 53 (18 DEC 2025)
C
Core Java by Ravishankar Sir (6th Nov 2025)
Java Batch 53 ( 6th Nov 2025 )
C
C Language by Kishore Sir
Java Batch 53 and .NET 38(22nd SEP 2025)
J
Java 53 & . NET 38 HTML by shiva prakash sir
HTML (23th Sep 2025)
C
C Language by Kishore Sir
Java Batch 53 and .NET 38(4TH SEP 2025)
B
BTech III (2021-2025) : Soft Skills (AY 2022-23)
Faculty: Dr. Raghu Pradeep Nair
Archived classes
Settings
Assignment details
HAS-A Relation
Ravi Shankar
•
4:04 PM
100 points
Batch_53_Assignment.txt
Text

Class comments
Your work
Assigned
Private comments
Assignment 01 :
----------------
Title :- Customer and Orders Management

Task Description :-
-------------------
Create a program that manages customers and their orders using Aggregation.

Create a BLC class Order.

A class to represent an order with details like order ID, product name, and price.

Field Declarations :-
------------------------
private String orderId; 	-> Stores the order ID
private String itemName; 	-> Stores the name of the product ordered
private double price; 		-> Stores the price of the product

Constructor Declaration :-
---------------------------
-> public Order(String orderId, String itemName, double price) A constructor to initialize the order ID, item name, and price.

getter() Methods Declaration :-
--------------------------------
-> public String getOrderId();
-> public String getProductName();
-> public double getPrice();

toString() Method Declaration :-
---------------------------------
@Override
public String toString();
A method to return a string representation of the order.

Create a class called Customer.

A class to represent a customer with details 

Field Declarations :-
------------------------
-> private String name; // Stores the customer's name
-> private String email; // Stores the customer's email
-> private String address; //Stroes the customer's address
-> private long mobileNo; //Stroes the customer's mobile number
-> private Order order; // Stores the order object

Constructor Declaration :-
---------------------------
->Take a parameterized constructor to initialize all the fields.

toString Method Declaration :-
------------------------------
@Override
public String toString();
A method to return a string representation of the customer, including order details.


Create an ELC class Zomoto class with the following tasks:

-> Create a main method.
-> Create an Order object.
-> Create a Customer object that includes the Order.
-> Display the customer information.

-----------------------------------------------------------------------------------------
Assignment 02 :
---------------
Title :- Modeling Employee and Address Details 

Create a BLC class Address

Fields :-
------------
Implement a class with private fields for street and city.

Constructor :-
--------------
Provide a constructor to initialize these fields.

getter() & toString() method :-
-------------------------------
Implement getter methods and a toString() method to display the address.


Create another BLC class Person.


Fields :-
--------
Implement a class with private fields for name and an Address object.

Constructor :-
--------------
Provide a constructor to initialize name and address.

method getPersonDetails()
--------------------------
Implement a method to display the person's name and address.

Create an ELC class called Test

Implement a main method :-
---------------------------
-> Instantiate an Address object with sample data.
-> Instantiate a Person object using the Address object created earlier.
-> Print the person's details using the method in the Person class.

-----------------------------------------------------------------------------------------
Assignment 03 :
--------------

Change the Driver scenario.

Scenario Description :-
------------------------
This is a scenario based program on Copy Constructor and Deep copy concept (another object) with HAS-A realtion. 

It describes that if we create another object by using copy constructor and deep copy concept then Modification done in first object will not reflect another object that means another object will remain unchanged.

Coding Requirements :
=====================
Create a BLC class called Driver with the following private non static fields:

-> name;
-> age;

Constructor :-
--------------
Implement a parameterized constructor to initialize all non static fields.
Implement getter and setter methods for all non static fields.


Create a BLC class Car with the following attributes:
-> private String brand;
-> private String model;
-> private int year;
-> private Driver driver;

Constructor :-
--------------
Implement a parameterized constructor to initialize all non static fields.

Implement a copy constructor (which accepts Car as a paraneter) for the Car  and initializes the new Car object with the existing object properties. [Deep copy]

methods()
----------
Implement getter and setter methods for all non static fields.

Implement a method named changeDriver(Driver newDriver) to update the driver of the car with public modifier and void as a return type.


Create an ELC class UpdateDriverScenario with main method.

Create two Car objects by using Deep copy concept.
Now, Change the Driver from first Car object by using changeDriver() method.
Verify drived changed in both the Car Objects OR only 1 object. [Deep Copy] 

Output :
=== Before Changing Driver ===
Original Car: Car Brand: Hyundai, Model: Creta, Year: 2025, Driver Name: Scott, Age: 30
Copied   Car: Car Brand: Hyundai, Model: Creta, Year: 2025, Driver Name: Scott, Age: 30

=== After Changing Driver ===
Original Car: Car Brand: Hyundai, Model: Creta, Year: 2025, Driver Name: Alen, Age: 35
Copied   Car: Car Brand: Hyundai, Model: Creta, Year: 2025, Driver Name: Scott, Age: 30
Batch_53_Assignment.txt
Displaying Batch_53_Assignment.txt. */
public class UpdateDriverScenario {

    public static void main(String[] args) {

        // First Driver
        Driver d1 = new Driver("Scott", 30);

        // Original Car
        Car originalCar = new Car("Hyundai", "Creta", 2025, d1);

        // Deep Copy using Copy Constructor
        Car copiedCar = new Car(originalCar);

        IO.println("=== Before Changing Driver ===");
        printCar("Original Car", originalCar);
        printCar("Copied   Car", copiedCar);

        // Change driver only in original car
        Driver d2 = new Driver("Alen", 35);
        originalCar.changeDriver(d2);

        IO.println("\n=== After Changing Driver ===");
        printCar("Original Car", originalCar);
        printCar("Copied   Car", copiedCar);
    }

    static void printCar(String label, Car car) {
        IO.println(label + ": Car Brand: " + car.brand +
                ", Model: " + car.model +
                ", Year: " + car.year +
                ", Driver Name: " + car.driver.name +
                ", Age: " + car.driver.age);
    }
}

// ---------------- Driver Class ----------------
class Driver {
    String name;
    int age;

    Driver(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// ---------------- Car Class ----------------
class Car {
    String brand;
    String model;
    int year;
    Driver driver;

    // Normal Constructor
    Car(String brand, String model, int year, Driver driver) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.driver = driver;
    }

    // Copy Constructor (Deep Copy)
    Car(Car car) {
        this.brand = car.brand;
        this.model = car.model;
        this.year = car.year;

        // Deep copy of Driver
        this.driver = new Driver(car.driver.name, car.driver.age);
    }

    // Change Driver
    void changeDriver(Driver newDriver) {
        this.driver = newDriver;
    }
}
