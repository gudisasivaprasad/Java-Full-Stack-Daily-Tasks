/*Q2.Write a Java program to accept one number using Command Line Arguments and:
Check whether the given number is a prime number or not
If the input is negative, display an appropriate error message.

Example:-
input:
java PrimeCheck 7
output:
7 is a Prime Number.
input:
java PrimeCheck -5
output:
Negative numbers are not allowed. 


write code in basic logic */

void main(String[] args) {
    int a = Integer.parseInt(args[0]);
    int count = 0;
    for (int i = 1; i < a; i++) {
        if (a % i == 0) {
            count++;
        }
    }
    if (count == 1) {
        IO.println("Number is Prime");
    } else {
        IO.println("Number is not Prime");
        IO.println("Negative numbers are not allowed. ");

    }

}