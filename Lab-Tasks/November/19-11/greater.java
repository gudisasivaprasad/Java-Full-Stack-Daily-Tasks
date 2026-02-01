/*Write a Java program to find Largest of Three Numbers.*/


void main() {
    IO.println("Enter a num1");
    int num1 = Integer.parseInt(IO.readln());
    IO.println("Enter a num2");
    int num2 = Integer.parseInt(IO.readln());
    IO.println("Enter a num3");
    int num3 = Integer.parseInt(IO.readln());
    
    if(num1 > num2 && num1 > num3)
    {
        IO.println(num1 + " is greater");
    }
        else if(num2 > num1 && num2 > num3)
    {
        IO.println(num2 + " is greater");
    }
        else if(num3 > num2 && num3 > num1)
    {
        IO.println(num3 + " is greater");
    }
    
    
  }
