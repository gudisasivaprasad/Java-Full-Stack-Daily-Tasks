/*A banking application tracks general account details. The BankAccount class stores basic
account data, SavingsAccount adds interest-related info, and FixedDepositAccount further
adds locking period info.

Requirements:
Create classes: BankAccount, SavingsAccount, FixedDepositAccount

Class: BankAccount
Variables: accountHolder, accountNumber
Method: displayBankAccountInfo()

Class: SavingsAccount (extends BankAccount)
Variables: balance, interestRate
Method: displaySavingsInfo() + call base method

Class: FixedDepositAccount (extends SavingsAccount)
Variables: depositAmount, lockPeriodInMonths

Method: displayFDInfo() to:
Display all info (own + inherited)
Call displaySavingsInfo() and displayBankAccountInfo()

Main class:
Create an object of FixedDepositAccount
Call displayFDInfo()
Examples
Input

Must use multi-level inheritance only

Subclass must reuse parent methods

Output format must match exactly
Output

Deposit Amount: 50000 
Lock Period: 12 months 
Balance: 100000 
Interest Rate: 6.5% 
Account Holder: Emma 
Account Number: ACC9987
 */
import java.util.*;

public class Maine {
    public static void main(String[] args) {
        // Write your code here
        String accountHolder = IO.readln();
        String accountNumber = IO.readln();
        int Balance = Integer.parseInt(IO.readln());
        double interestrate = Double.parseDouble(IO.readln());
        double depositAmount = Integer.parseInt(IO.readln());
        int lockPeriodInMonths = Integer.parseInt(IO.readln());

        FixedDepositAccount fd = new FixedDepositAccount( accountHolder,  accountNumber, Balance,interestrate, depositAmount,  lockPeriodInMonths);
        fd.displayFDInfo();        
    }
}

class BankAccount{
    String accountHolder;
    String accountNumber;

    BankAccount(String accountHolder, String accountNumber){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }
    
    void displayBankAccountInfo(){
        IO.println("Account Holder: " + accountHolder + "\nAccount Number: "+ accountNumber);
    }
}

class SavingsAccount extends BankAccount{
    double balance;
    double interestrate;

    SavingsAccount(String accountHolder, String accountNumber,double balance,double interestrate){
        super(accountHolder,accountNumber);
        this.balance = balance;
        this.interestrate = interestrate;
    }
    void displaySavingsInfo(){
        IO.println("Balance: "+ balance + "\nInterest Rate: " + interestrate+ "%");
        super.displayBankAccountInfo();
    }


}

class FixedDepositAccount extends SavingsAccount{
    double depositAmount;
    int lockPeriodInMonths;
    FixedDepositAccount(String accountHolder, String accountNumber,double balance,double interestrate,double depositAmount, int lockPeriodInMonths){
        super(accountHolder,accountNumber, balance, interestrate);
        this.depositAmount = depositAmount;
        this.lockPeriodInMonths = lockPeriodInMonths;
    }

    void displayFDInfo(){
        IO.println("Deposit Amount: "+depositAmount + "\nLock Period: "+lockPeriodInMonths + " months");
        super.displaySavingsInfo();
    }
}