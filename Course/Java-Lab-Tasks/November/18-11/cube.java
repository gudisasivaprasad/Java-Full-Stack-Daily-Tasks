/*1) Write a program to find out the cube of a number where number must be taken from command line argument.*/

void main( String[] args){
  int a = Integer.parseInt(args[0]);
  int cube = a*a*a;
  IO.println("The Cube of number is "+ cube);
}
