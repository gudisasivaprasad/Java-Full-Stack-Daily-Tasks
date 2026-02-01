/*Problem Description
Create a Bank Application project by using Method Overriding Concept to display
different kinds of account details and calculate interest rate on each different types
of account like saving account, Current account and Fixed deposit account.
Validate all the inputs properly and generate error message, if any input is not appropriate.

Create a BLC class called BankAccount
Fields :
accountHolderName String protected
accountNumber String protected
   balance double protected
   IFSC_CODE public static final String (Initialize the IFSC CODE at the time of declaration,
   will be common for all the Objects)
   
   Use a parameterized constructor to initialize all the fields, In this constructor provide
   error message, if inputs are not in valid format like (see test cases for more details)
a)Account holder name cannot be empty.
b)Account number cannot be empty.
c)Balance cannot be negative.

Methods :

1) Method Name     : calculateInterest()
Argument	   : No Argument
Return Type        : void
Access modifier    : public
In this method write a generic message regarding Bank interest Calculation.

2) Method Name     : displayAccountDetails()
Argument           : No Argument
Return Type        : void
Access modifier    : public
In this method display customer records [See the Test cases for more details in the below
of this question]

Create another BLC class SavingsAccount which is sub class of BankAccount

Field :
protected double interestRate = 4.0;

Take a parameterized constructor to initialize super class properties.

Method :

1) Method Name     : calculateInterest()
Argument           : No Argument
Return Type        : void
Access modifier    : public
In this method write a logic to calculate interest rate on Saving Account.

Create another BLC class CurrentAccount which is sub class of BankAccount

Field :
protected double overdraftLimit = 5000.0;

Take a parameterized constructor to initialize super class properties.

Method :

1) Method Name     : calculateInterest()
Argument           : No Argument
Return Type        : void
Access modifier    : public
In this method write a statement that Current accounts do not earn interest.

2) Method Name     : checkOverdraftLimit()
Argument           : No Argument
Return Type        : void
Access modifier    : public
In this method print overdraftLimit amount.

Create another BLC class FixedDepositAccount which is sub class of BankAccount

Field :
protected double interestRate = 6.5;
    depositTerm int protected;
   
    Take a parameterized constructor to initialize super class and current class properties.
    Validate the input deposit term with error message, depositTerm can't be negative.

Method :

1) Method Name     : calculateInterest()
Argument           : No Argument
Return Type        : void
Access modifier    : public
In this method write the logic to calculate the interest amount on FixedDeposit account.

Create an ELC class BankApplication with main method to test this application. Write
Switch case with Scanner class to Test as shown in the below Test Cases. */

public class BankApplication{
    void main(){
        int choice = Integer.parseInt(IO.readln());
        String name = IO.readln();
        String accnum = IO.readln();
        double balance = Double.parseDouble(IO.readln());

        switch(choice){

            case 1 : 
                SavingAccount sa = new SavingAccount(name, accnum,balance);
                sa.displayAccountDetails();
                sa.calculateInterest();
                break;  
            
            case 2:
                CurrentAccount ca = new CurrentAccount(name,accnum,balance);
                ca.displayAccountDetails();
                ca.calculateInterest();
                ca.checkOverdraftLimit();
                break;

            case 3:
            int term = Integer.parseInt(IO.readln());
            FixedDepositAccount fd = new FixedDepositAccount(name, accnum,balance,term);
            fd.displayAccountDetails();
            fd.calculateInterest();
            break;
        
        default:
        IO.println("Invalid choice.");
        } 
    }
}


class BankAccount{
    protected String accountHolderName;
    protected String accountNumber;
    protected double balance;
    public static final String IFSC_CODE = "SBIHYD151285";

    BankAccount(String accountHolderName, String accountNumber,double balance){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        if(balance < 0){
            IO.println("Balance cannot be negative.");
            System.exit(0);
        }
        this.balance = balance;

    }

    public void calculateInterest(){
        IO.println("Based on account type");
    }

    public void displayAccountDetails(){
        IO.println("Account Holder: "+ accountHolderName);
        IO.println("Account Number: "+ accountNumber);
        IO.println("Balance RS :"+ balance);
        IO.println("IFSC CODE :" + IFSC_CODE);

    }

}

class SavingAccount extends BankAccount{
    protected double interestRate = 4.0;

    SavingAccount(String accountHolderName, String accountNumber, double balance){
        super(accountHolderName,accountNumber,balance);
    }

    public void calculateInterest(){
        double interest = (balance * interestRate) / 100;
        IO.println("Savings Account Interest RS :"+ interest);
    }


}

class CurrentAccount extends BankAccount{
    protected double overdraftLimit = 5000.0;

    CurrentAccount(String name, String Number, double balance){
        super( name,  Number,  balance);
    }
    
    public void calculateInterest(){
        IO.println("Current accounts do not earn interest.");
    }

    public void checkOverdraftLimit(){
        IO.println("Overdraft limit RS :"+ overdraftLimit);
    }

}

class FixedDepositAccount extends BankAccount{
    protected int depositTerm;
    protected double interestRate = 6.5;

    FixedDepositAccount(String name, String Number, double balance, int depositTerm){
        if(depositTerm < 0){
            IO.println("Deposit term must be positive.");
            System.exit(0);
        }
        super(name, Number,balance);
        this.depositTerm = depositTerm;


    }
    public void calculateInterest(){
        double interest = (balance * interestRate * depositTerm)/ 100;
        IO.println("Fixed Deposit Interest for 5 years RS :"+ interest);
    }
}