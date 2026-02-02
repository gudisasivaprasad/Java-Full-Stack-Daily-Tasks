/*3. CakeOrderMain
Easy
100 points
• 130 min suggested
Problem Description
Create a program on abstract class to display Cake details with message and without
event message.

Coding Requirements :
--------------------
Create a BLC class called Cake with following attributes :

Attributes/Properties/Fields: [Access modifier is private for all the fields]

Attribute Name : shape String
Attribute Name :flavor String
Attribute Name :quantity int
public static double price = 400;

Create a Parameterized Constructor to initialize only shape, flavor and quantity.
[Don't initialize price through Constructor, Manual Initialization]

Methods :
  1) Define setters and getters for all non static fields
  2) Name of the method : toString()
     Return Type : String
     Modifier : public.
     Task : It must return the data as per below format/example.
     "A Round Chocolate Cake Of 4 KG is Ready @ Rs.1600.0"
     
Create an inherited class "OrderedCake". Inherit this from "Cake"
Define the following Attributes
Attributes: [private for all the fields]
Attribute name : message String

Constructors:(3 only)
   1) No argument Constructor : Ensure shape is Round, flavour is Vanilla,
      qty is 1 kg and price is 400. [see the output test cases]
   2) Parameterized public Constructor : For shape,flavor,quantity
   3) Parameterized public Constructor : For shape,flavor,quantity and message.
   Price is to be dynamically changed @400 per Kg.
Methods :
Name of the method : toString()
     Return Type : String
     Modifier : public.
     Task :Print the following if message is not null 
    "A Square Pineapple Cake of 3KG is Ready with Happy Birthday message @ Rs.1200.0".
      Otherwise display the message from superclass.
      
      
Create an ELC class CakeOrderMain to display cake details with price and message.

Examples
Example 1
Input:
Sample Input 
---------------------
Cake Name: Chocolate
Cake Type: Round
Cake Quantity: 4
Output:
Sample Output:
A Round Chocolate Cake Of 4 KG is Ready @ Rs.1600.0 */
public class Main2{
    void main(){
        String shape = IO.readln();
        String flavor = IO.readln();
        int quantity = Integer.parseInt(IO.readln());
        String message = IO.readln();

        OrderedCake c1;
        if(message.equals("null")){
            c1 = new OrderedCake(shape,flavor,quantity);
        }else{
            c1 = new OrderedCake(shape,flavor,quantity,message);
        }
        IO.println(c1.toString());
    }
}
abstract class Cake{
    private String shape;
    private String flavor;
    private int quantity;
    public static double price = 400;

    Cake(String shape, String flavor, int quantity){
        this.shape = shape;
        this.flavor = flavor;
        this.quantity = quantity;
    }

    public String getShape(){
        return shape;
    }

    public String getFlavor(){
        return flavor;
    }

    public int getQuantity(){
        return quantity;
    }

    public String toString(){
        double totalPrice = price * quantity;
        return "A " + shape + " " + flavor + " Cake Of " + quantity + " KG is Ready @ Rs." + totalPrice;
    }
}
class OrderedCake extends Cake{
    private String message;

    OrderedCake(){
        super("Round","Vanilla",1);
    }

    OrderedCake(String shape, String flavor, int quantity){
        super(shape,flavor,quantity);
    }

    OrderedCake(String shape, String flavor, int quantity, String message){
        super(shape,flavor,quantity);
        this.message = message;
    }

    public String toString(){
        if(message != null){
            double totalPrice = Cake.price * getQuantity();
            return "A " + getShape() + " " + getFlavor() + " Cake of " + getQuantity() + "KG is Ready with " + message + " message @ Rs." + totalPrice;
        }else{
            return super.toString();
        }
    }
}
