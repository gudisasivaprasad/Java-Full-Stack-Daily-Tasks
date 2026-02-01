/*Problem Description
Demonstrating Inheritance to Simplify and Extend Class Functionality and 
This motto emphasizes the key educational goal of the program: to show how inheritance can be used to simplify code by 
reusing existing class functionality and extending it with new features specific to derived classes.


Define the base class Vehicle
-------------------------------

Attributes: [protected]
make: String
model: String
year: int

Constructor:
Vehicle(String make, String model, int year): Constructor to initialize the attributes.

Methods:
void displayDetails(): Method to display the details of the vehicle.



Define the subclass Car Inherits from Vehicle
---------------------------------------------

Attributes: [protected]
numberOfDoors: int

Constructor:
Car(String make, String model, int year, int numberOfDoors): Constructor to initialize the attributes.

Methods:
void displayDetails(): Method to display the details of the car, overriding the method from Vehicle.



Define the subclass Bike Inherits from Vehicle
----------------------------------------------

Attributes: [protected]
type: String

Constructor:
Bike(String make, String model, int year, String type): Constructor to initialize the attributes.

Methods:
void displayDetails(): Method to display the details of the bike, overriding the method from Vehicle.



Create Test class
-----------------
-> create main method
-> in main method create Car object and Bike object.
-> Print the details of Car class and Bike class by calling displayDetails() methods of both class.


Condition :
-----------
if any numeric value is zero or negative then print "Error Invalid Input".


TEST CASE 1 :
-------------
sample input  : When your reading values for Vehicle class OR Car class OR Bike class then make sure if any numeric value is <=0 then print "Error Invalid Input".
                
sample output : Error Invalid Input



TEST CASE 2 :
-------------
sample input : Car car = new Car("Audi", "Q8", 2021, 4);
               System.out.println("Car Details:");
               car.displayDetails();

               Bike bike = new Bike("Yamaha", "MT-07", 2020, "Sports");
               System.out.println("\nBike Details:");
               bike.displayDetails();


sample output : 
                Car Details:
                Make: Audi
                Model: Q8
                Year: 2021
                Number of Doors: 4

                Bike Details:
                Make: Yamaha
                Model: MT-07
                Year: 2020
                Type: Sports

Examples
Example 1
Input:
Enter Car Details
Make: BMW
Model: X5
Year: -2020
Number of Doors: 4
Output:
Error Invalid Input */

public class Test{
    void main(){
   
        Car car = new Car("Audi","Q8",2021,4);
        IO.println("Car Details");
        car.displayDetails();

        Bike bike = new Bike("Yamaha","MT-07",2020,"Sports");
        IO.println("\nBike Details");
        bike.displayDetails();

    }
}


class Vehicle{
    protected String make;
    protected String model;
    protected int year;

    Vehicle(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    void displayDetails(){
        IO.println("make = " + make + ", model = " + model + ", year = " + year);
    }


}

class Car extends Vehicle{
    protected int numberOfDoors;

    Car(String make, String model, int year,int numberOfDoors){
        if(numberOfDoors <= 0 || year <= 0){
            IO.println("Error Invalid Input");
            System.exit(0);
        }
        super(make,model,year);
        this.numberOfDoors = numberOfDoors;
        
    }

    void displayDetails(){
       IO.println("make = " + make + ", model =" + model + "year = " + year + ", numberOfDoors= " + numberOfDoors );
    }
}

class Bike extends Vehicle{
    protected String type;

    Bike(String make, String model, int year, String type){
        if(year <= 0){
            IO.println("Error Invalid Input");
            System.exit(0);
        }
        super(make, model, year);
        this.type = type;
    }
    void displayDetails(){
        IO.println("Make =" + make + "model =" + model + "year ="+ year + "type = "+ type);
    }
}