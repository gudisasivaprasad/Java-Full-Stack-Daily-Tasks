/*A class called Customer is given to you. 
The task is to find the Applicable Credit card Type and create CardType object based on the Credit Points of a customer.
Define the following for the class.

Attributes : 
customerName : String,private
creditPoints: int,private

Constructor :
parameterizedConstructor: for both cusotmerName , creditPoints in that order.

Methods :
Name of the method : getCreditPoints
Return Type : int
Modifier : public 
Task : This must return creditPoints

Name of the method : toString -OverRide it, 
Return type : String 
Task : return only customerName from this.

Create another class called CardType. Define the following for the class

Attributes :
customer : Customer, private
cardType : String, private
Constructor :
parameterizedConstructor: for customer and cardType attributes in that order

Methods :
Name of the method : toString Override this. 
Return type : String
Modifier : public
Task : Return the string in the following format.
The Customer 'Rajeev' Is Eligible For 'Gold' Card.
Create One more class by name CardsOnOffer and define the following for the class.

Method : 
Name Of the method : getOfferedCard 
Return type : CardType
Modifiers: public,static
Arguments: Customer object
Task : Create and return a CardType object after logically finding Grade from creditPoints as per the below rules.
Marks Grade

100 - 500 - Silver

501 - 1000 - Gold

1001 > - Platinum

< 100 - EMI

Take a Main class(ELC Class) and instantiate the object and execute the methods.
Examples
Example 1:

Input

Swati
600
Output

The Customer 'Swati' Is Eligible For 'Gold' Card.
Example 2:

Input

Rajeev
100
Output

The Customer 'Rajeev' Is Eligible For 'Silver' Card.
Explanation

Demonstrates class design, constructor, method overriding, and using switch-case for logical decisions. */ 

import java.util.*;

public class CreditCard {
    public static void main(String[] args) {
        // Write your code here
        String name = IO.readln();
        int creditPoints = Integer.parseInt(IO.readln());

        Customer customer = new Customer(name,creditPoints);
        CardType card = CardsOnOffers.getOfferedCard(customer);

        IO.println(card);
        
    }
}

class Customer{
    private String customerName;
    private int creditPoints;

    Customer(String customerName, int creditPoints){
        this.customerName = customerName;
        this.creditPoints = creditPoints;
    }

    public int getCreditPoints(){
        return creditPoints;
    }

    public String toString(){
        return customerName;
    }
}

class CardType{
    private Customer customer;
    private String cardType;

    CardType(Customer customer, String cardType){
        this.customer = customer;
        this.cardType = cardType;
    }

    public String toString(){
        return "The Customer '" + customer + "' Is Eligible For '" +  cardType + "' Card.";
    }

}

class CardsOnOffers{
        public static CardType getOfferedCard(Customer customer){
            int points = customer.getCreditPoints();
            String card = "";

            switch(points / 100){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                        card = "Silver";
                        break;
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                        card = "Gold";
                        break;
                default:
                    if(points > 100){
                        card = "Platinum";
                    }
                    else{
                        card = "EMI";
                    }

            }
            return new CardType(customer,card);
        }
}