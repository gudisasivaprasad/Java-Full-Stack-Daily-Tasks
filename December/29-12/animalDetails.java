/*1. ZooManagement
Easy
100 points
• 130 min suggested
Problem Description

In a virtual zoo management system, you need to organize and categorize various types of animals to efficiently manage their characteristics and behaviors. 

To achieve this, you decide to implement a class hierarchy using multilevel inheritance.

1. Create the Animal Class
Requirements:
Define a private String attribute named name.
Implement a parameterized constructor to initialize name.
Implement getter and setter methods for name.


2. Create the Mammal Class
Requirements:
Extend the Animal class.
Add a private boolean attribute named hasFur.
Implement a parameterized constructor to initialize name (from Animal) and hasFur.
Implement getter and setter methods for hasFur.


3. Create the Dog Class
Requirements:
Extend the Mammal class.
Add a private String attribute named breed.
Implement a parameterized constructor to initialize name, hasFur (from Mammal), and breed.
Implement getter and setter methods for breed.
Generate toString() method to display all the Animal Details.In this method display all the Animal Details.

4. Create the Main Class which is an ELC class.

Create an instance of the Dog class.
Display details of the Dog object to demonstrate inheritance.

TEST CASE 1 :
-------------
sample input : Dog dog = new Dog("Tommy", true, "Bulldog");
               
sample output : 
              Dog [getName()=Tommy, isHasFur()=true, breed=Bulldog]


Test case 1:-
------------------
Choose the type of object to create:
1. Animal
2. Mammal
3. Dog
Enter your choice: 1
Enter Animal Name: Lion

Expected output:-
------------------
Animal [getName()=Lion]


Test case 2:-
------------------

Choose the type of object to create:
1. Animal
2. Mammal
3. Dog
Enter your choice: 2
Enter Mammal Name: Gorila
Does the Mammal have fur? (true/false): false


Expected output:-
------------------

Mammal [getName()=Gorila, isHasFur()=false]

Test case 3:-
------------------
Choose the type of object to create:
1. Animal
2. Mammal
3. Dog
Enter your choice: 2
Enter Mammal Name: Lion
Does the Mammal have fur? (true/false): true

Expected output:-
------------------
Mammal [getName()=Lion, isHasFur()=true]


Test case 4:-
------------------
Choose the type of object to create:
1. Animal
2. Mammal
3. Dog
Enter your choice: 3
Enter Dog Name: Tommy
Does the Dog have fur? (true/false): false
Enter Dog Breed: Labrador


Expected output:-
------------------

Dog [getName()=Tommy, isHasFur()=false, breed=Labrador]



Test case 5:-
------------------
Choose the type of object to create:
1. Animal
2. Mammal
3. Dog
Enter your choice: 4

Expected output:-
------------------
Invalid choice.

Examples
Example 1
Input:
1
Lion
Output:
Animal [getName()=Lion] */
public class animalDetails{
   void main(){
    String name = IO.readln();
    boolean hasFur = Boolean.parseBoolean(IO.readln());
    String breed = IO.readln();

    Dog dog = new Dog(name,hasFur,breed);

    IO.println(dog);
}}




class Animal{
    private String name;

    Animal(String name){
        this.name = name;
    }

    public void setname(String name){
        this.name = name;}

    public String getname(){
        return this.name;}

}

class mammal extends Animal{
    private boolean hasFur;

    mammal(String name, boolean hasFur){
        super(name);
        this.hasFur = hasFur;
    }

    public void sethasFur(boolean hasFur){
    this.hasFur = hasFur;
    }

    public boolean gethasFur(){
    return this.hasFur;
    }
}

class Dog extends mammal{
    private String breed;

    Dog(String name, boolean hasFur, String breed){
        super(name,hasFur);
        this.breed = breed;
    }
    public void setbreed(String breed){
        this.breed = breed;
    }

    public String getbreed(){
        return this.breed;
    }
    public  String toString(){
        return "Dog [getName()=" + getname()+", isHasFur()=" + gethasFur()+", breed="+ getbreed()+ "]";
    }
}
