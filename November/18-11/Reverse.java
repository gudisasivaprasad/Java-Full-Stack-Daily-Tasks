/*1) Write a program  Reverse of a 3 digit number without using loop take the number from readln() method.*/

void main( String [] args){

  IO.println("Enter a Three Digit Numbers: ");
  int num = Integer.parseInt(IO.readln());
  if (num < 100 && num > 999){
  IO.println("Enter Only Three Digit number");
  return;
  }
  //123
  
  int rem1 = num % 10;
  num /= 10;
  int rem2 = num %10;
  num /= 10;
  IO.println("Reverse num is: " + rem1 + rem2 + num);
}
