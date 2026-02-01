/*A local electricity board wants to calculate monthly bills.
Store the number of units consumed using a short.
Use an int to store and calculate the bill amount.
Apply the following tariff:
Up to 100 units → ₹5/unit
101–300 units → ₹7/unit
Above 300 units → ₹10/unit
Add a fixed charge of ₹50.
*/

void main()
{
  IO.println("Enter the number of units consumed ");
  int units = Integer.parseInt(IO.readln());
  int unitstotal = 0;
  if(units >0 && units <= 100){
     unitstotal = units * 5 + 50;
  }
    else if(units > 100 && units <= 300){
     unitstotal = (100*5) + ((units - 100) * 7) + 50 ;
  }
      else if(units > 300){
     unitstotal = (100*5) + (200 * 7) + ((units - 300) *10) + 50;
  }
      IO.println("Total bill = " + unitstotal);

}

