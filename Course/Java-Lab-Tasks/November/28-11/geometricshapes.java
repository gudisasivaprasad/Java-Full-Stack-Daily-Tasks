/*Write a Java program that defines method overloading to calculate the area of geometric shapes. 
Implement the following methods:

Coding Requirements :
---------------------
Methods [Access Modifier is public]
-----------------------------------

calculateArea(int side): Returns the area of a square (side * side).

calculateArea(int length, int width): Returns the area of a rectangle (length * width).

calculateArea(double radius): Returns the area of a circle (PI * radius * radius).

Take main method to work with above requirement. 

Test Cases -1 :
-------------------
Area of the Square :81
Area of the Rectangle :120
Area of the Circle is 32.15:

Examples
Example 1
Input:
Enter side of square: 9
Enter length of rectangle: 12
Enter width of rectangle: 10
Enter radius of circle: 3.2
Output:
Area of the Square : 81
Area of the Rectangle : 120
Area of the Circle : 32.15 */
/* 
void main(){
    int side = Integer.parseInt(IO.readln("Enter side of square: "));
    int length = Integer.parseInt(IO.readln("Enter length of rectangle: "));
    int width = Integer.parseInt(IO.readln("Enter width of rectangle: "));
    double radius = Double.parseDouble(IO.readln("Enter radius of circle: "));

    IO.println("Area of the Square : " + calculateArea(side));
    IO.println("Area of the Rectangle : " + calculateArea(length, width));
    IO.println("Area of the Circle : " + String.format("%.2f", calculateArea(radius)));
}
public int calculateArea(int side){
    return side * side;
}
public int calculateArea(int length, int width){
    return length * width;
}
public double calculateArea(double radius){
    return Math.PI * radius * radius;
}
*/
void main(){
    int side = Integer.parseInt(IO.readln());
    int length = Integer.parseInt(IO.readln());
    int width = Integer.parseInt(IO.readln());
    double r  = Double.parseDouble(IO.readln());
    if(side<0||length<0||width<0||r<0){
        IO.println("Invalid Input: Values must be greater than zero.");
        return;
    }

    IO.println("Area of the Square : " + cA(side));
    IO.println("Area of the Rectangle : " + cA(length,width));
    System.out.printf("Area of the Circle : %.2f" , 
    cA(r));
}
    int cA(int area){
        return area*area;
    }
    int cA(int length, int width){
        return length * width;

    }
    double cA(double r){
        return Math.PI*r*r;
    }
