/*2) Write a program to find out the area of Rectangle where length and  breadth of the Rectangle must be taken from user from command line argument..

void main( String[] args){
  int a = Integer.parseInt(args[0]);
  int b = Integer.parseInt(args[1]);
  int c = a * b ;
  IO.println("The Area of rectangle : " + c );
}
*/

void main(String[] args){
  
  int a = Integer.parseInt(args[0]);
  int b = Integer.parseInt(args[1]);
  int c = a * b;
  IO.println("The area of rect: " + c);
}