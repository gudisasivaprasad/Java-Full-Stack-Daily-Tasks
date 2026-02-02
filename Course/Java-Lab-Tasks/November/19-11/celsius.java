/*Program 05 :
-------------
Write a program in java to Fahrenheit to Celsius Program
Formula is :-  celsius=((fahrenheit-32)*5)/9;
*/

void main(){
  IO.println("Enter temperature in fahrenheit");
  int temp = Integer.parseInt(IO.readln());
  int celsius = ((temp-32)*5)/9;
  IO.println(celsius);
  
  
  }
