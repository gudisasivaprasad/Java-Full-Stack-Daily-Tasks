/*Q1.Write a Java program to display all Strong numbers between 1 to 1000.
Additionally:

Display All  Strong numbers exist in this range

Display the sum of all Strong numbers found.

Example:-

Strong numbers between 1 to 1000:
1 2 145
sum of each digit factorial of 145 = 1! + 4! + 5! = 1 + 24 + 120 = 145

Sum of Strong Numbers = 148
 
*/


void main(String[] args) {
        int sumOfStrong = 0;
        IO.println("Strong numbers between 1 to 1000:");
        for (int num = 1; num <= 1000; num++) {
            int temp = num;
            int sum = 0;
            while (temp > 0) {
                int digit = temp % 10;
                int fact = 1;
                int i = 1;
                while (i <= digit) {
                    fact = fact * i;
                    i++;
                }
                sum = sum + fact;
                temp = temp / 10;
            }
            if (sum == num) {
                IO.println(num + " ");
                sumOfStrong = sumOfStrong + num;
            }
        }
        IO.println("\n\nSum of Strong Numbers = " + sumOfStrong);
    }
