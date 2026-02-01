/*3) Write a program to find the sum and average of three numbers where  number must be taken from command line argument.*/

void main( String [] args){
  int a = Integer.parseInt(args[0]);
  int b = Integer.parseInt(args[1]);
  int c = Integer.parseInt(args[2]);
  int d = a + b + c;
  double e = d / 3;
  IO.println("The sum is " + d + " and average is " + e );
}

