/*You are working as a Java developer in a software company. Your team is developing a utility class that needs to display various types of user data (such as age, weight, username, gender, account balance, etc.). To maintain clean code and avoid method name duplication, your team decides to use the concept of Method Overloading.
You are assigned to implement a overloading concept that should handle and print values of different data types like int, float, double, char, boolean, String, long, short, and byte using the same method name printData.

Coding Requirement :
---------------------
Take various methods to print different kind of data using method overloading concept.
Methods :
---------
1) Name of the Method : printData()
      Access modifier : public
          Return type : void
	Argument type : byte type

2) Name of the Method : printData()
      Access modifier : public
          Return type : void
	Argument type : short type

3) Name of the Method : printData()
      Access modifier : public
          Return type : void
	Argument type : int type

4) Name of the Method : printData()
      Access modifier : public
          Return type : void
	Argument type : long type

5) Name of the Method : printData()
      Access modifier : public
          Return type : void
	Argument type : float type

6) Name of the Method : printData()
      Access modifier : public
          Return type : void
	Argument type : double type

7) Name of the Method : printData()
      Access modifier : public
          Return type : void
	Argument type : char type

8) Name of the Method : printData()
      Access modifier : public
          Return type : void
	Argument type : boolean type

9) Name of the Method : printData()
      Access modifier : public
          Return type : void
	Argument type : String type

Take a main method to call and print all overloaded methods.

Examples
Example 1
Input:
10
200
5000
9876543210
45.6
78.99
A
true
Virat
Output:
byte=10
short=200
int=5000
long=9876543210
float=45.6
double=78.99
char=A
boolean=true
String=Virat*/

void main(){
    
    byte b = Byte.parseByte(IO.readln());
    short s = Short.parseShort(IO.readln());
    int i = Integer.parseInt(IO.readln());
    long l = Long.parseLong(IO.readln());
    float f = Float.parseFloat(IO.readln());
    double d = Double.parseDouble(IO.readln());
    char c = IO.readln().charAt(0);
    boolean bool = Boolean.parseBoolean(IO.readln());
    String str = IO.readln();

    printData(b);
    printData(s);
    printData(i);
    printData(l);
    printData(f);
    printData(d);
    printData(c);
    printData(bool);
    printData(str);
}
public void printData(byte b1){
    IO.println("byte=" +b1);
}
public void printData(short s1){
    IO.println("short=" +s1);
}
public void printData(int i1){
    IO.println("int=" +i1);
}
public void printData(long l1){
    IO.println("long=" +l1);
}
public void printData(float f1){    
    IO.println("float=" +f1);
}
public void printData(double d1){
    IO.println("double=" +d1);
}
public void printData(char c1){
    IO.println("char=" +c1);
}
public void printData(boolean bool1){
    IO.println("boolean=" +bool1);
}
public void printData(String str1){
    IO.println("String=" +str1);
}   
