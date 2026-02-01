/*---------------
WAP to read your salary from keyword with user input message ("Enter your Salary :").
Display your salary in the console.
Print a message based on the Salary :
 * If Salary is greater than 50000, Your bonus amount is 5000 else 3000.
   Print the bonus amount and total salary.

Output :
Enter your Salary : 48000
Your Salary     : 48000.0
Your Bonus      : 3000.0
Total Salary    : 51000.0*/

void main() {
    IO.println("Enter Your Salary");
    Integer sal = Integer.parseInt(IO.readln());
    IO.println("Your Salary is " + sal);
    if (sal > 50000) {
        IO.println("Your Bonus Sal is " + 5000);
        Integer Total = sal += 5000;
        IO.println("Your Total Salary is " + Total);
        

    } else {
        IO.println("Your Bonus Sal is " + 3000);
        Integer Total = sal += 3000;
        IO.println("Your Total Salary is " + Total);

    }


}