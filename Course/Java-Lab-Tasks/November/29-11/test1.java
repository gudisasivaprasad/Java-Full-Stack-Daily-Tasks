/*Binary to Decimal Conversion (Without Using Array)
Question:
Write a Java program to convert a binary number (e.g., 10101) into its decimal equivalent without using any array.
The input should be taken as an integer, and the program should output the decimal value. usiong java v25*/


import java.util.Scanner;
public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int binaryNumber = scanner.nextInt();   
        int decimalNumber = 0;
        int base = 1; // 2^0
        int temp = binaryNumber;
        while (temp > 0) {
            int lastDigit = temp % 10;
            decimalNumber += lastDigit * base;
            base *= 2;
            temp /= 10;
        }
        System.out.println("Decimal equivalent: " + decimalNumber);
        scanner.close();
    }
}