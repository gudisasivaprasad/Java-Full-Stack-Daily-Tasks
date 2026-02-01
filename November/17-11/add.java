/*  Write a program to perform addition,subtraction, multiplication and 
    division between two numbers using 3rd variable. */


void main() {
    Integer num = Integer.parseInt(IO.readln());
    Integer num2 = Integer.parseInt(IO.readln());

    Integer Add = num + num2;
    Integer Sub = num - num2;
    Integer Mul = num * num2;
    Integer Div = num / num2;

    IO.println(Add+ "\n" +Sub+"\n"+ Mul+ "\n" + Div);


}