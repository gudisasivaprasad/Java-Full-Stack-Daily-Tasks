/*Problem Description
3) Write a Java program to create a class called Account with instance variables accountNumber accountHolderName and balance.
 Implement a parameterized constructor that initializes these variables with the following validations:
	1) accountNumber should not be empty.
	2) balance should not be negative.
Print an error message if the validation fails.

Examples
Example 1
Input:
Account Number: ACC101
Account Holder: Ravi
Balance: 5000
Output:
Account Number : ACC101
Account Holder : Ravi
Balance        : 5000.0 */


public class TestAccount{
    void main(){
        String accountNumber = IO.readln();
        String name = IO.readln();
        Double balance = Double.parseDouble(IO.readln());

        Account a = new Account(accountNumber,name,balance);
        if(a.isValid()){
        a.getDisplay();}
    }
}
class Account{
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private boolean valid = true;

    public Account(String accountNumber, String accountHolderName,double balance){
        if(accountNumber.equals("null") ){
            IO.println("Error: Account number should not be empty.");
            valid = false;
            return;
        }

        else if(balance < 0){
            IO.println("Error: Balance should not be negative.");
            valid = false;
            return;
        }

        
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    boolean isValid(){
        return valid;
    }

    void getDisplay(){
        IO.println("Account created successfully!");
        IO.println("Account Number: " + accountNumber);
        IO.println("Account Holder Name: " + accountHolderName);
        IO.println("Balance: " + balance);
    }

}