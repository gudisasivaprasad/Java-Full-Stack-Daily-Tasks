/*4) Write a program to accept a two digit number from command line argument and find the sum of digit. (Example : 54   5 + 4 =9)*/

void main( String [] args){
  int a = Integer.parseInt(args[0]);
  if ( a < 10 && a > 99){
    IO.println("Enter Only two digits");
    return ;
  }
  int rem = a % 10;
  int fir = a / 10;
  IO.println("The sum of the digit is " + (rem + fir) );
}

