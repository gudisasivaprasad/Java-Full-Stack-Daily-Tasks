/*Create  two methods having the same name but different sequence of the integer and the character parameters.

For example, if the parameters of the first method are of the form (int n, char c), then that of the second method will be of the form (char c, int n).

Input Format:
----------------
Enter an integer:
Enter a character:
Enter a character:
Enter an integer:

Output Format:
------------------
int=66 char=A
int=67 char=D

Examples
Example 1
Input:
66
A
D
67
Output:
int=66 char=A
int=67 char=D */

void main(){
    int a  = Integer.parseInt(IO.readln());
    char b = IO.readln().charAt(0);
    char c = IO.readln().charAt(0);
    int d = Integer.parseInt(IO.readln());

    values(a,b);
    values(c,d);
}

void values(int a1, char b1){
    IO.println("int=" +a1+ " char=" +b1);
}

void values(char c1, int d1){
    IO.println("int=" +d1+" char="+c1);
}