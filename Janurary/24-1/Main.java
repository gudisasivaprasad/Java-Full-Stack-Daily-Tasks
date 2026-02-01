/*GeometricShapeCalculationApplication
Easy
100 points
• 130 min suggested
Problem Description
2) Write a java program to create an abstract class Shape with abstract methods area() & perimeter(). Create sub classes Square & Triangle
that extend the Shape class & override area() and perimeter() methods to calculate the area and perimeter of each shape.*/

public class Main{
    void main(){
        int area = Integer.parseInt(IO.readln());
        int a = Integer.parseInt(IO.readln());
        int b = Integer.parseInt(IO.readln());
        int c = Integer.parseInt(IO.readln());

        Shape s1 = new Square(area);
        IO.println("Area of Square = "+ s1.area());
        IO.println("Perimeter of Square = " + s1.perimeter());

        Shape t1 = new Triangle(a,b,c);
        IO.println("Area of Triangle = " + t1.area()+".0");
        IO.println("Perimeter of Triangle = "+ t1.perimeter());
    }
}

abstract class Shape{
    abstract int area();
    abstract int perimeter();
}

class Square extends Shape{
    private int side;

    Square(int side){
        this.side = side;
    }

    int area(){
        return side * side;
    }

    int perimeter(){
        return 4 * side;
    }
}

class Triangle extends Shape{
    private int a,b,c;

    Triangle(int a,int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    int area(){
        return (a*b)/2;
    }

    int perimeter(){
        return a+b+c;
    }

}

