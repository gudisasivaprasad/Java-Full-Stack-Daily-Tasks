/*Create a BLC class Rectangle
 
Attributes :

names        datatypes
------       ----------
width           double-privatre
height          double-private

Implement a parameterized constructor to initialize the non static Field width and height.

Methods :
---------
1)
Method Name : getArea()
Parameter : No Parameters
Return Type : double
Access modifier : public

In this method returns the area of the rectangle.

2)
Method Name : getPerimeter()
Parameter : No Parameters
Return Type : double
Access modifier : public

In this method returns the perimeter of the rectangle.

Note : Don't use toString() method

Take one Main class ELC class which is having main method,
Create a Rectangle object with width 5 and height 10 and call
the getArea() and getPerimeter() methods on it.


Test Cases 1 :
------------------
Valid Case: width = 5, height = 10

Sample Input: width = 5, height = 10

Expected Output:

Area: 50.0
Perimeter: 30.0

Test Cases 2 :
------------------
Invalid Case: Negative width

Sample Input: width = -5, height = 10

Expected Output:

Error: Width and height must be non-negative. */
public class RectangleDetails
{
    void main()
    {
        double width = Double.parseDouble(IO.readln());
        double height = Double.parseDouble(IO.readln());
        Rectangle rect = new Rectangle(width,height);
        IO.println("Area: "+rect.getArea());
        IO.println("Perimeter: "+rect.getPerimeter());
    }
}
class Rectangle
{
    private double width;
    private double height;
public Rectangle(double width , double height)
{
    if(width<0 || height < 0)
    {
        IO.println("Error: Width and height must be non-negative.");
        System.exit(0);
    }
    this.width = width;
    this.height = height;
}
public void setWidth(double width)
{
    this.width = width;
}

public void setHeight(double height)
{
    this.height = height;
}

public double getwidth()
{
    return this.width;
}

public double getHeight()
{
    return this.height;
}

public double getPerimeter()
{
    return (height + width) * 2;
}

public double getArea()
{
    return height * width;
}


}