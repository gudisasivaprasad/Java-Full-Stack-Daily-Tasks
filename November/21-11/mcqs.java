void main(String[] args) {
    int a = 9;
    float b = a / 2; // a is an int. 2 is also an int. So a/2 = 9/2 = 4 (integer division).Then this
                     // 4 is stored into float b, so it becomes 4.0.
    IO.println(b); // output is 4.0

    char ch = 'A';
    int c = ch + 1; // asci value of a is 96 and 96 + 1 is 97 which is B
    ch = (char) c;
    IO.println(ch);

    int d = 260;
    byte e = (byte) d;
    IO.println(e);

    int f = 300;
    long i = f;
    IO.println(i);

    char ch1 = 'C';
    int i1 = ch1;
    IO.println(i1);

    IO.print("Y" + "O");
    IO.println('L');
    IO.println('O');

    IO.println("Y" + "O");
    IO.println('L' + 'O');

    int i2 = 100;
    long l2 = i2;
    float f2 = l2;
    IO.println("Int value " + i2);
    IO.println("Long value " + l2);
    IO.println("Float value " + f2);

    /*
     * char ch3 = 'c';
     * int num3 = 88;
     * ch3 = num3; // cannot convert from int to char
     */

    byte b4 = 42;
    char c4 = 'a';
    short s = 1024;
    int i4 = 50000;
    float f4 = 5.67f;
    double d4 = .1234;
    double result = (f4 * b4) + (i4 / c4) - (d4 * s);
    IO.println("result = " + result);

    int x = 10;
    if (x == 20) {
        IO.println("Hello");
    }

    int a5 = 5;
    if (a5++ == 5)
        if (a5++ == 6)
            IO.println("Yes");
        else
            IO.println("No");
    else
        IO.println("Maybe");

    boolean flag = false;
    if (flag = true)
        IO.println("True");
    else
        IO.println("False");
    IO.println(flag);

    String s1 = "Java";
    if (s1 == "Java")
        IO.println("Match 1");
    if (s1.equals("Java"))
        IO.println("Match 2");

    if (x > 5)
        if (x < 9)
            IO.println("A");
        else
            IO.println("B");
    else
        IO.println("C");

    int n = 0;

    if (n == 1 || n == 0)
        IO.println("Yes");
    else
        IO.println("No");

    char c6 = 'A';

    if (c6 >= 'a' && c6 <= 'z')
        IO.println("Lower");
    else if (c6 >= 'A' && c6 <= 'Z')
        IO.println("Upper");



    boolean a8 = true;
    boolean b8 = false;

    if (a8 & b8)
        IO.println("1");
    else if (a8 && b8)
        IO.println("2");
    else if (a8 | b8)
        IO.println("3");
    else if (a8 || b8)
        IO.println("4");

    

}