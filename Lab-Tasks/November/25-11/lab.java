/*Explain this code 
void main() { 
double a = 1 + 9;
 double b = a / 6; 
int c = 1 + 9; 
int d =c / 8; 
IO.println(b + " " + d); */
/*
d is 1 because both c and d are integers.
Integer division discards the fractional part: 10 / 8 = 1.25 → 1.
To get the fractional result use a floating-point operand or cast, e.g.:
double d = (double) c / 8; // yields 1.25
or
double d = c / 8.0;
*/

void main() {

  /*  int z = 7;
    int j = -9;
    double x = 72.3;
    double y = 0.34;

    IO.println("i is " + z);
    IO.println("j is " + j);
    IO.println("x is " + x);
    IO.println("y is " + y);*/

  /*   int roll = 0;
    IO.println(roll);
    double a = 892.457;
    int b = 10;
    a = a % 10;
    b = b % 10;
    IO.println(a + " " + b);
*/
    /*
     * final int m = 5;
     * int n = m++;
     * IO.println(n);
     */
    /*int i = 5;

    IO.println(i++);
    IO.println(i);
    IO.println(++i);
    IO.println(++i + i++);

    int d, e = 2, f = 2;

    d = e++ + ++f;

    IO.println(d + "  " + e + " " + f);
    char ch = '\u0041';
    IO.println(ch);

    int k = 0;

    k = k++ + k;

    IO.println("I = " + k);

    int g = 0;
    int h = 10;
    do {
        h--;
        ++g;
    } while (g < 5);
    IO.println(g + " , " + h);

    int u = 1, r = 1, o;
    o = u++ + r;
    IO.println("a=" + u + "  b=" + r + " c=" + o);

    int q = 20, w = 10;
    if ((q > w) && (--w < 12)) {
        IO.print(w);
    }
    IO.print(q);

    int x = 11, y = 23;
    float n = 9, m = 4;
    IO.print(operate(x, y)+"\t");
    IO.println(operate(n, m));
}

int operate(int a,int b)
{
    return (a * b);
}
float operate(float a,float b)
{
    return (a / b);
}*/
byte x = 127;
	x++;
	x++;
	x++;
	IO.print(x);
}