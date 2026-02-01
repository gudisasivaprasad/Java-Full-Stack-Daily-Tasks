/*Description
A software company is developing a transport management system. As a part of this system,
you need to manage vehicle-related information. Car is a type of vehicle,
and it inherits some basic properties from the vehicle class. You need to design
a program using single-level inheritance where a Car class inherits from a Vehicle class.

Requirements:
Create two classes: Vehicle and Car.

The Vehicle class should contain:
Instance variables: brand, speed
A non-static method displayVehicleDetails() to print those details.

The Car class should :
Inherit from Vehicle
Contain instance variables: model, fuelType

Have a non-static method displayCarDetails() that:
Accesses and prints its own variables
Accesses and prints inherited variables
Calls the inherited method displayVehicleDetails()

In the Main class:

Create an object of the Car class
Call the displayCarDetails() method to print all information

Note:
You are not required to take input from the user. Just focus on demonstrating single-level
inheritance and how subclass can access superclass properties and methods.
Examples
Input

Honda
80
City 
Petrol
Output

Car Model: City 
Fuel Type: Petrol 
Inherited Brand: Honda 
Inherited Speed: 80 
Vehicle Brand: Honda 
Top Speed: 80 km/h
Explanation

Hardcode vlaue initialization
Constraints
Must implement single-level inheritance only
Subclass must access superclass variables & methods
Output must match exactly */

public class Main {
    public static void main(String[] args) {
        // Write your code here
        Car car = new Car("Honda", 80 ,"City","Petrol");
        car.displayCarDetails();  
    }
}
class Vehicle{
     String brand;
     int speed;

    Vehicle(String brand, int speed){
        this.brand = brand;
        this.speed = speed;
    }

    public void displayCarDetails(){
        IO.println("Brand =" + brand + "\nSpeed = "+ speed);
    }
}

class Car extends Vehicle{
     String model;
     String fueltype;

    Car(String brand, int speed ,String model, String fueltype){
        super(brand,speed);
        this.model = model;
        this.fueltype = fueltype;
    }

    public void displayCarDetails(){
        IO.println("Car Model: "+ model +"\nFuel Type: "+ fueltype + "\nInherited Brand: " + brand + "\nInherited Speed: " + speed + "\nVehicle Brand: "+ brand + "\nTop Speed: "+ speed+ " km/h");
    }
}