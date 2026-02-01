/*Assignment 01 :
---------------
WAP to read your name from keyword with user input message ("Enter your Name :").
Display your name in upper-case letter.
Display the length of your name including space. */


void main( String[] args){
    IO.println("Enter Your Name");
    String name = IO.readln();
    IO.println(name.length());
    IO.println(name.toUpperCase());

}

