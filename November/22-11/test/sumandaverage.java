/*Q3. Write a java program to accept three numbers at the command
prompt & find the largest.
Display the sum and average of the three numbers.


Example:

Input:
java ThreeNumbers 10 30 20

Output:

Largest Number = 30
Sum = 60
Average = 20.0
 */

void main( String [] args){
    IO.println("Enter Three numbers");
    int a = Integer.parseInt(args [0]);
    int b = Integer.parseInt(args [1]);
    int c = Integer.parseInt(args [2]);
    int d = a + b + c;
    int avg = d / 3;
    if ( a > b && a > c){
        IO.println(a + "is the largest");
    }

    else if( b > a && b > c){
        IO.println(b + "is the largest");
    }

    else if (c > a && c >b){
        IO.println(c + "is the largest");
    }
    IO.println("The sum of 3 numbers is " + d + "average is " + avg);

}