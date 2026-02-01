/*Q2) Write a program to perform addition using command line Argument.*/

void main( String [] args){

    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);

    int c = a+ b;
    IO.println("Your output is " + c);
}