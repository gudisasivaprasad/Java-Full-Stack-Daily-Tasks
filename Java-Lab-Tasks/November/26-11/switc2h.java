/*void main() {
    IO.println("Enter x Value");
    int x = Integer.parseInt(IO.readln());
    IO.println("Enter y Value");
    int y = Integer.parseInt(IO.readln());
    IO.println("Enter operator");

    String ch = IO.readln().toLowerCase();
    if (y == 0) {
        IO.println("Error: Cannot divide by zero");
        return;
    }
    switch (ch) {
        case "add" -> IO.println("Result: " + (x + y));
        case "sub" -> IO.println("Result: " + (x - y));
        case "mul" -> IO.println("Result: " + (x * y));
        case "div" -> IO.println("Result: " + (x / y));
        default -> IO.println("Invalid Operation");

    }
}*/

void main(){
    String cities[] = {"Hyd","Pune"};

    for(String city: cities){
        IO.println(city);
    }
}