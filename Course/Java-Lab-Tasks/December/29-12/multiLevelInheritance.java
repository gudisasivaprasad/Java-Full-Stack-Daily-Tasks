/*2. MultilevelInheritance
Easy
100 points
• 130 min suggested
Problem Description
Simple Inheritance Program :
-------------------------------------
Develop one program on Multi-level Inheritance with following requirements :

Animal => Mammal => Dog [Multi-level Inheritance]

Create a BLC class called Animal.

Attributes/Properties: No properties

Constructor:
No Constructor 

Methods:

public void eat() : Method to print that "Animal is eating"

Create Another BLC class Mammal which is the sub class of Animal.

Attributes/Properties: No properties

Constructor:
No Constructor 

Methods:

public void walk() : Method to print that "Mammal is walking"


Create Another class Dog which is the sub class of Mammal.

Attributes/Properties: No properties

Constructor:
No Constructor 

Methods:

public void bark() : Method to print that "Dog is barking"


Create an ELC class MultilevelInheritance which contains main method, Create the Object for more specialized class and call the behavior.
take choice form user using scanner class and perform the below operations.

if choice is 1 create object of Animal class and call the method.
if choice is 2 create object of Mammal class and call the method.
if choice is 3 create object of Dog class and call the method.


Testcase 1:-
----------------

Choose an action:
1. Animal eats
2. Mammal walks
3. Dog barks
Enter your choice (1-3): 1

Expected Output :-
------------------

Animal is eating

___________________________


Testcase 2:-
----------------

Choose an action:
1. Animal eats
2. Mammal walks
3. Dog barks
Enter your choice (1-3): 2

Expected Output :-
------------------

Mammal is walking

___________________________

Testcase 3:-
------------------
Choose an action:
1. Animal eats
2. Mammal walks
3. Dog barks
Enter your choice (1-3): 3

Expected Output :-
------------------
Dog is barking

___________________________

Testcase 4:-
------------------
Choose an action:
1. Animal eats
2. Mammal walks
3. Dog barks
Enter your choice (1-3): 4

Examples
Example 1
Input:
1
Output:
Animal is eating*/
public class multiLevelInheritance{
    void main(){
        int ch = Integer.parseInt(IO.readln());
        switch(ch){
            case 1 -> {
                new Animal().eat();
            }
            case 2 -> {
                new Mammal().walk();
            }
            case 3 -> {
                new Dog().bark();
            }
            default ->{
                IO.println("Invalid choice!");
            }
        };
    }
}


class Animal {
    public void eat(){
        IO.println("Animal is eating");
    }
}

class Mammal extends Animal{
    public void walk(){
        IO.println("Mammal is walking");
    }
}

class Dog extends Mammal{
    public void bark(){
        IO.println("Dog is barking");
    }
}