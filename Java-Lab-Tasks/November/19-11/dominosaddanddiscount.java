/*Write a  program in Java that will generate and print the bill at Dominos for four chicken rolls (@ Rs 60 per chicken rolls) and three vegetable puffs (@ Rs 25 per vegetable puffs). There is a special discount of Rs 50 on the final bill amount. Calculate and print final bill as well as all item bill.*/

void main() {
  
    
    
    IO.println("Enter no of chicken rolls:");
    int chickenRollQnty = Integer.parseInt(IO.readln());
    
    IO.println("Enter no of puffs");
    int vegPuff = Integer.parseInt(IO.readln());
    int totalbill=(chickenRollQnty * 60)+(vegPuff * 25)-50;
    IO.println("cost of "+chickenRollQnty+" is "+(chickenRollQnty * 60)+" and Veg puff is "+(vegPuff * 25) +"Your Bill amount is"+totalbill);
     
}
